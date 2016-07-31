package com.github.chenmingang.mysql.protobuf;

import com.google.protobuf.AbstractMessage;

public final class CanalEntry {
  private CanalEntry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code protocol.protobuf.EntryType}
   *
   * <pre>
   **打散后的事件类型，主要用于标识事务的开始，变更数据，结束*
   * </pre>
   */
  public enum EntryType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TRANSACTIONBEGIN = 1;</code>
     */
    TRANSACTIONBEGIN(0, 1),
    /**
     * <code>ROWDATA = 2;</code>
     */
    ROWDATA(1, 2),
    /**
     * <code>TRANSACTIONEND = 3;</code>
     */
    TRANSACTIONEND(2, 3),
    /**
     * <code>HEARTBEAT = 4;</code>
     *
     * <pre>
     ** 心跳类型，内部使用，外部暂不可见，可忽略 *
     * </pre>
     */
    HEARTBEAT(3, 4),
    ;

    /**
     * <code>TRANSACTIONBEGIN = 1;</code>
     */
    public static final int TRANSACTIONBEGIN_VALUE = 1;
    /**
     * <code>ROWDATA = 2;</code>
     */
    public static final int ROWDATA_VALUE = 2;
    /**
     * <code>TRANSACTIONEND = 3;</code>
     */
    public static final int TRANSACTIONEND_VALUE = 3;
    /**
     * <code>HEARTBEAT = 4;</code>
     *
     * <pre>
     ** 心跳类型，内部使用，外部暂不可见，可忽略 *
     * </pre>
     */
    public static final int HEARTBEAT_VALUE = 4;


    public final int getNumber() { return value; }

    public static EntryType valueOf(int value) {
      switch (value) {
        case 1: return TRANSACTIONBEGIN;
        case 2: return ROWDATA;
        case 3: return TRANSACTIONEND;
        case 4: return HEARTBEAT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EntryType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EntryType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EntryType>() {
            public EntryType findValueByNumber(int number) {
              return EntryType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CanalEntry.getDescriptor().getEnumTypes().get(0);
    }

    private static final EntryType[] VALUES = values();

    public static EntryType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EntryType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.protobuf.EntryType)
  }

  /**
   * Protobuf enum {@code protocol.protobuf.EventType}
   *
   * <pre>
   ** 事件类型 *
   * </pre>
   */
  public enum EventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INSERT = 1;</code>
     */
    INSERT(0, 1),
    /**
     * <code>UPDATE = 2;</code>
     */
    UPDATE(1, 2),
    /**
     * <code>DELETE = 3;</code>
     */
    DELETE(2, 3),
    /**
     * <code>CREATE = 4;</code>
     */
    CREATE(3, 4),
    /**
     * <code>ALTER = 5;</code>
     */
    ALTER(4, 5),
    /**
     * <code>ERASE = 6;</code>
     */
    ERASE(5, 6),
    /**
     * <code>QUERY = 7;</code>
     */
    QUERY(6, 7),
    /**
     * <code>TRUNCATE = 8;</code>
     */
    TRUNCATE(7, 8),
    /**
     * <code>RENAME = 9;</code>
     */
    RENAME(8, 9),
    /**
     * <code>CINDEX = 10;</code>
     *
     * <pre>
     **CREATE INDEX*
     * </pre>
     */
    CINDEX(9, 10),
    /**
     * <code>DINDEX = 11;</code>
     */
    DINDEX(10, 11),
    ;

    /**
     * <code>INSERT = 1;</code>
     */
    public static final int INSERT_VALUE = 1;
    /**
     * <code>UPDATE = 2;</code>
     */
    public static final int UPDATE_VALUE = 2;
    /**
     * <code>DELETE = 3;</code>
     */
    public static final int DELETE_VALUE = 3;
    /**
     * <code>CREATE = 4;</code>
     */
    public static final int CREATE_VALUE = 4;
    /**
     * <code>ALTER = 5;</code>
     */
    public static final int ALTER_VALUE = 5;
    /**
     * <code>ERASE = 6;</code>
     */
    public static final int ERASE_VALUE = 6;
    /**
     * <code>QUERY = 7;</code>
     */
    public static final int QUERY_VALUE = 7;
    /**
     * <code>TRUNCATE = 8;</code>
     */
    public static final int TRUNCATE_VALUE = 8;
    /**
     * <code>RENAME = 9;</code>
     */
    public static final int RENAME_VALUE = 9;
    /**
     * <code>CINDEX = 10;</code>
     *
     * <pre>
     **CREATE INDEX*
     * </pre>
     */
    public static final int CINDEX_VALUE = 10;
    /**
     * <code>DINDEX = 11;</code>
     */
    public static final int DINDEX_VALUE = 11;


    public final int getNumber() { return value; }

    public static EventType valueOf(int value) {
      switch (value) {
        case 1: return INSERT;
        case 2: return UPDATE;
        case 3: return DELETE;
        case 4: return CREATE;
        case 5: return ALTER;
        case 6: return ERASE;
        case 7: return QUERY;
        case 8: return TRUNCATE;
        case 9: return RENAME;
        case 10: return CINDEX;
        case 11: return DINDEX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EventType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
            public EventType findValueByNumber(int number) {
              return EventType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CanalEntry.getDescriptor().getEnumTypes().get(1);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EventType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.protobuf.EventType)
  }

  /**
   * Protobuf enum {@code protocol.protobuf.Type}
   *
   * <pre>
   **数据库类型*
   * </pre>
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ORACLE = 1;</code>
     */
    ORACLE(0, 1),
    /**
     * <code>MYSQL = 2;</code>
     */
    MYSQL(1, 2),
    /**
     * <code>PGSQL = 3;</code>
     */
    PGSQL(2, 3),
    ;

    /**
     * <code>ORACLE = 1;</code>
     */
    public static final int ORACLE_VALUE = 1;
    /**
     * <code>MYSQL = 2;</code>
     */
    public static final int MYSQL_VALUE = 2;
    /**
     * <code>PGSQL = 3;</code>
     */
    public static final int PGSQL_VALUE = 3;


    public final int getNumber() { return value; }

    public static Type valueOf(int value) {
      switch (value) {
        case 1: return ORACLE;
        case 2: return MYSQL;
        case 3: return PGSQL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return CanalEntry.getDescriptor().getEnumTypes().get(2);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Type(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:protocol.protobuf.Type)
  }

  public interface EntryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .protocol.protobuf.Header header = 1;
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    boolean hasHeader();
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    CanalEntry.Header getHeader();
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    CanalEntry.HeaderOrBuilder getHeaderOrBuilder();

    // optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];
    /**
     * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
     *
     * <pre>
     **打散后的事件类型*
     * </pre>
     */
    boolean hasEntryType();
    /**
     * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
     *
     * <pre>
     **打散后的事件类型*
     * </pre>
     */
    CanalEntry.EntryType getEntryType();

    // optional bytes storeValue = 3;
    /**
     * <code>optional bytes storeValue = 3;</code>
     *
     * <pre>
     **传输的二进制数组*
     * </pre>
     */
    boolean hasStoreValue();
    /**
     * <code>optional bytes storeValue = 3;</code>
     *
     * <pre>
     **传输的二进制数组*
     * </pre>
     */
    com.google.protobuf.ByteString getStoreValue();

    // optional int64 batchId = 4;
    /**
     * <code>optional int64 batchId = 4;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    boolean hasBatchId();
    /**
     * <code>optional int64 batchId = 4;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    long getBatchId();

    // optional int64 inId = 5;
    /**
     * <code>optional int64 inId = 5;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    boolean hasInId();
    /**
     * <code>optional int64 inId = 5;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    long getInId();

    // optional string ip = 6;
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    boolean hasIp();
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    java.lang.String getIp();
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    com.google.protobuf.ByteString
        getIpBytes();
  }
  /**
   * Protobuf type {@code protocol.protobuf.Entry}
   *
   * <pre>
   ****************************************************************
   * message model
   *如果要在Enum中新增类型，确保以前的类型的下标值不变.
   ***************************************************************
   * </pre>
   */
  public static final class Entry extends
      com.google.protobuf.GeneratedMessage
      implements EntryOrBuilder {
    // Use Entry.newBuilder() to construct.
    private Entry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Entry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Entry defaultInstance;
    public static Entry getDefaultInstance() {
      return defaultInstance;
    }

    public Entry getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Entry(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              CanalEntry.Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(CanalEntry.Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              CanalEntry.EntryType value = CanalEntry.EntryType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                entryType_ = value;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              storeValue_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              batchId_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              inId_ = input.readInt64();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              ip_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_Entry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_Entry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.Entry.class, CanalEntry.Entry.Builder.class);
    }

    public static com.google.protobuf.Parser<Entry> PARSER =
        new com.google.protobuf.AbstractParser<Entry>() {
      public Entry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Entry(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Entry> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional .protocol.protobuf.Header header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private CanalEntry.Header header_;
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    public CanalEntry.Header getHeader() {
      return header_;
    }
    /**
     * <code>optional .protocol.protobuf.Header header = 1;</code>
     *
     * <pre>
     **协议头部信息*
     * </pre>
     */
    public CanalEntry.HeaderOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];
    public static final int ENTRYTYPE_FIELD_NUMBER = 2;
    private CanalEntry.EntryType entryType_;
    /**
     * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
     *
     * <pre>
     **打散后的事件类型*
     * </pre>
     */
    public boolean hasEntryType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
     *
     * <pre>
     **打散后的事件类型*
     * </pre>
     */
    public CanalEntry.EntryType getEntryType() {
      return entryType_;
    }

    // optional bytes storeValue = 3;
    public static final int STOREVALUE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString storeValue_;
    /**
     * <code>optional bytes storeValue = 3;</code>
     *
     * <pre>
     **传输的二进制数组*
     * </pre>
     */
    public boolean hasStoreValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes storeValue = 3;</code>
     *
     * <pre>
     **传输的二进制数组*
     * </pre>
     */
    public com.google.protobuf.ByteString getStoreValue() {
      return storeValue_;
    }

    // optional int64 batchId = 4;
    public static final int BATCHID_FIELD_NUMBER = 4;
    private long batchId_;
    /**
     * <code>optional int64 batchId = 4;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public boolean hasBatchId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 batchId = 4;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public long getBatchId() {
      return batchId_;
    }

    // optional int64 inId = 5;
    public static final int INID_FIELD_NUMBER = 5;
    private long inId_;
    /**
     * <code>optional int64 inId = 5;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public boolean hasInId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 inId = 5;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public long getInId() {
      return inId_;
    }

    // optional string ip = 6;
    public static final int IP_FIELD_NUMBER = 6;
    private java.lang.Object ip_;
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ip_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ip = 6;</code>
     *
     * <pre>
     **additional info*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      header_ = CanalEntry.Header.getDefaultInstance();
      entryType_ = CanalEntry.EntryType.ROWDATA;
      storeValue_ = com.google.protobuf.ByteString.EMPTY;
      batchId_ = 0L;
      inId_ = 0L;
      ip_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, entryType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, storeValue_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, batchId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, inId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getIpBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, entryType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, storeValue_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, batchId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, inId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getIpBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.Entry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Entry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Entry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Entry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Entry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Entry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.Entry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.Entry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.Entry prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.Entry}
     *
     * <pre>
     ****************************************************************
     * message model
     *如果要在Enum中新增类型，确保以前的类型的下标值不变.
     ***************************************************************
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.EntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_Entry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_Entry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.Entry.class, CanalEntry.Entry.Builder.class);
      }

      // Construct using CanalEntry.Entry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHeaderFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = CanalEntry.Header.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        entryType_ = CanalEntry.EntryType.ROWDATA;
        bitField0_ = (bitField0_ & ~0x00000002);
        storeValue_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        batchId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        inId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        ip_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_Entry_descriptor;
      }

      public CanalEntry.Entry getDefaultInstanceForType() {
        return CanalEntry.Entry.getDefaultInstance();
      }

      public CanalEntry.Entry build() {
        CanalEntry.Entry result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.Entry buildPartial() {
        CanalEntry.Entry result = new CanalEntry.Entry(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.entryType_ = entryType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.storeValue_ = storeValue_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.batchId_ = batchId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.inId_ = inId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.ip_ = ip_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.Entry) {
          return mergeFrom((CanalEntry.Entry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.Entry other) {
        if (other == CanalEntry.Entry.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasEntryType()) {
          setEntryType(other.getEntryType());
        }
        if (other.hasStoreValue()) {
          setStoreValue(other.getStoreValue());
        }
        if (other.hasBatchId()) {
          setBatchId(other.getBatchId());
        }
        if (other.hasInId()) {
          setInId(other.getInId());
        }
        if (other.hasIp()) {
          bitField0_ |= 0x00000020;
          ip_ = other.ip_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.Entry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.Entry) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .protocol.protobuf.Header header = 1;
      private CanalEntry.Header header_ = CanalEntry.Header.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          CanalEntry.Header, CanalEntry.Header.Builder, CanalEntry.HeaderOrBuilder> headerBuilder_;
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public CanalEntry.Header getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public Builder setHeader(CanalEntry.Header value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public Builder setHeader(
          CanalEntry.Header.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public Builder mergeHeader(CanalEntry.Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != CanalEntry.Header.getDefaultInstance()) {
            header_ =
              CanalEntry.Header.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = CanalEntry.Header.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public CanalEntry.Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      public CanalEntry.HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>optional .protocol.protobuf.Header header = 1;</code>
       *
       * <pre>
       **协议头部信息*
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          CanalEntry.Header, CanalEntry.Header.Builder, CanalEntry.HeaderOrBuilder>
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              CanalEntry.Header, CanalEntry.Header.Builder, CanalEntry.HeaderOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];
      private CanalEntry.EntryType entryType_ = CanalEntry.EntryType.ROWDATA;
      /**
       * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
       *
       * <pre>
       **打散后的事件类型*
       * </pre>
       */
      public boolean hasEntryType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
       *
       * <pre>
       **打散后的事件类型*
       * </pre>
       */
      public CanalEntry.EntryType getEntryType() {
        return entryType_;
      }
      /**
       * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
       *
       * <pre>
       **打散后的事件类型*
       * </pre>
       */
      public Builder setEntryType(CanalEntry.EntryType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        entryType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.EntryType entryType = 2 [default = ROWDATA];</code>
       *
       * <pre>
       **打散后的事件类型*
       * </pre>
       */
      public Builder clearEntryType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entryType_ = CanalEntry.EntryType.ROWDATA;
        onChanged();
        return this;
      }

      // optional bytes storeValue = 3;
      private com.google.protobuf.ByteString storeValue_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes storeValue = 3;</code>
       *
       * <pre>
       **传输的二进制数组*
       * </pre>
       */
      public boolean hasStoreValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes storeValue = 3;</code>
       *
       * <pre>
       **传输的二进制数组*
       * </pre>
       */
      public com.google.protobuf.ByteString getStoreValue() {
        return storeValue_;
      }
      /**
       * <code>optional bytes storeValue = 3;</code>
       *
       * <pre>
       **传输的二进制数组*
       * </pre>
       */
      public Builder setStoreValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        storeValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes storeValue = 3;</code>
       *
       * <pre>
       **传输的二进制数组*
       * </pre>
       */
      public Builder clearStoreValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        storeValue_ = getDefaultInstance().getStoreValue();
        onChanged();
        return this;
      }

      // optional int64 batchId = 4;
      private long batchId_ ;
      /**
       * <code>optional int64 batchId = 4;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public boolean hasBatchId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 batchId = 4;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public long getBatchId() {
        return batchId_;
      }
      /**
       * <code>optional int64 batchId = 4;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder setBatchId(long value) {
        bitField0_ |= 0x00000008;
        batchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 batchId = 4;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder clearBatchId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        batchId_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 inId = 5;
      private long inId_ ;
      /**
       * <code>optional int64 inId = 5;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public boolean hasInId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int64 inId = 5;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public long getInId() {
        return inId_;
      }
      /**
       * <code>optional int64 inId = 5;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder setInId(long value) {
        bitField0_ |= 0x00000010;
        inId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 inId = 5;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder clearInId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        inId_ = 0L;
        onChanged();
        return this;
      }

      // optional string ip = 6;
      private java.lang.Object ip_ = "";
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 6;</code>
       *
       * <pre>
       **additional info*
       * </pre>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        ip_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.Entry)
    }

    static {
      defaultInstance = new Entry(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.Entry)
  }

  public interface HeaderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 version = 1 [default = 1];
    /**
     * <code>optional int32 version = 1 [default = 1];</code>
     *
     * <pre>
     **协议的版本号*
     * </pre>
     */
    boolean hasVersion();
    /**
     * <code>optional int32 version = 1 [default = 1];</code>
     *
     * <pre>
     **协议的版本号*
     * </pre>
     */
    int getVersion();

    // optional string logfileName = 2;
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    boolean hasLogfileName();
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    java.lang.String getLogfileName();
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    com.google.protobuf.ByteString
        getLogfileNameBytes();

    // optional int64 logfileOffset = 3;
    /**
     * <code>optional int64 logfileOffset = 3;</code>
     *
     * <pre>
     **binlog/redolog 文件的偏移位置*
     * </pre>
     */
    boolean hasLogfileOffset();
    /**
     * <code>optional int64 logfileOffset = 3;</code>
     *
     * <pre>
     **binlog/redolog 文件的偏移位置*
     * </pre>
     */
    long getLogfileOffset();

    // optional int64 serverId = 4;
    /**
     * <code>optional int64 serverId = 4;</code>
     *
     * <pre>
     **服务端serverId*
     * </pre>
     */
    boolean hasServerId();
    /**
     * <code>optional int64 serverId = 4;</code>
     *
     * <pre>
     **服务端serverId*
     * </pre>
     */
    long getServerId();

    // optional string serverenCode = 5;
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    boolean hasServerenCode();
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    java.lang.String getServerenCode();
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    com.google.protobuf.ByteString
        getServerenCodeBytes();

    // optional int64 executeTime = 6;
    /**
     * <code>optional int64 executeTime = 6;</code>
     *
     * <pre>
     **变更数据的执行时间 *
     * </pre>
     */
    boolean hasExecuteTime();
    /**
     * <code>optional int64 executeTime = 6;</code>
     *
     * <pre>
     **变更数据的执行时间 *
     * </pre>
     */
    long getExecuteTime();

    // optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];
    /**
     * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
     *
     * <pre>
     ** 变更数据的来源*
     * </pre>
     */
    boolean hasSourceType();
    /**
     * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
     *
     * <pre>
     ** 变更数据的来源*
     * </pre>
     */
    CanalEntry.Type getSourceType();

    // optional string schemaName = 8;
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    boolean hasSchemaName();
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    java.lang.String getSchemaName();
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    com.google.protobuf.ByteString
        getSchemaNameBytes();

    // optional string tableName = 9;
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    boolean hasTableName();
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    java.lang.String getTableName();
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    com.google.protobuf.ByteString
        getTableNameBytes();

    // optional int64 eventLength = 10;
    /**
     * <code>optional int64 eventLength = 10;</code>
     *
     * <pre>
     **每个event的长度*
     * </pre>
     */
    boolean hasEventLength();
    /**
     * <code>optional int64 eventLength = 10;</code>
     *
     * <pre>
     **每个event的长度*
     * </pre>
     */
    long getEventLength();

    // optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    boolean hasEventType();
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    CanalEntry.EventType getEventType();

    // repeated .protocol.protobuf.Pair props = 12;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code protocol.protobuf.Header}
   *
   * <pre>
   **message Header*
   * </pre>
   */
  public static final class Header extends
      com.google.protobuf.GeneratedMessage
      implements HeaderOrBuilder {
    // Use Header.newBuilder() to construct.
    private Header(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Header(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Header defaultInstance;
    public static Header getDefaultInstance() {
      return defaultInstance;
    }

    public Header getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Header(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              version_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              logfileName_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              logfileOffset_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              serverId_ = input.readInt64();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              serverenCode_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              executeTime_ = input.readInt64();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();
              CanalEntry.Type value = CanalEntry.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(7, rawValue);
              } else {
                bitField0_ |= 0x00000040;
                sourceType_ = value;
              }
              break;
            }
            case 66: {
              bitField0_ |= 0x00000080;
              schemaName_ = input.readBytes();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              tableName_ = input.readBytes();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              eventLength_ = input.readInt64();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();
              CanalEntry.EventType value = CanalEntry.EventType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(11, rawValue);
              } else {
                bitField0_ |= 0x00000400;
                eventType_ = value;
              }
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000800) == 0x00000800)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000800;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000800) == 0x00000800)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_Header_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.Header.class, CanalEntry.Header.Builder.class);
    }

    public static com.google.protobuf.Parser<Header> PARSER =
        new com.google.protobuf.AbstractParser<Header>() {
      public Header parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Header(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Header> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 version = 1 [default = 1];
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>optional int32 version = 1 [default = 1];</code>
     *
     * <pre>
     **协议的版本号*
     * </pre>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 version = 1 [default = 1];</code>
     *
     * <pre>
     **协议的版本号*
     * </pre>
     */
    public int getVersion() {
      return version_;
    }

    // optional string logfileName = 2;
    public static final int LOGFILENAME_FIELD_NUMBER = 2;
    private java.lang.Object logfileName_;
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    public boolean hasLogfileName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    public java.lang.String getLogfileName() {
      java.lang.Object ref = logfileName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          logfileName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string logfileName = 2;</code>
     *
     * <pre>
     **binlog/redolog 文件名*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getLogfileNameBytes() {
      java.lang.Object ref = logfileName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logfileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 logfileOffset = 3;
    public static final int LOGFILEOFFSET_FIELD_NUMBER = 3;
    private long logfileOffset_;
    /**
     * <code>optional int64 logfileOffset = 3;</code>
     *
     * <pre>
     **binlog/redolog 文件的偏移位置*
     * </pre>
     */
    public boolean hasLogfileOffset() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 logfileOffset = 3;</code>
     *
     * <pre>
     **binlog/redolog 文件的偏移位置*
     * </pre>
     */
    public long getLogfileOffset() {
      return logfileOffset_;
    }

    // optional int64 serverId = 4;
    public static final int SERVERID_FIELD_NUMBER = 4;
    private long serverId_;
    /**
     * <code>optional int64 serverId = 4;</code>
     *
     * <pre>
     **服务端serverId*
     * </pre>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 serverId = 4;</code>
     *
     * <pre>
     **服务端serverId*
     * </pre>
     */
    public long getServerId() {
      return serverId_;
    }

    // optional string serverenCode = 5;
    public static final int SERVERENCODE_FIELD_NUMBER = 5;
    private java.lang.Object serverenCode_;
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    public boolean hasServerenCode() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    public java.lang.String getServerenCode() {
      java.lang.Object ref = serverenCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverenCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string serverenCode = 5;</code>
     *
     * <pre>
     ** 变更数据的编码 *
     * </pre>
     */
    public com.google.protobuf.ByteString
        getServerenCodeBytes() {
      java.lang.Object ref = serverenCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverenCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 executeTime = 6;
    public static final int EXECUTETIME_FIELD_NUMBER = 6;
    private long executeTime_;
    /**
     * <code>optional int64 executeTime = 6;</code>
     *
     * <pre>
     **变更数据的执行时间 *
     * </pre>
     */
    public boolean hasExecuteTime() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int64 executeTime = 6;</code>
     *
     * <pre>
     **变更数据的执行时间 *
     * </pre>
     */
    public long getExecuteTime() {
      return executeTime_;
    }

    // optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];
    public static final int SOURCETYPE_FIELD_NUMBER = 7;
    private CanalEntry.Type sourceType_;
    /**
     * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
     *
     * <pre>
     ** 变更数据的来源*
     * </pre>
     */
    public boolean hasSourceType() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
     *
     * <pre>
     ** 变更数据的来源*
     * </pre>
     */
    public CanalEntry.Type getSourceType() {
      return sourceType_;
    }

    // optional string schemaName = 8;
    public static final int SCHEMANAME_FIELD_NUMBER = 8;
    private java.lang.Object schemaName_;
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    public boolean hasSchemaName() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    public java.lang.String getSchemaName() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          schemaName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string schemaName = 8;</code>
     *
     * <pre>
     ** 变更数据的schemaname*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSchemaNameBytes() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schemaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string tableName = 9;
    public static final int TABLENAME_FIELD_NUMBER = 9;
    private java.lang.Object tableName_;
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tableName = 9;</code>
     *
     * <pre>
     **变更数据的tablename*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 eventLength = 10;
    public static final int EVENTLENGTH_FIELD_NUMBER = 10;
    private long eventLength_;
    /**
     * <code>optional int64 eventLength = 10;</code>
     *
     * <pre>
     **每个event的长度*
     * </pre>
     */
    public boolean hasEventLength() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional int64 eventLength = 10;</code>
     *
     * <pre>
     **每个event的长度*
     * </pre>
     */
    public long getEventLength() {
      return eventLength_;
    }

    // optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];
    public static final int EVENTTYPE_FIELD_NUMBER = 11;
    private CanalEntry.EventType eventType_;
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    public boolean hasEventType() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    public CanalEntry.EventType getEventType() {
      return eventType_;
    }

    // repeated .protocol.protobuf.Pair props = 12;
    public static final int PROPS_FIELD_NUMBER = 12;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 12;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    private void initFields() {
      version_ = 1;
      logfileName_ = "";
      logfileOffset_ = 0L;
      serverId_ = 0L;
      serverenCode_ = "";
      executeTime_ = 0L;
      sourceType_ = CanalEntry.Type.MYSQL;
      schemaName_ = "";
      tableName_ = "";
      eventLength_ = 0L;
      eventType_ = CanalEntry.EventType.UPDATE;
      props_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLogfileNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, logfileOffset_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, serverId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getServerenCodeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, executeTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeEnum(7, sourceType_.getNumber());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, getSchemaNameBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, getTableNameBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt64(10, eventLength_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeEnum(11, eventType_.getNumber());
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(12, props_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLogfileNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, logfileOffset_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, serverId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getServerenCodeBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, executeTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, sourceType_.getNumber());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getSchemaNameBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getTableNameBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, eventLength_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, eventType_.getNumber());
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, props_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.Header prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.Header}
     *
     * <pre>
     **message Header*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.HeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_Header_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_Header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.Header.class, CanalEntry.Header.Builder.class);
      }

      // Construct using CanalEntry.Header.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        version_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        logfileName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        logfileOffset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        serverId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        serverenCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        executeTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        sourceType_ = CanalEntry.Type.MYSQL;
        bitField0_ = (bitField0_ & ~0x00000040);
        schemaName_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        tableName_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        eventLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000200);
        eventType_ = CanalEntry.EventType.UPDATE;
        bitField0_ = (bitField0_ & ~0x00000400);
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000800);
        } else {
          propsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_Header_descriptor;
      }

      public CanalEntry.Header getDefaultInstanceForType() {
        return CanalEntry.Header.getDefaultInstance();
      }

      public CanalEntry.Header build() {
        CanalEntry.Header result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.Header buildPartial() {
        CanalEntry.Header result = new CanalEntry.Header(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.logfileName_ = logfileName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.logfileOffset_ = logfileOffset_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.serverenCode_ = serverenCode_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.executeTime_ = executeTime_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.sourceType_ = sourceType_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.schemaName_ = schemaName_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.tableName_ = tableName_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.eventLength_ = eventLength_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.eventType_ = eventType_;
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000800) == 0x00000800)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000800);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.Header) {
          return mergeFrom((CanalEntry.Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.Header other) {
        if (other == CanalEntry.Header.getDefaultInstance()) return this;
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasLogfileName()) {
          bitField0_ |= 0x00000002;
          logfileName_ = other.logfileName_;
          onChanged();
        }
        if (other.hasLogfileOffset()) {
          setLogfileOffset(other.getLogfileOffset());
        }
        if (other.hasServerId()) {
          setServerId(other.getServerId());
        }
        if (other.hasServerenCode()) {
          bitField0_ |= 0x00000010;
          serverenCode_ = other.serverenCode_;
          onChanged();
        }
        if (other.hasExecuteTime()) {
          setExecuteTime(other.getExecuteTime());
        }
        if (other.hasSourceType()) {
          setSourceType(other.getSourceType());
        }
        if (other.hasSchemaName()) {
          bitField0_ |= 0x00000080;
          schemaName_ = other.schemaName_;
          onChanged();
        }
        if (other.hasTableName()) {
          bitField0_ |= 0x00000100;
          tableName_ = other.tableName_;
          onChanged();
        }
        if (other.hasEventLength()) {
          setEventLength(other.getEventLength());
        }
        if (other.hasEventType()) {
          setEventType(other.getEventType());
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000800);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000800);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.Header parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.Header) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 version = 1 [default = 1];
      private int version_ = 1;
      /**
       * <code>optional int32 version = 1 [default = 1];</code>
       *
       * <pre>
       **协议的版本号*
       * </pre>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 version = 1 [default = 1];</code>
       *
       * <pre>
       **协议的版本号*
       * </pre>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>optional int32 version = 1 [default = 1];</code>
       *
       * <pre>
       **协议的版本号*
       * </pre>
       */
      public Builder setVersion(int value) {
        bitField0_ |= 0x00000001;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 version = 1 [default = 1];</code>
       *
       * <pre>
       **协议的版本号*
       * </pre>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 1;
        onChanged();
        return this;
      }

      // optional string logfileName = 2;
      private java.lang.Object logfileName_ = "";
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public boolean hasLogfileName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public java.lang.String getLogfileName() {
        java.lang.Object ref = logfileName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          logfileName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getLogfileNameBytes() {
        java.lang.Object ref = logfileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          logfileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public Builder setLogfileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        logfileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public Builder clearLogfileName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        logfileName_ = getDefaultInstance().getLogfileName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string logfileName = 2;</code>
       *
       * <pre>
       **binlog/redolog 文件名*
       * </pre>
       */
      public Builder setLogfileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        logfileName_ = value;
        onChanged();
        return this;
      }

      // optional int64 logfileOffset = 3;
      private long logfileOffset_ ;
      /**
       * <code>optional int64 logfileOffset = 3;</code>
       *
       * <pre>
       **binlog/redolog 文件的偏移位置*
       * </pre>
       */
      public boolean hasLogfileOffset() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 logfileOffset = 3;</code>
       *
       * <pre>
       **binlog/redolog 文件的偏移位置*
       * </pre>
       */
      public long getLogfileOffset() {
        return logfileOffset_;
      }
      /**
       * <code>optional int64 logfileOffset = 3;</code>
       *
       * <pre>
       **binlog/redolog 文件的偏移位置*
       * </pre>
       */
      public Builder setLogfileOffset(long value) {
        bitField0_ |= 0x00000004;
        logfileOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 logfileOffset = 3;</code>
       *
       * <pre>
       **binlog/redolog 文件的偏移位置*
       * </pre>
       */
      public Builder clearLogfileOffset() {
        bitField0_ = (bitField0_ & ~0x00000004);
        logfileOffset_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 serverId = 4;
      private long serverId_ ;
      /**
       * <code>optional int64 serverId = 4;</code>
       *
       * <pre>
       **服务端serverId*
       * </pre>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 serverId = 4;</code>
       *
       * <pre>
       **服务端serverId*
       * </pre>
       */
      public long getServerId() {
        return serverId_;
      }
      /**
       * <code>optional int64 serverId = 4;</code>
       *
       * <pre>
       **服务端serverId*
       * </pre>
       */
      public Builder setServerId(long value) {
        bitField0_ |= 0x00000008;
        serverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 serverId = 4;</code>
       *
       * <pre>
       **服务端serverId*
       * </pre>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        serverId_ = 0L;
        onChanged();
        return this;
      }

      // optional string serverenCode = 5;
      private java.lang.Object serverenCode_ = "";
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public boolean hasServerenCode() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public java.lang.String getServerenCode() {
        java.lang.Object ref = serverenCode_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          serverenCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public com.google.protobuf.ByteString
          getServerenCodeBytes() {
        java.lang.Object ref = serverenCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverenCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public Builder setServerenCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        serverenCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public Builder clearServerenCode() {
        bitField0_ = (bitField0_ & ~0x00000010);
        serverenCode_ = getDefaultInstance().getServerenCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverenCode = 5;</code>
       *
       * <pre>
       ** 变更数据的编码 *
       * </pre>
       */
      public Builder setServerenCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        serverenCode_ = value;
        onChanged();
        return this;
      }

      // optional int64 executeTime = 6;
      private long executeTime_ ;
      /**
       * <code>optional int64 executeTime = 6;</code>
       *
       * <pre>
       **变更数据的执行时间 *
       * </pre>
       */
      public boolean hasExecuteTime() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int64 executeTime = 6;</code>
       *
       * <pre>
       **变更数据的执行时间 *
       * </pre>
       */
      public long getExecuteTime() {
        return executeTime_;
      }
      /**
       * <code>optional int64 executeTime = 6;</code>
       *
       * <pre>
       **变更数据的执行时间 *
       * </pre>
       */
      public Builder setExecuteTime(long value) {
        bitField0_ |= 0x00000020;
        executeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 executeTime = 6;</code>
       *
       * <pre>
       **变更数据的执行时间 *
       * </pre>
       */
      public Builder clearExecuteTime() {
        bitField0_ = (bitField0_ & ~0x00000020);
        executeTime_ = 0L;
        onChanged();
        return this;
      }

      // optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];
      private CanalEntry.Type sourceType_ = CanalEntry.Type.MYSQL;
      /**
       * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
       *
       * <pre>
       ** 变更数据的来源*
       * </pre>
       */
      public boolean hasSourceType() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
       *
       * <pre>
       ** 变更数据的来源*
       * </pre>
       */
      public CanalEntry.Type getSourceType() {
        return sourceType_;
      }
      /**
       * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
       *
       * <pre>
       ** 变更数据的来源*
       * </pre>
       */
      public Builder setSourceType(CanalEntry.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        sourceType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.Type sourceType = 7 [default = MYSQL];</code>
       *
       * <pre>
       ** 变更数据的来源*
       * </pre>
       */
      public Builder clearSourceType() {
        bitField0_ = (bitField0_ & ~0x00000040);
        sourceType_ = CanalEntry.Type.MYSQL;
        onChanged();
        return this;
      }

      // optional string schemaName = 8;
      private java.lang.Object schemaName_ = "";
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public boolean hasSchemaName() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public java.lang.String getSchemaName() {
        java.lang.Object ref = schemaName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          schemaName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSchemaNameBytes() {
        java.lang.Object ref = schemaName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          schemaName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public Builder setSchemaName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        schemaName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public Builder clearSchemaName() {
        bitField0_ = (bitField0_ & ~0x00000080);
        schemaName_ = getDefaultInstance().getSchemaName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string schemaName = 8;</code>
       *
       * <pre>
       ** 变更数据的schemaname*
       * </pre>
       */
      public Builder setSchemaNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        schemaName_ = value;
        onChanged();
        return this;
      }

      // optional string tableName = 9;
      private java.lang.Object tableName_ = "";
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public boolean hasTableName() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public java.lang.String getTableName() {
        java.lang.Object ref = tableName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          tableName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTableNameBytes() {
        java.lang.Object ref = tableName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tableName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public Builder setTableName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        tableName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public Builder clearTableName() {
        bitField0_ = (bitField0_ & ~0x00000100);
        tableName_ = getDefaultInstance().getTableName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tableName = 9;</code>
       *
       * <pre>
       **变更数据的tablename*
       * </pre>
       */
      public Builder setTableNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        tableName_ = value;
        onChanged();
        return this;
      }

      // optional int64 eventLength = 10;
      private long eventLength_ ;
      /**
       * <code>optional int64 eventLength = 10;</code>
       *
       * <pre>
       **每个event的长度*
       * </pre>
       */
      public boolean hasEventLength() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional int64 eventLength = 10;</code>
       *
       * <pre>
       **每个event的长度*
       * </pre>
       */
      public long getEventLength() {
        return eventLength_;
      }
      /**
       * <code>optional int64 eventLength = 10;</code>
       *
       * <pre>
       **每个event的长度*
       * </pre>
       */
      public Builder setEventLength(long value) {
        bitField0_ |= 0x00000200;
        eventLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 eventLength = 10;</code>
       *
       * <pre>
       **每个event的长度*
       * </pre>
       */
      public Builder clearEventLength() {
        bitField0_ = (bitField0_ & ~0x00000200);
        eventLength_ = 0L;
        onChanged();
        return this;
      }

      // optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];
      private CanalEntry.EventType eventType_ = CanalEntry.EventType.UPDATE;
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public boolean hasEventType() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public CanalEntry.EventType getEventType() {
        return eventType_;
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public Builder setEventType(CanalEntry.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000400;
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 11 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public Builder clearEventType() {
        bitField0_ = (bitField0_ & ~0x00000400);
        eventType_ = CanalEntry.EventType.UPDATE;
        onChanged();
        return this;
      }

      // repeated .protocol.protobuf.Pair props = 12;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000800) == 0x00000800)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000800;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000800);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 12;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000800) == 0x00000800),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.Header)
    }

    static {
      defaultInstance = new Header(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.Header)
  }

  public interface ColumnOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 index = 1;
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     **字段下标*
     * </pre>
     */
    boolean hasIndex();
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     **字段下标*
     * </pre>
     */
    int getIndex();

    // optional int32 sqlType = 2;
    /**
     * <code>optional int32 sqlType = 2;</code>
     *
     * <pre>
     **字段java中类型*
     * </pre>
     */
    boolean hasSqlType();
    /**
     * <code>optional int32 sqlType = 2;</code>
     *
     * <pre>
     **字段java中类型*
     * </pre>
     */
    int getSqlType();

    // optional string name = 3;
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    boolean hasName();
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // optional bool isKey = 4;
    /**
     * <code>optional bool isKey = 4;</code>
     *
     * <pre>
     **是否是主键*
     * </pre>
     */
    boolean hasIsKey();
    /**
     * <code>optional bool isKey = 4;</code>
     *
     * <pre>
     **是否是主键*
     * </pre>
     */
    boolean getIsKey();

    // optional bool updated = 5;
    /**
     * <code>optional bool updated = 5;</code>
     *
     * <pre>
     **如果EventType=UPDATE,用于标识这个字段值是否有修改*
     * </pre>
     */
    boolean hasUpdated();
    /**
     * <code>optional bool updated = 5;</code>
     *
     * <pre>
     **如果EventType=UPDATE,用于标识这个字段值是否有修改*
     * </pre>
     */
    boolean getUpdated();

    // optional bool isNull = 6 [default = false];
    /**
     * <code>optional bool isNull = 6 [default = false];</code>
     *
     * <pre>
     ** 标识是否为空  *
     * </pre>
     */
    boolean hasIsNull();
    /**
     * <code>optional bool isNull = 6 [default = false];</code>
     *
     * <pre>
     ** 标识是否为空  *
     * </pre>
     */
    boolean getIsNull();

    // repeated .protocol.protobuf.Pair props = 7;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);

    // optional string value = 8;
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    boolean hasValue();
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    java.lang.String getValue();
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    com.google.protobuf.ByteString
        getValueBytes();

    // optional int32 length = 9;
    /**
     * <code>optional int32 length = 9;</code>
     *
     * <pre>
     ** 对应数据对象原始长度 *
     * </pre>
     */
    boolean hasLength();
    /**
     * <code>optional int32 length = 9;</code>
     *
     * <pre>
     ** 对应数据对象原始长度 *
     * </pre>
     */
    int getLength();

    // optional string mysqlType = 10;
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    boolean hasMysqlType();
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    java.lang.String getMysqlType();
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    com.google.protobuf.ByteString
        getMysqlTypeBytes();
  }
  /**
   * Protobuf type {@code protocol.protobuf.Column}
   *
   * <pre>
   **每个字段的数据结构*
   * </pre>
   */
  public static final class Column extends
      com.google.protobuf.GeneratedMessage
      implements ColumnOrBuilder {
    // Use Column.newBuilder() to construct.
    private Column(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Column(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Column defaultInstance;
    public static Column getDefaultInstance() {
      return defaultInstance;
    }

    public Column getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Column(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              index_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              sqlType_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              isKey_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              updated_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              isNull_ = input.readBool();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000040;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
            case 66: {
              bitField0_ |= 0x00000040;
              value_ = input.readBytes();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000080;
              length_ = input.readInt32();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000100;
              mysqlType_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_Column_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_Column_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.Column.class, CanalEntry.Column.Builder.class);
    }

    public static com.google.protobuf.Parser<Column> PARSER =
        new com.google.protobuf.AbstractParser<Column>() {
      public Column parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Column(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Column> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 index = 1;
    public static final int INDEX_FIELD_NUMBER = 1;
    private int index_;
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     **字段下标*
     * </pre>
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     **字段下标*
     * </pre>
     */
    public int getIndex() {
      return index_;
    }

    // optional int32 sqlType = 2;
    public static final int SQLTYPE_FIELD_NUMBER = 2;
    private int sqlType_;
    /**
     * <code>optional int32 sqlType = 2;</code>
     *
     * <pre>
     **字段java中类型*
     * </pre>
     */
    public boolean hasSqlType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 sqlType = 2;</code>
     *
     * <pre>
     **字段java中类型*
     * </pre>
     */
    public int getSqlType() {
      return sqlType_;
    }

    // optional string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     *
     * <pre>
     **字段名称(忽略大小写)，在mysql中是没有的*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bool isKey = 4;
    public static final int ISKEY_FIELD_NUMBER = 4;
    private boolean isKey_;
    /**
     * <code>optional bool isKey = 4;</code>
     *
     * <pre>
     **是否是主键*
     * </pre>
     */
    public boolean hasIsKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool isKey = 4;</code>
     *
     * <pre>
     **是否是主键*
     * </pre>
     */
    public boolean getIsKey() {
      return isKey_;
    }

    // optional bool updated = 5;
    public static final int UPDATED_FIELD_NUMBER = 5;
    private boolean updated_;
    /**
     * <code>optional bool updated = 5;</code>
     *
     * <pre>
     **如果EventType=UPDATE,用于标识这个字段值是否有修改*
     * </pre>
     */
    public boolean hasUpdated() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool updated = 5;</code>
     *
     * <pre>
     **如果EventType=UPDATE,用于标识这个字段值是否有修改*
     * </pre>
     */
    public boolean getUpdated() {
      return updated_;
    }

    // optional bool isNull = 6 [default = false];
    public static final int ISNULL_FIELD_NUMBER = 6;
    private boolean isNull_;
    /**
     * <code>optional bool isNull = 6 [default = false];</code>
     *
     * <pre>
     ** 标识是否为空  *
     * </pre>
     */
    public boolean hasIsNull() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool isNull = 6 [default = false];</code>
     *
     * <pre>
     ** 标识是否为空  *
     * </pre>
     */
    public boolean getIsNull() {
      return isNull_;
    }

    // repeated .protocol.protobuf.Pair props = 7;
    public static final int PROPS_FIELD_NUMBER = 7;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 7;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    // optional string value = 8;
    public static final int VALUE_FIELD_NUMBER = 8;
    private java.lang.Object value_;
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string value = 8;</code>
     *
     * <pre>
     ** 字段值,timestamp,Datetime是一个时间格式的文本 *
     * </pre>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 length = 9;
    public static final int LENGTH_FIELD_NUMBER = 9;
    private int length_;
    /**
     * <code>optional int32 length = 9;</code>
     *
     * <pre>
     ** 对应数据对象原始长度 *
     * </pre>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 length = 9;</code>
     *
     * <pre>
     ** 对应数据对象原始长度 *
     * </pre>
     */
    public int getLength() {
      return length_;
    }

    // optional string mysqlType = 10;
    public static final int MYSQLTYPE_FIELD_NUMBER = 10;
    private java.lang.Object mysqlType_;
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    public boolean hasMysqlType() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    public java.lang.String getMysqlType() {
      java.lang.Object ref = mysqlType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mysqlType_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mysqlType = 10;</code>
     *
     * <pre>
     **字段mysql类型*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMysqlTypeBytes() {
      java.lang.Object ref = mysqlType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mysqlType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      index_ = 0;
      sqlType_ = 0;
      name_ = "";
      isKey_ = false;
      updated_ = false;
      isNull_ = false;
      props_ = java.util.Collections.emptyList();
      value_ = "";
      length_ = 0;
      mysqlType_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, sqlType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, isKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, updated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, isNull_);
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(7, props_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(8, getValueBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(9, length_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(10, getMysqlTypeBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sqlType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, updated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isNull_);
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, props_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getValueBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, length_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getMysqlTypeBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.Column parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Column parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Column parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Column parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Column parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Column parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.Column parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.Column parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.Column parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Column parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.Column prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.Column}
     *
     * <pre>
     **每个字段的数据结构*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.ColumnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_Column_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_Column_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.Column.class, CanalEntry.Column.Builder.class);
      }

      // Construct using CanalEntry.Column.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        index_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sqlType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        isKey_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        updated_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        isNull_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          propsBuilder_.clear();
        }
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        length_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        mysqlType_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_Column_descriptor;
      }

      public CanalEntry.Column getDefaultInstanceForType() {
        return CanalEntry.Column.getDefaultInstance();
      }

      public CanalEntry.Column build() {
        CanalEntry.Column result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.Column buildPartial() {
        CanalEntry.Column result = new CanalEntry.Column(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.index_ = index_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sqlType_ = sqlType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.isKey_ = isKey_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.updated_ = updated_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.isNull_ = isNull_;
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000040;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000080;
        }
        result.length_ = length_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000100;
        }
        result.mysqlType_ = mysqlType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.Column) {
          return mergeFrom((CanalEntry.Column)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.Column other) {
        if (other == CanalEntry.Column.getDefaultInstance()) return this;
        if (other.hasIndex()) {
          setIndex(other.getIndex());
        }
        if (other.hasSqlType()) {
          setSqlType(other.getSqlType());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000004;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasIsKey()) {
          setIsKey(other.getIsKey());
        }
        if (other.hasUpdated()) {
          setUpdated(other.getUpdated());
        }
        if (other.hasIsNull()) {
          setIsNull(other.getIsNull());
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000040);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000080;
          value_ = other.value_;
          onChanged();
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        if (other.hasMysqlType()) {
          bitField0_ |= 0x00000200;
          mysqlType_ = other.mysqlType_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.Column parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.Column) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 index = 1;
      private int index_ ;
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       **字段下标*
       * </pre>
       */
      public boolean hasIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       **字段下标*
       * </pre>
       */
      public int getIndex() {
        return index_;
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       **字段下标*
       * </pre>
       */
      public Builder setIndex(int value) {
        bitField0_ |= 0x00000001;
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       **字段下标*
       * </pre>
       */
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0;
        onChanged();
        return this;
      }

      // optional int32 sqlType = 2;
      private int sqlType_ ;
      /**
       * <code>optional int32 sqlType = 2;</code>
       *
       * <pre>
       **字段java中类型*
       * </pre>
       */
      public boolean hasSqlType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 sqlType = 2;</code>
       *
       * <pre>
       **字段java中类型*
       * </pre>
       */
      public int getSqlType() {
        return sqlType_;
      }
      /**
       * <code>optional int32 sqlType = 2;</code>
       *
       * <pre>
       **字段java中类型*
       * </pre>
       */
      public Builder setSqlType(int value) {
        bitField0_ |= 0x00000002;
        sqlType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 sqlType = 2;</code>
       *
       * <pre>
       **字段java中类型*
       * </pre>
       */
      public Builder clearSqlType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sqlType_ = 0;
        onChanged();
        return this;
      }

      // optional string name = 3;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       *
       * <pre>
       **字段名称(忽略大小写)，在mysql中是没有的*
       * </pre>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }

      // optional bool isKey = 4;
      private boolean isKey_ ;
      /**
       * <code>optional bool isKey = 4;</code>
       *
       * <pre>
       **是否是主键*
       * </pre>
       */
      public boolean hasIsKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool isKey = 4;</code>
       *
       * <pre>
       **是否是主键*
       * </pre>
       */
      public boolean getIsKey() {
        return isKey_;
      }
      /**
       * <code>optional bool isKey = 4;</code>
       *
       * <pre>
       **是否是主键*
       * </pre>
       */
      public Builder setIsKey(boolean value) {
        bitField0_ |= 0x00000008;
        isKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isKey = 4;</code>
       *
       * <pre>
       **是否是主键*
       * </pre>
       */
      public Builder clearIsKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isKey_ = false;
        onChanged();
        return this;
      }

      // optional bool updated = 5;
      private boolean updated_ ;
      /**
       * <code>optional bool updated = 5;</code>
       *
       * <pre>
       **如果EventType=UPDATE,用于标识这个字段值是否有修改*
       * </pre>
       */
      public boolean hasUpdated() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool updated = 5;</code>
       *
       * <pre>
       **如果EventType=UPDATE,用于标识这个字段值是否有修改*
       * </pre>
       */
      public boolean getUpdated() {
        return updated_;
      }
      /**
       * <code>optional bool updated = 5;</code>
       *
       * <pre>
       **如果EventType=UPDATE,用于标识这个字段值是否有修改*
       * </pre>
       */
      public Builder setUpdated(boolean value) {
        bitField0_ |= 0x00000010;
        updated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool updated = 5;</code>
       *
       * <pre>
       **如果EventType=UPDATE,用于标识这个字段值是否有修改*
       * </pre>
       */
      public Builder clearUpdated() {
        bitField0_ = (bitField0_ & ~0x00000010);
        updated_ = false;
        onChanged();
        return this;
      }

      // optional bool isNull = 6 [default = false];
      private boolean isNull_ ;
      /**
       * <code>optional bool isNull = 6 [default = false];</code>
       *
       * <pre>
       ** 标识是否为空  *
       * </pre>
       */
      public boolean hasIsNull() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool isNull = 6 [default = false];</code>
       *
       * <pre>
       ** 标识是否为空  *
       * </pre>
       */
      public boolean getIsNull() {
        return isNull_;
      }
      /**
       * <code>optional bool isNull = 6 [default = false];</code>
       *
       * <pre>
       ** 标识是否为空  *
       * </pre>
       */
      public Builder setIsNull(boolean value) {
        bitField0_ |= 0x00000020;
        isNull_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isNull = 6 [default = false];</code>
       *
       * <pre>
       ** 标识是否为空  *
       * </pre>
       */
      public Builder clearIsNull() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isNull_ = false;
        onChanged();
        return this;
      }

      // repeated .protocol.protobuf.Pair props = 7;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 7;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000040) == 0x00000040),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // optional string value = 8;
      private java.lang.Object value_ = "";
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000080);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 8;</code>
       *
       * <pre>
       ** 字段值,timestamp,Datetime是一个时间格式的文本 *
       * </pre>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        value_ = value;
        onChanged();
        return this;
      }

      // optional int32 length = 9;
      private int length_ ;
      /**
       * <code>optional int32 length = 9;</code>
       *
       * <pre>
       ** 对应数据对象原始长度 *
       * </pre>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional int32 length = 9;</code>
       *
       * <pre>
       ** 对应数据对象原始长度 *
       * </pre>
       */
      public int getLength() {
        return length_;
      }
      /**
       * <code>optional int32 length = 9;</code>
       *
       * <pre>
       ** 对应数据对象原始长度 *
       * </pre>
       */
      public Builder setLength(int value) {
        bitField0_ |= 0x00000100;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 length = 9;</code>
       *
       * <pre>
       ** 对应数据对象原始长度 *
       * </pre>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000100);
        length_ = 0;
        onChanged();
        return this;
      }

      // optional string mysqlType = 10;
      private java.lang.Object mysqlType_ = "";
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public boolean hasMysqlType() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public java.lang.String getMysqlType() {
        java.lang.Object ref = mysqlType_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          mysqlType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMysqlTypeBytes() {
        java.lang.Object ref = mysqlType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mysqlType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public Builder setMysqlType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        mysqlType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public Builder clearMysqlType() {
        bitField0_ = (bitField0_ & ~0x00000200);
        mysqlType_ = getDefaultInstance().getMysqlType();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mysqlType = 10;</code>
       *
       * <pre>
       **字段mysql类型*
       * </pre>
       */
      public Builder setMysqlTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        mysqlType_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.Column)
    }

    static {
      defaultInstance = new Column(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.Column)
  }

  public interface RowDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .protocol.protobuf.Column beforeColumns = 1;
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    java.util.List<CanalEntry.Column>
        getBeforeColumnsList();
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    CanalEntry.Column getBeforeColumns(int index);
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    int getBeforeColumnsCount();
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    java.util.List<? extends CanalEntry.ColumnOrBuilder>
        getBeforeColumnsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    CanalEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
        int index);

    // repeated .protocol.protobuf.Column afterColumns = 2;
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    java.util.List<CanalEntry.Column>
        getAfterColumnsList();
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    CanalEntry.Column getAfterColumns(int index);
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    int getAfterColumnsCount();
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    java.util.List<? extends CanalEntry.ColumnOrBuilder>
        getAfterColumnsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    CanalEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
        int index);

    // repeated .protocol.protobuf.Pair props = 3;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code protocol.protobuf.RowData}
   */
  public static final class RowData extends
      com.google.protobuf.GeneratedMessage
      implements RowDataOrBuilder {
    // Use RowData.newBuilder() to construct.
    private RowData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RowData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RowData defaultInstance;
    public static RowData getDefaultInstance() {
      return defaultInstance;
    }

    public RowData getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RowData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                beforeColumns_ = new java.util.ArrayList<CanalEntry.Column>();
                mutable_bitField0_ |= 0x00000001;
              }
              beforeColumns_.add(input.readMessage(CanalEntry.Column.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                afterColumns_ = new java.util.ArrayList<CanalEntry.Column>();
                mutable_bitField0_ |= 0x00000002;
              }
              afterColumns_.add(input.readMessage(CanalEntry.Column.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000004;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          beforeColumns_ = java.util.Collections.unmodifiableList(beforeColumns_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          afterColumns_ = java.util.Collections.unmodifiableList(afterColumns_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_RowData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_RowData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.RowData.class, CanalEntry.RowData.Builder.class);
    }

    public static com.google.protobuf.Parser<RowData> PARSER =
        new com.google.protobuf.AbstractParser<RowData>() {
      public RowData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RowData(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RowData> getParserForType() {
      return PARSER;
    }

    // repeated .protocol.protobuf.Column beforeColumns = 1;
    public static final int BEFORECOLUMNS_FIELD_NUMBER = 1;
    private java.util.List<CanalEntry.Column> beforeColumns_;
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    public java.util.List<CanalEntry.Column> getBeforeColumnsList() {
      return beforeColumns_;
    }
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    public java.util.List<? extends CanalEntry.ColumnOrBuilder>
        getBeforeColumnsOrBuilderList() {
      return beforeColumns_;
    }
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    public int getBeforeColumnsCount() {
      return beforeColumns_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    public CanalEntry.Column getBeforeColumns(int index) {
      return beforeColumns_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改前,删除前) *
     * </pre>
     */
    public CanalEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
        int index) {
      return beforeColumns_.get(index);
    }

    // repeated .protocol.protobuf.Column afterColumns = 2;
    public static final int AFTERCOLUMNS_FIELD_NUMBER = 2;
    private java.util.List<CanalEntry.Column> afterColumns_;
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    public java.util.List<CanalEntry.Column> getAfterColumnsList() {
      return afterColumns_;
    }
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    public java.util.List<? extends CanalEntry.ColumnOrBuilder>
        getAfterColumnsOrBuilderList() {
      return afterColumns_;
    }
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    public int getAfterColumnsCount() {
      return afterColumns_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    public CanalEntry.Column getAfterColumns(int index) {
      return afterColumns_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
     *
     * <pre>
     ** 字段信息，增量数据(修改后,新增后)  *
     * </pre>
     */
    public CanalEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
        int index) {
      return afterColumns_.get(index);
    }

    // repeated .protocol.protobuf.Pair props = 3;
    public static final int PROPS_FIELD_NUMBER = 3;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    private void initFields() {
      beforeColumns_ = java.util.Collections.emptyList();
      afterColumns_ = java.util.Collections.emptyList();
      props_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < beforeColumns_.size(); i++) {
        output.writeMessage(1, beforeColumns_.get(i));
      }
      for (int i = 0; i < afterColumns_.size(); i++) {
        output.writeMessage(2, afterColumns_.get(i));
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(3, props_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < beforeColumns_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, beforeColumns_.get(i));
      }
      for (int i = 0; i < afterColumns_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, afterColumns_.get(i));
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, props_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.RowData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.RowData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.RowData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.RowData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.RowData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.RowData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.RowData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.RowData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.RowData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.RowData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.RowData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.RowData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.RowDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_RowData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_RowData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.RowData.class, CanalEntry.RowData.Builder.class);
      }

      // Construct using CanalEntry.RowData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBeforeColumnsFieldBuilder();
          getAfterColumnsFieldBuilder();
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (beforeColumnsBuilder_ == null) {
          beforeColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          beforeColumnsBuilder_.clear();
        }
        if (afterColumnsBuilder_ == null) {
          afterColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          afterColumnsBuilder_.clear();
        }
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          propsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_RowData_descriptor;
      }

      public CanalEntry.RowData getDefaultInstanceForType() {
        return CanalEntry.RowData.getDefaultInstance();
      }

      public CanalEntry.RowData build() {
        CanalEntry.RowData result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.RowData buildPartial() {
        CanalEntry.RowData result = new CanalEntry.RowData(this);
        int from_bitField0_ = bitField0_;
        if (beforeColumnsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            beforeColumns_ = java.util.Collections.unmodifiableList(beforeColumns_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.beforeColumns_ = beforeColumns_;
        } else {
          result.beforeColumns_ = beforeColumnsBuilder_.build();
        }
        if (afterColumnsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            afterColumns_ = java.util.Collections.unmodifiableList(afterColumns_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.afterColumns_ = afterColumns_;
        } else {
          result.afterColumns_ = afterColumnsBuilder_.build();
        }
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.RowData) {
          return mergeFrom((CanalEntry.RowData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.RowData other) {
        if (other == CanalEntry.RowData.getDefaultInstance()) return this;
        if (beforeColumnsBuilder_ == null) {
          if (!other.beforeColumns_.isEmpty()) {
            if (beforeColumns_.isEmpty()) {
              beforeColumns_ = other.beforeColumns_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBeforeColumnsIsMutable();
              beforeColumns_.addAll(other.beforeColumns_);
            }
            onChanged();
          }
        } else {
          if (!other.beforeColumns_.isEmpty()) {
            if (beforeColumnsBuilder_.isEmpty()) {
              beforeColumnsBuilder_.dispose();
              beforeColumnsBuilder_ = null;
              beforeColumns_ = other.beforeColumns_;
              bitField0_ = (bitField0_ & ~0x00000001);
              beforeColumnsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getBeforeColumnsFieldBuilder() : null;
            } else {
              beforeColumnsBuilder_.addAllMessages(other.beforeColumns_);
            }
          }
        }
        if (afterColumnsBuilder_ == null) {
          if (!other.afterColumns_.isEmpty()) {
            if (afterColumns_.isEmpty()) {
              afterColumns_ = other.afterColumns_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAfterColumnsIsMutable();
              afterColumns_.addAll(other.afterColumns_);
            }
            onChanged();
          }
        } else {
          if (!other.afterColumns_.isEmpty()) {
            if (afterColumnsBuilder_.isEmpty()) {
              afterColumnsBuilder_.dispose();
              afterColumnsBuilder_ = null;
              afterColumns_ = other.afterColumns_;
              bitField0_ = (bitField0_ & ~0x00000002);
              afterColumnsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAfterColumnsFieldBuilder() : null;
            } else {
              afterColumnsBuilder_.addAllMessages(other.afterColumns_);
            }
          }
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.RowData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.RowData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .protocol.protobuf.Column beforeColumns = 1;
      private java.util.List<CanalEntry.Column> beforeColumns_ =
        java.util.Collections.emptyList();
      private void ensureBeforeColumnsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          beforeColumns_ = new java.util.ArrayList<CanalEntry.Column>(beforeColumns_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder> beforeColumnsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public java.util.List<CanalEntry.Column> getBeforeColumnsList() {
        if (beforeColumnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(beforeColumns_);
        } else {
          return beforeColumnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public int getBeforeColumnsCount() {
        if (beforeColumnsBuilder_ == null) {
          return beforeColumns_.size();
        } else {
          return beforeColumnsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public CanalEntry.Column getBeforeColumns(int index) {
        if (beforeColumnsBuilder_ == null) {
          return beforeColumns_.get(index);
        } else {
          return beforeColumnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder setBeforeColumns(
          int index, CanalEntry.Column value) {
        if (beforeColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeforeColumnsIsMutable();
          beforeColumns_.set(index, value);
          onChanged();
        } else {
          beforeColumnsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder setBeforeColumns(
          int index, CanalEntry.Column.Builder builderForValue) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          beforeColumns_.set(index, builderForValue.build());
          onChanged();
        } else {
          beforeColumnsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder addBeforeColumns(CanalEntry.Column value) {
        if (beforeColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeforeColumnsIsMutable();
          beforeColumns_.add(value);
          onChanged();
        } else {
          beforeColumnsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder addBeforeColumns(
          int index, CanalEntry.Column value) {
        if (beforeColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeforeColumnsIsMutable();
          beforeColumns_.add(index, value);
          onChanged();
        } else {
          beforeColumnsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder addBeforeColumns(
          CanalEntry.Column.Builder builderForValue) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          beforeColumns_.add(builderForValue.build());
          onChanged();
        } else {
          beforeColumnsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder addBeforeColumns(
          int index, CanalEntry.Column.Builder builderForValue) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          beforeColumns_.add(index, builderForValue.build());
          onChanged();
        } else {
          beforeColumnsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder addAllBeforeColumns(
          java.lang.Iterable<? extends CanalEntry.Column> values) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          super.addAll(values, beforeColumns_);
          onChanged();
        } else {
          beforeColumnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder clearBeforeColumns() {
        if (beforeColumnsBuilder_ == null) {
          beforeColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          beforeColumnsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public Builder removeBeforeColumns(int index) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          beforeColumns_.remove(index);
          onChanged();
        } else {
          beforeColumnsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public CanalEntry.Column.Builder getBeforeColumnsBuilder(
          int index) {
        return getBeforeColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public CanalEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
          int index) {
        if (beforeColumnsBuilder_ == null) {
          return beforeColumns_.get(index);  } else {
          return beforeColumnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public java.util.List<? extends CanalEntry.ColumnOrBuilder>
           getBeforeColumnsOrBuilderList() {
        if (beforeColumnsBuilder_ != null) {
          return beforeColumnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(beforeColumns_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public CanalEntry.Column.Builder addBeforeColumnsBuilder() {
        return getBeforeColumnsFieldBuilder().addBuilder(
            CanalEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public CanalEntry.Column.Builder addBeforeColumnsBuilder(
          int index) {
        return getBeforeColumnsFieldBuilder().addBuilder(
            index, CanalEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Column beforeColumns = 1;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改前,删除前) *
       * </pre>
       */
      public java.util.List<CanalEntry.Column.Builder>
           getBeforeColumnsBuilderList() {
        return getBeforeColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder>
          getBeforeColumnsFieldBuilder() {
        if (beforeColumnsBuilder_ == null) {
          beforeColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder>(
                  beforeColumns_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          beforeColumns_ = null;
        }
        return beforeColumnsBuilder_;
      }

      // repeated .protocol.protobuf.Column afterColumns = 2;
      private java.util.List<CanalEntry.Column> afterColumns_ =
        java.util.Collections.emptyList();
      private void ensureAfterColumnsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          afterColumns_ = new java.util.ArrayList<CanalEntry.Column>(afterColumns_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder> afterColumnsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public java.util.List<CanalEntry.Column> getAfterColumnsList() {
        if (afterColumnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(afterColumns_);
        } else {
          return afterColumnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public int getAfterColumnsCount() {
        if (afterColumnsBuilder_ == null) {
          return afterColumns_.size();
        } else {
          return afterColumnsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public CanalEntry.Column getAfterColumns(int index) {
        if (afterColumnsBuilder_ == null) {
          return afterColumns_.get(index);
        } else {
          return afterColumnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder setAfterColumns(
          int index, CanalEntry.Column value) {
        if (afterColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAfterColumnsIsMutable();
          afterColumns_.set(index, value);
          onChanged();
        } else {
          afterColumnsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder setAfterColumns(
          int index, CanalEntry.Column.Builder builderForValue) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          afterColumns_.set(index, builderForValue.build());
          onChanged();
        } else {
          afterColumnsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder addAfterColumns(CanalEntry.Column value) {
        if (afterColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAfterColumnsIsMutable();
          afterColumns_.add(value);
          onChanged();
        } else {
          afterColumnsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder addAfterColumns(
          int index, CanalEntry.Column value) {
        if (afterColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAfterColumnsIsMutable();
          afterColumns_.add(index, value);
          onChanged();
        } else {
          afterColumnsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder addAfterColumns(
          CanalEntry.Column.Builder builderForValue) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          afterColumns_.add(builderForValue.build());
          onChanged();
        } else {
          afterColumnsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder addAfterColumns(
          int index, CanalEntry.Column.Builder builderForValue) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          afterColumns_.add(index, builderForValue.build());
          onChanged();
        } else {
          afterColumnsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder addAllAfterColumns(
          java.lang.Iterable<? extends CanalEntry.Column> values) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          super.addAll(values, afterColumns_);
          onChanged();
        } else {
          afterColumnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder clearAfterColumns() {
        if (afterColumnsBuilder_ == null) {
          afterColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          afterColumnsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public Builder removeAfterColumns(int index) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          afterColumns_.remove(index);
          onChanged();
        } else {
          afterColumnsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public CanalEntry.Column.Builder getAfterColumnsBuilder(
          int index) {
        return getAfterColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public CanalEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
          int index) {
        if (afterColumnsBuilder_ == null) {
          return afterColumns_.get(index);  } else {
          return afterColumnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public java.util.List<? extends CanalEntry.ColumnOrBuilder>
           getAfterColumnsOrBuilderList() {
        if (afterColumnsBuilder_ != null) {
          return afterColumnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(afterColumns_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public CanalEntry.Column.Builder addAfterColumnsBuilder() {
        return getAfterColumnsFieldBuilder().addBuilder(
            CanalEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public CanalEntry.Column.Builder addAfterColumnsBuilder(
          int index) {
        return getAfterColumnsFieldBuilder().addBuilder(
            index, CanalEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Column afterColumns = 2;</code>
       *
       * <pre>
       ** 字段信息，增量数据(修改后,新增后)  *
       * </pre>
       */
      public java.util.List<CanalEntry.Column.Builder>
           getAfterColumnsBuilderList() {
        return getAfterColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder>
          getAfterColumnsFieldBuilder() {
        if (afterColumnsBuilder_ == null) {
          afterColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Column, CanalEntry.Column.Builder, CanalEntry.ColumnOrBuilder>(
                  afterColumns_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          afterColumns_ = null;
        }
        return afterColumnsBuilder_;
      }

      // repeated .protocol.protobuf.Pair props = 3;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.RowData)
    }

    static {
      defaultInstance = new RowData(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.RowData)
  }

  public interface RowChangeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 tableId = 1;
    /**
     * <code>optional int64 tableId = 1;</code>
     *
     * <pre>
     **tableId,由数据库产生*
     * </pre>
     */
    boolean hasTableId();
    /**
     * <code>optional int64 tableId = 1;</code>
     *
     * <pre>
     **tableId,由数据库产生*
     * </pre>
     */
    long getTableId();

    // optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    boolean hasEventType();
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    CanalEntry.EventType getEventType();

    // optional bool isDdl = 10 [default = false];
    /**
     * <code>optional bool isDdl = 10 [default = false];</code>
     *
     * <pre>
     ** 标识是否是ddl语句  *
     * </pre>
     */
    boolean hasIsDdl();
    /**
     * <code>optional bool isDdl = 10 [default = false];</code>
     *
     * <pre>
     ** 标识是否是ddl语句  *
     * </pre>
     */
    boolean getIsDdl();

    // optional string sql = 11;
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    boolean hasSql();
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    java.lang.String getSql();
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    com.google.protobuf.ByteString
        getSqlBytes();

    // repeated .protocol.protobuf.RowData rowDatas = 12;
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    java.util.List<CanalEntry.RowData>
        getRowDatasList();
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    CanalEntry.RowData getRowDatas(int index);
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    int getRowDatasCount();
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    java.util.List<? extends CanalEntry.RowDataOrBuilder>
        getRowDatasOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    CanalEntry.RowDataOrBuilder getRowDatasOrBuilder(
        int index);

    // repeated .protocol.protobuf.Pair props = 13;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);

    // optional string ddlSchemaName = 14;
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    boolean hasDdlSchemaName();
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    java.lang.String getDdlSchemaName();
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    com.google.protobuf.ByteString
        getDdlSchemaNameBytes();
  }
  /**
   * Protobuf type {@code protocol.protobuf.RowChange}
   *
   * <pre>
   **message row 每行变更数据的数据结构*
   * </pre>
   */
  public static final class RowChange extends
      com.google.protobuf.GeneratedMessage
      implements RowChangeOrBuilder {
    // Use RowChange.newBuilder() to construct.
    private RowChange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RowChange(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RowChange defaultInstance;
    public static RowChange getDefaultInstance() {
      return defaultInstance;
    }

    public RowChange getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RowChange(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              tableId_ = input.readInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              CanalEntry.EventType value = CanalEntry.EventType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                eventType_ = value;
              }
              break;
            }
            case 80: {
              bitField0_ |= 0x00000004;
              isDdl_ = input.readBool();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000008;
              sql_ = input.readBytes();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                rowDatas_ = new java.util.ArrayList<CanalEntry.RowData>();
                mutable_bitField0_ |= 0x00000010;
              }
              rowDatas_.add(input.readMessage(CanalEntry.RowData.PARSER, extensionRegistry));
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000020;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
            case 114: {
              bitField0_ |= 0x00000010;
              ddlSchemaName_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          rowDatas_ = java.util.Collections.unmodifiableList(rowDatas_);
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_RowChange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_RowChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.RowChange.class, CanalEntry.RowChange.Builder.class);
    }

    public static com.google.protobuf.Parser<RowChange> PARSER =
        new com.google.protobuf.AbstractParser<RowChange>() {
      public RowChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RowChange(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RowChange> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 tableId = 1;
    public static final int TABLEID_FIELD_NUMBER = 1;
    private long tableId_;
    /**
     * <code>optional int64 tableId = 1;</code>
     *
     * <pre>
     **tableId,由数据库产生*
     * </pre>
     */
    public boolean hasTableId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 tableId = 1;</code>
     *
     * <pre>
     **tableId,由数据库产生*
     * </pre>
     */
    public long getTableId() {
      return tableId_;
    }

    // optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];
    public static final int EVENTTYPE_FIELD_NUMBER = 2;
    private CanalEntry.EventType eventType_;
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    public boolean hasEventType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
     *
     * <pre>
     **数据变更类型*
     * </pre>
     */
    public CanalEntry.EventType getEventType() {
      return eventType_;
    }

    // optional bool isDdl = 10 [default = false];
    public static final int ISDDL_FIELD_NUMBER = 10;
    private boolean isDdl_;
    /**
     * <code>optional bool isDdl = 10 [default = false];</code>
     *
     * <pre>
     ** 标识是否是ddl语句  *
     * </pre>
     */
    public boolean hasIsDdl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool isDdl = 10 [default = false];</code>
     *
     * <pre>
     ** 标识是否是ddl语句  *
     * </pre>
     */
    public boolean getIsDdl() {
      return isDdl_;
    }

    // optional string sql = 11;
    public static final int SQL_FIELD_NUMBER = 11;
    private java.lang.Object sql_;
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    public boolean hasSql() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    public java.lang.String getSql() {
      java.lang.Object ref = sql_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sql_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sql = 11;</code>
     *
     * <pre>
     ** ddl/query的sql语句  *
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSqlBytes() {
      java.lang.Object ref = sql_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sql_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .protocol.protobuf.RowData rowDatas = 12;
    public static final int ROWDATAS_FIELD_NUMBER = 12;
    private java.util.List<CanalEntry.RowData> rowDatas_;
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    public java.util.List<CanalEntry.RowData> getRowDatasList() {
      return rowDatas_;
    }
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    public java.util.List<? extends CanalEntry.RowDataOrBuilder>
        getRowDatasOrBuilderList() {
      return rowDatas_;
    }
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    public int getRowDatasCount() {
      return rowDatas_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    public CanalEntry.RowData getRowDatas(int index) {
      return rowDatas_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
     *
     * <pre>
     ** 一次数据库变更可能存在多行  *
     * </pre>
     */
    public CanalEntry.RowDataOrBuilder getRowDatasOrBuilder(
        int index) {
      return rowDatas_.get(index);
    }

    // repeated .protocol.protobuf.Pair props = 13;
    public static final int PROPS_FIELD_NUMBER = 13;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 13;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    // optional string ddlSchemaName = 14;
    public static final int DDLSCHEMANAME_FIELD_NUMBER = 14;
    private java.lang.Object ddlSchemaName_;
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    public boolean hasDdlSchemaName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    public java.lang.String getDdlSchemaName() {
      java.lang.Object ref = ddlSchemaName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ddlSchemaName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ddlSchemaName = 14;</code>
     *
     * <pre>
     ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDdlSchemaNameBytes() {
      java.lang.Object ref = ddlSchemaName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ddlSchemaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      tableId_ = 0L;
      eventType_ = CanalEntry.EventType.UPDATE;
      isDdl_ = false;
      sql_ = "";
      rowDatas_ = java.util.Collections.emptyList();
      props_ = java.util.Collections.emptyList();
      ddlSchemaName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, tableId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, eventType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(10, isDdl_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(11, getSqlBytes());
      }
      for (int i = 0; i < rowDatas_.size(); i++) {
        output.writeMessage(12, rowDatas_.get(i));
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(13, props_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(14, getDdlSchemaNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, tableId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, eventType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isDdl_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getSqlBytes());
      }
      for (int i = 0; i < rowDatas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, rowDatas_.get(i));
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, props_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(14, getDdlSchemaNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.RowChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.RowChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.RowChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.RowChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.RowChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.RowChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.RowChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.RowChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.RowChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.RowChange parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.RowChange prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.RowChange}
     *
     * <pre>
     **message row 每行变更数据的数据结构*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.RowChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_RowChange_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_RowChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.RowChange.class, CanalEntry.RowChange.Builder.class);
      }

      // Construct using CanalEntry.RowChange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRowDatasFieldBuilder();
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        tableId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        eventType_ = CanalEntry.EventType.UPDATE;
        bitField0_ = (bitField0_ & ~0x00000002);
        isDdl_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        sql_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        if (rowDatasBuilder_ == null) {
          rowDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          rowDatasBuilder_.clear();
        }
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          propsBuilder_.clear();
        }
        ddlSchemaName_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_RowChange_descriptor;
      }

      public CanalEntry.RowChange getDefaultInstanceForType() {
        return CanalEntry.RowChange.getDefaultInstance();
      }

      public CanalEntry.RowChange build() {
        CanalEntry.RowChange result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.RowChange buildPartial() {
        CanalEntry.RowChange result = new CanalEntry.RowChange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tableId_ = tableId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.eventType_ = eventType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.isDdl_ = isDdl_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sql_ = sql_;
        if (rowDatasBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            rowDatas_ = java.util.Collections.unmodifiableList(rowDatas_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.rowDatas_ = rowDatas_;
        } else {
          result.rowDatas_ = rowDatasBuilder_.build();
        }
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        result.ddlSchemaName_ = ddlSchemaName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.RowChange) {
          return mergeFrom((CanalEntry.RowChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.RowChange other) {
        if (other == CanalEntry.RowChange.getDefaultInstance()) return this;
        if (other.hasTableId()) {
          setTableId(other.getTableId());
        }
        if (other.hasEventType()) {
          setEventType(other.getEventType());
        }
        if (other.hasIsDdl()) {
          setIsDdl(other.getIsDdl());
        }
        if (other.hasSql()) {
          bitField0_ |= 0x00000008;
          sql_ = other.sql_;
          onChanged();
        }
        if (rowDatasBuilder_ == null) {
          if (!other.rowDatas_.isEmpty()) {
            if (rowDatas_.isEmpty()) {
              rowDatas_ = other.rowDatas_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureRowDatasIsMutable();
              rowDatas_.addAll(other.rowDatas_);
            }
            onChanged();
          }
        } else {
          if (!other.rowDatas_.isEmpty()) {
            if (rowDatasBuilder_.isEmpty()) {
              rowDatasBuilder_.dispose();
              rowDatasBuilder_ = null;
              rowDatas_ = other.rowDatas_;
              bitField0_ = (bitField0_ & ~0x00000010);
              rowDatasBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRowDatasFieldBuilder() : null;
            } else {
              rowDatasBuilder_.addAllMessages(other.rowDatas_);
            }
          }
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000020);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        if (other.hasDdlSchemaName()) {
          bitField0_ |= 0x00000040;
          ddlSchemaName_ = other.ddlSchemaName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.RowChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.RowChange) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 tableId = 1;
      private long tableId_ ;
      /**
       * <code>optional int64 tableId = 1;</code>
       *
       * <pre>
       **tableId,由数据库产生*
       * </pre>
       */
      public boolean hasTableId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 tableId = 1;</code>
       *
       * <pre>
       **tableId,由数据库产生*
       * </pre>
       */
      public long getTableId() {
        return tableId_;
      }
      /**
       * <code>optional int64 tableId = 1;</code>
       *
       * <pre>
       **tableId,由数据库产生*
       * </pre>
       */
      public Builder setTableId(long value) {
        bitField0_ |= 0x00000001;
        tableId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 tableId = 1;</code>
       *
       * <pre>
       **tableId,由数据库产生*
       * </pre>
       */
      public Builder clearTableId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tableId_ = 0L;
        onChanged();
        return this;
      }

      // optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];
      private CanalEntry.EventType eventType_ = CanalEntry.EventType.UPDATE;
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public boolean hasEventType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public CanalEntry.EventType getEventType() {
        return eventType_;
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public Builder setEventType(CanalEntry.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protocol.protobuf.EventType eventType = 2 [default = UPDATE];</code>
       *
       * <pre>
       **数据变更类型*
       * </pre>
       */
      public Builder clearEventType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        eventType_ = CanalEntry.EventType.UPDATE;
        onChanged();
        return this;
      }

      // optional bool isDdl = 10 [default = false];
      private boolean isDdl_ ;
      /**
       * <code>optional bool isDdl = 10 [default = false];</code>
       *
       * <pre>
       ** 标识是否是ddl语句  *
       * </pre>
       */
      public boolean hasIsDdl() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool isDdl = 10 [default = false];</code>
       *
       * <pre>
       ** 标识是否是ddl语句  *
       * </pre>
       */
      public boolean getIsDdl() {
        return isDdl_;
      }
      /**
       * <code>optional bool isDdl = 10 [default = false];</code>
       *
       * <pre>
       ** 标识是否是ddl语句  *
       * </pre>
       */
      public Builder setIsDdl(boolean value) {
        bitField0_ |= 0x00000004;
        isDdl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isDdl = 10 [default = false];</code>
       *
       * <pre>
       ** 标识是否是ddl语句  *
       * </pre>
       */
      public Builder clearIsDdl() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isDdl_ = false;
        onChanged();
        return this;
      }

      // optional string sql = 11;
      private java.lang.Object sql_ = "";
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public boolean hasSql() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public java.lang.String getSql() {
        java.lang.Object ref = sql_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          sql_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSqlBytes() {
        java.lang.Object ref = sql_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sql_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public Builder setSql(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        sql_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public Builder clearSql() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sql_ = getDefaultInstance().getSql();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sql = 11;</code>
       *
       * <pre>
       ** ddl/query的sql语句  *
       * </pre>
       */
      public Builder setSqlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        sql_ = value;
        onChanged();
        return this;
      }

      // repeated .protocol.protobuf.RowData rowDatas = 12;
      private java.util.List<CanalEntry.RowData> rowDatas_ =
        java.util.Collections.emptyList();
      private void ensureRowDatasIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          rowDatas_ = new java.util.ArrayList<CanalEntry.RowData>(rowDatas_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.RowData, CanalEntry.RowData.Builder, CanalEntry.RowDataOrBuilder> rowDatasBuilder_;

      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public java.util.List<CanalEntry.RowData> getRowDatasList() {
        if (rowDatasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rowDatas_);
        } else {
          return rowDatasBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public int getRowDatasCount() {
        if (rowDatasBuilder_ == null) {
          return rowDatas_.size();
        } else {
          return rowDatasBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public CanalEntry.RowData getRowDatas(int index) {
        if (rowDatasBuilder_ == null) {
          return rowDatas_.get(index);
        } else {
          return rowDatasBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder setRowDatas(
          int index, CanalEntry.RowData value) {
        if (rowDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDatasIsMutable();
          rowDatas_.set(index, value);
          onChanged();
        } else {
          rowDatasBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder setRowDatas(
          int index, CanalEntry.RowData.Builder builderForValue) {
        if (rowDatasBuilder_ == null) {
          ensureRowDatasIsMutable();
          rowDatas_.set(index, builderForValue.build());
          onChanged();
        } else {
          rowDatasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder addRowDatas(CanalEntry.RowData value) {
        if (rowDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDatasIsMutable();
          rowDatas_.add(value);
          onChanged();
        } else {
          rowDatasBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder addRowDatas(
          int index, CanalEntry.RowData value) {
        if (rowDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDatasIsMutable();
          rowDatas_.add(index, value);
          onChanged();
        } else {
          rowDatasBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder addRowDatas(
          CanalEntry.RowData.Builder builderForValue) {
        if (rowDatasBuilder_ == null) {
          ensureRowDatasIsMutable();
          rowDatas_.add(builderForValue.build());
          onChanged();
        } else {
          rowDatasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder addRowDatas(
          int index, CanalEntry.RowData.Builder builderForValue) {
        if (rowDatasBuilder_ == null) {
          ensureRowDatasIsMutable();
          rowDatas_.add(index, builderForValue.build());
          onChanged();
        } else {
          rowDatasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder addAllRowDatas(
          java.lang.Iterable<? extends CanalEntry.RowData> values) {
        if (rowDatasBuilder_ == null) {
          ensureRowDatasIsMutable();
          super.addAll(values, rowDatas_);
          onChanged();
        } else {
          rowDatasBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder clearRowDatas() {
        if (rowDatasBuilder_ == null) {
          rowDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          rowDatasBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public Builder removeRowDatas(int index) {
        if (rowDatasBuilder_ == null) {
          ensureRowDatasIsMutable();
          rowDatas_.remove(index);
          onChanged();
        } else {
          rowDatasBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public CanalEntry.RowData.Builder getRowDatasBuilder(
          int index) {
        return getRowDatasFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public CanalEntry.RowDataOrBuilder getRowDatasOrBuilder(
          int index) {
        if (rowDatasBuilder_ == null) {
          return rowDatas_.get(index);  } else {
          return rowDatasBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public java.util.List<? extends CanalEntry.RowDataOrBuilder>
           getRowDatasOrBuilderList() {
        if (rowDatasBuilder_ != null) {
          return rowDatasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rowDatas_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public CanalEntry.RowData.Builder addRowDatasBuilder() {
        return getRowDatasFieldBuilder().addBuilder(
            CanalEntry.RowData.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public CanalEntry.RowData.Builder addRowDatasBuilder(
          int index) {
        return getRowDatasFieldBuilder().addBuilder(
            index, CanalEntry.RowData.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.RowData rowDatas = 12;</code>
       *
       * <pre>
       ** 一次数据库变更可能存在多行  *
       * </pre>
       */
      public java.util.List<CanalEntry.RowData.Builder>
           getRowDatasBuilderList() {
        return getRowDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.RowData, CanalEntry.RowData.Builder, CanalEntry.RowDataOrBuilder>
          getRowDatasFieldBuilder() {
        if (rowDatasBuilder_ == null) {
          rowDatasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.RowData, CanalEntry.RowData.Builder, CanalEntry.RowDataOrBuilder>(
                  rowDatas_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          rowDatas_ = null;
        }
        return rowDatasBuilder_;
      }

      // repeated .protocol.protobuf.Pair props = 13;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 13;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // optional string ddlSchemaName = 14;
      private java.lang.Object ddlSchemaName_ = "";
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public boolean hasDdlSchemaName() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public java.lang.String getDdlSchemaName() {
        java.lang.Object ref = ddlSchemaName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          ddlSchemaName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDdlSchemaNameBytes() {
        java.lang.Object ref = ddlSchemaName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ddlSchemaName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public Builder setDdlSchemaName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        ddlSchemaName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public Builder clearDdlSchemaName() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ddlSchemaName_ = getDefaultInstance().getDdlSchemaName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ddlSchemaName = 14;</code>
       *
       * <pre>
       ** ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName  *
       * </pre>
       */
      public Builder setDdlSchemaNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        ddlSchemaName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.RowChange)
    }

    static {
      defaultInstance = new RowChange(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.RowChange)
  }

  public interface TransactionBeginOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 executeTime = 1;
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    boolean hasExecuteTime();
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    long getExecuteTime();

    // optional string transactionId = 2;
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    boolean hasTransactionId();
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    java.lang.String getTransactionId();
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    com.google.protobuf.ByteString
        getTransactionIdBytes();

    // repeated .protocol.protobuf.Pair props = 3;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);

    // optional int64 threadId = 4;
    /**
     * <code>optional int64 threadId = 4;</code>
     *
     * <pre>
     **执行的thread Id*
     * </pre>
     */
    boolean hasThreadId();
    /**
     * <code>optional int64 threadId = 4;</code>
     *
     * <pre>
     **执行的thread Id*
     * </pre>
     */
    long getThreadId();
  }
  /**
   * Protobuf type {@code protocol.protobuf.TransactionBegin}
   *
   * <pre>
   **开始事务的一些信息*
   * </pre>
   */
  public static final class TransactionBegin extends
      com.google.protobuf.GeneratedMessage
      implements TransactionBeginOrBuilder {
    // Use TransactionBegin.newBuilder() to construct.
    private TransactionBegin(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TransactionBegin(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TransactionBegin defaultInstance;
    public static TransactionBegin getDefaultInstance() {
      return defaultInstance;
    }

    public TransactionBegin getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TransactionBegin(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              executeTime_ = input.readInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              transactionId_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000004;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              threadId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_TransactionBegin_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_TransactionBegin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.TransactionBegin.class, CanalEntry.TransactionBegin.Builder.class);
    }

    public static com.google.protobuf.Parser<TransactionBegin> PARSER =
        new com.google.protobuf.AbstractParser<TransactionBegin>() {
      public TransactionBegin parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransactionBegin(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionBegin> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 executeTime = 1;
    public static final int EXECUTETIME_FIELD_NUMBER = 1;
    private long executeTime_;
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    public boolean hasExecuteTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    public long getExecuteTime() {
      return executeTime_;
    }

    // optional string transactionId = 2;
    public static final int TRANSACTIONID_FIELD_NUMBER = 2;
    private java.lang.Object transactionId_;
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    public boolean hasTransactionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          transactionId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **已废弃，Begin里不提供事务id*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .protocol.protobuf.Pair props = 3;
    public static final int PROPS_FIELD_NUMBER = 3;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    // optional int64 threadId = 4;
    public static final int THREADID_FIELD_NUMBER = 4;
    private long threadId_;
    /**
     * <code>optional int64 threadId = 4;</code>
     *
     * <pre>
     **执行的thread Id*
     * </pre>
     */
    public boolean hasThreadId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 threadId = 4;</code>
     *
     * <pre>
     **执行的thread Id*
     * </pre>
     */
    public long getThreadId() {
      return threadId_;
    }

    private void initFields() {
      executeTime_ = 0L;
      transactionId_ = "";
      props_ = java.util.Collections.emptyList();
      threadId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, executeTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTransactionIdBytes());
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(3, props_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(4, threadId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, executeTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTransactionIdBytes());
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, props_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, threadId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.TransactionBegin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.TransactionBegin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.TransactionBegin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.TransactionBegin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.TransactionBegin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.TransactionBegin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.TransactionBegin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.TransactionBegin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.TransactionBegin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.TransactionBegin parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.TransactionBegin prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.TransactionBegin}
     *
     * <pre>
     **开始事务的一些信息*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.TransactionBeginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionBegin_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionBegin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.TransactionBegin.class, CanalEntry.TransactionBegin.Builder.class);
      }

      // Construct using CanalEntry.TransactionBegin.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        executeTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        transactionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          propsBuilder_.clear();
        }
        threadId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionBegin_descriptor;
      }

      public CanalEntry.TransactionBegin getDefaultInstanceForType() {
        return CanalEntry.TransactionBegin.getDefaultInstance();
      }

      public CanalEntry.TransactionBegin build() {
        CanalEntry.TransactionBegin result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.TransactionBegin buildPartial() {
        CanalEntry.TransactionBegin result = new CanalEntry.TransactionBegin(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.executeTime_ = executeTime_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.transactionId_ = transactionId_;
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.threadId_ = threadId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.TransactionBegin) {
          return mergeFrom((CanalEntry.TransactionBegin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.TransactionBegin other) {
        if (other == CanalEntry.TransactionBegin.getDefaultInstance()) return this;
        if (other.hasExecuteTime()) {
          setExecuteTime(other.getExecuteTime());
        }
        if (other.hasTransactionId()) {
          bitField0_ |= 0x00000002;
          transactionId_ = other.transactionId_;
          onChanged();
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        if (other.hasThreadId()) {
          setThreadId(other.getThreadId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.TransactionBegin parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.TransactionBegin) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 executeTime = 1;
      private long executeTime_ ;
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public boolean hasExecuteTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public long getExecuteTime() {
        return executeTime_;
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public Builder setExecuteTime(long value) {
        bitField0_ |= 0x00000001;
        executeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public Builder clearExecuteTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        executeTime_ = 0L;
        onChanged();
        return this;
      }

      // optional string transactionId = 2;
      private java.lang.Object transactionId_ = "";
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public boolean hasTransactionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public java.lang.String getTransactionId() {
        java.lang.Object ref = transactionId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          transactionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTransactionIdBytes() {
        java.lang.Object ref = transactionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transactionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public Builder setTransactionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        transactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public Builder clearTransactionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        transactionId_ = getDefaultInstance().getTransactionId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **已废弃，Begin里不提供事务id*
       * </pre>
       */
      public Builder setTransactionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        transactionId_ = value;
        onChanged();
        return this;
      }

      // repeated .protocol.protobuf.Pair props = 3;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // optional int64 threadId = 4;
      private long threadId_ ;
      /**
       * <code>optional int64 threadId = 4;</code>
       *
       * <pre>
       **执行的thread Id*
       * </pre>
       */
      public boolean hasThreadId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 threadId = 4;</code>
       *
       * <pre>
       **执行的thread Id*
       * </pre>
       */
      public long getThreadId() {
        return threadId_;
      }
      /**
       * <code>optional int64 threadId = 4;</code>
       *
       * <pre>
       **执行的thread Id*
       * </pre>
       */
      public Builder setThreadId(long value) {
        bitField0_ |= 0x00000008;
        threadId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 threadId = 4;</code>
       *
       * <pre>
       **执行的thread Id*
       * </pre>
       */
      public Builder clearThreadId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        threadId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.TransactionBegin)
    }

    static {
      defaultInstance = new TransactionBegin(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.TransactionBegin)
  }

  public interface TransactionEndOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 executeTime = 1;
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    boolean hasExecuteTime();
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    long getExecuteTime();

    // optional string transactionId = 2;
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    boolean hasTransactionId();
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    java.lang.String getTransactionId();
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    com.google.protobuf.ByteString
        getTransactionIdBytes();

    // repeated .protocol.protobuf.Pair props = 3;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<CanalEntry.Pair>
        getPropsList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.Pair getProps(int index);
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    int getPropsCount();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList();
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code protocol.protobuf.TransactionEnd}
   *
   * <pre>
   **结束事务的一些信息*
   * </pre>
   */
  public static final class TransactionEnd extends
      com.google.protobuf.GeneratedMessage
      implements TransactionEndOrBuilder {
    // Use TransactionEnd.newBuilder() to construct.
    private TransactionEnd(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TransactionEnd(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TransactionEnd defaultInstance;
    public static TransactionEnd getDefaultInstance() {
      return defaultInstance;
    }

    public TransactionEnd getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TransactionEnd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              executeTime_ = input.readInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              transactionId_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                props_ = new java.util.ArrayList<CanalEntry.Pair>();
                mutable_bitField0_ |= 0x00000004;
              }
              props_.add(input.readMessage(CanalEntry.Pair.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = java.util.Collections.unmodifiableList(props_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_TransactionEnd_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_TransactionEnd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.TransactionEnd.class, CanalEntry.TransactionEnd.Builder.class);
    }

    public static com.google.protobuf.Parser<TransactionEnd> PARSER =
        new com.google.protobuf.AbstractParser<TransactionEnd>() {
      public TransactionEnd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransactionEnd(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionEnd> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 executeTime = 1;
    public static final int EXECUTETIME_FIELD_NUMBER = 1;
    private long executeTime_;
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    public boolean hasExecuteTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 executeTime = 1;</code>
     *
     * <pre>
     **已废弃，请使用header里的executeTime*
     * </pre>
     */
    public long getExecuteTime() {
      return executeTime_;
    }

    // optional string transactionId = 2;
    public static final int TRANSACTIONID_FIELD_NUMBER = 2;
    private java.lang.Object transactionId_;
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    public boolean hasTransactionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          transactionId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string transactionId = 2;</code>
     *
     * <pre>
     **事务号*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .protocol.protobuf.Pair props = 3;
    public static final int PROPS_FIELD_NUMBER = 3;
    private java.util.List<CanalEntry.Pair> props_;
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<CanalEntry.Pair> getPropsList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public java.util.List<? extends CanalEntry.PairOrBuilder>
        getPropsOrBuilderList() {
      return props_;
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public int getPropsCount() {
      return props_.size();
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.Pair getProps(int index) {
      return props_.get(index);
    }
    /**
     * <code>repeated .protocol.protobuf.Pair props = 3;</code>
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public CanalEntry.PairOrBuilder getPropsOrBuilder(
        int index) {
      return props_.get(index);
    }

    private void initFields() {
      executeTime_ = 0L;
      transactionId_ = "";
      props_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, executeTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTransactionIdBytes());
      }
      for (int i = 0; i < props_.size(); i++) {
        output.writeMessage(3, props_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, executeTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTransactionIdBytes());
      }
      for (int i = 0; i < props_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, props_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.TransactionEnd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.TransactionEnd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.TransactionEnd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.TransactionEnd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.TransactionEnd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.TransactionEnd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.TransactionEnd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.TransactionEnd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.TransactionEnd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.TransactionEnd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.TransactionEnd prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.TransactionEnd}
     *
     * <pre>
     **结束事务的一些信息*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.TransactionEndOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionEnd_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionEnd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.TransactionEnd.class, CanalEntry.TransactionEnd.Builder.class);
      }

      // Construct using CanalEntry.TransactionEnd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPropsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        executeTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        transactionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          propsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_TransactionEnd_descriptor;
      }

      public CanalEntry.TransactionEnd getDefaultInstanceForType() {
        return CanalEntry.TransactionEnd.getDefaultInstance();
      }

      public CanalEntry.TransactionEnd build() {
        CanalEntry.TransactionEnd result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.TransactionEnd buildPartial() {
        CanalEntry.TransactionEnd result = new CanalEntry.TransactionEnd(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.executeTime_ = executeTime_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.transactionId_ = transactionId_;
        if (propsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            props_ = java.util.Collections.unmodifiableList(props_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.props_ = props_;
        } else {
          result.props_ = propsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.TransactionEnd) {
          return mergeFrom((CanalEntry.TransactionEnd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.TransactionEnd other) {
        if (other == CanalEntry.TransactionEnd.getDefaultInstance()) return this;
        if (other.hasExecuteTime()) {
          setExecuteTime(other.getExecuteTime());
        }
        if (other.hasTransactionId()) {
          bitField0_ |= 0x00000002;
          transactionId_ = other.transactionId_;
          onChanged();
        }
        if (propsBuilder_ == null) {
          if (!other.props_.isEmpty()) {
            if (props_.isEmpty()) {
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePropsIsMutable();
              props_.addAll(other.props_);
            }
            onChanged();
          }
        } else {
          if (!other.props_.isEmpty()) {
            if (propsBuilder_.isEmpty()) {
              propsBuilder_.dispose();
              propsBuilder_ = null;
              props_ = other.props_;
              bitField0_ = (bitField0_ & ~0x00000004);
              propsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropsFieldBuilder() : null;
            } else {
              propsBuilder_.addAllMessages(other.props_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.TransactionEnd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.TransactionEnd) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 executeTime = 1;
      private long executeTime_ ;
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public boolean hasExecuteTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public long getExecuteTime() {
        return executeTime_;
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public Builder setExecuteTime(long value) {
        bitField0_ |= 0x00000001;
        executeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 executeTime = 1;</code>
       *
       * <pre>
       **已废弃，请使用header里的executeTime*
       * </pre>
       */
      public Builder clearExecuteTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        executeTime_ = 0L;
        onChanged();
        return this;
      }

      // optional string transactionId = 2;
      private java.lang.Object transactionId_ = "";
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public boolean hasTransactionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public java.lang.String getTransactionId() {
        java.lang.Object ref = transactionId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          transactionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTransactionIdBytes() {
        java.lang.Object ref = transactionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transactionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public Builder setTransactionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        transactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public Builder clearTransactionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        transactionId_ = getDefaultInstance().getTransactionId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string transactionId = 2;</code>
       *
       * <pre>
       **事务号*
       * </pre>
       */
      public Builder setTransactionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        transactionId_ = value;
        onChanged();
        return this;
      }

      // repeated .protocol.protobuf.Pair props = 3;
      private java.util.List<CanalEntry.Pair> props_ =
        java.util.Collections.emptyList();
      private void ensurePropsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          props_ = new java.util.ArrayList<CanalEntry.Pair>(props_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder> propsBuilder_;

      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair> getPropsList() {
        if (propsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(props_);
        } else {
          return propsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public int getPropsCount() {
        if (propsBuilder_ == null) {
          return props_.size();
        } else {
          return propsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair getProps(int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);
        } else {
          return propsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.set(index, value);
          onChanged();
        } else {
          propsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder setProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.set(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(value);
          onChanged();
        } else {
          propsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair value) {
        if (propsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropsIsMutable();
          props_.add(index, value);
          onChanged();
        } else {
          propsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addProps(
          int index, CanalEntry.Pair.Builder builderForValue) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.add(index, builderForValue.build());
          onChanged();
        } else {
          propsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder addAllProps(
          java.lang.Iterable<? extends CanalEntry.Pair> values) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          super.addAll(values, props_);
          onChanged();
        } else {
          propsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder clearProps() {
        if (propsBuilder_ == null) {
          props_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          propsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public Builder removeProps(int index) {
        if (propsBuilder_ == null) {
          ensurePropsIsMutable();
          props_.remove(index);
          onChanged();
        } else {
          propsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder getPropsBuilder(
          int index) {
        return getPropsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.PairOrBuilder getPropsOrBuilder(
          int index) {
        if (propsBuilder_ == null) {
          return props_.get(index);  } else {
          return propsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<? extends CanalEntry.PairOrBuilder>
           getPropsOrBuilderList() {
        if (propsBuilder_ != null) {
          return propsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(props_);
        }
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder() {
        return getPropsFieldBuilder().addBuilder(
            CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public CanalEntry.Pair.Builder addPropsBuilder(
          int index) {
        return getPropsFieldBuilder().addBuilder(
            index, CanalEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .protocol.protobuf.Pair props = 3;</code>
       *
       * <pre>
       **预留扩展*
       * </pre>
       */
      public java.util.List<CanalEntry.Pair.Builder>
           getPropsBuilderList() {
        return getPropsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>
          getPropsFieldBuilder() {
        if (propsBuilder_ == null) {
          propsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CanalEntry.Pair, CanalEntry.Pair.Builder, CanalEntry.PairOrBuilder>(
                  props_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          props_ = null;
        }
        return propsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.TransactionEnd)
    }

    static {
      defaultInstance = new TransactionEnd(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.TransactionEnd)
  }

  public interface PairOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string key = 1;
    /**
     * <code>optional string key = 1;</code>
     */
    boolean hasKey();
    /**
     * <code>optional string key = 1;</code>
     */
    java.lang.String getKey();
    /**
     * <code>optional string key = 1;</code>
     */
    com.google.protobuf.ByteString
        getKeyBytes();

    // optional string value = 2;
    /**
     * <code>optional string value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>optional string value = 2;</code>
     */
    java.lang.String getValue();
    /**
     * <code>optional string value = 2;</code>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code protocol.protobuf.Pair}
   *
   * <pre>
   **预留扩展*
   * </pre>
   */
  public static final class Pair extends
      com.google.protobuf.GeneratedMessage
      implements PairOrBuilder {
    // Use Pair.newBuilder() to construct.
    private Pair(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Pair(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Pair defaultInstance;
    public static Pair getDefaultInstance() {
      return defaultInstance;
    }

    public Pair getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Pair(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CanalEntry.internal_static_protocol_protobuf_Pair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CanalEntry.internal_static_protocol_protobuf_Pair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CanalEntry.Pair.class, CanalEntry.Pair.Builder.class);
    }

    public static com.google.protobuf.Parser<Pair> PARSER =
        new com.google.protobuf.AbstractParser<Pair>() {
      public Pair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pair(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Pair> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    /**
     * <code>optional string key = 1;</code>
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          key_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    /**
     * <code>optional string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      key_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static CanalEntry.Pair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Pair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Pair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CanalEntry.Pair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CanalEntry.Pair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Pair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static CanalEntry.Pair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static CanalEntry.Pair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static CanalEntry.Pair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static CanalEntry.Pair parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CanalEntry.Pair prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.protobuf.Pair}
     *
     * <pre>
     **预留扩展*
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements CanalEntry.PairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CanalEntry.internal_static_protocol_protobuf_Pair_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CanalEntry.internal_static_protocol_protobuf_Pair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CanalEntry.Pair.class, CanalEntry.Pair.Builder.class);
      }

      // Construct using CanalEntry.Pair.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CanalEntry.internal_static_protocol_protobuf_Pair_descriptor;
      }

      public CanalEntry.Pair getDefaultInstanceForType() {
        return CanalEntry.Pair.getDefaultInstance();
      }

      public CanalEntry.Pair build() {
        CanalEntry.Pair result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CanalEntry.Pair buildPartial() {
        CanalEntry.Pair result = new CanalEntry.Pair(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CanalEntry.Pair) {
          return mergeFrom((CanalEntry.Pair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CanalEntry.Pair other) {
        if (other == CanalEntry.Pair.getDefaultInstance()) return this;
        if (other.hasKey()) {
          bitField0_ |= 0x00000001;
          key_ = other.key_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CanalEntry.Pair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CanalEntry.Pair) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string key = 1;
      private java.lang.Object key_ = "";
      /**
       * <code>optional string key = 1;</code>
       */
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public com.google.protobuf.ByteString
          getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string key = 1;</code>
       */
      public Builder setKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }

      // optional string value = 2;
      private java.lang.Object value_ = "";
      /**
       * <code>optional string value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.protobuf.Pair)
    }

    static {
      defaultInstance = new Pair(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.protobuf.Pair)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_Entry_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_Entry_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_Header_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_Header_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_Column_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_Column_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_RowData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_RowData_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_RowChange_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_RowChange_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_TransactionBegin_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_TransactionBegin_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_TransactionEnd_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_TransactionEnd_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_protobuf_Pair_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_protobuf_Pair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023EntryProtocol.proto\022\021protocol.protobuf" +
      "\"\253\001\n\005Entry\022)\n\006header\030\001 \001(\0132\031.protocol.pr" +
      "otobuf.Header\0228\n\tentryType\030\002 \001(\0162\034.proto" +
      "col.protobuf.EntryType:\007ROWDATA\022\022\n\nstore" +
      "Value\030\003 \001(\014\022\017\n\007batchId\030\004 \001(\003\022\014\n\004inId\030\005 \001" +
      "(\003\022\n\n\002ip\030\006 \001(\t\"\326\002\n\006Header\022\022\n\007version\030\001 \001" +
      "(\005:\0011\022\023\n\013logfileName\030\002 \001(\t\022\025\n\rlogfileOff" +
      "set\030\003 \001(\003\022\020\n\010serverId\030\004 \001(\003\022\024\n\014serverenC" +
      "ode\030\005 \001(\t\022\023\n\013executeTime\030\006 \001(\003\0222\n\nsource" +
      "Type\030\007 \001(\0162\027.protocol.protobuf.Type:\005MYS",
      "QL\022\022\n\nschemaName\030\010 \001(\t\022\021\n\ttableName\030\t \001(" +
      "\t\022\023\n\013eventLength\030\n \001(\003\0227\n\teventType\030\013 \001(" +
      "\0162\034.protocol.protobuf.EventType:\006UPDATE\022" +
      "&\n\005props\030\014 \003(\0132\027.protocol.protobuf.Pair\"" +
      "\307\001\n\006Column\022\r\n\005index\030\001 \001(\005\022\017\n\007sqlType\030\002 \001" +
      "(\005\022\014\n\004name\030\003 \001(\t\022\r\n\005isKey\030\004 \001(\010\022\017\n\007updat" +
      "ed\030\005 \001(\010\022\025\n\006isNull\030\006 \001(\010:\005false\022&\n\005props" +
      "\030\007 \003(\0132\027.protocol.protobuf.Pair\022\r\n\005value" +
      "\030\010 \001(\t\022\016\n\006length\030\t \001(\005\022\021\n\tmysqlType\030\n \001(" +
      "\t\"\224\001\n\007RowData\0220\n\rbeforeColumns\030\001 \003(\0132\031.p",
      "rotocol.protobuf.Column\022/\n\014afterColumns\030" +
      "\002 \003(\0132\031.protocol.protobuf.Column\022&\n\005prop" +
      "s\030\003 \003(\0132\027.protocol.protobuf.Pair\"\345\001\n\tRow" +
      "Change\022\017\n\007tableId\030\001 \001(\003\0227\n\teventType\030\002 \001" +
      "(\0162\034.protocol.protobuf.EventType:\006UPDATE" +
      "\022\024\n\005isDdl\030\n \001(\010:\005false\022\013\n\003sql\030\013 \001(\t\022,\n\010r" +
      "owDatas\030\014 \003(\0132\032.protocol.protobuf.RowDat" +
      "a\022&\n\005props\030\r \003(\0132\027.protocol.protobuf.Pai" +
      "r\022\025\n\rddlSchemaName\030\016 \001(\t\"x\n\020TransactionB" +
      "egin\022\023\n\013executeTime\030\001 \001(\003\022\025\n\rtransaction",
      "Id\030\002 \001(\t\022&\n\005props\030\003 \003(\0132\027.protocol.proto" +
      "buf.Pair\022\020\n\010threadId\030\004 \001(\003\"d\n\016Transactio" +
      "nEnd\022\023\n\013executeTime\030\001 \001(\003\022\025\n\rtransaction" +
      "Id\030\002 \001(\t\022&\n\005props\030\003 \003(\0132\027.protocol.proto" +
      "buf.Pair\"\"\n\004Pair\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\t*Q\n\tEntryType\022\024\n\020TRANSACTIONBEGIN\020\001\022" +
      "\013\n\007ROWDATA\020\002\022\022\n\016TRANSACTIONEND\020\003\022\r\n\tHEAR" +
      "TBEAT\020\004*\216\001\n\tEventType\022\n\n\006INSERT\020\001\022\n\n\006UPD" +
      "ATE\020\002\022\n\n\006DELETE\020\003\022\n\n\006CREATE\020\004\022\t\n\005ALTER\020\005" +
      "\022\t\n\005ERASE\020\006\022\t\n\005QUERY\020\007\022\014\n\010TRUNCATE\020\010\022\n\n\006",
      "RENAME\020\t\022\n\n\006CINDEX\020\n\022\n\n\006DINDEX\020\013*(\n\004Type" +
      "\022\n\n\006ORACLE\020\001\022\t\n\005MYSQL\020\002\022\t\n\005PGSQL\020\003B!\n\021pr" +
      "otocol.protobufB\nCanalEntryH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protocol_protobuf_Entry_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protocol_protobuf_Entry_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_Entry_descriptor,
              new java.lang.String[] { "Header", "EntryType", "StoreValue", "BatchId", "InId", "Ip", });
          internal_static_protocol_protobuf_Header_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_protocol_protobuf_Header_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_Header_descriptor,
              new java.lang.String[] { "Version", "LogfileName", "LogfileOffset", "ServerId", "ServerenCode", "ExecuteTime", "SourceType", "SchemaName", "TableName", "EventLength", "EventType", "Props", });
          internal_static_protocol_protobuf_Column_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_protocol_protobuf_Column_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_Column_descriptor,
              new java.lang.String[] { "Index", "SqlType", "Name", "IsKey", "Updated", "IsNull", "Props", "Value", "Length", "MysqlType", });
          internal_static_protocol_protobuf_RowData_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_protocol_protobuf_RowData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_RowData_descriptor,
              new java.lang.String[] { "BeforeColumns", "AfterColumns", "Props", });
          internal_static_protocol_protobuf_RowChange_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_protocol_protobuf_RowChange_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_RowChange_descriptor,
              new java.lang.String[] { "TableId", "EventType", "IsDdl", "Sql", "RowDatas", "Props", "DdlSchemaName", });
          internal_static_protocol_protobuf_TransactionBegin_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_protocol_protobuf_TransactionBegin_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_TransactionBegin_descriptor,
              new java.lang.String[] { "ExecuteTime", "TransactionId", "Props", "ThreadId", });
          internal_static_protocol_protobuf_TransactionEnd_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_protocol_protobuf_TransactionEnd_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_TransactionEnd_descriptor,
              new java.lang.String[] { "ExecuteTime", "TransactionId", "Props", });
          internal_static_protocol_protobuf_Pair_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_protocol_protobuf_Pair_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_protobuf_Pair_descriptor,
              new java.lang.String[] { "Key", "Value", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
