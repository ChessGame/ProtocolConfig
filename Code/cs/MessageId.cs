// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: MessageId.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from MessageId.proto</summary>
public static partial class MessageIdReflection {

  #region Descriptor
  /// <summary>File descriptor for MessageId.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static MessageIdReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "Cg9NZXNzYWdlSWQucHJvdG8qcgoFTXNnSWQSCwoHVW5rbm93bhAAEhIKDExv",
          "Z2luUmVxdWVzdBCJlQYSEwoNTG9naW5SZXNwb25zZRCKlQYSGAoSQ2xvc2VT",
          "ZXJ2ZXJSZXF1ZXN0EKmiDBIZChNDbG9zZVNlcnZlclJlc3BvbnNlEKqiDEIq",
          "CiZpbmZvLnhpYW9tby5zZXJ2ZXIuc2hhcmVkLnByb3RvY29sLm1zZ1ABYgZw",
          "cm90bzM="));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { },
        new pbr::GeneratedClrTypeInfo(new[] {typeof(global::MsgId), }, null, null));
  }
  #endregion

}
#region Enums
public enum MsgId {
  [pbr::OriginalName("Unknown")] Unknown = 0,
  /// <summary>
  /// user group:101
  /// </summary>
  [pbr::OriginalName("LoginRequest")] LoginRequest = 101001,
  [pbr::OriginalName("LoginResponse")] LoginResponse = 101002,
  /// <summary>
  /// gm group: 201
  /// </summary>
  [pbr::OriginalName("CloseServerRequest")] CloseServerRequest = 201001,
  [pbr::OriginalName("CloseServerResponse")] CloseServerResponse = 201002,
}

#endregion


#endregion Designer generated code