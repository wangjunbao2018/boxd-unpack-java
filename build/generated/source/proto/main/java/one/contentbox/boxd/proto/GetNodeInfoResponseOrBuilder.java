// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: control.proto

package one.contentbox.boxd.proto;

public interface GetNodeInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.GetNodeInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  java.util.List<one.contentbox.boxd.proto.Node> 
      getNodesList();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  one.contentbox.boxd.proto.Node getNodes(int index);
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  java.util.List<? extends one.contentbox.boxd.proto.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  one.contentbox.boxd.proto.NodeOrBuilder getNodesOrBuilder(
      int index);
}