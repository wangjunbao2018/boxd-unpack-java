// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code corepb.TxIn}
 */
public  final class TxIn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:corepb.TxIn)
    TxInOrBuilder {
  // Use TxIn.newBuilder() to construct.
  private TxIn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxIn() {
    scriptSig_ = com.google.protobuf.ByteString.EMPTY;
    sequence_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TxIn(
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
          case 10: {
            OutPoint.Builder subBuilder = null;
            if (prevOutPoint_ != null) {
              subBuilder = prevOutPoint_.toBuilder();
            }
            prevOutPoint_ = input.readMessage(OutPoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prevOutPoint_);
              prevOutPoint_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            scriptSig_ = input.readBytes();
            break;
          }
          case 24: {

            sequence_ = input.readUInt32();
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
    return BlockProto.internal_static_corepb_TxIn_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BlockProto.internal_static_corepb_TxIn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TxIn.class, Builder.class);
  }

  public static final int PREV_OUT_POINT_FIELD_NUMBER = 1;
  private OutPoint prevOutPoint_;
  /**
   * <code>.corepb.OutPoint prev_out_point = 1;</code>
   */
  public boolean hasPrevOutPoint() {
    return prevOutPoint_ != null;
  }
  /**
   * <code>.corepb.OutPoint prev_out_point = 1;</code>
   */
  public OutPoint getPrevOutPoint() {
    return prevOutPoint_ == null ? OutPoint.getDefaultInstance() : prevOutPoint_;
  }
  /**
   * <code>.corepb.OutPoint prev_out_point = 1;</code>
   */
  public OutPointOrBuilder getPrevOutPointOrBuilder() {
    return getPrevOutPoint();
  }

  public static final int SCRIPT_SIG_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString scriptSig_;
  /**
   * <code>bytes script_sig = 2;</code>
   */
  public com.google.protobuf.ByteString getScriptSig() {
    return scriptSig_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 3;
  private int sequence_;
  /**
   * <code>uint32 sequence = 3;</code>
   */
  public int getSequence() {
    return sequence_;
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
    if (prevOutPoint_ != null) {
      output.writeMessage(1, getPrevOutPoint());
    }
    if (!scriptSig_.isEmpty()) {
      output.writeBytes(2, scriptSig_);
    }
    if (sequence_ != 0) {
      output.writeUInt32(3, sequence_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prevOutPoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrevOutPoint());
    }
    if (!scriptSig_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, scriptSig_);
    }
    if (sequence_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, sequence_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TxIn)) {
      return super.equals(obj);
    }
    TxIn other = (TxIn) obj;

    boolean result = true;
    result = result && (hasPrevOutPoint() == other.hasPrevOutPoint());
    if (hasPrevOutPoint()) {
      result = result && getPrevOutPoint()
          .equals(other.getPrevOutPoint());
    }
    result = result && getScriptSig()
        .equals(other.getScriptSig());
    result = result && (getSequence()
        == other.getSequence());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrevOutPoint()) {
      hash = (37 * hash) + PREV_OUT_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPrevOutPoint().hashCode();
    }
    hash = (37 * hash) + SCRIPT_SIG_FIELD_NUMBER;
    hash = (53 * hash) + getScriptSig().hashCode();
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + getSequence();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TxIn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TxIn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TxIn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TxIn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TxIn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TxIn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TxIn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TxIn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TxIn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TxIn parseFrom(
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
  public static Builder newBuilder(TxIn prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code corepb.TxIn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:corepb.TxIn)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.TxInOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BlockProto.internal_static_corepb_TxIn_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BlockProto.internal_static_corepb_TxIn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TxIn.class, Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.TxIn.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      if (prevOutPointBuilder_ == null) {
        prevOutPoint_ = null;
      } else {
        prevOutPoint_ = null;
        prevOutPointBuilder_ = null;
      }
      scriptSig_ = com.google.protobuf.ByteString.EMPTY;

      sequence_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BlockProto.internal_static_corepb_TxIn_descriptor;
    }

    public TxIn getDefaultInstanceForType() {
      return TxIn.getDefaultInstance();
    }

    public TxIn build() {
      TxIn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TxIn buildPartial() {
      TxIn result = new TxIn(this);
      if (prevOutPointBuilder_ == null) {
        result.prevOutPoint_ = prevOutPoint_;
      } else {
        result.prevOutPoint_ = prevOutPointBuilder_.build();
      }
      result.scriptSig_ = scriptSig_;
      result.sequence_ = sequence_;
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
      if (other instanceof TxIn) {
        return mergeFrom((TxIn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TxIn other) {
      if (other == TxIn.getDefaultInstance()) return this;
      if (other.hasPrevOutPoint()) {
        mergePrevOutPoint(other.getPrevOutPoint());
      }
      if (other.getScriptSig() != com.google.protobuf.ByteString.EMPTY) {
        setScriptSig(other.getScriptSig());
      }
      if (other.getSequence() != 0) {
        setSequence(other.getSequence());
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
      TxIn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TxIn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private OutPoint prevOutPoint_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        OutPoint, OutPoint.Builder, OutPointOrBuilder> prevOutPointBuilder_;
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public boolean hasPrevOutPoint() {
      return prevOutPointBuilder_ != null || prevOutPoint_ != null;
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public OutPoint getPrevOutPoint() {
      if (prevOutPointBuilder_ == null) {
        return prevOutPoint_ == null ? OutPoint.getDefaultInstance() : prevOutPoint_;
      } else {
        return prevOutPointBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public Builder setPrevOutPoint(OutPoint value) {
      if (prevOutPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prevOutPoint_ = value;
        onChanged();
      } else {
        prevOutPointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public Builder setPrevOutPoint(
        OutPoint.Builder builderForValue) {
      if (prevOutPointBuilder_ == null) {
        prevOutPoint_ = builderForValue.build();
        onChanged();
      } else {
        prevOutPointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public Builder mergePrevOutPoint(OutPoint value) {
      if (prevOutPointBuilder_ == null) {
        if (prevOutPoint_ != null) {
          prevOutPoint_ =
            OutPoint.newBuilder(prevOutPoint_).mergeFrom(value).buildPartial();
        } else {
          prevOutPoint_ = value;
        }
        onChanged();
      } else {
        prevOutPointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public Builder clearPrevOutPoint() {
      if (prevOutPointBuilder_ == null) {
        prevOutPoint_ = null;
        onChanged();
      } else {
        prevOutPoint_ = null;
        prevOutPointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public OutPoint.Builder getPrevOutPointBuilder() {
      
      onChanged();
      return getPrevOutPointFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    public OutPointOrBuilder getPrevOutPointOrBuilder() {
      if (prevOutPointBuilder_ != null) {
        return prevOutPointBuilder_.getMessageOrBuilder();
      } else {
        return prevOutPoint_ == null ?
            OutPoint.getDefaultInstance() : prevOutPoint_;
      }
    }
    /**
     * <code>.corepb.OutPoint prev_out_point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        OutPoint, OutPoint.Builder, OutPointOrBuilder>
        getPrevOutPointFieldBuilder() {
      if (prevOutPointBuilder_ == null) {
        prevOutPointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            OutPoint, OutPoint.Builder, OutPointOrBuilder>(
                getPrevOutPoint(),
                getParentForChildren(),
                isClean());
        prevOutPoint_ = null;
      }
      return prevOutPointBuilder_;
    }

    private com.google.protobuf.ByteString scriptSig_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes script_sig = 2;</code>
     */
    public com.google.protobuf.ByteString getScriptSig() {
      return scriptSig_;
    }
    /**
     * <code>bytes script_sig = 2;</code>
     */
    public Builder setScriptSig(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptSig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes script_sig = 2;</code>
     */
    public Builder clearScriptSig() {
      
      scriptSig_ = getDefaultInstance().getScriptSig();
      onChanged();
      return this;
    }

    private int sequence_ ;
    /**
     * <code>uint32 sequence = 3;</code>
     */
    public int getSequence() {
      return sequence_;
    }
    /**
     * <code>uint32 sequence = 3;</code>
     */
    public Builder setSequence(int value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 sequence = 3;</code>
     */
    public Builder clearSequence() {
      
      sequence_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:corepb.TxIn)
  }

  // @@protoc_insertion_point(class_scope:corepb.TxIn)
  private static final TxIn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TxIn();
  }

  public static TxIn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxIn>
      PARSER = new com.google.protobuf.AbstractParser<TxIn>() {
    public TxIn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TxIn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxIn> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TxIn> getParserForType() {
    return PARSER;
  }

  public TxIn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

