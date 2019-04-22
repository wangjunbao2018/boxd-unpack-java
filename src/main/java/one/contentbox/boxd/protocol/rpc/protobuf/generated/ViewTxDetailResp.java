// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.ViewTxDetailResp}
 */
public  final class ViewTxDetailResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.ViewTxDetailResp)
    ViewTxDetailRespOrBuilder {
  // Use ViewTxDetailResp.newBuilder() to construct.
  private ViewTxDetailResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViewTxDetailResp() {
    code_ = 0;
    message_ = "";
    version_ = 0;
    blockTime_ = 0L;
    blockHeight_ = 0;
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ViewTxDetailResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            code_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 24: {

            version_ = input.readInt32();
            break;
          }
          case 32: {

            blockTime_ = input.readInt64();
            break;
          }
          case 40: {

            blockHeight_ = input.readUInt32();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 58: {
            TxDetail.Builder subBuilder = null;
            if (detail_ != null) {
              subBuilder = detail_.toBuilder();
            }
            detail_ = input.readMessage(TxDetail.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(detail_);
              detail_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return WebProto.internal_static_rpcpb_ViewTxDetailResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return WebProto.internal_static_rpcpb_ViewTxDetailResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ViewTxDetailResp.class, ViewTxDetailResp.Builder.class);
  }

  /**
   * Protobuf enum {@code rpcpb.ViewTxDetailResp.TxStatus}
   */
  public enum TxStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>unknown = 0;</code>
     */
    unknown(0),
    /**
     * <code>pending = 1;</code>
     */
    pending(1),
    /**
     * <code>onchain = 2;</code>
     */
    onchain(2),
    /**
     * <code>confirmed = 3;</code>
     */
    confirmed(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>unknown = 0;</code>
     */
    public static final int unknown_VALUE = 0;
    /**
     * <code>pending = 1;</code>
     */
    public static final int pending_VALUE = 1;
    /**
     * <code>onchain = 2;</code>
     */
    public static final int onchain_VALUE = 2;
    /**
     * <code>confirmed = 3;</code>
     */
    public static final int confirmed_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TxStatus valueOf(int value) {
      return forNumber(value);
    }

    public static TxStatus forNumber(int value) {
      switch (value) {
        case 0: return unknown;
        case 1: return pending;
        case 2: return onchain;
        case 3: return confirmed;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TxStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TxStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TxStatus>() {
            public TxStatus findValueByNumber(int number) {
              return TxStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ViewTxDetailResp.getDescriptor().getEnumTypes().get(0);
    }

    private static final TxStatus[] VALUES = values();

    public static TxStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TxStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rpcpb.ViewTxDetailResp.TxStatus)
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>int32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private int version_;
  /**
   * <code>int32 version = 3;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int BLOCK_TIME_FIELD_NUMBER = 4;
  private long blockTime_;
  /**
   * <code>int64 block_time = 4;</code>
   */
  public long getBlockTime() {
    return blockTime_;
  }

  public static final int BLOCK_HEIGHT_FIELD_NUMBER = 5;
  private int blockHeight_;
  /**
   * <code>uint32 block_height = 5;</code>
   */
  public int getBlockHeight() {
    return blockHeight_;
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
   */
  public ViewTxDetailResp.TxStatus getStatus() {
    ViewTxDetailResp.TxStatus result = ViewTxDetailResp.TxStatus.valueOf(status_);
    return result == null ? ViewTxDetailResp.TxStatus.UNRECOGNIZED : result;
  }

  public static final int DETAIL_FIELD_NUMBER = 7;
  private TxDetail detail_;
  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  public boolean hasDetail() {
    return detail_ != null;
  }
  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  public TxDetail getDetail() {
    return detail_ == null ? TxDetail.getDefaultInstance() : detail_;
  }
  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  public TxDetailOrBuilder getDetailOrBuilder() {
    return getDetail();
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (version_ != 0) {
      output.writeInt32(3, version_);
    }
    if (blockTime_ != 0L) {
      output.writeInt64(4, blockTime_);
    }
    if (blockHeight_ != 0) {
      output.writeUInt32(5, blockHeight_);
    }
    if (status_ != ViewTxDetailResp.TxStatus.unknown.getNumber()) {
      output.writeEnum(6, status_);
    }
    if (detail_ != null) {
      output.writeMessage(7, getDetail());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, version_);
    }
    if (blockTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, blockTime_);
    }
    if (blockHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, blockHeight_);
    }
    if (status_ != ViewTxDetailResp.TxStatus.unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, status_);
    }
    if (detail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getDetail());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ViewTxDetailResp)) {
      return super.equals(obj);
    }
    ViewTxDetailResp other = (ViewTxDetailResp) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getVersion()
        == other.getVersion());
    result = result && (getBlockTime()
        == other.getBlockTime());
    result = result && (getBlockHeight()
        == other.getBlockHeight());
    result = result && status_ == other.status_;
    result = result && (hasDetail() == other.hasDetail());
    if (hasDetail()) {
      result = result && getDetail()
          .equals(other.getDetail());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + BLOCK_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockTime());
    hash = (37 * hash) + BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getBlockHeight();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasDetail()) {
      hash = (37 * hash) + DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getDetail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ViewTxDetailResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ViewTxDetailResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ViewTxDetailResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ViewTxDetailResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ViewTxDetailResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ViewTxDetailResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ViewTxDetailResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ViewTxDetailResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ViewTxDetailResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ViewTxDetailResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ViewTxDetailResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpcpb.ViewTxDetailResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.ViewTxDetailResp)
          ViewTxDetailRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WebProto.internal_static_rpcpb_ViewTxDetailResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WebProto.internal_static_rpcpb_ViewTxDetailResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ViewTxDetailResp.class, ViewTxDetailResp.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      code_ = 0;

      message_ = "";

      version_ = 0;

      blockTime_ = 0L;

      blockHeight_ = 0;

      status_ = 0;

      if (detailBuilder_ == null) {
        detail_ = null;
      } else {
        detail_ = null;
        detailBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return WebProto.internal_static_rpcpb_ViewTxDetailResp_descriptor;
    }

    public ViewTxDetailResp getDefaultInstanceForType() {
      return ViewTxDetailResp.getDefaultInstance();
    }

    public ViewTxDetailResp build() {
      ViewTxDetailResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ViewTxDetailResp buildPartial() {
      ViewTxDetailResp result = new ViewTxDetailResp(this);
      result.code_ = code_;
      result.message_ = message_;
      result.version_ = version_;
      result.blockTime_ = blockTime_;
      result.blockHeight_ = blockHeight_;
      result.status_ = status_;
      if (detailBuilder_ == null) {
        result.detail_ = detail_;
      } else {
        result.detail_ = detailBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ViewTxDetailResp) {
        return mergeFrom((ViewTxDetailResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ViewTxDetailResp other) {
      if (other == ViewTxDetailResp.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getBlockTime() != 0L) {
        setBlockTime(other.getBlockTime());
      }
      if (other.getBlockHeight() != 0) {
        setBlockHeight(other.getBlockHeight());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasDetail()) {
        mergeDetail(other.getDetail());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ViewTxDetailResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ViewTxDetailResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ ;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>int32 version = 3;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 3;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 version = 3;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private long blockTime_ ;
    /**
     * <code>int64 block_time = 4;</code>
     */
    public long getBlockTime() {
      return blockTime_;
    }
    /**
     * <code>int64 block_time = 4;</code>
     */
    public Builder setBlockTime(long value) {
      
      blockTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 block_time = 4;</code>
     */
    public Builder clearBlockTime() {
      
      blockTime_ = 0L;
      onChanged();
      return this;
    }

    private int blockHeight_ ;
    /**
     * <code>uint32 block_height = 5;</code>
     */
    public int getBlockHeight() {
      return blockHeight_;
    }
    /**
     * <code>uint32 block_height = 5;</code>
     */
    public Builder setBlockHeight(int value) {
      
      blockHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 block_height = 5;</code>
     */
    public Builder clearBlockHeight() {
      
      blockHeight_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
     */
    public ViewTxDetailResp.TxStatus getStatus() {
      ViewTxDetailResp.TxStatus result = ViewTxDetailResp.TxStatus.valueOf(status_);
      return result == null ? ViewTxDetailResp.TxStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
     */
    public Builder setStatus(ViewTxDetailResp.TxStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private TxDetail detail_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            TxDetail, TxDetail.Builder, TxDetailOrBuilder> detailBuilder_;
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public boolean hasDetail() {
      return detailBuilder_ != null || detail_ != null;
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public TxDetail getDetail() {
      if (detailBuilder_ == null) {
        return detail_ == null ? TxDetail.getDefaultInstance() : detail_;
      } else {
        return detailBuilder_.getMessage();
      }
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public Builder setDetail(TxDetail value) {
      if (detailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detail_ = value;
        onChanged();
      } else {
        detailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public Builder setDetail(
        TxDetail.Builder builderForValue) {
      if (detailBuilder_ == null) {
        detail_ = builderForValue.build();
        onChanged();
      } else {
        detailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public Builder mergeDetail(TxDetail value) {
      if (detailBuilder_ == null) {
        if (detail_ != null) {
          detail_ =
            TxDetail.newBuilder(detail_).mergeFrom(value).buildPartial();
        } else {
          detail_ = value;
        }
        onChanged();
      } else {
        detailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public Builder clearDetail() {
      if (detailBuilder_ == null) {
        detail_ = null;
        onChanged();
      } else {
        detail_ = null;
        detailBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public TxDetail.Builder getDetailBuilder() {
      
      onChanged();
      return getDetailFieldBuilder().getBuilder();
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    public TxDetailOrBuilder getDetailOrBuilder() {
      if (detailBuilder_ != null) {
        return detailBuilder_.getMessageOrBuilder();
      } else {
        return detail_ == null ?
            TxDetail.getDefaultInstance() : detail_;
      }
    }
    /**
     * <code>.rpcpb.TxDetail detail = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            TxDetail, TxDetail.Builder, TxDetailOrBuilder>
        getDetailFieldBuilder() {
      if (detailBuilder_ == null) {
        detailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                TxDetail, TxDetail.Builder, TxDetailOrBuilder>(
                getDetail(),
                getParentForChildren(),
                isClean());
        detail_ = null;
      }
      return detailBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:rpcpb.ViewTxDetailResp)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.ViewTxDetailResp)
  private static final ViewTxDetailResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ViewTxDetailResp();
  }

  public static ViewTxDetailResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViewTxDetailResp>
      PARSER = new com.google.protobuf.AbstractParser<ViewTxDetailResp>() {
    public ViewTxDetailResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ViewTxDetailResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ViewTxDetailResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViewTxDetailResp> getParserForType() {
    return PARSER;
  }

  public ViewTxDetailResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
