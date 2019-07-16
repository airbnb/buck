/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class ObtainAllAvailableCapacityRequest implements org.apache.thrift.TBase<ObtainAllAvailableCapacityRequest, ObtainAllAvailableCapacityRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ObtainAllAvailableCapacityRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ObtainAllAvailableCapacityRequest");

  private static final org.apache.thrift.protocol.TField BUILD_SLAVE_RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildSlaveRunId", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ObtainAllAvailableCapacityRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ObtainAllAvailableCapacityRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.facebook.buck.distributed.thrift.BuildSlaveRunId buildSlaveRunId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUILD_SLAVE_RUN_ID((short)1, "buildSlaveRunId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUILD_SLAVE_RUN_ID
          return BUILD_SLAVE_RUN_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.BUILD_SLAVE_RUN_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUILD_SLAVE_RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("buildSlaveRunId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.buck.distributed.thrift.BuildSlaveRunId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ObtainAllAvailableCapacityRequest.class, metaDataMap);
  }

  public ObtainAllAvailableCapacityRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ObtainAllAvailableCapacityRequest(ObtainAllAvailableCapacityRequest other) {
    if (other.isSetBuildSlaveRunId()) {
      this.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId(other.buildSlaveRunId);
    }
  }

  public ObtainAllAvailableCapacityRequest deepCopy() {
    return new ObtainAllAvailableCapacityRequest(this);
  }

  @Override
  public void clear() {
    this.buildSlaveRunId = null;
  }

  @org.apache.thrift.annotation.Nullable
  public com.facebook.buck.distributed.thrift.BuildSlaveRunId getBuildSlaveRunId() {
    return this.buildSlaveRunId;
  }

  public ObtainAllAvailableCapacityRequest setBuildSlaveRunId(@org.apache.thrift.annotation.Nullable com.facebook.buck.distributed.thrift.BuildSlaveRunId buildSlaveRunId) {
    this.buildSlaveRunId = buildSlaveRunId;
    return this;
  }

  public void unsetBuildSlaveRunId() {
    this.buildSlaveRunId = null;
  }

  /** Returns true if field buildSlaveRunId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildSlaveRunId() {
    return this.buildSlaveRunId != null;
  }

  public void setBuildSlaveRunIdIsSet(boolean value) {
    if (!value) {
      this.buildSlaveRunId = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      if (value == null) {
        unsetBuildSlaveRunId();
      } else {
        setBuildSlaveRunId((com.facebook.buck.distributed.thrift.BuildSlaveRunId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      return getBuildSlaveRunId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      return isSetBuildSlaveRunId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ObtainAllAvailableCapacityRequest)
      return this.equals((ObtainAllAvailableCapacityRequest)that);
    return false;
  }

  public boolean equals(ObtainAllAvailableCapacityRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_buildSlaveRunId = true && this.isSetBuildSlaveRunId();
    boolean that_present_buildSlaveRunId = true && that.isSetBuildSlaveRunId();
    if (this_present_buildSlaveRunId || that_present_buildSlaveRunId) {
      if (!(this_present_buildSlaveRunId && that_present_buildSlaveRunId))
        return false;
      if (!this.buildSlaveRunId.equals(that.buildSlaveRunId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBuildSlaveRunId()) ? 131071 : 524287);
    if (isSetBuildSlaveRunId())
      hashCode = hashCode * 8191 + buildSlaveRunId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ObtainAllAvailableCapacityRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBuildSlaveRunId()).compareTo(other.isSetBuildSlaveRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildSlaveRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildSlaveRunId, other.buildSlaveRunId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ObtainAllAvailableCapacityRequest(");
    boolean first = true;

    if (isSetBuildSlaveRunId()) {
      sb.append("buildSlaveRunId:");
      if (this.buildSlaveRunId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildSlaveRunId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildSlaveRunId != null) {
      buildSlaveRunId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ObtainAllAvailableCapacityRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ObtainAllAvailableCapacityRequestStandardScheme getScheme() {
      return new ObtainAllAvailableCapacityRequestStandardScheme();
    }
  }

  private static class ObtainAllAvailableCapacityRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<ObtainAllAvailableCapacityRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ObtainAllAvailableCapacityRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUILD_SLAVE_RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId();
              struct.buildSlaveRunId.read(iprot);
              struct.setBuildSlaveRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ObtainAllAvailableCapacityRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buildSlaveRunId != null) {
        if (struct.isSetBuildSlaveRunId()) {
          oprot.writeFieldBegin(BUILD_SLAVE_RUN_ID_FIELD_DESC);
          struct.buildSlaveRunId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ObtainAllAvailableCapacityRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ObtainAllAvailableCapacityRequestTupleScheme getScheme() {
      return new ObtainAllAvailableCapacityRequestTupleScheme();
    }
  }

  private static class ObtainAllAvailableCapacityRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<ObtainAllAvailableCapacityRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ObtainAllAvailableCapacityRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBuildSlaveRunId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBuildSlaveRunId()) {
        struct.buildSlaveRunId.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ObtainAllAvailableCapacityRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.buildSlaveRunId = new com.facebook.buck.distributed.thrift.BuildSlaveRunId();
        struct.buildSlaveRunId.read(iprot);
        struct.setBuildSlaveRunIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

