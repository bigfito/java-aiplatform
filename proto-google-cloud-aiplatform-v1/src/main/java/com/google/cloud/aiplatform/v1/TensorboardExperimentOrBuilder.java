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
// source: google/cloud/aiplatform/v1/tensorboard_experiment.proto

package com.google.cloud.aiplatform.v1;

public interface TensorboardExperimentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TensorboardExperiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the TensorboardExperiment.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the TensorboardExperiment.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User provided name of this TensorboardExperiment.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * User provided name of this TensorboardExperiment.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Description of this TensorboardExperiment.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of this TensorboardExperiment.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema":
   *   - output only, its value is the
   *   [metadata_schema's][metadata_schema_uri] title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema":
   *   - output only, its value is the
   *   [metadata_schema's][metadata_schema_uri] title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema":
   *   - output only, its value is the
   *   [metadata_schema's][metadata_schema_uri] title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema":
   *   - output only, its value is the
   *   [metadata_schema's][metadata_schema_uri] title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Datasets.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one Dataset (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each Dataset:
   * * "aiplatform.googleapis.com/dataset_metadata_schema":
   *   - output only, its value is the
   *   [metadata_schema's][metadata_schema_uri] title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Source of the TensorboardExperiment. Example: a custom training job.
   * </pre>
   *
   * <code>string source = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Immutable. Source of the TensorboardExperiment. Example: a custom training job.
   * </pre>
   *
   * <code>string source = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();
}
