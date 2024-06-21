// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: edge.proto

package org.thingsboard.server.gen.edge.v1;

public interface RuleChainUpdateMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:edge.RuleChainUpdateMsg)
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
   * <code>int64 idMSB = 2;</code>
   * @return The idMSB.
   */
  long getIdMSB();

  /**
   * <code>int64 idLSB = 3;</code>
   * @return The idLSB.
   */
  long getIdLSB();

  /**
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.name is deprecated.
   *     See edge.proto;l=143
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <code>string name = 4 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.name is deprecated.
   *     See edge.proto;l=143
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int64 firstRuleNodeIdMSB = 5 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.firstRuleNodeIdMSB is deprecated.
   *     See edge.proto;l=144
   * @return Whether the firstRuleNodeIdMSB field is set.
   */
  @java.lang.Deprecated boolean hasFirstRuleNodeIdMSB();
  /**
   * <code>optional int64 firstRuleNodeIdMSB = 5 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.firstRuleNodeIdMSB is deprecated.
   *     See edge.proto;l=144
   * @return The firstRuleNodeIdMSB.
   */
  @java.lang.Deprecated long getFirstRuleNodeIdMSB();

  /**
   * <code>optional int64 firstRuleNodeIdLSB = 6 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.firstRuleNodeIdLSB is deprecated.
   *     See edge.proto;l=145
   * @return Whether the firstRuleNodeIdLSB field is set.
   */
  @java.lang.Deprecated boolean hasFirstRuleNodeIdLSB();
  /**
   * <code>optional int64 firstRuleNodeIdLSB = 6 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.firstRuleNodeIdLSB is deprecated.
   *     See edge.proto;l=145
   * @return The firstRuleNodeIdLSB.
   */
  @java.lang.Deprecated long getFirstRuleNodeIdLSB();

  /**
   * <code>bool root = 7 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.root is deprecated.
   *     See edge.proto;l=146
   * @return The root.
   */
  @java.lang.Deprecated boolean getRoot();

  /**
   * <code>bool debugMode = 8 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.debugMode is deprecated.
   *     See edge.proto;l=147
   * @return The debugMode.
   */
  @java.lang.Deprecated boolean getDebugMode();

  /**
   * <code>string configuration = 9 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.configuration is deprecated.
   *     See edge.proto;l=148
   * @return The configuration.
   */
  @java.lang.Deprecated java.lang.String getConfiguration();
  /**
   * <code>string configuration = 9 [deprecated = true];</code>
   * @deprecated edge.RuleChainUpdateMsg.configuration is deprecated.
   *     See edge.proto;l=148
   * @return The bytes for configuration.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getConfigurationBytes();

  /**
   * <code>string entity = 10;</code>
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   * <code>string entity = 10;</code>
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString
      getEntityBytes();
}
