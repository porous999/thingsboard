// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package org.thingsboard.server.gen.edge.v1;

@java.lang.Deprecated public interface RuleChainConnectionInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:edge.RuleChainConnectionInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 fromIndex = 1;</code>
   * @return The fromIndex.
   */
  int getFromIndex();

  /**
   * <code>int64 targetRuleChainIdMSB = 2;</code>
   * @return The targetRuleChainIdMSB.
   */
  long getTargetRuleChainIdMSB();

  /**
   * <code>int64 targetRuleChainIdLSB = 3;</code>
   * @return The targetRuleChainIdLSB.
   */
  long getTargetRuleChainIdLSB();

  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string additionalInfo = 5;</code>
   * @return The additionalInfo.
   */
  java.lang.String getAdditionalInfo();
  /**
   * <code>string additionalInfo = 5;</code>
   * @return The bytes for additionalInfo.
   */
  com.google.protobuf.ByteString
      getAdditionalInfoBytes();
}
