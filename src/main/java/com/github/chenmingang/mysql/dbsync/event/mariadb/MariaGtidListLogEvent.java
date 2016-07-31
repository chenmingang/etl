package com.github.chenmingang.mysql.dbsync.event.mariadb;

import com.github.chenmingang.mysql.dbsync.LogBuffer;
import com.github.chenmingang.mysql.dbsync.event.FormatDescriptionLogEvent;
import com.github.chenmingang.mysql.dbsync.event.IgnorableLogEvent;
import com.github.chenmingang.mysql.dbsync.event.LogHeader;

/**
 * mariadb的GTID_LIST_EVENT类型
 * 
 * @author jianghang 2014-1-20 下午4:51:50
 * @since 1.0.17
 */
public class MariaGtidListLogEvent extends IgnorableLogEvent {

    public MariaGtidListLogEvent(LogHeader header, LogBuffer buffer, FormatDescriptionLogEvent descriptionEvent){
        super(header, buffer, descriptionEvent);
        // do nothing , just ignore log mysql.dbsync.event
    }

}
