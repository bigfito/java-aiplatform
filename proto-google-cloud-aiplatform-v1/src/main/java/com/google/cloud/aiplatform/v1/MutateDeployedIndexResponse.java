/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for [IndexEndpointService.MutateDeployedIndex][google.cloud.aiplatform.v1.IndexEndpointService.MutateDeployedIndex].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.MutateDeployedIndexResponse}
 */
public final class MutateDeployedIndexResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.MutateDeployedIndexResponse)
    MutateDeployedIndexResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MutateDeployedIndexResponse.newBuilder() to construct.
  private MutateDeployedIndexResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MutateDeployedIndexResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MutateDeployedIndexResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MutateDeployedIndexResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              com.google.cloud.aiplatform.v1.DeployedIndex.Builder subBuilder = null;
              if (deployedIndex_ != null) {
                subBuilder = deployedIndex_.toBuilder();
              }
              deployedIndex_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.DeployedIndex.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deployedIndex_);
                deployedIndex_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.class,
            com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.Builder.class);
  }

  public static final int DEPLOYED_INDEX_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.DeployedIndex deployedIndex_;
  /**
   *
   *
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   *
   * @return Whether the deployedIndex field is set.
   */
  @java.lang.Override
  public boolean hasDeployedIndex() {
    return deployedIndex_ != null;
  }
  /**
   *
   *
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   *
   * @return The deployedIndex.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex() {
    return deployedIndex_ == null
        ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
        : deployedIndex_;
  }
  /**
   *
   *
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder() {
    return getDeployedIndex();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (deployedIndex_ != null) {
      output.writeMessage(1, getDeployedIndex());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployedIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDeployedIndex());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse other =
        (com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse) obj;

    if (hasDeployedIndex() != other.hasDeployedIndex()) return false;
    if (hasDeployedIndex()) {
      if (!getDeployedIndex().equals(other.getDeployedIndex())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDeployedIndex()) {
      hash = (37 * hash) + DEPLOYED_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDeployedIndex().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for [IndexEndpointService.MutateDeployedIndex][google.cloud.aiplatform.v1.IndexEndpointService.MutateDeployedIndex].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.MutateDeployedIndexResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.MutateDeployedIndexResponse)
      com.google.cloud.aiplatform.v1.MutateDeployedIndexResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.class,
              com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = null;
      } else {
        deployedIndex_ = null;
        deployedIndexBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse build() {
      com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse buildPartial() {
      com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse result =
          new com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse(this);
      if (deployedIndexBuilder_ == null) {
        result.deployedIndex_ = deployedIndex_;
      } else {
        result.deployedIndex_ = deployedIndexBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse other) {
      if (other == com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse.getDefaultInstance())
        return this;
      if (other.hasDeployedIndex()) {
        mergeDeployedIndex(other.getDeployedIndex());
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
      com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1.DeployedIndex deployedIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DeployedIndex,
            com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
            com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>
        deployedIndexBuilder_;
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     *
     * @return Whether the deployedIndex field is set.
     */
    public boolean hasDeployedIndex() {
      return deployedIndexBuilder_ != null || deployedIndex_ != null;
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     *
     * @return The deployedIndex.
     */
    public com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex() {
      if (deployedIndexBuilder_ == null) {
        return deployedIndex_ == null
            ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
            : deployedIndex_;
      } else {
        return deployedIndexBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public Builder setDeployedIndex(com.google.cloud.aiplatform.v1.DeployedIndex value) {
      if (deployedIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployedIndex_ = value;
        onChanged();
      } else {
        deployedIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public Builder setDeployedIndex(
        com.google.cloud.aiplatform.v1.DeployedIndex.Builder builderForValue) {
      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = builderForValue.build();
        onChanged();
      } else {
        deployedIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public Builder mergeDeployedIndex(com.google.cloud.aiplatform.v1.DeployedIndex value) {
      if (deployedIndexBuilder_ == null) {
        if (deployedIndex_ != null) {
          deployedIndex_ =
              com.google.cloud.aiplatform.v1.DeployedIndex.newBuilder(deployedIndex_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deployedIndex_ = value;
        }
        onChanged();
      } else {
        deployedIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public Builder clearDeployedIndex() {
      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = null;
        onChanged();
      } else {
        deployedIndex_ = null;
        deployedIndexBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeployedIndex.Builder getDeployedIndexBuilder() {

      onChanged();
      return getDeployedIndexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder() {
      if (deployedIndexBuilder_ != null) {
        return deployedIndexBuilder_.getMessageOrBuilder();
      } else {
        return deployedIndex_ == null
            ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
            : deployedIndex_;
      }
    }
    /**
     *
     *
     * <pre>
     * The DeployedIndex that had been updated in the IndexEndpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DeployedIndex,
            com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
            com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>
        getDeployedIndexFieldBuilder() {
      if (deployedIndexBuilder_ == null) {
        deployedIndexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.DeployedIndex,
                com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
                com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>(
                getDeployedIndex(), getParentForChildren(), isClean());
        deployedIndex_ = null;
      }
      return deployedIndexBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.MutateDeployedIndexResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.MutateDeployedIndexResponse)
  private static final com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse();
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateDeployedIndexResponse> PARSER =
      new com.google.protobuf.AbstractParser<MutateDeployedIndexResponse>() {
        @java.lang.Override
        public MutateDeployedIndexResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MutateDeployedIndexResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MutateDeployedIndexResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateDeployedIndexResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MutateDeployedIndexResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
