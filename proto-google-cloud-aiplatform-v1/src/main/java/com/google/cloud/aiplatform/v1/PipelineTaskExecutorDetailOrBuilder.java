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
// source: google/cloud/aiplatform/v1/pipeline_job.proto

package com.google.cloud.aiplatform.v1;

public interface PipelineTaskExecutorDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.PipelineTaskExecutorDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a container executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.ContainerDetail container_detail = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the containerDetail field is set.
   */
  boolean hasContainerDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a container executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.ContainerDetail container_detail = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The containerDetail.
   */
  com.google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.ContainerDetail getContainerDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a container executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.ContainerDetail container_detail = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.ContainerDetailOrBuilder
      getContainerDetailOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a custom job executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.CustomJobDetail custom_job_detail = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.custom_job_detail is
   *     deprecated. See google/cloud/aiplatform/v1/pipeline_job.proto;l=370
   * @return Whether the customJobDetail field is set.
   */
  @java.lang.Deprecated
  boolean hasCustomJobDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a custom job executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.CustomJobDetail custom_job_detail = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.custom_job_detail is
   *     deprecated. See google/cloud/aiplatform/v1/pipeline_job.proto;l=370
   * @return The customJobDetail.
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.CustomJobDetail getCustomJobDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed info for a custom job executor.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.CustomJobDetail custom_job_detail = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.CustomJobDetailOrBuilder
      getCustomJobDetailOrBuilder();

  public com.google.cloud.aiplatform.v1.PipelineTaskExecutorDetail.DetailsCase getDetailsCase();
}
