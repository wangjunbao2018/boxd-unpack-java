// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface TxInDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.TxInDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rpcpb.TxOutDetail prev_out_detail = 1;</code>
   */
  boolean hasPrevOutDetail();
  /**
   * <code>.rpcpb.TxOutDetail prev_out_detail = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetail getPrevOutDetail();
  /**
   * <code>.rpcpb.TxOutDetail prev_out_detail = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetailOrBuilder getPrevOutDetailOrBuilder();

  /**
   * <code>string script_sig = 2;</code>
   */
  String getScriptSig();
  /**
   * <code>string script_sig = 2;</code>
   */
  com.google.protobuf.ByteString
      getScriptSigBytes();

  /**
   * <code>uint32 sequence = 3;</code>
   */
  int getSequence();

  /**
   * <code>string prev_out_point = 4;</code>
   */
  String getPrevOutPoint();
  /**
   * <code>string prev_out_point = 4;</code>
   */
  com.google.protobuf.ByteString
      getPrevOutPointBytes();
}
