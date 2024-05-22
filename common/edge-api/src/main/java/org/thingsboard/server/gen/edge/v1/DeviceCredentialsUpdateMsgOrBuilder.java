// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package org.thingsboard.server.gen.edge.v1;

public interface DeviceCredentialsUpdateMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:edge.DeviceCredentialsUpdateMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 deviceIdMSB = 1 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.deviceIdMSB is deprecated.
   *     See edge.proto;l=270
   * @return The deviceIdMSB.
   */
  @java.lang.Deprecated long getDeviceIdMSB();

  /**
   * <code>int64 deviceIdLSB = 2 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.deviceIdLSB is deprecated.
   *     See edge.proto;l=271
   * @return The deviceIdLSB.
   */
  @java.lang.Deprecated long getDeviceIdLSB();

  /**
   * <code>string credentialsType = 3 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsType is deprecated.
   *     See edge.proto;l=272
   * @return The credentialsType.
   */
  @java.lang.Deprecated java.lang.String getCredentialsType();
  /**
   * <code>string credentialsType = 3 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsType is deprecated.
   *     See edge.proto;l=272
   * @return The bytes for credentialsType.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCredentialsTypeBytes();

  /**
   * <code>string credentialsId = 4 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsId is deprecated.
   *     See edge.proto;l=273
   * @return The credentialsId.
   */
  @java.lang.Deprecated java.lang.String getCredentialsId();
  /**
   * <code>string credentialsId = 4 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsId is deprecated.
   *     See edge.proto;l=273
   * @return The bytes for credentialsId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCredentialsIdBytes();

  /**
   * <code>optional string credentialsValue = 5 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsValue is deprecated.
   *     See edge.proto;l=274
   * @return Whether the credentialsValue field is set.
   */
  @java.lang.Deprecated boolean hasCredentialsValue();
  /**
   * <code>optional string credentialsValue = 5 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsValue is deprecated.
   *     See edge.proto;l=274
   * @return The credentialsValue.
   */
  @java.lang.Deprecated java.lang.String getCredentialsValue();
  /**
   * <code>optional string credentialsValue = 5 [deprecated = true];</code>
   * @deprecated edge.DeviceCredentialsUpdateMsg.credentialsValue is deprecated.
   *     See edge.proto;l=274
   * @return The bytes for credentialsValue.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCredentialsValueBytes();

  /**
   * <code>string entity = 6;</code>
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   * <code>string entity = 6;</code>
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString
      getEntityBytes();
}
