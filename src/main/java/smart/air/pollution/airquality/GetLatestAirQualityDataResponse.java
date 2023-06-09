// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirQualityService.proto

package smart.air.pollution.airquality;

/**
 * <pre>
 * Response message for the GetLatestAirQualityData method
 * </pre>
 *
 * Protobuf type {@code GetLatestAirQualityDataResponse}
 */
public  final class GetLatestAirQualityDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetLatestAirQualityDataResponse)
    GetLatestAirQualityDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLatestAirQualityDataResponse.newBuilder() to construct.
  private GetLatestAirQualityDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLatestAirQualityDataResponse() {
    aqi_ = 0;
    healthEffects_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLatestAirQualityDataResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            aqi_ = input.readInt32();
            break;
          }
          case 18: {
            smart.air.pollution.airquality.Pollutant.Builder subBuilder = null;
            if (pollutants_ != null) {
              subBuilder = pollutants_.toBuilder();
            }
            pollutants_ = input.readMessage(smart.air.pollution.airquality.Pollutant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pollutants_);
              pollutants_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            healthEffects_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return smart.air.pollution.airquality.AirQualityServiceImpl.internal_static_GetLatestAirQualityDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return smart.air.pollution.airquality.AirQualityServiceImpl.internal_static_GetLatestAirQualityDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            smart.air.pollution.airquality.GetLatestAirQualityDataResponse.class, smart.air.pollution.airquality.GetLatestAirQualityDataResponse.Builder.class);
  }

  public static final int AQI_FIELD_NUMBER = 1;
  private int aqi_;
  /**
   * <code>int32 aqi = 1;</code>
   */
  public int getAqi() {
    return aqi_;
  }

  public static final int POLLUTANTS_FIELD_NUMBER = 2;
  private smart.air.pollution.airquality.Pollutant pollutants_;
  /**
   * <code>.Pollutant pollutants = 2;</code>
   */
  public boolean hasPollutants() {
    return pollutants_ != null;
  }
  /**
   * <code>.Pollutant pollutants = 2;</code>
   */
  public smart.air.pollution.airquality.Pollutant getPollutants() {
    return pollutants_ == null ? smart.air.pollution.airquality.Pollutant.getDefaultInstance() : pollutants_;
  }
  /**
   * <code>.Pollutant pollutants = 2;</code>
   */
  public smart.air.pollution.airquality.PollutantOrBuilder getPollutantsOrBuilder() {
    return getPollutants();
  }

  public static final int HEALTH_EFFECTS_FIELD_NUMBER = 3;
  private volatile java.lang.Object healthEffects_;
  /**
   * <code>string health_effects = 3;</code>
   */
  public java.lang.String getHealthEffects() {
    java.lang.Object ref = healthEffects_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthEffects_ = s;
      return s;
    }
  }
  /**
   * <code>string health_effects = 3;</code>
   */
  public com.google.protobuf.ByteString
      getHealthEffectsBytes() {
    java.lang.Object ref = healthEffects_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthEffects_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (aqi_ != 0) {
      output.writeInt32(1, aqi_);
    }
    if (pollutants_ != null) {
      output.writeMessage(2, getPollutants());
    }
    if (!getHealthEffectsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, healthEffects_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aqi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, aqi_);
    }
    if (pollutants_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPollutants());
    }
    if (!getHealthEffectsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, healthEffects_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof smart.air.pollution.airquality.GetLatestAirQualityDataResponse)) {
      return super.equals(obj);
    }
    smart.air.pollution.airquality.GetLatestAirQualityDataResponse other = (smart.air.pollution.airquality.GetLatestAirQualityDataResponse) obj;

    boolean result = true;
    result = result && (getAqi()
        == other.getAqi());
    result = result && (hasPollutants() == other.hasPollutants());
    if (hasPollutants()) {
      result = result && getPollutants()
          .equals(other.getPollutants());
    }
    result = result && getHealthEffects()
        .equals(other.getHealthEffects());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AQI_FIELD_NUMBER;
    hash = (53 * hash) + getAqi();
    if (hasPollutants()) {
      hash = (37 * hash) + POLLUTANTS_FIELD_NUMBER;
      hash = (53 * hash) + getPollutants().hashCode();
    }
    hash = (37 * hash) + HEALTH_EFFECTS_FIELD_NUMBER;
    hash = (53 * hash) + getHealthEffects().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse parseFrom(
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
  public static Builder newBuilder(smart.air.pollution.airquality.GetLatestAirQualityDataResponse prototype) {
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
   * <pre>
   * Response message for the GetLatestAirQualityData method
   * </pre>
   *
   * Protobuf type {@code GetLatestAirQualityDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetLatestAirQualityDataResponse)
      smart.air.pollution.airquality.GetLatestAirQualityDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return smart.air.pollution.airquality.AirQualityServiceImpl.internal_static_GetLatestAirQualityDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return smart.air.pollution.airquality.AirQualityServiceImpl.internal_static_GetLatestAirQualityDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              smart.air.pollution.airquality.GetLatestAirQualityDataResponse.class, smart.air.pollution.airquality.GetLatestAirQualityDataResponse.Builder.class);
    }

    // Construct using smart.air.pollution.airquality.GetLatestAirQualityDataResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      aqi_ = 0;

      if (pollutantsBuilder_ == null) {
        pollutants_ = null;
      } else {
        pollutants_ = null;
        pollutantsBuilder_ = null;
      }
      healthEffects_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return smart.air.pollution.airquality.AirQualityServiceImpl.internal_static_GetLatestAirQualityDataResponse_descriptor;
    }

    @java.lang.Override
    public smart.air.pollution.airquality.GetLatestAirQualityDataResponse getDefaultInstanceForType() {
      return smart.air.pollution.airquality.GetLatestAirQualityDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public smart.air.pollution.airquality.GetLatestAirQualityDataResponse build() {
      smart.air.pollution.airquality.GetLatestAirQualityDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public smart.air.pollution.airquality.GetLatestAirQualityDataResponse buildPartial() {
      smart.air.pollution.airquality.GetLatestAirQualityDataResponse result = new smart.air.pollution.airquality.GetLatestAirQualityDataResponse(this);
      result.aqi_ = aqi_;
      if (pollutantsBuilder_ == null) {
        result.pollutants_ = pollutants_;
      } else {
        result.pollutants_ = pollutantsBuilder_.build();
      }
      result.healthEffects_ = healthEffects_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof smart.air.pollution.airquality.GetLatestAirQualityDataResponse) {
        return mergeFrom((smart.air.pollution.airquality.GetLatestAirQualityDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(smart.air.pollution.airquality.GetLatestAirQualityDataResponse other) {
      if (other == smart.air.pollution.airquality.GetLatestAirQualityDataResponse.getDefaultInstance()) return this;
      if (other.getAqi() != 0) {
        setAqi(other.getAqi());
      }
      if (other.hasPollutants()) {
        mergePollutants(other.getPollutants());
      }
      if (!other.getHealthEffects().isEmpty()) {
        healthEffects_ = other.healthEffects_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      smart.air.pollution.airquality.GetLatestAirQualityDataResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (smart.air.pollution.airquality.GetLatestAirQualityDataResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int aqi_ ;
    /**
     * <code>int32 aqi = 1;</code>
     */
    public int getAqi() {
      return aqi_;
    }
    /**
     * <code>int32 aqi = 1;</code>
     */
    public Builder setAqi(int value) {
      
      aqi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 aqi = 1;</code>
     */
    public Builder clearAqi() {
      
      aqi_ = 0;
      onChanged();
      return this;
    }

    private smart.air.pollution.airquality.Pollutant pollutants_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        smart.air.pollution.airquality.Pollutant, smart.air.pollution.airquality.Pollutant.Builder, smart.air.pollution.airquality.PollutantOrBuilder> pollutantsBuilder_;
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public boolean hasPollutants() {
      return pollutantsBuilder_ != null || pollutants_ != null;
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public smart.air.pollution.airquality.Pollutant getPollutants() {
      if (pollutantsBuilder_ == null) {
        return pollutants_ == null ? smart.air.pollution.airquality.Pollutant.getDefaultInstance() : pollutants_;
      } else {
        return pollutantsBuilder_.getMessage();
      }
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public Builder setPollutants(smart.air.pollution.airquality.Pollutant value) {
      if (pollutantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pollutants_ = value;
        onChanged();
      } else {
        pollutantsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public Builder setPollutants(
        smart.air.pollution.airquality.Pollutant.Builder builderForValue) {
      if (pollutantsBuilder_ == null) {
        pollutants_ = builderForValue.build();
        onChanged();
      } else {
        pollutantsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public Builder mergePollutants(smart.air.pollution.airquality.Pollutant value) {
      if (pollutantsBuilder_ == null) {
        if (pollutants_ != null) {
          pollutants_ =
            smart.air.pollution.airquality.Pollutant.newBuilder(pollutants_).mergeFrom(value).buildPartial();
        } else {
          pollutants_ = value;
        }
        onChanged();
      } else {
        pollutantsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public Builder clearPollutants() {
      if (pollutantsBuilder_ == null) {
        pollutants_ = null;
        onChanged();
      } else {
        pollutants_ = null;
        pollutantsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public smart.air.pollution.airquality.Pollutant.Builder getPollutantsBuilder() {
      
      onChanged();
      return getPollutantsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    public smart.air.pollution.airquality.PollutantOrBuilder getPollutantsOrBuilder() {
      if (pollutantsBuilder_ != null) {
        return pollutantsBuilder_.getMessageOrBuilder();
      } else {
        return pollutants_ == null ?
            smart.air.pollution.airquality.Pollutant.getDefaultInstance() : pollutants_;
      }
    }
    /**
     * <code>.Pollutant pollutants = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        smart.air.pollution.airquality.Pollutant, smart.air.pollution.airquality.Pollutant.Builder, smart.air.pollution.airquality.PollutantOrBuilder> 
        getPollutantsFieldBuilder() {
      if (pollutantsBuilder_ == null) {
        pollutantsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            smart.air.pollution.airquality.Pollutant, smart.air.pollution.airquality.Pollutant.Builder, smart.air.pollution.airquality.PollutantOrBuilder>(
                getPollutants(),
                getParentForChildren(),
                isClean());
        pollutants_ = null;
      }
      return pollutantsBuilder_;
    }

    private java.lang.Object healthEffects_ = "";
    /**
     * <code>string health_effects = 3;</code>
     */
    public java.lang.String getHealthEffects() {
      java.lang.Object ref = healthEffects_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthEffects_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string health_effects = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHealthEffectsBytes() {
      java.lang.Object ref = healthEffects_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthEffects_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string health_effects = 3;</code>
     */
    public Builder setHealthEffects(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      healthEffects_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string health_effects = 3;</code>
     */
    public Builder clearHealthEffects() {
      
      healthEffects_ = getDefaultInstance().getHealthEffects();
      onChanged();
      return this;
    }
    /**
     * <code>string health_effects = 3;</code>
     */
    public Builder setHealthEffectsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      healthEffects_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetLatestAirQualityDataResponse)
  }

  // @@protoc_insertion_point(class_scope:GetLatestAirQualityDataResponse)
  private static final smart.air.pollution.airquality.GetLatestAirQualityDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new smart.air.pollution.airquality.GetLatestAirQualityDataResponse();
  }

  public static smart.air.pollution.airquality.GetLatestAirQualityDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLatestAirQualityDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLatestAirQualityDataResponse>() {
    @java.lang.Override
    public GetLatestAirQualityDataResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLatestAirQualityDataResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLatestAirQualityDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLatestAirQualityDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public smart.air.pollution.airquality.GetLatestAirQualityDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

