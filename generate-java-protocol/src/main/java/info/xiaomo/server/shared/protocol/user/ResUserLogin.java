// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserMessage.proto

package info.xiaomo.server.shared.protocol.user;

/**
 * Protobuf type {@code ResUserLogin}
 */
public final class ResUserLogin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResUserLogin)
    ResUserLoginOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResUserLogin.newBuilder() to construct.
  private ResUserLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResUserLogin() {
    loginName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResUserLogin();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResUserLogin(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            loginName_ = s;
            break;
          }
          case 24: {

            userId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ResUserLogin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ResUserLogin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.user.ResUserLogin.class, info.xiaomo.server.shared.protocol.user.ResUserLogin.Builder.class);
  }

  public static final int LOGINNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object loginName_;
  /**
   * <code>string loginName = 1;</code>
   * @return The loginName.
   */
  @java.lang.Override
  public java.lang.String getLoginName() {
    java.lang.Object ref = loginName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loginName_ = s;
      return s;
    }
  }
  /**
   * <code>string loginName = 1;</code>
   * @return The bytes for loginName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLoginNameBytes() {
    java.lang.Object ref = loginName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loginName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private long userId_;
  /**
   * <code>int64 userId = 3;</code>
   * @return The userId.
   */
  @java.lang.Override
  public long getUserId() {
    return userId_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLoginNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, loginName_);
    }
    if (userId_ != 0L) {
      output.writeInt64(3, userId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLoginNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, loginName_);
    }
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, userId_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.user.ResUserLogin)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.user.ResUserLogin other = (info.xiaomo.server.shared.protocol.user.ResUserLogin) obj;

    if (!getLoginName()
        .equals(other.getLoginName())) return false;
    if (getUserId()
        != other.getUserId()) return false;
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
    hash = (37 * hash) + LOGINNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLoginName().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ResUserLogin parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.user.ResUserLogin prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ResUserLogin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResUserLogin)
      info.xiaomo.server.shared.protocol.user.ResUserLoginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ResUserLogin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ResUserLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.user.ResUserLogin.class, info.xiaomo.server.shared.protocol.user.ResUserLogin.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.user.ResUserLogin.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      loginName_ = "";

      userId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ResUserLogin_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ResUserLogin getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.user.ResUserLogin.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ResUserLogin build() {
      info.xiaomo.server.shared.protocol.user.ResUserLogin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ResUserLogin buildPartial() {
      info.xiaomo.server.shared.protocol.user.ResUserLogin result = new info.xiaomo.server.shared.protocol.user.ResUserLogin(this);
      result.loginName_ = loginName_;
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.user.ResUserLogin) {
        return mergeFrom((info.xiaomo.server.shared.protocol.user.ResUserLogin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.user.ResUserLogin other) {
      if (other == info.xiaomo.server.shared.protocol.user.ResUserLogin.getDefaultInstance()) return this;
      if (!other.getLoginName().isEmpty()) {
        loginName_ = other.loginName_;
        onChanged();
      }
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
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
      info.xiaomo.server.shared.protocol.user.ResUserLogin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.user.ResUserLogin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object loginName_ = "";
    /**
     * <code>string loginName = 1;</code>
     * @return The loginName.
     */
    public java.lang.String getLoginName() {
      java.lang.Object ref = loginName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loginName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string loginName = 1;</code>
     * @return The bytes for loginName.
     */
    public com.google.protobuf.ByteString
        getLoginNameBytes() {
      java.lang.Object ref = loginName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string loginName = 1;</code>
     * @param value The loginName to set.
     * @return This builder for chaining.
     */
    public Builder setLoginName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loginName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string loginName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoginName() {
      
      loginName_ = getDefaultInstance().getLoginName();
      onChanged();
      return this;
    }
    /**
     * <code>string loginName = 1;</code>
     * @param value The bytes for loginName to set.
     * @return This builder for chaining.
     */
    public Builder setLoginNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loginName_ = value;
      onChanged();
      return this;
    }

    private long userId_ ;
    /**
     * <code>int64 userId = 3;</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>int64 userId = 3;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ResUserLogin)
  }

  // @@protoc_insertion_point(class_scope:ResUserLogin)
  private static final info.xiaomo.server.shared.protocol.user.ResUserLogin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.user.ResUserLogin();
  }

  public static info.xiaomo.server.shared.protocol.user.ResUserLogin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResUserLogin>
      PARSER = new com.google.protobuf.AbstractParser<ResUserLogin>() {
    @java.lang.Override
    public ResUserLogin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResUserLogin(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResUserLogin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResUserLogin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.user.ResUserLogin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
