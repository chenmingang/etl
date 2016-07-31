package com.github.chenmingang.mysql.protobuf;

public final class SimpleEntry {
  private SimpleEntry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code EntryType}
   *
   * <pre>
   ** customer entry type *
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


    public final int getNumber() { return value; }

    public static EntryType valueOf(int value) {
      switch (value) {
        case 1: return TRANSACTIONBEGIN;
        case 2: return ROWDATA;
        case 3: return TRANSACTIONEND;
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
      return SimpleEntry.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:EntryType)
  }

  /**
   * Protobuf enum {@code EventType}
   *
   * <pre>
   ** mysql event type *
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
      return SimpleEntry.getDescriptor().getEnumTypes().get(1);
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

    // @@protoc_insertion_point(enum_scope:EventType)
  }

  public interface EntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Entry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    boolean hasHeader();
    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    SimpleEntry.Header getHeader();
    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    SimpleEntry.HeaderOrBuilder getHeaderOrBuilder();

    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    boolean hasRowChange();
    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    SimpleEntry.RowChange getRowChange();
    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    SimpleEntry.RowChangeOrBuilder getRowChangeOrBuilder();

    /**
     * <code>optional .EntryType entryType = 3;</code>
     *
     * <pre>
     ** entry type *
     * </pre>
     */
    boolean hasEntryType();
    /**
     * <code>optional .EntryType entryType = 3;</code>
     *
     * <pre>
     ** entry type *
     * </pre>
     */
    SimpleEntry.EntryType getEntryType();

    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    boolean hasExts();
    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.Pair getExts();
    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.PairOrBuilder getExtsOrBuilder();
  }
  /**
   * Protobuf type {@code Entry}
   *
   * <pre>
   ** message *
   * </pre>
   */
  public static final class Entry extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Entry)
      EntryOrBuilder {
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
              SimpleEntry.Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(SimpleEntry.Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              SimpleEntry.RowChange.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = rowChange_.toBuilder();
              }
              rowChange_ = input.readMessage(SimpleEntry.RowChange.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rowChange_);
                rowChange_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              SimpleEntry.EntryType value = SimpleEntry.EntryType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                entryType_ = value;
              }
              break;
            }
            case 34: {
              SimpleEntry.Pair.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = exts_.toBuilder();
              }
              exts_ = input.readMessage(SimpleEntry.Pair.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(exts_);
                exts_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
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
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.Entry.class, SimpleEntry.Entry.Builder.class);
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
    public static final int HEADER_FIELD_NUMBER = 1;
    private SimpleEntry.Header header_;
    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    public SimpleEntry.Header getHeader() {
      return header_;
    }
    /**
     * <code>optional .Header header = 1;</code>
     *
     * <pre>
     ** head *
     * </pre>
     */
    public SimpleEntry.HeaderOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    public static final int ROWCHANGE_FIELD_NUMBER = 2;
    private SimpleEntry.RowChange rowChange_;
    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    public boolean hasRowChange() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    public SimpleEntry.RowChange getRowChange() {
      return rowChange_;
    }
    /**
     * <code>optional .RowChange rowChange = 2;</code>
     *
     * <pre>
     ** body *
     * </pre>
     */
    public SimpleEntry.RowChangeOrBuilder getRowChangeOrBuilder() {
      return rowChange_;
    }

    public static final int ENTRYTYPE_FIELD_NUMBER = 3;
    private SimpleEntry.EntryType entryType_;
    /**
     * <code>optional .EntryType entryType = 3;</code>
     *
     * <pre>
     ** entry type *
     * </pre>
     */
    public boolean hasEntryType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .EntryType entryType = 3;</code>
     *
     * <pre>
     ** entry type *
     * </pre>
     */
    public SimpleEntry.EntryType getEntryType() {
      return entryType_;
    }

    public static final int EXTS_FIELD_NUMBER = 4;
    private SimpleEntry.Pair exts_;
    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public boolean hasExts() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.Pair getExts() {
      return exts_;
    }
    /**
     * <code>optional .Pair exts = 4;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.PairOrBuilder getExtsOrBuilder() {
      return exts_;
    }

    private void initFields() {
      header_ = SimpleEntry.Header.getDefaultInstance();
      rowChange_ = SimpleEntry.RowChange.getDefaultInstance();
      entryType_ = SimpleEntry.EntryType.TRANSACTIONBEGIN;
      exts_ = SimpleEntry.Pair.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

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
        output.writeMessage(2, rowChange_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, entryType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, exts_);
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
          .computeMessageSize(2, rowChange_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, entryType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, exts_);
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

    public static SimpleEntry.Entry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Entry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Entry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Entry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Entry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Entry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Entry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.Entry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Entry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.Entry prototype) {
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
     * Protobuf type {@code Entry}
     *
     * <pre>
     ** message *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Entry)
        SimpleEntry.EntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.Entry.class, SimpleEntry.Entry.Builder.class);
      }

      // Construct using SimpleEntry.Entry.newBuilder()
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
          getRowChangeFieldBuilder();
          getExtsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = SimpleEntry.Header.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rowChangeBuilder_ == null) {
          rowChange_ = SimpleEntry.RowChange.getDefaultInstance();
        } else {
          rowChangeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        entryType_ = SimpleEntry.EntryType.TRANSACTIONBEGIN;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (extsBuilder_ == null) {
          exts_ = SimpleEntry.Pair.getDefaultInstance();
        } else {
          extsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor;
      }

      public SimpleEntry.Entry getDefaultInstanceForType() {
        return SimpleEntry.Entry.getDefaultInstance();
      }

      public SimpleEntry.Entry build() {
        SimpleEntry.Entry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.Entry buildPartial() {
        SimpleEntry.Entry result = new SimpleEntry.Entry(this);
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
        if (rowChangeBuilder_ == null) {
          result.rowChange_ = rowChange_;
        } else {
          result.rowChange_ = rowChangeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.entryType_ = entryType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (extsBuilder_ == null) {
          result.exts_ = exts_;
        } else {
          result.exts_ = extsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SimpleEntry.Entry) {
          return mergeFrom((SimpleEntry.Entry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.Entry other) {
        if (other == SimpleEntry.Entry.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasRowChange()) {
          mergeRowChange(other.getRowChange());
        }
        if (other.hasEntryType()) {
          setEntryType(other.getEntryType());
        }
        if (other.hasExts()) {
          mergeExts(other.getExts());
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
        SimpleEntry.Entry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.Entry) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private SimpleEntry.Header header_ = SimpleEntry.Header.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Header, SimpleEntry.Header.Builder, SimpleEntry.HeaderOrBuilder> headerBuilder_;
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public SimpleEntry.Header getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public Builder setHeader(SimpleEntry.Header value) {
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
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public Builder setHeader(
          SimpleEntry.Header.Builder builderForValue) {
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
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public Builder mergeHeader(SimpleEntry.Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != SimpleEntry.Header.getDefaultInstance()) {
            header_ =
              SimpleEntry.Header.newBuilder(header_).mergeFrom(value).buildPartial();
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
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = SimpleEntry.Header.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public SimpleEntry.Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      public SimpleEntry.HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>optional .Header header = 1;</code>
       *
       * <pre>
       ** head *
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Header, SimpleEntry.Header.Builder, SimpleEntry.HeaderOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              SimpleEntry.Header, SimpleEntry.Header.Builder, SimpleEntry.HeaderOrBuilder>(
                  getHeader(),
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      private SimpleEntry.RowChange rowChange_ = SimpleEntry.RowChange.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.RowChange, SimpleEntry.RowChange.Builder, SimpleEntry.RowChangeOrBuilder> rowChangeBuilder_;
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public boolean hasRowChange() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public SimpleEntry.RowChange getRowChange() {
        if (rowChangeBuilder_ == null) {
          return rowChange_;
        } else {
          return rowChangeBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public Builder setRowChange(SimpleEntry.RowChange value) {
        if (rowChangeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rowChange_ = value;
          onChanged();
        } else {
          rowChangeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public Builder setRowChange(
          SimpleEntry.RowChange.Builder builderForValue) {
        if (rowChangeBuilder_ == null) {
          rowChange_ = builderForValue.build();
          onChanged();
        } else {
          rowChangeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public Builder mergeRowChange(SimpleEntry.RowChange value) {
        if (rowChangeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              rowChange_ != SimpleEntry.RowChange.getDefaultInstance()) {
            rowChange_ =
              SimpleEntry.RowChange.newBuilder(rowChange_).mergeFrom(value).buildPartial();
          } else {
            rowChange_ = value;
          }
          onChanged();
        } else {
          rowChangeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public Builder clearRowChange() {
        if (rowChangeBuilder_ == null) {
          rowChange_ = SimpleEntry.RowChange.getDefaultInstance();
          onChanged();
        } else {
          rowChangeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public SimpleEntry.RowChange.Builder getRowChangeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRowChangeFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      public SimpleEntry.RowChangeOrBuilder getRowChangeOrBuilder() {
        if (rowChangeBuilder_ != null) {
          return rowChangeBuilder_.getMessageOrBuilder();
        } else {
          return rowChange_;
        }
      }
      /**
       * <code>optional .RowChange rowChange = 2;</code>
       *
       * <pre>
       ** body *
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.RowChange, SimpleEntry.RowChange.Builder, SimpleEntry.RowChangeOrBuilder> 
          getRowChangeFieldBuilder() {
        if (rowChangeBuilder_ == null) {
          rowChangeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              SimpleEntry.RowChange, SimpleEntry.RowChange.Builder, SimpleEntry.RowChangeOrBuilder>(
                  getRowChange(),
                  getParentForChildren(),
                  isClean());
          rowChange_ = null;
        }
        return rowChangeBuilder_;
      }

      private SimpleEntry.EntryType entryType_ = SimpleEntry.EntryType.TRANSACTIONBEGIN;
      /**
       * <code>optional .EntryType entryType = 3;</code>
       *
       * <pre>
       ** entry type *
       * </pre>
       */
      public boolean hasEntryType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .EntryType entryType = 3;</code>
       *
       * <pre>
       ** entry type *
       * </pre>
       */
      public SimpleEntry.EntryType getEntryType() {
        return entryType_;
      }
      /**
       * <code>optional .EntryType entryType = 3;</code>
       *
       * <pre>
       ** entry type *
       * </pre>
       */
      public Builder setEntryType(SimpleEntry.EntryType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        entryType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .EntryType entryType = 3;</code>
       *
       * <pre>
       ** entry type *
       * </pre>
       */
      public Builder clearEntryType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entryType_ = SimpleEntry.EntryType.TRANSACTIONBEGIN;
        onChanged();
        return this;
      }

      private SimpleEntry.Pair exts_ = SimpleEntry.Pair.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> extsBuilder_;
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public boolean hasExts() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair getExts() {
        if (extsBuilder_ == null) {
          return exts_;
        } else {
          return extsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          exts_ = value;
          onChanged();
        } else {
          extsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          exts_ = builderForValue.build();
          onChanged();
        } else {
          extsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder mergeExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              exts_ != SimpleEntry.Pair.getDefaultInstance()) {
            exts_ =
              SimpleEntry.Pair.newBuilder(exts_).mergeFrom(value).buildPartial();
          } else {
            exts_ = value;
          }
          onChanged();
        } else {
          extsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder clearExts() {
        if (extsBuilder_ == null) {
          exts_ = SimpleEntry.Pair.getDefaultInstance();
          onChanged();
        } else {
          extsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder getExtsBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getExtsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.PairOrBuilder getExtsOrBuilder() {
        if (extsBuilder_ != null) {
          return extsBuilder_.getMessageOrBuilder();
        } else {
          return exts_;
        }
      }
      /**
       * <code>optional .Pair exts = 4;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> 
          getExtsFieldBuilder() {
        if (extsBuilder_ == null) {
          extsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder>(
                  getExts(),
                  getParentForChildren(),
                  isClean());
          exts_ = null;
        }
        return extsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Entry)
    }

    static {
      defaultInstance = new Entry(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Entry)
  }

  public interface HeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Header)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
     * </pre>
     */
    boolean hasLogfileName();
    /**
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
     * </pre>
     */
    java.lang.String getLogfileName();
    /**
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
     * </pre>
     */
    com.google.protobuf.ByteString
        getLogfileNameBytes();

    /**
     * <code>optional int64 logfileOffset = 2;</code>
     *
     * <pre>
     ** file offset, a event start offset not end offset *
     * </pre>
     */
    boolean hasLogfileOffset();
    /**
     * <code>optional int64 logfileOffset = 2;</code>
     *
     * <pre>
     ** file offset, a event start offset not end offset *
     * </pre>
     */
    long getLogfileOffset();

    /**
     * <code>optional int64 serverId = 3;</code>
     *
     * <pre>
     ** master serverId or slave serverId, we need master serverId *
     * </pre>
     */
    boolean hasServerId();
    /**
     * <code>optional int64 serverId = 3;</code>
     *
     * <pre>
     ** master serverId or slave serverId, we need master serverId *
     * </pre>
     */
    long getServerId();

    /**
     * <code>optional int64 ts = 4;</code>
     *
     * <pre>
     ** event build timestamp *
     * </pre>
     */
    boolean hasTs();
    /**
     * <code>optional int64 ts = 4;</code>
     *
     * <pre>
     ** event build timestamp *
     * </pre>
     */
    long getTs();

    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    boolean hasDatabaseName();
    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    java.lang.String getDatabaseName();
    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    com.google.protobuf.ByteString
        getDatabaseNameBytes();

    /**
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
     * </pre>
     */
    boolean hasTableName();
    /**
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
     * </pre>
     */
    java.lang.String getTableName();
    /**
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
     * </pre>
     */
    com.google.protobuf.ByteString
        getTableNameBytes();

    /**
     * <code>optional int64 eventLen = 7;</code>
     *
     * <pre>
     ** event length *
     * </pre>
     */
    boolean hasEventLen();
    /**
     * <code>optional int64 eventLen = 7;</code>
     *
     * <pre>
     ** event length *
     * </pre>
     */
    long getEventLen();

    /**
     * <code>optional .EventType eventType = 8;</code>
     *
     * <pre>
     ** event type *
     * </pre>
     */
    boolean hasEventType();
    /**
     * <code>optional .EventType eventType = 8;</code>
     *
     * <pre>
     ** event type *
     * </pre>
     */
    SimpleEntry.EventType getEventType();

    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<SimpleEntry.Pair> 
        getExtsList();
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.Pair getExts(int index);
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    int getExtsCount();
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList();
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Header}
   *
   * <pre>
   ** message head *
   * </pre>
   */
  public static final class Header extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Header)
      HeaderOrBuilder {
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              logfileName_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              logfileOffset_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              serverId_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              ts_ = input.readInt64();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              databaseName_ = bs;
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              tableName_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              eventLen_ = input.readInt64();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();
              SimpleEntry.EventType value = SimpleEntry.EventType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(8, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                eventType_ = value;
              }
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                exts_ = new java.util.ArrayList<SimpleEntry.Pair>();
                mutable_bitField0_ |= 0x00000100;
              }
              exts_.add(input.readMessage(SimpleEntry.Pair.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
          exts_ = java.util.Collections.unmodifiableList(exts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.Header.class, SimpleEntry.Header.Builder.class);
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
    public static final int LOGFILENAME_FIELD_NUMBER = 1;
    private java.lang.Object logfileName_;
    /**
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
     * </pre>
     */
    public boolean hasLogfileName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
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
     * <code>optional string logfileName = 1;</code>
     *
     * <pre>
     ** binlog file name *
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

    public static final int LOGFILEOFFSET_FIELD_NUMBER = 2;
    private long logfileOffset_;
    /**
     * <code>optional int64 logfileOffset = 2;</code>
     *
     * <pre>
     ** file offset, a event start offset not end offset *
     * </pre>
     */
    public boolean hasLogfileOffset() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 logfileOffset = 2;</code>
     *
     * <pre>
     ** file offset, a event start offset not end offset *
     * </pre>
     */
    public long getLogfileOffset() {
      return logfileOffset_;
    }

    public static final int SERVERID_FIELD_NUMBER = 3;
    private long serverId_;
    /**
     * <code>optional int64 serverId = 3;</code>
     *
     * <pre>
     ** master serverId or slave serverId, we need master serverId *
     * </pre>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 serverId = 3;</code>
     *
     * <pre>
     ** master serverId or slave serverId, we need master serverId *
     * </pre>
     */
    public long getServerId() {
      return serverId_;
    }

    public static final int TS_FIELD_NUMBER = 4;
    private long ts_;
    /**
     * <code>optional int64 ts = 4;</code>
     *
     * <pre>
     ** event build timestamp *
     * </pre>
     */
    public boolean hasTs() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 ts = 4;</code>
     *
     * <pre>
     ** event build timestamp *
     * </pre>
     */
    public long getTs() {
      return ts_;
    }

    public static final int DATABASENAME_FIELD_NUMBER = 5;
    private java.lang.Object databaseName_;
    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    public boolean hasDatabaseName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    public java.lang.String getDatabaseName() {
      java.lang.Object ref = databaseName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          databaseName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string databaseName = 5;</code>
     *
     * <pre>
     ** database name *
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDatabaseNameBytes() {
      java.lang.Object ref = databaseName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        databaseName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TABLENAME_FIELD_NUMBER = 6;
    private java.lang.Object tableName_;
    /**
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
     * </pre>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
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
     * <code>optional string tableName = 6;</code>
     *
     * <pre>
     ** table name *
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

    public static final int EVENTLEN_FIELD_NUMBER = 7;
    private long eventLen_;
    /**
     * <code>optional int64 eventLen = 7;</code>
     *
     * <pre>
     ** event length *
     * </pre>
     */
    public boolean hasEventLen() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int64 eventLen = 7;</code>
     *
     * <pre>
     ** event length *
     * </pre>
     */
    public long getEventLen() {
      return eventLen_;
    }

    public static final int EVENTTYPE_FIELD_NUMBER = 8;
    private SimpleEntry.EventType eventType_;
    /**
     * <code>optional .EventType eventType = 8;</code>
     *
     * <pre>
     ** event type *
     * </pre>
     */
    public boolean hasEventType() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional .EventType eventType = 8;</code>
     *
     * <pre>
     ** event type *
     * </pre>
     */
    public SimpleEntry.EventType getEventType() {
      return eventType_;
    }

    public static final int EXTS_FIELD_NUMBER = 9;
    private java.util.List<SimpleEntry.Pair> exts_;
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<SimpleEntry.Pair> getExtsList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public int getExtsCount() {
      return exts_.size();
    }
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.Pair getExts(int index) {
      return exts_.get(index);
    }
    /**
     * <code>repeated .Pair exts = 9;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index) {
      return exts_.get(index);
    }

    private void initFields() {
      logfileName_ = "";
      logfileOffset_ = 0L;
      serverId_ = 0L;
      ts_ = 0L;
      databaseName_ = "";
      tableName_ = "";
      eventLen_ = 0L;
      eventType_ = SimpleEntry.EventType.INSERT;
      exts_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getLogfileNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, logfileOffset_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, serverId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, ts_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getDatabaseNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getTableNameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(7, eventLen_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(8, eventType_.getNumber());
      }
      for (int i = 0; i < exts_.size(); i++) {
        output.writeMessage(9, exts_.get(i));
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
          .computeBytesSize(1, getLogfileNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, logfileOffset_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, serverId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, ts_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getDatabaseNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getTableNameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, eventLen_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, eventType_.getNumber());
      }
      for (int i = 0; i < exts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, exts_.get(i));
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

    public static SimpleEntry.Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.Header prototype) {
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
     * Protobuf type {@code Header}
     *
     * <pre>
     ** message head *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Header)
        SimpleEntry.HeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.Header.class, SimpleEntry.Header.Builder.class);
      }

      // Construct using SimpleEntry.Header.newBuilder()
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
          getExtsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        logfileName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        logfileOffset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        ts_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        databaseName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        tableName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        eventLen_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        eventType_ = SimpleEntry.EventType.INSERT;
        bitField0_ = (bitField0_ & ~0x00000080);
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
        } else {
          extsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor;
      }

      public SimpleEntry.Header getDefaultInstanceForType() {
        return SimpleEntry.Header.getDefaultInstance();
      }

      public SimpleEntry.Header build() {
        SimpleEntry.Header result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.Header buildPartial() {
        SimpleEntry.Header result = new SimpleEntry.Header(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.logfileName_ = logfileName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.logfileOffset_ = logfileOffset_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ts_ = ts_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.databaseName_ = databaseName_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.tableName_ = tableName_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.eventLen_ = eventLen_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.eventType_ = eventType_;
        if (extsBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100)) {
            exts_ = java.util.Collections.unmodifiableList(exts_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.exts_ = exts_;
        } else {
          result.exts_ = extsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SimpleEntry.Header) {
          return mergeFrom((SimpleEntry.Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.Header other) {
        if (other == SimpleEntry.Header.getDefaultInstance()) return this;
        if (other.hasLogfileName()) {
          bitField0_ |= 0x00000001;
          logfileName_ = other.logfileName_;
          onChanged();
        }
        if (other.hasLogfileOffset()) {
          setLogfileOffset(other.getLogfileOffset());
        }
        if (other.hasServerId()) {
          setServerId(other.getServerId());
        }
        if (other.hasTs()) {
          setTs(other.getTs());
        }
        if (other.hasDatabaseName()) {
          bitField0_ |= 0x00000010;
          databaseName_ = other.databaseName_;
          onChanged();
        }
        if (other.hasTableName()) {
          bitField0_ |= 0x00000020;
          tableName_ = other.tableName_;
          onChanged();
        }
        if (other.hasEventLen()) {
          setEventLen(other.getEventLen());
        }
        if (other.hasEventType()) {
          setEventType(other.getEventType());
        }
        if (extsBuilder_ == null) {
          if (!other.exts_.isEmpty()) {
            if (exts_.isEmpty()) {
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureExtsIsMutable();
              exts_.addAll(other.exts_);
            }
            onChanged();
          }
        } else {
          if (!other.exts_.isEmpty()) {
            if (extsBuilder_.isEmpty()) {
              extsBuilder_.dispose();
              extsBuilder_ = null;
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000100);
              extsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getExtsFieldBuilder() : null;
            } else {
              extsBuilder_.addAllMessages(other.exts_);
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
        SimpleEntry.Header parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.Header) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object logfileName_ = "";
      /**
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
       * </pre>
       */
      public boolean hasLogfileName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
       * </pre>
       */
      public java.lang.String getLogfileName() {
        java.lang.Object ref = logfileName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            logfileName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
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
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
       * </pre>
       */
      public Builder setLogfileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        logfileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
       * </pre>
       */
      public Builder clearLogfileName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        logfileName_ = getDefaultInstance().getLogfileName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string logfileName = 1;</code>
       *
       * <pre>
       ** binlog file name *
       * </pre>
       */
      public Builder setLogfileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        logfileName_ = value;
        onChanged();
        return this;
      }

      private long logfileOffset_ ;
      /**
       * <code>optional int64 logfileOffset = 2;</code>
       *
       * <pre>
       ** file offset, a event start offset not end offset *
       * </pre>
       */
      public boolean hasLogfileOffset() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 logfileOffset = 2;</code>
       *
       * <pre>
       ** file offset, a event start offset not end offset *
       * </pre>
       */
      public long getLogfileOffset() {
        return logfileOffset_;
      }
      /**
       * <code>optional int64 logfileOffset = 2;</code>
       *
       * <pre>
       ** file offset, a event start offset not end offset *
       * </pre>
       */
      public Builder setLogfileOffset(long value) {
        bitField0_ |= 0x00000002;
        logfileOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 logfileOffset = 2;</code>
       *
       * <pre>
       ** file offset, a event start offset not end offset *
       * </pre>
       */
      public Builder clearLogfileOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        logfileOffset_ = 0L;
        onChanged();
        return this;
      }

      private long serverId_ ;
      /**
       * <code>optional int64 serverId = 3;</code>
       *
       * <pre>
       ** master serverId or slave serverId, we need master serverId *
       * </pre>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 serverId = 3;</code>
       *
       * <pre>
       ** master serverId or slave serverId, we need master serverId *
       * </pre>
       */
      public long getServerId() {
        return serverId_;
      }
      /**
       * <code>optional int64 serverId = 3;</code>
       *
       * <pre>
       ** master serverId or slave serverId, we need master serverId *
       * </pre>
       */
      public Builder setServerId(long value) {
        bitField0_ |= 0x00000004;
        serverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 serverId = 3;</code>
       *
       * <pre>
       ** master serverId or slave serverId, we need master serverId *
       * </pre>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serverId_ = 0L;
        onChanged();
        return this;
      }

      private long ts_ ;
      /**
       * <code>optional int64 ts = 4;</code>
       *
       * <pre>
       ** event build timestamp *
       * </pre>
       */
      public boolean hasTs() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 ts = 4;</code>
       *
       * <pre>
       ** event build timestamp *
       * </pre>
       */
      public long getTs() {
        return ts_;
      }
      /**
       * <code>optional int64 ts = 4;</code>
       *
       * <pre>
       ** event build timestamp *
       * </pre>
       */
      public Builder setTs(long value) {
        bitField0_ |= 0x00000008;
        ts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 ts = 4;</code>
       *
       * <pre>
       ** event build timestamp *
       * </pre>
       */
      public Builder clearTs() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ts_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object databaseName_ = "";
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public boolean hasDatabaseName() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public java.lang.String getDatabaseName() {
        java.lang.Object ref = databaseName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            databaseName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDatabaseNameBytes() {
        java.lang.Object ref = databaseName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          databaseName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public Builder setDatabaseName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        databaseName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public Builder clearDatabaseName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        databaseName_ = getDefaultInstance().getDatabaseName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string databaseName = 5;</code>
       *
       * <pre>
       ** database name *
       * </pre>
       */
      public Builder setDatabaseNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        databaseName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object tableName_ = "";
      /**
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
       * </pre>
       */
      public boolean hasTableName() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
       * </pre>
       */
      public java.lang.String getTableName() {
        java.lang.Object ref = tableName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tableName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
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
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
       * </pre>
       */
      public Builder setTableName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        tableName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
       * </pre>
       */
      public Builder clearTableName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        tableName_ = getDefaultInstance().getTableName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tableName = 6;</code>
       *
       * <pre>
       ** table name *
       * </pre>
       */
      public Builder setTableNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        tableName_ = value;
        onChanged();
        return this;
      }

      private long eventLen_ ;
      /**
       * <code>optional int64 eventLen = 7;</code>
       *
       * <pre>
       ** event length *
       * </pre>
       */
      public boolean hasEventLen() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int64 eventLen = 7;</code>
       *
       * <pre>
       ** event length *
       * </pre>
       */
      public long getEventLen() {
        return eventLen_;
      }
      /**
       * <code>optional int64 eventLen = 7;</code>
       *
       * <pre>
       ** event length *
       * </pre>
       */
      public Builder setEventLen(long value) {
        bitField0_ |= 0x00000040;
        eventLen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 eventLen = 7;</code>
       *
       * <pre>
       ** event length *
       * </pre>
       */
      public Builder clearEventLen() {
        bitField0_ = (bitField0_ & ~0x00000040);
        eventLen_ = 0L;
        onChanged();
        return this;
      }

      private SimpleEntry.EventType eventType_ = SimpleEntry.EventType.INSERT;
      /**
       * <code>optional .EventType eventType = 8;</code>
       *
       * <pre>
       ** event type *
       * </pre>
       */
      public boolean hasEventType() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional .EventType eventType = 8;</code>
       *
       * <pre>
       ** event type *
       * </pre>
       */
      public SimpleEntry.EventType getEventType() {
        return eventType_;
      }
      /**
       * <code>optional .EventType eventType = 8;</code>
       *
       * <pre>
       ** event type *
       * </pre>
       */
      public Builder setEventType(SimpleEntry.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .EventType eventType = 8;</code>
       *
       * <pre>
       ** event type *
       * </pre>
       */
      public Builder clearEventType() {
        bitField0_ = (bitField0_ & ~0x00000080);
        eventType_ = SimpleEntry.EventType.INSERT;
        onChanged();
        return this;
      }

      private java.util.List<SimpleEntry.Pair> exts_ =
        java.util.Collections.emptyList();
      private void ensureExtsIsMutable() {
        if (!((bitField0_ & 0x00000100) == 0x00000100)) {
          exts_ = new java.util.ArrayList<SimpleEntry.Pair>(exts_);
          bitField0_ |= 0x00000100;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> extsBuilder_;

      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair> getExtsList() {
        if (extsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exts_);
        } else {
          return extsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public int getExtsCount() {
        if (extsBuilder_ == null) {
          return exts_.size();
        } else {
          return extsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair getExts(int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);
        } else {
          return extsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.set(index, value);
          onChanged();
        } else {
          extsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.set(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(value);
          onChanged();
        } else {
          extsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(index, value);
          onChanged();
        } else {
          extsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addAllExts(
          java.lang.Iterable<? extends SimpleEntry.Pair> values) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, exts_);
          onChanged();
        } else {
          extsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder clearExts() {
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          extsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder removeExts(int index) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.remove(index);
          onChanged();
        } else {
          extsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder getExtsBuilder(
          int index) {
        return getExtsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.PairOrBuilder getExtsOrBuilder(
          int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);  } else {
          return extsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.PairOrBuilder> 
           getExtsOrBuilderList() {
        if (extsBuilder_ != null) {
          return extsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exts_);
        }
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder() {
        return getExtsFieldBuilder().addBuilder(
            SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder(
          int index) {
        return getExtsFieldBuilder().addBuilder(
            index, SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 9;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair.Builder> 
           getExtsBuilderList() {
        return getExtsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> 
          getExtsFieldBuilder() {
        if (extsBuilder_ == null) {
          extsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder>(
                  exts_,
                  ((bitField0_ & 0x00000100) == 0x00000100),
                  getParentForChildren(),
                  isClean());
          exts_ = null;
        }
        return extsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Header)
    }

    static {
      defaultInstance = new Header(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Header)
  }

  public interface RowChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RowChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    java.util.List<SimpleEntry.RowData> 
        getRowDataList();
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    SimpleEntry.RowData getRowData(int index);
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    int getRowDataCount();
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.RowDataOrBuilder> 
        getRowDataOrBuilderList();
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    SimpleEntry.RowDataOrBuilder getRowDataOrBuilder(
        int index);

    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<SimpleEntry.Pair> 
        getExtsList();
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.Pair getExts(int index);
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    int getExtsCount();
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList();
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RowChange}
   *
   * <pre>
   ** message body *
   * </pre>
   */
  public static final class RowChange extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RowChange)
      RowChangeOrBuilder {
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                rowData_ = new java.util.ArrayList<SimpleEntry.RowData>();
                mutable_bitField0_ |= 0x00000001;
              }
              rowData_.add(input.readMessage(SimpleEntry.RowData.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                exts_ = new java.util.ArrayList<SimpleEntry.Pair>();
                mutable_bitField0_ |= 0x00000002;
              }
              exts_.add(input.readMessage(SimpleEntry.Pair.PARSER, extensionRegistry));
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
          rowData_ = java.util.Collections.unmodifiableList(rowData_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          exts_ = java.util.Collections.unmodifiableList(exts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.RowChange.class, SimpleEntry.RowChange.Builder.class);
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

    public static final int ROWDATA_FIELD_NUMBER = 1;
    private java.util.List<SimpleEntry.RowData> rowData_;
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    public java.util.List<SimpleEntry.RowData> getRowDataList() {
      return rowData_;
    }
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.RowDataOrBuilder> 
        getRowDataOrBuilderList() {
      return rowData_;
    }
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    public int getRowDataCount() {
      return rowData_.size();
    }
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    public SimpleEntry.RowData getRowData(int index) {
      return rowData_.get(index);
    }
    /**
     * <code>repeated .RowData rowData = 1;</code>
     *
     * <pre>
     ** multiple rowdata *
     * </pre>
     */
    public SimpleEntry.RowDataOrBuilder getRowDataOrBuilder(
        int index) {
      return rowData_.get(index);
    }

    public static final int EXTS_FIELD_NUMBER = 2;
    private java.util.List<SimpleEntry.Pair> exts_;
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<SimpleEntry.Pair> getExtsList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public int getExtsCount() {
      return exts_.size();
    }
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.Pair getExts(int index) {
      return exts_.get(index);
    }
    /**
     * <code>repeated .Pair exts = 2;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index) {
      return exts_.get(index);
    }

    private void initFields() {
      rowData_ = java.util.Collections.emptyList();
      exts_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < rowData_.size(); i++) {
        output.writeMessage(1, rowData_.get(i));
      }
      for (int i = 0; i < exts_.size(); i++) {
        output.writeMessage(2, exts_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < rowData_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, rowData_.get(i));
      }
      for (int i = 0; i < exts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, exts_.get(i));
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

    public static SimpleEntry.RowChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.RowChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.RowChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.RowChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.RowChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.RowChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.RowChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.RowChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.RowChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.RowChange parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.RowChange prototype) {
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
     * Protobuf type {@code RowChange}
     *
     * <pre>
     ** message body *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RowChange)
        SimpleEntry.RowChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.RowChange.class, SimpleEntry.RowChange.Builder.class);
      }

      // Construct using SimpleEntry.RowChange.newBuilder()
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
          getRowDataFieldBuilder();
          getExtsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (rowDataBuilder_ == null) {
          rowData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          rowDataBuilder_.clear();
        }
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          extsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor;
      }

      public SimpleEntry.RowChange getDefaultInstanceForType() {
        return SimpleEntry.RowChange.getDefaultInstance();
      }

      public SimpleEntry.RowChange build() {
        SimpleEntry.RowChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.RowChange buildPartial() {
        SimpleEntry.RowChange result = new SimpleEntry.RowChange(this);
        int from_bitField0_ = bitField0_;
        if (rowDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            rowData_ = java.util.Collections.unmodifiableList(rowData_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rowData_ = rowData_;
        } else {
          result.rowData_ = rowDataBuilder_.build();
        }
        if (extsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            exts_ = java.util.Collections.unmodifiableList(exts_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.exts_ = exts_;
        } else {
          result.exts_ = extsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SimpleEntry.RowChange) {
          return mergeFrom((SimpleEntry.RowChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.RowChange other) {
        if (other == SimpleEntry.RowChange.getDefaultInstance()) return this;
        if (rowDataBuilder_ == null) {
          if (!other.rowData_.isEmpty()) {
            if (rowData_.isEmpty()) {
              rowData_ = other.rowData_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRowDataIsMutable();
              rowData_.addAll(other.rowData_);
            }
            onChanged();
          }
        } else {
          if (!other.rowData_.isEmpty()) {
            if (rowDataBuilder_.isEmpty()) {
              rowDataBuilder_.dispose();
              rowDataBuilder_ = null;
              rowData_ = other.rowData_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rowDataBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRowDataFieldBuilder() : null;
            } else {
              rowDataBuilder_.addAllMessages(other.rowData_);
            }
          }
        }
        if (extsBuilder_ == null) {
          if (!other.exts_.isEmpty()) {
            if (exts_.isEmpty()) {
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureExtsIsMutable();
              exts_.addAll(other.exts_);
            }
            onChanged();
          }
        } else {
          if (!other.exts_.isEmpty()) {
            if (extsBuilder_.isEmpty()) {
              extsBuilder_.dispose();
              extsBuilder_ = null;
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000002);
              extsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getExtsFieldBuilder() : null;
            } else {
              extsBuilder_.addAllMessages(other.exts_);
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
        SimpleEntry.RowChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.RowChange) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<SimpleEntry.RowData> rowData_ =
        java.util.Collections.emptyList();
      private void ensureRowDataIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          rowData_ = new java.util.ArrayList<SimpleEntry.RowData>(rowData_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.RowData, SimpleEntry.RowData.Builder, SimpleEntry.RowDataOrBuilder> rowDataBuilder_;

      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public java.util.List<SimpleEntry.RowData> getRowDataList() {
        if (rowDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rowData_);
        } else {
          return rowDataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public int getRowDataCount() {
        if (rowDataBuilder_ == null) {
          return rowData_.size();
        } else {
          return rowDataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public SimpleEntry.RowData getRowData(int index) {
        if (rowDataBuilder_ == null) {
          return rowData_.get(index);
        } else {
          return rowDataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder setRowData(
          int index, SimpleEntry.RowData value) {
        if (rowDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDataIsMutable();
          rowData_.set(index, value);
          onChanged();
        } else {
          rowDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder setRowData(
          int index, SimpleEntry.RowData.Builder builderForValue) {
        if (rowDataBuilder_ == null) {
          ensureRowDataIsMutable();
          rowData_.set(index, builderForValue.build());
          onChanged();
        } else {
          rowDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder addRowData(SimpleEntry.RowData value) {
        if (rowDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDataIsMutable();
          rowData_.add(value);
          onChanged();
        } else {
          rowDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder addRowData(
          int index, SimpleEntry.RowData value) {
        if (rowDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowDataIsMutable();
          rowData_.add(index, value);
          onChanged();
        } else {
          rowDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder addRowData(
          SimpleEntry.RowData.Builder builderForValue) {
        if (rowDataBuilder_ == null) {
          ensureRowDataIsMutable();
          rowData_.add(builderForValue.build());
          onChanged();
        } else {
          rowDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder addRowData(
          int index, SimpleEntry.RowData.Builder builderForValue) {
        if (rowDataBuilder_ == null) {
          ensureRowDataIsMutable();
          rowData_.add(index, builderForValue.build());
          onChanged();
        } else {
          rowDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder addAllRowData(
          java.lang.Iterable<? extends SimpleEntry.RowData> values) {
        if (rowDataBuilder_ == null) {
          ensureRowDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, rowData_);
          onChanged();
        } else {
          rowDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder clearRowData() {
        if (rowDataBuilder_ == null) {
          rowData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rowDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public Builder removeRowData(int index) {
        if (rowDataBuilder_ == null) {
          ensureRowDataIsMutable();
          rowData_.remove(index);
          onChanged();
        } else {
          rowDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public SimpleEntry.RowData.Builder getRowDataBuilder(
          int index) {
        return getRowDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public SimpleEntry.RowDataOrBuilder getRowDataOrBuilder(
          int index) {
        if (rowDataBuilder_ == null) {
          return rowData_.get(index);  } else {
          return rowDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.RowDataOrBuilder> 
           getRowDataOrBuilderList() {
        if (rowDataBuilder_ != null) {
          return rowDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rowData_);
        }
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public SimpleEntry.RowData.Builder addRowDataBuilder() {
        return getRowDataFieldBuilder().addBuilder(
            SimpleEntry.RowData.getDefaultInstance());
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public SimpleEntry.RowData.Builder addRowDataBuilder(
          int index) {
        return getRowDataFieldBuilder().addBuilder(
            index, SimpleEntry.RowData.getDefaultInstance());
      }
      /**
       * <code>repeated .RowData rowData = 1;</code>
       *
       * <pre>
       ** multiple rowdata *
       * </pre>
       */
      public java.util.List<SimpleEntry.RowData.Builder> 
           getRowDataBuilderList() {
        return getRowDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.RowData, SimpleEntry.RowData.Builder, SimpleEntry.RowDataOrBuilder> 
          getRowDataFieldBuilder() {
        if (rowDataBuilder_ == null) {
          rowDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.RowData, SimpleEntry.RowData.Builder, SimpleEntry.RowDataOrBuilder>(
                  rowData_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          rowData_ = null;
        }
        return rowDataBuilder_;
      }

      private java.util.List<SimpleEntry.Pair> exts_ =
        java.util.Collections.emptyList();
      private void ensureExtsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          exts_ = new java.util.ArrayList<SimpleEntry.Pair>(exts_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> extsBuilder_;

      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair> getExtsList() {
        if (extsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exts_);
        } else {
          return extsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public int getExtsCount() {
        if (extsBuilder_ == null) {
          return exts_.size();
        } else {
          return extsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair getExts(int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);
        } else {
          return extsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.set(index, value);
          onChanged();
        } else {
          extsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.set(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(value);
          onChanged();
        } else {
          extsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(index, value);
          onChanged();
        } else {
          extsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addAllExts(
          java.lang.Iterable<? extends SimpleEntry.Pair> values) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, exts_);
          onChanged();
        } else {
          extsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder clearExts() {
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          extsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder removeExts(int index) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.remove(index);
          onChanged();
        } else {
          extsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder getExtsBuilder(
          int index) {
        return getExtsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.PairOrBuilder getExtsOrBuilder(
          int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);  } else {
          return extsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.PairOrBuilder> 
           getExtsOrBuilderList() {
        if (extsBuilder_ != null) {
          return extsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exts_);
        }
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder() {
        return getExtsFieldBuilder().addBuilder(
            SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder(
          int index) {
        return getExtsFieldBuilder().addBuilder(
            index, SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 2;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair.Builder> 
           getExtsBuilderList() {
        return getExtsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> 
          getExtsFieldBuilder() {
        if (extsBuilder_ == null) {
          extsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder>(
                  exts_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          exts_ = null;
        }
        return extsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:RowChange)
    }

    static {
      defaultInstance = new RowChange(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RowChange)
  }

  public interface RowDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RowData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    java.util.List<SimpleEntry.Column> 
        getBeforeColumnsList();
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    SimpleEntry.Column getBeforeColumns(int index);
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    int getBeforeColumnsCount();
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
        getBeforeColumnsOrBuilderList();
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    SimpleEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
        int index);

    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    java.util.List<SimpleEntry.Column> 
        getAfterColumnsList();
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    SimpleEntry.Column getAfterColumns(int index);
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    int getAfterColumnsCount();
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
        getAfterColumnsOrBuilderList();
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    SimpleEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
        int index);

    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<SimpleEntry.Pair> 
        getExtsList();
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.Pair getExts(int index);
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    int getExtsCount();
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList();
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RowData}
   *
   * <pre>
   ** row data *
   * </pre>
   */
  public static final class RowData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RowData)
      RowDataOrBuilder {
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
                beforeColumns_ = new java.util.ArrayList<SimpleEntry.Column>();
                mutable_bitField0_ |= 0x00000001;
              }
              beforeColumns_.add(input.readMessage(SimpleEntry.Column.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                afterColumns_ = new java.util.ArrayList<SimpleEntry.Column>();
                mutable_bitField0_ |= 0x00000002;
              }
              afterColumns_.add(input.readMessage(SimpleEntry.Column.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                exts_ = new java.util.ArrayList<SimpleEntry.Pair>();
                mutable_bitField0_ |= 0x00000004;
              }
              exts_.add(input.readMessage(SimpleEntry.Pair.PARSER, extensionRegistry));
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
          exts_ = java.util.Collections.unmodifiableList(exts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.RowData.class, SimpleEntry.RowData.Builder.class);
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

    public static final int BEFORECOLUMNS_FIELD_NUMBER = 1;
    private java.util.List<SimpleEntry.Column> beforeColumns_;
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    public java.util.List<SimpleEntry.Column> getBeforeColumnsList() {
      return beforeColumns_;
    }
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
        getBeforeColumnsOrBuilderList() {
      return beforeColumns_;
    }
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    public int getBeforeColumnsCount() {
      return beforeColumns_.size();
    }
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    public SimpleEntry.Column getBeforeColumns(int index) {
      return beforeColumns_.get(index);
    }
    /**
     * <code>repeated .Column beforeColumns = 1;</code>
     *
     * <pre>
     ** before change the columns *
     * </pre>
     */
    public SimpleEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
        int index) {
      return beforeColumns_.get(index);
    }

    public static final int AFTERCOLUMNS_FIELD_NUMBER = 2;
    private java.util.List<SimpleEntry.Column> afterColumns_;
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    public java.util.List<SimpleEntry.Column> getAfterColumnsList() {
      return afterColumns_;
    }
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
        getAfterColumnsOrBuilderList() {
      return afterColumns_;
    }
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    public int getAfterColumnsCount() {
      return afterColumns_.size();
    }
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    public SimpleEntry.Column getAfterColumns(int index) {
      return afterColumns_.get(index);
    }
    /**
     * <code>repeated .Column afterColumns = 2;</code>
     *
     * <pre>
     ** after change the columns *
     * </pre>
     */
    public SimpleEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
        int index) {
      return afterColumns_.get(index);
    }

    public static final int EXTS_FIELD_NUMBER = 3;
    private java.util.List<SimpleEntry.Pair> exts_;
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<SimpleEntry.Pair> getExtsList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public java.util.List<? extends SimpleEntry.PairOrBuilder> 
        getExtsOrBuilderList() {
      return exts_;
    }
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public int getExtsCount() {
      return exts_.size();
    }
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.Pair getExts(int index) {
      return exts_.get(index);
    }
    /**
     * <code>repeated .Pair exts = 3;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.PairOrBuilder getExtsOrBuilder(
        int index) {
      return exts_.get(index);
    }

    private void initFields() {
      beforeColumns_ = java.util.Collections.emptyList();
      afterColumns_ = java.util.Collections.emptyList();
      exts_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

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
      for (int i = 0; i < exts_.size(); i++) {
        output.writeMessage(3, exts_.get(i));
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
      for (int i = 0; i < exts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, exts_.get(i));
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

    public static SimpleEntry.RowData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.RowData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.RowData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.RowData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.RowData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.RowData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.RowData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.RowData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.RowData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.RowData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.RowData prototype) {
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
     * Protobuf type {@code RowData}
     *
     * <pre>
     ** row data *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RowData)
        SimpleEntry.RowDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.RowData.class, SimpleEntry.RowData.Builder.class);
      }

      // Construct using SimpleEntry.RowData.newBuilder()
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
          getExtsFieldBuilder();
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
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          extsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor;
      }

      public SimpleEntry.RowData getDefaultInstanceForType() {
        return SimpleEntry.RowData.getDefaultInstance();
      }

      public SimpleEntry.RowData build() {
        SimpleEntry.RowData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.RowData buildPartial() {
        SimpleEntry.RowData result = new SimpleEntry.RowData(this);
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
        if (extsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            exts_ = java.util.Collections.unmodifiableList(exts_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.exts_ = exts_;
        } else {
          result.exts_ = extsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SimpleEntry.RowData) {
          return mergeFrom((SimpleEntry.RowData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.RowData other) {
        if (other == SimpleEntry.RowData.getDefaultInstance()) return this;
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
        if (extsBuilder_ == null) {
          if (!other.exts_.isEmpty()) {
            if (exts_.isEmpty()) {
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureExtsIsMutable();
              exts_.addAll(other.exts_);
            }
            onChanged();
          }
        } else {
          if (!other.exts_.isEmpty()) {
            if (extsBuilder_.isEmpty()) {
              extsBuilder_.dispose();
              extsBuilder_ = null;
              exts_ = other.exts_;
              bitField0_ = (bitField0_ & ~0x00000004);
              extsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getExtsFieldBuilder() : null;
            } else {
              extsBuilder_.addAllMessages(other.exts_);
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
        SimpleEntry.RowData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.RowData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<SimpleEntry.Column> beforeColumns_ =
        java.util.Collections.emptyList();
      private void ensureBeforeColumnsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          beforeColumns_ = new java.util.ArrayList<SimpleEntry.Column>(beforeColumns_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder> beforeColumnsBuilder_;

      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public java.util.List<SimpleEntry.Column> getBeforeColumnsList() {
        if (beforeColumnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(beforeColumns_);
        } else {
          return beforeColumnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public SimpleEntry.Column getBeforeColumns(int index) {
        if (beforeColumnsBuilder_ == null) {
          return beforeColumns_.get(index);
        } else {
          return beforeColumnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder setBeforeColumns(
          int index, SimpleEntry.Column value) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder setBeforeColumns(
          int index, SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder addBeforeColumns(SimpleEntry.Column value) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder addBeforeColumns(
          int index, SimpleEntry.Column value) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder addBeforeColumns(
          SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder addBeforeColumns(
          int index, SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public Builder addAllBeforeColumns(
          java.lang.Iterable<? extends SimpleEntry.Column> values) {
        if (beforeColumnsBuilder_ == null) {
          ensureBeforeColumnsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, beforeColumns_);
          onChanged();
        } else {
          beforeColumnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
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
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder getBeforeColumnsBuilder(
          int index) {
        return getBeforeColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public SimpleEntry.ColumnOrBuilder getBeforeColumnsOrBuilder(
          int index) {
        if (beforeColumnsBuilder_ == null) {
          return beforeColumns_.get(index);  } else {
          return beforeColumnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
           getBeforeColumnsOrBuilderList() {
        if (beforeColumnsBuilder_ != null) {
          return beforeColumnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(beforeColumns_);
        }
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder addBeforeColumnsBuilder() {
        return getBeforeColumnsFieldBuilder().addBuilder(
            SimpleEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder addBeforeColumnsBuilder(
          int index) {
        return getBeforeColumnsFieldBuilder().addBuilder(
            index, SimpleEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .Column beforeColumns = 1;</code>
       *
       * <pre>
       ** before change the columns *
       * </pre>
       */
      public java.util.List<SimpleEntry.Column.Builder> 
           getBeforeColumnsBuilderList() {
        return getBeforeColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder> 
          getBeforeColumnsFieldBuilder() {
        if (beforeColumnsBuilder_ == null) {
          beforeColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder>(
                  beforeColumns_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          beforeColumns_ = null;
        }
        return beforeColumnsBuilder_;
      }

      private java.util.List<SimpleEntry.Column> afterColumns_ =
        java.util.Collections.emptyList();
      private void ensureAfterColumnsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          afterColumns_ = new java.util.ArrayList<SimpleEntry.Column>(afterColumns_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder> afterColumnsBuilder_;

      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public java.util.List<SimpleEntry.Column> getAfterColumnsList() {
        if (afterColumnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(afterColumns_);
        } else {
          return afterColumnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public SimpleEntry.Column getAfterColumns(int index) {
        if (afterColumnsBuilder_ == null) {
          return afterColumns_.get(index);
        } else {
          return afterColumnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder setAfterColumns(
          int index, SimpleEntry.Column value) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder setAfterColumns(
          int index, SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder addAfterColumns(SimpleEntry.Column value) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder addAfterColumns(
          int index, SimpleEntry.Column value) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder addAfterColumns(
          SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder addAfterColumns(
          int index, SimpleEntry.Column.Builder builderForValue) {
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public Builder addAllAfterColumns(
          java.lang.Iterable<? extends SimpleEntry.Column> values) {
        if (afterColumnsBuilder_ == null) {
          ensureAfterColumnsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, afterColumns_);
          onChanged();
        } else {
          afterColumnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
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
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder getAfterColumnsBuilder(
          int index) {
        return getAfterColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public SimpleEntry.ColumnOrBuilder getAfterColumnsOrBuilder(
          int index) {
        if (afterColumnsBuilder_ == null) {
          return afterColumns_.get(index);  } else {
          return afterColumnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.ColumnOrBuilder> 
           getAfterColumnsOrBuilderList() {
        if (afterColumnsBuilder_ != null) {
          return afterColumnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(afterColumns_);
        }
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder addAfterColumnsBuilder() {
        return getAfterColumnsFieldBuilder().addBuilder(
            SimpleEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public SimpleEntry.Column.Builder addAfterColumnsBuilder(
          int index) {
        return getAfterColumnsFieldBuilder().addBuilder(
            index, SimpleEntry.Column.getDefaultInstance());
      }
      /**
       * <code>repeated .Column afterColumns = 2;</code>
       *
       * <pre>
       ** after change the columns *
       * </pre>
       */
      public java.util.List<SimpleEntry.Column.Builder> 
           getAfterColumnsBuilderList() {
        return getAfterColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder> 
          getAfterColumnsFieldBuilder() {
        if (afterColumnsBuilder_ == null) {
          afterColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.Column, SimpleEntry.Column.Builder, SimpleEntry.ColumnOrBuilder>(
                  afterColumns_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          afterColumns_ = null;
        }
        return afterColumnsBuilder_;
      }

      private java.util.List<SimpleEntry.Pair> exts_ =
        java.util.Collections.emptyList();
      private void ensureExtsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          exts_ = new java.util.ArrayList<SimpleEntry.Pair>(exts_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> extsBuilder_;

      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair> getExtsList() {
        if (extsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exts_);
        } else {
          return extsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public int getExtsCount() {
        if (extsBuilder_ == null) {
          return exts_.size();
        } else {
          return extsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair getExts(int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);
        } else {
          return extsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.set(index, value);
          onChanged();
        } else {
          extsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.set(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(value);
          onChanged();
        } else {
          extsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtsIsMutable();
          exts_.add(index, value);
          onChanged();
        } else {
          extsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addExts(
          int index, SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.add(index, builderForValue.build());
          onChanged();
        } else {
          extsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder addAllExts(
          java.lang.Iterable<? extends SimpleEntry.Pair> values) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, exts_);
          onChanged();
        } else {
          extsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder clearExts() {
        if (extsBuilder_ == null) {
          exts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          extsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder removeExts(int index) {
        if (extsBuilder_ == null) {
          ensureExtsIsMutable();
          exts_.remove(index);
          onChanged();
        } else {
          extsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder getExtsBuilder(
          int index) {
        return getExtsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.PairOrBuilder getExtsOrBuilder(
          int index) {
        if (extsBuilder_ == null) {
          return exts_.get(index);  } else {
          return extsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<? extends SimpleEntry.PairOrBuilder> 
           getExtsOrBuilderList() {
        if (extsBuilder_ != null) {
          return extsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exts_);
        }
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder() {
        return getExtsFieldBuilder().addBuilder(
            SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder addExtsBuilder(
          int index) {
        return getExtsFieldBuilder().addBuilder(
            index, SimpleEntry.Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Pair exts = 3;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public java.util.List<SimpleEntry.Pair.Builder> 
           getExtsBuilderList() {
        return getExtsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> 
          getExtsFieldBuilder() {
        if (extsBuilder_ == null) {
          extsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder>(
                  exts_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          exts_ = null;
        }
        return extsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:RowData)
    }

    static {
      defaultInstance = new RowData(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RowData)
  }

  public interface ColumnOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Column)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
     * </pre>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
     * </pre>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
     * </pre>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
     * </pre>
     */
    boolean hasValue();
    /**
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
     * </pre>
     */
    java.lang.String getValue();
    /**
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
     * </pre>
     */
    com.google.protobuf.ByteString
        getValueBytes();

    /**
     * <code>optional bool isKey = 3;</code>
     *
     * <pre>
     ** is key *
     * </pre>
     */
    boolean hasIsKey();
    /**
     * <code>optional bool isKey = 3;</code>
     *
     * <pre>
     ** is key *
     * </pre>
     */
    boolean getIsKey();

    /**
     * <code>optional bool isNull = 4;</code>
     *
     * <pre>
     ** is null *
     * </pre>
     */
    boolean hasIsNull();
    /**
     * <code>optional bool isNull = 4;</code>
     *
     * <pre>
     ** is null *
     * </pre>
     */
    boolean getIsNull();

    /**
     * <code>optional bool isUpdated = 5;</code>
     *
     * <pre>
     ** is updated *
     * </pre>
     */
    boolean hasIsUpdated();
    /**
     * <code>optional bool isUpdated = 5;</code>
     *
     * <pre>
     ** is updated *
     * </pre>
     */
    boolean getIsUpdated();

    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    boolean hasExts();
    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.Pair getExts();
    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    SimpleEntry.PairOrBuilder getExtsOrBuilder();
  }
  /**
   * Protobuf type {@code Column}
   *
   * <pre>
   ** per column data structure *
   * </pre>
   */
  public static final class Column extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Column)
      ColumnOrBuilder {
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              value_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              isKey_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              isNull_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              isUpdated_ = input.readBool();
              break;
            }
            case 50: {
              SimpleEntry.Pair.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) == 0x00000020)) {
                subBuilder = exts_.toBuilder();
              }
              exts_ = input.readMessage(SimpleEntry.Pair.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(exts_);
                exts_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
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
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.Column.class, SimpleEntry.Column.Builder.class);
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
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
     * </pre>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
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
     * <code>optional string name = 1;</code>
     *
     * <pre>
     ** field name *
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

    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    /**
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
     * </pre>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
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
     * <code>optional string value = 2;</code>
     *
     * <pre>
     ** field value *
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

    public static final int ISKEY_FIELD_NUMBER = 3;
    private boolean isKey_;
    /**
     * <code>optional bool isKey = 3;</code>
     *
     * <pre>
     ** is key *
     * </pre>
     */
    public boolean hasIsKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool isKey = 3;</code>
     *
     * <pre>
     ** is key *
     * </pre>
     */
    public boolean getIsKey() {
      return isKey_;
    }

    public static final int ISNULL_FIELD_NUMBER = 4;
    private boolean isNull_;
    /**
     * <code>optional bool isNull = 4;</code>
     *
     * <pre>
     ** is null *
     * </pre>
     */
    public boolean hasIsNull() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool isNull = 4;</code>
     *
     * <pre>
     ** is null *
     * </pre>
     */
    public boolean getIsNull() {
      return isNull_;
    }

    public static final int ISUPDATED_FIELD_NUMBER = 5;
    private boolean isUpdated_;
    /**
     * <code>optional bool isUpdated = 5;</code>
     *
     * <pre>
     ** is updated *
     * </pre>
     */
    public boolean hasIsUpdated() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool isUpdated = 5;</code>
     *
     * <pre>
     ** is updated *
     * </pre>
     */
    public boolean getIsUpdated() {
      return isUpdated_;
    }

    public static final int EXTS_FIELD_NUMBER = 6;
    private SimpleEntry.Pair exts_;
    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public boolean hasExts() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.Pair getExts() {
      return exts_;
    }
    /**
     * <code>optional .Pair exts = 6;</code>
     *
     * <pre>
     ** extension *
     * </pre>
     */
    public SimpleEntry.PairOrBuilder getExtsOrBuilder() {
      return exts_;
    }

    private void initFields() {
      name_ = "";
      value_ = "";
      isKey_ = false;
      isNull_ = false;
      isUpdated_ = false;
      exts_ = SimpleEntry.Pair.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, isKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, isNull_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, isUpdated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(6, exts_);
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNull_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isUpdated_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, exts_);
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

    public static SimpleEntry.Column parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Column parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Column parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Column parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Column parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Column parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Column parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.Column parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Column parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Column parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.Column prototype) {
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
     * Protobuf type {@code Column}
     *
     * <pre>
     ** per column data structure *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Column)
        SimpleEntry.ColumnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.Column.class, SimpleEntry.Column.Builder.class);
      }

      // Construct using SimpleEntry.Column.newBuilder()
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
          getExtsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        isKey_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        isNull_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        isUpdated_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        if (extsBuilder_ == null) {
          exts_ = SimpleEntry.Pair.getDefaultInstance();
        } else {
          extsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor;
      }

      public SimpleEntry.Column getDefaultInstanceForType() {
        return SimpleEntry.Column.getDefaultInstance();
      }

      public SimpleEntry.Column build() {
        SimpleEntry.Column result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.Column buildPartial() {
        SimpleEntry.Column result = new SimpleEntry.Column(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.isKey_ = isKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.isNull_ = isNull_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.isUpdated_ = isUpdated_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        if (extsBuilder_ == null) {
          result.exts_ = exts_;
        } else {
          result.exts_ = extsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SimpleEntry.Column) {
          return mergeFrom((SimpleEntry.Column)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.Column other) {
        if (other == SimpleEntry.Column.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        if (other.hasIsKey()) {
          setIsKey(other.getIsKey());
        }
        if (other.hasIsNull()) {
          setIsNull(other.getIsNull());
        }
        if (other.hasIsUpdated()) {
          setIsUpdated(other.getIsUpdated());
        }
        if (other.hasExts()) {
          mergeExts(other.getExts());
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
        SimpleEntry.Column parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.Column) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
       * </pre>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
       * </pre>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
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
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
       * </pre>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
       * </pre>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       *
       * <pre>
       ** field name *
       * </pre>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       * <code>optional string value = 2;</code>
       *
       * <pre>
       ** field value *
       * </pre>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string value = 2;</code>
       *
       * <pre>
       ** field value *
       * </pre>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            value_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string value = 2;</code>
       *
       * <pre>
       ** field value *
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
       * <code>optional string value = 2;</code>
       *
       * <pre>
       ** field value *
       * </pre>
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
       *
       * <pre>
       ** field value *
       * </pre>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 2;</code>
       *
       * <pre>
       ** field value *
       * </pre>
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

      private boolean isKey_ ;
      /**
       * <code>optional bool isKey = 3;</code>
       *
       * <pre>
       ** is key *
       * </pre>
       */
      public boolean hasIsKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool isKey = 3;</code>
       *
       * <pre>
       ** is key *
       * </pre>
       */
      public boolean getIsKey() {
        return isKey_;
      }
      /**
       * <code>optional bool isKey = 3;</code>
       *
       * <pre>
       ** is key *
       * </pre>
       */
      public Builder setIsKey(boolean value) {
        bitField0_ |= 0x00000004;
        isKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isKey = 3;</code>
       *
       * <pre>
       ** is key *
       * </pre>
       */
      public Builder clearIsKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isKey_ = false;
        onChanged();
        return this;
      }

      private boolean isNull_ ;
      /**
       * <code>optional bool isNull = 4;</code>
       *
       * <pre>
       ** is null *
       * </pre>
       */
      public boolean hasIsNull() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool isNull = 4;</code>
       *
       * <pre>
       ** is null *
       * </pre>
       */
      public boolean getIsNull() {
        return isNull_;
      }
      /**
       * <code>optional bool isNull = 4;</code>
       *
       * <pre>
       ** is null *
       * </pre>
       */
      public Builder setIsNull(boolean value) {
        bitField0_ |= 0x00000008;
        isNull_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isNull = 4;</code>
       *
       * <pre>
       ** is null *
       * </pre>
       */
      public Builder clearIsNull() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isNull_ = false;
        onChanged();
        return this;
      }

      private boolean isUpdated_ ;
      /**
       * <code>optional bool isUpdated = 5;</code>
       *
       * <pre>
       ** is updated *
       * </pre>
       */
      public boolean hasIsUpdated() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool isUpdated = 5;</code>
       *
       * <pre>
       ** is updated *
       * </pre>
       */
      public boolean getIsUpdated() {
        return isUpdated_;
      }
      /**
       * <code>optional bool isUpdated = 5;</code>
       *
       * <pre>
       ** is updated *
       * </pre>
       */
      public Builder setIsUpdated(boolean value) {
        bitField0_ |= 0x00000010;
        isUpdated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isUpdated = 5;</code>
       *
       * <pre>
       ** is updated *
       * </pre>
       */
      public Builder clearIsUpdated() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isUpdated_ = false;
        onChanged();
        return this;
      }

      private SimpleEntry.Pair exts_ = SimpleEntry.Pair.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> extsBuilder_;
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public boolean hasExts() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair getExts() {
        if (extsBuilder_ == null) {
          return exts_;
        } else {
          return extsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          exts_ = value;
          onChanged();
        } else {
          extsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder setExts(
          SimpleEntry.Pair.Builder builderForValue) {
        if (extsBuilder_ == null) {
          exts_ = builderForValue.build();
          onChanged();
        } else {
          extsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder mergeExts(SimpleEntry.Pair value) {
        if (extsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
              exts_ != SimpleEntry.Pair.getDefaultInstance()) {
            exts_ =
              SimpleEntry.Pair.newBuilder(exts_).mergeFrom(value).buildPartial();
          } else {
            exts_ = value;
          }
          onChanged();
        } else {
          extsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public Builder clearExts() {
        if (extsBuilder_ == null) {
          exts_ = SimpleEntry.Pair.getDefaultInstance();
          onChanged();
        } else {
          extsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.Pair.Builder getExtsBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getExtsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      public SimpleEntry.PairOrBuilder getExtsOrBuilder() {
        if (extsBuilder_ != null) {
          return extsBuilder_.getMessageOrBuilder();
        } else {
          return exts_;
        }
      }
      /**
       * <code>optional .Pair exts = 6;</code>
       *
       * <pre>
       ** extension *
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder> 
          getExtsFieldBuilder() {
        if (extsBuilder_ == null) {
          extsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              SimpleEntry.Pair, SimpleEntry.Pair.Builder, SimpleEntry.PairOrBuilder>(
                  getExts(),
                  getParentForChildren(),
                  isClean());
          exts_ = null;
        }
        return extsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Column)
    }

    static {
      defaultInstance = new Column(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Column)
  }

  public interface PairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Pair)
      com.google.protobuf.MessageOrBuilder {

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
   * Protobuf type {@code Pair}
   *
   * <pre>
   ** key value *
   * </pre>
   */
  public static final class Pair extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Pair)
      PairOrBuilder {
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              key_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              value_ = bs;
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
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleEntry.Pair.class, SimpleEntry.Pair.Builder.class);
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
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

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

    public static SimpleEntry.Pair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Pair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Pair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SimpleEntry.Pair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SimpleEntry.Pair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Pair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Pair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static SimpleEntry.Pair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SimpleEntry.Pair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static SimpleEntry.Pair parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SimpleEntry.Pair prototype) {
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
     * Protobuf type {@code Pair}
     *
     * <pre>
     ** key value *
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Pair)
        SimpleEntry.PairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SimpleEntry.Pair.class, SimpleEntry.Pair.Builder.class);
      }

      // Construct using SimpleEntry.Pair.newBuilder()
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
        return SimpleEntry.internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor;
      }

      public SimpleEntry.Pair getDefaultInstanceForType() {
        return SimpleEntry.Pair.getDefaultInstance();
      }

      public SimpleEntry.Pair build() {
        SimpleEntry.Pair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SimpleEntry.Pair buildPartial() {
        SimpleEntry.Pair result = new SimpleEntry.Pair(this);
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
        if (other instanceof SimpleEntry.Pair) {
          return mergeFrom((SimpleEntry.Pair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SimpleEntry.Pair other) {
        if (other == SimpleEntry.Pair.getDefaultInstance()) return this;
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
        SimpleEntry.Pair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SimpleEntry.Pair) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            key_ = s;
          }
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
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            value_ = s;
          }
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

      // @@protoc_insertion_point(builder_scope:Pair)
    }

    static {
      defaultInstance = new Pair(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Pair)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGcom/github/hackerwin7/mysql/tracker/pr" +
      "otocol/protobuf/SimpleEntry.proto\0225com.g" +
      "ithub.hackerwin7.mysql.tracker.protocol." +
      "protobuf\"\313\002\n\005Entry\022M\n\006header\030\001 \001(\0132=.com" +
      ".github.hackerwin7.mysql.tracker.protoco" +
      "l.protobuf.Header\022S\n\trowChange\030\002 \001(\0132@.c" +
      "om.github.hackerwin7.mysql.tracker.proto" +
      "col.protobuf.RowChange\022S\n\tentryType\030\003 \001(" +
      "\0162@.com.github.hackerwin7.mysql.tracker." +
      "protocol.protobuf.EntryType\022I\n\004exts\030\004 \001(",
      "\0132;.com.github.hackerwin7.mysql.tracker." +
      "protocol.protobuf.Pair\"\255\002\n\006Header\022\023\n\013log" +
      "fileName\030\001 \001(\t\022\025\n\rlogfileOffset\030\002 \001(\003\022\020\n" +
      "\010serverId\030\003 \001(\003\022\n\n\002ts\030\004 \001(\003\022\024\n\014databaseN" +
      "ame\030\005 \001(\t\022\021\n\ttableName\030\006 \001(\t\022\020\n\010eventLen" +
      "\030\007 \001(\003\022S\n\teventType\030\010 \001(\0162@.com.github.h" +
      "ackerwin7.mysql.tracker.protocol.protobu" +
      "f.EventType\022I\n\004exts\030\t \003(\0132;.com.github.h" +
      "ackerwin7.mysql.tracker.protocol.protobu" +
      "f.Pair\"\247\001\n\tRowChange\022O\n\007rowData\030\001 \003(\0132>.",
      "com.github.hackerwin7.mysql.tracker.prot" +
      "ocol.protobuf.RowData\022I\n\004exts\030\002 \003(\0132;.co" +
      "m.github.hackerwin7.mysql.tracker.protoc" +
      "ol.protobuf.Pair\"\377\001\n\007RowData\022T\n\rbeforeCo" +
      "lumns\030\001 \003(\0132=.com.github.hackerwin7.mysq" +
      "l.tracker.protocol.protobuf.Column\022S\n\014af" +
      "terColumns\030\002 \003(\0132=.com.github.hackerwin7" +
      ".mysql.tracker.protocol.protobuf.Column\022" +
      "I\n\004exts\030\003 \003(\0132;.com.github.hackerwin7.my" +
      "sql.tracker.protocol.protobuf.Pair\"\242\001\n\006C",
      "olumn\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\022\r\n\005is" +
      "Key\030\003 \001(\010\022\016\n\006isNull\030\004 \001(\010\022\021\n\tisUpdated\030\005" +
      " \001(\010\022I\n\004exts\030\006 \001(\0132;.com.github.hackerwi" +
      "n7.mysql.tracker.protocol.protobuf.Pair\"" +
      "\"\n\004Pair\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t*B\n\tE" +
      "ntryType\022\024\n\020TRANSACTIONBEGIN\020\001\022\013\n\007ROWDAT" +
      "A\020\002\022\022\n\016TRANSACTIONEND\020\003*\216\001\n\tEventType\022\n\n" +
      "\006INSERT\020\001\022\n\n\006UPDATE\020\002\022\n\n\006DELETE\020\003\022\n\n\006CRE" +
      "ATE\020\004\022\t\n\005ALTER\020\005\022\t\n\005ERASE\020\006\022\t\n\005QUERY\020\007\022\014" +
      "\n\010TRUNCATE\020\010\022\n\n\006RENAME\020\t\022\n\n\006CINDEX\020\n\022\n\n\006",
      "DINDEX\020\013BF\n5com.github.hackerwin7.mysql." +
      "tracker.protocol.protobufB\013SimpleEntryH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Entry_descriptor,
        new java.lang.String[] { "Header", "RowChange", "EntryType", "Exts", });
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Header_descriptor,
        new java.lang.String[] { "LogfileName", "LogfileOffset", "ServerId", "Ts", "DatabaseName", "TableName", "EventLen", "EventType", "Exts", });
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowChange_descriptor,
        new java.lang.String[] { "RowData", "Exts", });
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_RowData_descriptor,
        new java.lang.String[] { "BeforeColumns", "AfterColumns", "Exts", });
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Column_descriptor,
        new java.lang.String[] { "Name", "Value", "IsKey", "IsNull", "IsUpdated", "Exts", });
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_github_hackerwin7_mysql_tracker_protocol_protobuf_Pair_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
