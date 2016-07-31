package com.github.chenmingang.core;

import com.github.chenmingang.mysql.dbsync.DirectLogFetcherChannel;
import com.github.chenmingang.mysql.dbsync.LogContext;
import com.github.chenmingang.mysql.dbsync.LogDecoder;
import com.github.chenmingang.mysql.dbsync.LogEvent;
import com.github.chenmingang.mysql.driver.MysqlConnector;
import com.github.chenmingang.mysql.driver.MysqlQueryExecutor;
import com.github.chenmingang.mysql.driver.MysqlUpdateExecutor;
import com.github.chenmingang.mysql.driver.packets.HeaderPacket;
import com.github.chenmingang.mysql.driver.packets.client.BinlogDumpCommandPacket;
import com.github.chenmingang.mysql.driver.packets.server.ResultSetPacket;
import com.github.chenmingang.mysql.driver.utils.PacketManager;
import com.github.chenmingang.mysql.parser.LogEventConvert;
import com.github.chenmingang.mysql.parser.TableMetaCache;
import com.github.chenmingang.mysql.protobuf.CanalEntry;
import com.github.chenmingang.mysql.protobuf.EntryPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by hp on 14-9-2.
 */
public class MysqlTracker {


    //tracker's logger
    private Logger logger = LoggerFactory.getLogger(MysqlTracker.class);
    //private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MysqlTracker.class);

    //mysql JDBC by socket
    private MysqlConnector connector;

    private MysqlQueryExecutor queryExecutor;

    private MysqlUpdateExecutor updateExecutor;

    //get the table structure
    private MysqlConnector connectorTable;

    //table meta cache
    private TableMetaCache tableMetaCache;

    //log event convert
    LogEventConvert eventParser;

    //configuration for tracker of mysql
    private TrackerConfiger configer;

    //entry position, manager the offset
    private EntryPosition startPosition;

    //multi Thread share queue
    private BlockingQueue<LogEvent> eventQueue = new LinkedBlockingQueue<LogEvent>();


    public MysqlTracker(String username, String password, String address, int port, Long slaveId) {
        configer = new TrackerConfiger(username, password, address, port, slaveId);
    }


    //prepare the configuration and connector and position for binlog dump
    private void preBinlogDump() throws IOException {
        //log comment
        logger.info("tracker is start successfully......");
        //initialize the connector and executor
        connector = new MysqlConnector(new InetSocketAddress(configer.getAddress(), configer.getPort()),
                configer.getUsername(),
                configer.getPassword());
        connectorTable = new MysqlConnector(new InetSocketAddress(configer.getAddress(), configer.getPort()),
                configer.getUsername(),
                configer.getPassword());
        //connect mysql to find start position and dump binlog
        try {
            connector.connect();
            connectorTable.connect();
        } catch (IOException e) {
            logger.error("connector connect failed or connectorTable connect failed");
            throw new NullPointerException("connection failed!");
        }
        queryExecutor = new MysqlQueryExecutor(connector);
        updateExecutor = new MysqlUpdateExecutor(connector);
        //find start position
        //log comment
        logger.info("find start position");
        startPosition = findStartPosition();
        if (startPosition == null) throw new NullPointerException("start position is null");
        //get the table structure
        tableMetaCache = new TableMetaCache(connectorTable);
        //initialize the log event convert (to the entry)
        eventParser = new LogEventConvert();
        eventParser.setTableMetaCache(tableMetaCache);
    }

    //find start position include binlog file name and offset
    private EntryPosition findStartPosition() throws IOException {
        EntryPosition entryPosition;
        //load form file
        entryPosition = findFileStartPosition();
        if (entryPosition == null) {
            //load from mysql
            logger.info("file position load failed , get the position from mysql!");
            entryPosition = findMysqlStartPosition();
        } else {
            logger.info("file position loaded!");
        }
        return (entryPosition);
    }

    //find position by file
    private EntryPosition findFileStartPosition() throws IOException {
        EntryPosition entryPosition = new EntryPosition();
        if (entryPosition.readBinlogPosFile()) {
            if (!entryPosition.getJournalName().equals("") &&
                    entryPosition.getPosition() != 0) {
                return (entryPosition);
            } else return (null);
        } else return (null);
    }

    //find position by mysql
    private EntryPosition findMysqlStartPosition() throws IOException {
        ResultSetPacket resultSetPacket = queryExecutor.query("show master status");
        List<String> fields = resultSetPacket.getFieldValues();
        if (CollectionUtils.isEmpty(fields)) {
            throw new NullPointerException("show master status failed!");
        }
        EntryPosition entryPosition = new EntryPosition(fields.get(0), Long.valueOf(fields.get(1)));
        return (entryPosition);
    }


