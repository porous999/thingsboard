// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package org.thingsboard.server.gen.edge.v1;

/**
 * Protobuf type {@code edge.ProcessingStrategyProto}
 */
@java.lang.Deprecated public final class ProcessingStrategyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:edge.ProcessingStrategyProto)
    ProcessingStrategyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessingStrategyProto.newBuilder() to construct.
  private ProcessingStrategyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessingStrategyProto() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcessingStrategyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thingsboard.server.gen.edge.v1.EdgeProtos.internal_static_edge_ProcessingStrategyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thingsboard.server.gen.edge.v1.EdgeProtos.internal_static_edge_ProcessingStrategyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.class, org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETRIES_FIELD_NUMBER = 2;
  private int retries_ = 0;
  /**
   * <code>int32 retries = 2;</code>
   * @return The retries.
   */
  @java.lang.Override
  public int getRetries() {
    return retries_;
  }

  public static final int FAILUREPERCENTAGE_FIELD_NUMBER = 3;
  private double failurePercentage_ = 0D;
  /**
   * <code>double failurePercentage = 3;</code>
   * @return The failurePercentage.
   */
  @java.lang.Override
  public double getFailurePercentage() {
    return failurePercentage_;
  }

  public static final int PAUSEBETWEENRETRIES_FIELD_NUMBER = 4;
  private long pauseBetweenRetries_ = 0L;
  /**
   * <code>int64 pauseBetweenRetries = 4;</code>
   * @return The pauseBetweenRetries.
   */
  @java.lang.Override
  public long getPauseBetweenRetries() {
    return pauseBetweenRetries_;
  }

  public static final int MAXPAUSEBETWEENRETRIES_FIELD_NUMBER = 5;
  private long maxPauseBetweenRetries_ = 0L;
  /**
   * <code>int64 maxPauseBetweenRetries = 5;</code>
   * @return The maxPauseBetweenRetries.
   */
  @java.lang.Override
  public long getMaxPauseBetweenRetries() {
    return maxPauseBetweenRetries_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (retries_ != 0) {
      output.writeInt32(2, retries_);
    }
    if (java.lang.Double.doubleToRawLongBits(failurePercentage_) != 0) {
      output.writeDouble(3, failurePercentage_);
    }
    if (pauseBetweenRetries_ != 0L) {
      output.writeInt64(4, pauseBetweenRetries_);
    }
    if (maxPauseBetweenRetries_ != 0L) {
      output.writeInt64(5, maxPauseBetweenRetries_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (retries_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, retries_);
    }
    if (java.lang.Double.doubleToRawLongBits(failurePercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, failurePercentage_);
    }
    if (pauseBetweenRetries_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, pauseBetweenRetries_);
    }
    if (maxPauseBetweenRetries_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, maxPauseBetweenRetries_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto)) {
      return super.equals(obj);
    }
    org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto other = (org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (getRetries()
        != other.getRetries()) return false;
    if (java.lang.Double.doubleToLongBits(getFailurePercentage())
        != java.lang.Double.doubleToLongBits(
            other.getFailurePercentage())) return false;
    if (getPauseBetweenRetries()
        != other.getPauseBetweenRetries()) return false;
    if (getMaxPauseBetweenRetries()
        != other.getMaxPauseBetweenRetries()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + RETRIES_FIELD_NUMBER;
    hash = (53 * hash) + getRetries();
    hash = (37 * hash) + FAILUREPERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFailurePercentage()));
    hash = (37 * hash) + PAUSEBETWEENRETRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPauseBetweenRetries());
    hash = (37 * hash) + MAXPAUSEBETWEENRETRIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxPauseBetweenRetries());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code edge.ProcessingStrategyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:edge.ProcessingStrategyProto)
      org.thingsboard.server.gen.edge.v1.ProcessingStrategyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thingsboard.server.gen.edge.v1.EdgeProtos.internal_static_edge_ProcessingStrategyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thingsboard.server.gen.edge.v1.EdgeProtos.internal_static_edge_ProcessingStrategyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.class, org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.Builder.class);
    }

    // Construct using org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      retries_ = 0;
      failurePercentage_ = 0D;
      pauseBetweenRetries_ = 0L;
      maxPauseBetweenRetries_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thingsboard.server.gen.edge.v1.EdgeProtos.internal_static_edge_ProcessingStrategyProto_descriptor;
    }

    @java.lang.Override
    public org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto getDefaultInstanceForType() {
      return org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto build() {
      org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto buildPartial() {
      org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto result = new org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.retries_ = retries_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failurePercentage_ = failurePercentage_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pauseBetweenRetries_ = pauseBetweenRetries_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.maxPauseBetweenRetries_ = maxPauseBetweenRetries_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto) {
        return mergeFrom((org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto other) {
      if (other == org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRetries() != 0) {
        setRetries(other.getRetries());
      }
      if (other.getFailurePercentage() != 0D) {
        setFailurePercentage(other.getFailurePercentage());
      }
      if (other.getPauseBetweenRetries() != 0L) {
        setPauseBetweenRetries(other.getPauseBetweenRetries());
      }
      if (other.getMaxPauseBetweenRetries() != 0L) {
        setMaxPauseBetweenRetries(other.getMaxPauseBetweenRetries());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              retries_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 25: {
              failurePercentage_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 32: {
              pauseBetweenRetries_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              maxPauseBetweenRetries_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int retries_ ;
    /**
     * <code>int32 retries = 2;</code>
     * @return The retries.
     */
    @java.lang.Override
    public int getRetries() {
      return retries_;
    }
    /**
     * <code>int32 retries = 2;</code>
     * @param value The retries to set.
     * @return This builder for chaining.
     */
    public Builder setRetries(int value) {
      
      retries_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retries = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRetries() {
      bitField0_ = (bitField0_ & ~0x00000002);
      retries_ = 0;
      onChanged();
      return this;
    }

    private double failurePercentage_ ;
    /**
     * <code>double failurePercentage = 3;</code>
     * @return The failurePercentage.
     */
    @java.lang.Override
    public double getFailurePercentage() {
      return failurePercentage_;
    }
    /**
     * <code>double failurePercentage = 3;</code>
     * @param value The failurePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setFailurePercentage(double value) {
      
      failurePercentage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double failurePercentage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailurePercentage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failurePercentage_ = 0D;
      onChanged();
      return this;
    }

    private long pauseBetweenRetries_ ;
    /**
     * <code>int64 pauseBetweenRetries = 4;</code>
     * @return The pauseBetweenRetries.
     */
    @java.lang.Override
    public long getPauseBetweenRetries() {
      return pauseBetweenRetries_;
    }
    /**
     * <code>int64 pauseBetweenRetries = 4;</code>
     * @param value The pauseBetweenRetries to set.
     * @return This builder for chaining.
     */
    public Builder setPauseBetweenRetries(long value) {
      
      pauseBetweenRetries_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pauseBetweenRetries = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPauseBetweenRetries() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pauseBetweenRetries_ = 0L;
      onChanged();
      return this;
    }

    private long maxPauseBetweenRetries_ ;
    /**
     * <code>int64 maxPauseBetweenRetries = 5;</code>
     * @return The maxPauseBetweenRetries.
     */
    @java.lang.Override
    public long getMaxPauseBetweenRetries() {
      return maxPauseBetweenRetries_;
    }
    /**
     * <code>int64 maxPauseBetweenRetries = 5;</code>
     * @param value The maxPauseBetweenRetries to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPauseBetweenRetries(long value) {
      
      maxPauseBetweenRetries_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 maxPauseBetweenRetries = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPauseBetweenRetries() {
      bitField0_ = (bitField0_ & ~0x00000010);
      maxPauseBetweenRetries_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:edge.ProcessingStrategyProto)
  }

  // @@protoc_insertion_point(class_scope:edge.ProcessingStrategyProto)
  private static final org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto();
  }

  public static org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessingStrategyProto>
      PARSER = new com.google.protobuf.AbstractParser<ProcessingStrategyProto>() {
    @java.lang.Override
    public ProcessingStrategyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ProcessingStrategyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessingStrategyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.thingsboard.server.gen.edge.v1.ProcessingStrategyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

