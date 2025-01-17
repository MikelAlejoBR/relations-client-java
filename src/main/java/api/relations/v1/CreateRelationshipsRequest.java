// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rebac/v1/relationships.proto

package api.relations.v1;

/**
 * Protobuf type {@code api.rebac.v1.CreateRelationshipsRequest}
 */
public final class CreateRelationshipsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.rebac.v1.CreateRelationshipsRequest)
    CreateRelationshipsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRelationshipsRequest.newBuilder() to construct.
  private CreateRelationshipsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRelationshipsRequest() {
    relationships_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRelationshipsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.relations.v1.RelationshipsOuterClass.internal_static_api_rebac_v1_CreateRelationshipsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.relations.v1.RelationshipsOuterClass.internal_static_api_rebac_v1_CreateRelationshipsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.relations.v1.CreateRelationshipsRequest.class, api.relations.v1.CreateRelationshipsRequest.Builder.class);
  }

  public static final int TOUCH_FIELD_NUMBER = 1;
  private boolean touch_ = false;
  /**
   * <code>bool touch = 1;</code>
   * @return The touch.
   */
  @java.lang.Override
  public boolean getTouch() {
    return touch_;
  }

  public static final int RELATIONSHIPS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<api.relations.v1.Relationship> relationships_;
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  @java.lang.Override
  public java.util.List<api.relations.v1.Relationship> getRelationshipsList() {
    return relationships_;
  }
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends api.relations.v1.RelationshipOrBuilder> 
      getRelationshipsOrBuilderList() {
    return relationships_;
  }
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  @java.lang.Override
  public int getRelationshipsCount() {
    return relationships_.size();
  }
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  @java.lang.Override
  public api.relations.v1.Relationship getRelationships(int index) {
    return relationships_.get(index);
  }
  /**
   * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
   */
  @java.lang.Override
  public api.relations.v1.RelationshipOrBuilder getRelationshipsOrBuilder(
      int index) {
    return relationships_.get(index);
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
    if (touch_ != false) {
      output.writeBool(1, touch_);
    }
    for (int i = 0; i < relationships_.size(); i++) {
      output.writeMessage(2, relationships_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (touch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, touch_);
    }
    for (int i = 0; i < relationships_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, relationships_.get(i));
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
    if (!(obj instanceof api.relations.v1.CreateRelationshipsRequest)) {
      return super.equals(obj);
    }
    api.relations.v1.CreateRelationshipsRequest other = (api.relations.v1.CreateRelationshipsRequest) obj;

    if (getTouch()
        != other.getTouch()) return false;
    if (!getRelationshipsList()
        .equals(other.getRelationshipsList())) return false;
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
    hash = (37 * hash) + TOUCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTouch());
    if (getRelationshipsCount() > 0) {
      hash = (37 * hash) + RELATIONSHIPS_FIELD_NUMBER;
      hash = (53 * hash) + getRelationshipsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.relations.v1.CreateRelationshipsRequest parseFrom(
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
  public static Builder newBuilder(api.relations.v1.CreateRelationshipsRequest prototype) {
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
   * Protobuf type {@code api.rebac.v1.CreateRelationshipsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.rebac.v1.CreateRelationshipsRequest)
      api.relations.v1.CreateRelationshipsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.relations.v1.RelationshipsOuterClass.internal_static_api_rebac_v1_CreateRelationshipsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.relations.v1.RelationshipsOuterClass.internal_static_api_rebac_v1_CreateRelationshipsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.relations.v1.CreateRelationshipsRequest.class, api.relations.v1.CreateRelationshipsRequest.Builder.class);
    }

    // Construct using api.relations.v1.CreateRelationshipsRequest.newBuilder()
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
      touch_ = false;
      if (relationshipsBuilder_ == null) {
        relationships_ = java.util.Collections.emptyList();
      } else {
        relationships_ = null;
        relationshipsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.relations.v1.RelationshipsOuterClass.internal_static_api_rebac_v1_CreateRelationshipsRequest_descriptor;
    }

    @java.lang.Override
    public api.relations.v1.CreateRelationshipsRequest getDefaultInstanceForType() {
      return api.relations.v1.CreateRelationshipsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public api.relations.v1.CreateRelationshipsRequest build() {
      api.relations.v1.CreateRelationshipsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.relations.v1.CreateRelationshipsRequest buildPartial() {
      api.relations.v1.CreateRelationshipsRequest result = new api.relations.v1.CreateRelationshipsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(api.relations.v1.CreateRelationshipsRequest result) {
      if (relationshipsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          relationships_ = java.util.Collections.unmodifiableList(relationships_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.relationships_ = relationships_;
      } else {
        result.relationships_ = relationshipsBuilder_.build();
      }
    }

    private void buildPartial0(api.relations.v1.CreateRelationshipsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.touch_ = touch_;
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
      if (other instanceof api.relations.v1.CreateRelationshipsRequest) {
        return mergeFrom((api.relations.v1.CreateRelationshipsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.relations.v1.CreateRelationshipsRequest other) {
      if (other == api.relations.v1.CreateRelationshipsRequest.getDefaultInstance()) return this;
      if (other.getTouch() != false) {
        setTouch(other.getTouch());
      }
      if (relationshipsBuilder_ == null) {
        if (!other.relationships_.isEmpty()) {
          if (relationships_.isEmpty()) {
            relationships_ = other.relationships_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRelationshipsIsMutable();
            relationships_.addAll(other.relationships_);
          }
          onChanged();
        }
      } else {
        if (!other.relationships_.isEmpty()) {
          if (relationshipsBuilder_.isEmpty()) {
            relationshipsBuilder_.dispose();
            relationshipsBuilder_ = null;
            relationships_ = other.relationships_;
            bitField0_ = (bitField0_ & ~0x00000002);
            relationshipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRelationshipsFieldBuilder() : null;
          } else {
            relationshipsBuilder_.addAllMessages(other.relationships_);
          }
        }
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
            case 8: {
              touch_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              api.relations.v1.Relationship m =
                  input.readMessage(
                      api.relations.v1.Relationship.parser(),
                      extensionRegistry);
              if (relationshipsBuilder_ == null) {
                ensureRelationshipsIsMutable();
                relationships_.add(m);
              } else {
                relationshipsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private boolean touch_ ;
    /**
     * <code>bool touch = 1;</code>
     * @return The touch.
     */
    @java.lang.Override
    public boolean getTouch() {
      return touch_;
    }
    /**
     * <code>bool touch = 1;</code>
     * @param value The touch to set.
     * @return This builder for chaining.
     */
    public Builder setTouch(boolean value) {
      
      touch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool touch = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTouch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      touch_ = false;
      onChanged();
      return this;
    }

    private java.util.List<api.relations.v1.Relationship> relationships_ =
      java.util.Collections.emptyList();
    private void ensureRelationshipsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        relationships_ = new java.util.ArrayList<api.relations.v1.Relationship>(relationships_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.relations.v1.Relationship, api.relations.v1.Relationship.Builder, api.relations.v1.RelationshipOrBuilder> relationshipsBuilder_;

    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public java.util.List<api.relations.v1.Relationship> getRelationshipsList() {
      if (relationshipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relationships_);
      } else {
        return relationshipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public int getRelationshipsCount() {
      if (relationshipsBuilder_ == null) {
        return relationships_.size();
      } else {
        return relationshipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public api.relations.v1.Relationship getRelationships(int index) {
      if (relationshipsBuilder_ == null) {
        return relationships_.get(index);
      } else {
        return relationshipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder setRelationships(
        int index, api.relations.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.set(index, value);
        onChanged();
      } else {
        relationshipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder setRelationships(
        int index, api.relations.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.set(index, builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder addRelationships(api.relations.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.add(value);
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder addRelationships(
        int index, api.relations.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.add(index, value);
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder addRelationships(
        api.relations.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.add(builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder addRelationships(
        int index, api.relations.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.add(index, builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder addAllRelationships(
        java.lang.Iterable<? extends api.relations.v1.Relationship> values) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, relationships_);
        onChanged();
      } else {
        relationshipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder clearRelationships() {
      if (relationshipsBuilder_ == null) {
        relationships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        relationshipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public Builder removeRelationships(int index) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.remove(index);
        onChanged();
      } else {
        relationshipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public api.relations.v1.Relationship.Builder getRelationshipsBuilder(
        int index) {
      return getRelationshipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public api.relations.v1.RelationshipOrBuilder getRelationshipsOrBuilder(
        int index) {
      if (relationshipsBuilder_ == null) {
        return relationships_.get(index);  } else {
        return relationshipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public java.util.List<? extends api.relations.v1.RelationshipOrBuilder> 
         getRelationshipsOrBuilderList() {
      if (relationshipsBuilder_ != null) {
        return relationshipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relationships_);
      }
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public api.relations.v1.Relationship.Builder addRelationshipsBuilder() {
      return getRelationshipsFieldBuilder().addBuilder(
          api.relations.v1.Relationship.getDefaultInstance());
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public api.relations.v1.Relationship.Builder addRelationshipsBuilder(
        int index) {
      return getRelationshipsFieldBuilder().addBuilder(
          index, api.relations.v1.Relationship.getDefaultInstance());
    }
    /**
     * <code>repeated .api.rebac.v1.Relationship relationships = 2;</code>
     */
    public java.util.List<api.relations.v1.Relationship.Builder> 
         getRelationshipsBuilderList() {
      return getRelationshipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.relations.v1.Relationship, api.relations.v1.Relationship.Builder, api.relations.v1.RelationshipOrBuilder> 
        getRelationshipsFieldBuilder() {
      if (relationshipsBuilder_ == null) {
        relationshipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            api.relations.v1.Relationship, api.relations.v1.Relationship.Builder, api.relations.v1.RelationshipOrBuilder>(
                relationships_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        relationships_ = null;
      }
      return relationshipsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.rebac.v1.CreateRelationshipsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.rebac.v1.CreateRelationshipsRequest)
  private static final api.relations.v1.CreateRelationshipsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.relations.v1.CreateRelationshipsRequest();
  }

  public static api.relations.v1.CreateRelationshipsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRelationshipsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRelationshipsRequest>() {
    @java.lang.Override
    public CreateRelationshipsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRelationshipsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRelationshipsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.relations.v1.CreateRelationshipsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