    //dump the binlog data according to the start position
    private void binlogDump() throws IOException {
        //Thread : take the binlog data from the mysql
        logger.info("start the tracker thread to dump the binlog data from mysql...");
        TakeDataThread takeData = new TakeDataThread();
        takeData.start();

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Thread : take the binlog data from the mysql
    class TakeDataThread extends Thread {


        private LogEvent event;

        //mysql.dbsync interface
        private DirectLogFetcherChannel fetcher;

        private LogDecoder decoder;

        private LogContext context;

        private Logger logger = LoggerFactory.getLogger(TakeDataThread.class);

        public void run() {
            try {
                preRun();
                while (fetcher.fetch()) {
                    logger.info("fetch the binlog data (event) successfully...");
                    event = decoder.decode(fetcher, context);
                    if (event == null) {
                        logger.error("fetched event is null!!!");
                        throw new NullPointerException("event is null!");
                    }
//                    System.out.println("---------------->get event : " +
//                            LogEvent.getTypeName(event.getHeader().getType()) +
//                            ",----> now pos: " +
//                            (event.getLogPos() - event.getEventLen()) +
//                            ",----> next pos: " +
//                            event.getLogPos() +
//                            ",----> binlog file : " +
//                            eventParser.getBinlogFileName());
//                    if(isEndEvent(event)) eventThread = event;//for per minute event position record
//                    minLogFile = eventParser.getBinlogFileName();
//                    try {
//                        if(event!=null) eventQueue.put(event);
//                    } catch (InterruptedException e){
//                        logger.error("eventQueue and entryQueue add data failed!!!");
//                        throw new InterruptedIOException();
//                    }
                    if (LogEvent.getTypeName(event.getHeader().getType()).endsWith("_rows")) {
                        CanalEntry.Entry entry = eventParser.parse(event);
                        CanalEntry.RowChange rowChage = null;
                        try {
                            rowChage = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
                        } catch (Exception e) {
                            throw new RuntimeException("parse event has an error , data:" + entry.toString(), e);
                        }

                        CanalEntry.EventType eventType = rowChage.getEventType();
                        for (CanalEntry.RowData rowData : rowChage.getRowDatasList()) {
                            //before
                            printColumn(rowData.getBeforeColumnsList());
                            //after
                            printColumn(rowData.getAfterColumnsList());
                        }
                    }
                }
            } catch (IOException e) {
                logger.error("fetch data failed!!!");
                e.printStackTrace();
            }

        }

        public void printColumn(List<CanalEntry.Column> columns) {
            //print the column information
            System.out.println("------------------------------------------->column info :");
            StringBuilder builder = new StringBuilder();
            for (CanalEntry.Column column : columns) {
                builder.append(column.getName() + " : " + column.getValue());
                builder.append("    type=" + column.getMysqlType());
                if (column.getUpdated()) {
                    builder.append("    update=" + column.getUpdated());
                }
            }
            System.out.println(builder);
        }

        public void preRun() throws IOException {
            //binlog dump thread configuration
            logger.info("set the binlog configuration for the binlog dump");
            updateExecutor.update("set wait_timeout=9999999");
            updateExecutor.update("set net_write_timeout=1800");
            updateExecutor.update("set net_read_timeout=1800");
            updateExecutor.update("set names 'binary'");//this will be my try to test no binary
            updateExecutor.update("set @master_binlog_checksum= '@@global.binlog_checksum'");
            updateExecutor.update("SET @mariadb_slave_capability='" + LogEvent.MARIA_SLAVE_CAPABILITY_MINE + "'");
            //send binlog dump packet and mysql will establish a binlog dump thread
            logger.info("send the binlog dump packet to mysql , let mysql set up a binlog dump thread in mysql");
            BinlogDumpCommandPacket binDmpPacket = new BinlogDumpCommandPacket();
            binDmpPacket.binlogFileName = startPosition.getJournalName();
            binDmpPacket.binlogPosition = startPosition.getPosition();
            binDmpPacket.slaveServerId = configer.getSlaveId();
            byte[] dmpBody = binDmpPacket.toBytes();
            HeaderPacket dmpHeader = new HeaderPacket();
            dmpHeader.setPacketBodyLength(dmpBody.length);
            dmpHeader.setPacketSequenceNumber((byte) 0x00);
            PacketManager.write(connector.getChannel(), new ByteBuffer[]{ByteBuffer.wrap(dmpHeader.toBytes()), ByteBuffer.wrap(dmpBody)});
            //initialize the mysql.dbsync to fetch the binlog data
            logger.info("initialize the mysql.dbsync class");
            fetcher = new DirectLogFetcherChannel(connector.getReceiveBufferSize());
            fetcher.start(connector.getChannel());
            decoder = new LogDecoder(LogEvent.UNKNOWN_EVENT, LogEvent.ENUM_END_EVENT);
            context = new LogContext();
        }
    }


    public static String getStringFromByteArray(byte[] bytes) {
        String inString = new String("");
        inString += String.valueOf(bytes[0]);
        for (int i = 1; i <= bytes.length - 1; i++) {
            inString += "," + String.valueOf(bytes[i]);
        }
        return (inString);
    }

    public static byte[] getByteArrayFromString(String inString) {
        String[] stringBytes = inString.split(",");
        byte[] bytes = new byte[stringBytes.length];
        for (int i = 0; i <= stringBytes.length - 1; i++) {
            bytes[i] = Integer.valueOf(stringBytes[i]).byteValue();
        }
        return (bytes);
    }

    //main process
    public void mainProc() throws IOException {
        preBinlogDump();
        binlogDump();
        afterBinlogDump();
    }


    private void afterBinlogDump() throws IOException {
        connector.disconnect();
        connectorTable.disconnect();

    }
}


