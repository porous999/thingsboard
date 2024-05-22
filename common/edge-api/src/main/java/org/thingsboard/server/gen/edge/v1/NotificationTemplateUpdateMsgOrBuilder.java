// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package org.thingsboard.server.gen.edge.v1;

public interface NotificationTemplateUpdateMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:edge.NotificationTemplateUpdateMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.edge.UpdateMsgType msgType = 1;</code>
   * @return The enum numeric value on the wire for msgType.
   */
  int getMsgTypeValue();
  /**
   * <code>.edge.UpdateMsgType msgType = 1;</code>
   * @return The msgType.
   */
  org.thingsboard.server.gen.edge.v1.UpdateMsgType getMsgType();

  /**
   * <code>optional int64 idMSB = 2;</code>
   * @return Whether the idMSB field is set.
   */
  boolean hasIdMSB();
  /**
   * <code>optional int64 idMSB = 2;</code>
   * @return The idMSB.
   */
  long getIdMSB();

  /**
   * <code>optional int64 idLSB = 3;</code>
   * @return Whether the idLSB field is set.
   */
  boolean hasIdLSB();
  /**
   * <code>optional int64 idLSB = 3;</code>
   * @return The idLSB.
   */
  long getIdLSB();

  /**
   * <code>optional string entity = 4;</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>optional string entity = 4;</code>
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   * <code>optional string entity = 4;</code>
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString
      getEntityBytes();
}
