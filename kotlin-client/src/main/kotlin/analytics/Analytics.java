// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: analytics.proto
// Protobuf Java Version: 4.28.0

package analytics;

public final class Analytics {
  private Analytics() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      Analytics.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnalyticsEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:analytics.AnalyticsEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string event_type = 1;</code>
     * @return The eventType.
     */
    String getEventType();
    /**
     * <code>string event_type = 1;</code>
     * @return The bytes for eventType.
     */
    com.google.protobuf.ByteString
        getEventTypeBytes();

    /**
     * <code>string user_id = 2;</code>
     * @return The userId.
     */
    String getUserId();
    /**
     * <code>string user_id = 2;</code>
     * @return The bytes for userId.
     */
    com.google.protobuf.ByteString
        getUserIdBytes();

    /**
     * <code>string timestamp = 3;</code>
     * @return The timestamp.
     */
    String getTimestamp();
    /**
     * <code>string timestamp = 3;</code>
     * @return The bytes for timestamp.
     */
    com.google.protobuf.ByteString
        getTimestampBytes();

    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    int getAttributesCount();
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    boolean containsAttributes(
        String key);
    /**
     * Use {@link #getAttributesMap()} instead.
     */
    @Deprecated
    java.util.Map<String, String>
    getAttributes();
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    java.util.Map<String, String>
    getAttributesMap();
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    /* nullable */
String getAttributesOrDefault(
        String key,
        /* nullable */
String defaultValue);
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    String getAttributesOrThrow(
        String key);
  }
  /**
   * <pre>
   * Definicion del mensaje que queremos estandarizar para manejo de analitica en nuestros diferentes stack tecnologico.
   * Tecnologias soportadas actualmente: JavaScript, TypeScript, Swift, Java y Kotlin
   * </pre>
   *
   * Protobuf type {@code analytics.AnalyticsEvent}
   */
  public static final class AnalyticsEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:analytics.AnalyticsEvent)
      AnalyticsEventOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 0,
        /* suffix= */ "",
        AnalyticsEvent.class.getName());
    }
    // Use AnalyticsEvent.newBuilder() to construct.
    private AnalyticsEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AnalyticsEvent() {
      eventType_ = "";
      userId_ = "";
      timestamp_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Analytics.internal_static_analytics_AnalyticsEvent_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 4:
          return internalGetAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Analytics.internal_static_analytics_AnalyticsEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AnalyticsEvent.class, Builder.class);
    }

    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object eventType_ = "";
    /**
     * <code>string event_type = 1;</code>
     * @return The eventType.
     */
    @Override
    public String getEventType() {
      Object ref = eventType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      }
    }
    /**
     * <code>string event_type = 1;</code>
     * @return The bytes for eventType.
     */
    @Override
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      Object ref = eventType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_ID_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object userId_ = "";
    /**
     * <code>string user_id = 2;</code>
     * @return The userId.
     */
    @Override
    public String getUserId() {
      Object ref = userId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     * @return The bytes for userId.
     */
    @Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile Object timestamp_ = "";
    /**
     * <code>string timestamp = 3;</code>
     * @return The timestamp.
     */
    @Override
    public String getTimestamp() {
      Object ref = timestamp_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     * @return The bytes for timestamp.
     */
    @Override
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ATTRIBUTES_FIELD_NUMBER = 4;
    private static final class AttributesDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          String, String> defaultEntry =
              com.google.protobuf.MapEntry
              .<String, String>newDefaultInstance(
                  Analytics.internal_static_analytics_AnalyticsEvent_AttributesEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        String, String> attributes_;
    private com.google.protobuf.MapField<String, String>
    internalGetAttributes() {
      if (attributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      return attributes_;
    }
    public int getAttributesCount() {
      return internalGetAttributes().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @Override
    public boolean containsAttributes(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAttributes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttributesMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, String> getAttributes() {
      return getAttributesMap();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @Override
    public java.util.Map<String, String> getAttributesMap() {
      return internalGetAttributes().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @Override
    public /* nullable */
String getAttributesOrDefault(
        String key,
        /* nullable */
String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, String> map =
          internalGetAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @Override
    public String getAttributesOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, String> map =
          internalGetAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(eventType_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, eventType_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, userId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, timestamp_);
      }
      com.google.protobuf.GeneratedMessage
        .serializeStringMapTo(
          output,
          internalGetAttributes(),
          AttributesDefaultEntryHolder.defaultEntry,
          4);
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(eventType_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, eventType_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, timestamp_);
      }
      for (java.util.Map.Entry<String, String> entry
           : internalGetAttributes().getMap().entrySet()) {
        com.google.protobuf.MapEntry<String, String>
        attributes__ = AttributesDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, attributes__);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AnalyticsEvent)) {
        return super.equals(obj);
      }
      AnalyticsEvent other = (AnalyticsEvent) obj;

      if (!getEventType()
          .equals(other.getEventType())) return false;
      if (!getUserId()
          .equals(other.getUserId())) return false;
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
      if (!internalGetAttributes().equals(
          other.internalGetAttributes())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEventType().hashCode();
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
      if (!internalGetAttributes().getMap().isEmpty()) {
        hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAttributes().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AnalyticsEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AnalyticsEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AnalyticsEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AnalyticsEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AnalyticsEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AnalyticsEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AnalyticsEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AnalyticsEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AnalyticsEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static AnalyticsEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AnalyticsEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AnalyticsEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(AnalyticsEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Definicion del mensaje que queremos estandarizar para manejo de analitica en nuestros diferentes stack tecnologico.
     * Tecnologias soportadas actualmente: JavaScript, TypeScript, Swift, Java y Kotlin
     * </pre>
     *
     * Protobuf type {@code analytics.AnalyticsEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:analytics.AnalyticsEvent)
        AnalyticsEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Analytics.internal_static_analytics_AnalyticsEvent_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
          int number) {
        switch (number) {
          case 4:
            return internalGetAttributes();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableAttributes();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Analytics.internal_static_analytics_AnalyticsEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AnalyticsEvent.class, Builder.class);
      }

      // Construct using analytics.Analytics.AnalyticsEvent.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        eventType_ = "";
        userId_ = "";
        timestamp_ = "";
        internalGetMutableAttributes().clear();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Analytics.internal_static_analytics_AnalyticsEvent_descriptor;
      }

      @Override
      public AnalyticsEvent getDefaultInstanceForType() {
        return AnalyticsEvent.getDefaultInstance();
      }

      @Override
      public AnalyticsEvent build() {
        AnalyticsEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public AnalyticsEvent buildPartial() {
        AnalyticsEvent result = new AnalyticsEvent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(AnalyticsEvent result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.eventType_ = eventType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.userId_ = userId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.timestamp_ = timestamp_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.attributes_ = internalGetAttributes();
          result.attributes_.makeImmutable();
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AnalyticsEvent) {
          return mergeFrom((AnalyticsEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AnalyticsEvent other) {
        if (other == AnalyticsEvent.getDefaultInstance()) return this;
        if (!other.getEventType().isEmpty()) {
          eventType_ = other.eventType_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getUserId().isEmpty()) {
          userId_ = other.userId_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getTimestamp().isEmpty()) {
          timestamp_ = other.timestamp_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        internalGetMutableAttributes().mergeFrom(
            other.internalGetAttributes());
        bitField0_ |= 0x00000008;
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                eventType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                userId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                timestamp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                com.google.protobuf.MapEntry<String, String>
                attributes__ = input.readMessage(
                    AttributesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableAttributes().getMutableMap().put(
                    attributes__.getKey(), attributes__.getValue());
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private Object eventType_ = "";
      /**
       * <code>string event_type = 1;</code>
       * @return The eventType.
       */
      public String getEventType() {
        Object ref = eventType_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          eventType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string event_type = 1;</code>
       * @return The bytes for eventType.
       */
      public com.google.protobuf.ByteString
          getEventTypeBytes() {
        Object ref = eventType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          eventType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string event_type = 1;</code>
       * @param value The eventType to set.
       * @return This builder for chaining.
       */
      public Builder setEventType(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        eventType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string event_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventType() {
        eventType_ = getDefaultInstance().getEventType();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string event_type = 1;</code>
       * @param value The bytes for eventType to set.
       * @return This builder for chaining.
       */
      public Builder setEventTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        eventType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object userId_ = "";
      /**
       * <code>string user_id = 2;</code>
       * @return The userId.
       */
      public String getUserId() {
        Object ref = userId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          userId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string user_id = 2;</code>
       * @return The bytes for userId.
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string user_id = 2;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        userId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string user_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        userId_ = getDefaultInstance().getUserId();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string user_id = 2;</code>
       * @param value The bytes for userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        userId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private Object timestamp_ = "";
      /**
       * <code>string timestamp = 3;</code>
       * @return The timestamp.
       */
      public String getTimestamp() {
        Object ref = timestamp_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          timestamp_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string timestamp = 3;</code>
       * @return The bytes for timestamp.
       */
      public com.google.protobuf.ByteString
          getTimestampBytes() {
        Object ref = timestamp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          timestamp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string timestamp = 3;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        timestamp_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        timestamp_ = getDefaultInstance().getTimestamp();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 3;</code>
       * @param value The bytes for timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestampBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        timestamp_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          String, String> attributes_;
      private com.google.protobuf.MapField<String, String>
          internalGetAttributes() {
        if (attributes_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AttributesDefaultEntryHolder.defaultEntry);
        }
        return attributes_;
      }
      private com.google.protobuf.MapField<String, String>
          internalGetMutableAttributes() {
        if (attributes_ == null) {
          attributes_ = com.google.protobuf.MapField.newMapField(
              AttributesDefaultEntryHolder.defaultEntry);
        }
        if (!attributes_.isMutable()) {
          attributes_ = attributes_.copy();
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return attributes_;
      }
      public int getAttributesCount() {
        return internalGetAttributes().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      @Override
      public boolean containsAttributes(
          String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        return internalGetAttributes().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAttributesMap()} instead.
       */
      @Override
      @Deprecated
      public java.util.Map<String, String> getAttributes() {
        return getAttributesMap();
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      @Override
      public java.util.Map<String, String> getAttributesMap() {
        return internalGetAttributes().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      @Override
      public /* nullable */
String getAttributesOrDefault(
          String key,
          /* nullable */
String defaultValue) {
        if (key == null) { throw new NullPointerException("map key"); }
        java.util.Map<String, String> map =
            internalGetAttributes().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      @Override
      public String getAttributesOrThrow(
          String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        java.util.Map<String, String> map =
            internalGetAttributes().getMap();
        if (!map.containsKey(key)) {
          throw new IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearAttributes() {
        bitField0_ = (bitField0_ & ~0x00000008);
        internalGetMutableAttributes().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      public Builder removeAttributes(
          String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        internalGetMutableAttributes().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @Deprecated
      public java.util.Map<String, String>
          getMutableAttributes() {
        bitField0_ |= 0x00000008;
        return internalGetMutableAttributes().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      public Builder putAttributes(
          String key,
          String value) {
        if (key == null) { throw new NullPointerException("map key"); }
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableAttributes().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; attributes = 4;</code>
       */
      public Builder putAllAttributes(
          java.util.Map<String, String> values) {
        internalGetMutableAttributes().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000008;
        return this;
      }

      // @@protoc_insertion_point(builder_scope:analytics.AnalyticsEvent)
    }

    // @@protoc_insertion_point(class_scope:analytics.AnalyticsEvent)
    private static final AnalyticsEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AnalyticsEvent();
    }

    public static AnalyticsEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnalyticsEvent>
        PARSER = new com.google.protobuf.AbstractParser<AnalyticsEvent>() {
      @Override
      public AnalyticsEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AnalyticsEvent> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AnalyticsEvent> getParserForType() {
      return PARSER;
    }

    @Override
    public AnalyticsEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_analytics_AnalyticsEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_analytics_AnalyticsEvent_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_analytics_AnalyticsEvent_AttributesEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_analytics_AnalyticsEvent_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017analytics.proto\022\tanalytics\"\272\001\n\016Analyti" +
      "csEvent\022\022\n\nevent_type\030\001 \001(\t\022\017\n\007user_id\030\002" +
      " \001(\t\022\021\n\ttimestamp\030\003 \001(\t\022=\n\nattributes\030\004 " +
      "\003(\0132).analytics.AnalyticsEvent.Attribute" +
      "sEntry\0321\n\017AttributesEntry\022\013\n\003key\030\001 \001(\t\022\r" +
      "\n\005value\030\002 \001(\t:\0028\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_analytics_AnalyticsEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_analytics_AnalyticsEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_analytics_AnalyticsEvent_descriptor,
        new String[] { "EventType", "UserId", "Timestamp", "Attributes", });
    internal_static_analytics_AnalyticsEvent_AttributesEntry_descriptor =
      internal_static_analytics_AnalyticsEvent_descriptor.getNestedTypes().get(0);
    internal_static_analytics_AnalyticsEvent_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_analytics_AnalyticsEvent_AttributesEntry_descriptor,
        new String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
