/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-05-05")
public class BuildSlaveEventsQuery implements org.apache.thrift.TBase<BuildSlaveEventsQuery, BuildSlaveEventsQuery._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveEventsQuery> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveEventsQuery");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("runId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField FIRST_EVENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("firstEventNumber", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildSlaveEventsQueryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildSlaveEventsQueryTupleSchemeFactory());
  }

  public StampedeId stampedeId; // optional
  public RunId runId; // optional
  public int firstEventNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    RUN_ID((short)2, "runId"),
    FIRST_EVENT_NUMBER((short)3, "firstEventNumber");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // RUN_ID
          return RUN_ID;
        case 3: // FIRST_EVENT_NUMBER
          return FIRST_EVENT_NUMBER;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FIRSTEVENTNUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.RUN_ID,_Fields.FIRST_EVENT_NUMBER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("runId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RunId.class)));
    tmpMap.put(_Fields.FIRST_EVENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("firstEventNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveEventsQuery.class, metaDataMap);
  }

  public BuildSlaveEventsQuery() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveEventsQuery(BuildSlaveEventsQuery other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetRunId()) {
      this.runId = new RunId(other.runId);
    }
    this.firstEventNumber = other.firstEventNumber;
  }

  public BuildSlaveEventsQuery deepCopy() {
    return new BuildSlaveEventsQuery(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.runId = null;
    setFirstEventNumberIsSet(false);
    this.firstEventNumber = 0;
  }

  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public BuildSlaveEventsQuery setStampedeId(StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public RunId getRunId() {
    return this.runId;
  }

  public BuildSlaveEventsQuery setRunId(RunId runId) {
    this.runId = runId;
    return this;
  }

  public void unsetRunId() {
    this.runId = null;
  }

  /** Returns true if field runId is set (has been assigned a value) and false otherwise */
  public boolean isSetRunId() {
    return this.runId != null;
  }

  public void setRunIdIsSet(boolean value) {
    if (!value) {
      this.runId = null;
    }
  }

  public int getFirstEventNumber() {
    return this.firstEventNumber;
  }

  public BuildSlaveEventsQuery setFirstEventNumber(int firstEventNumber) {
    this.firstEventNumber = firstEventNumber;
    setFirstEventNumberIsSet(true);
    return this;
  }

  public void unsetFirstEventNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FIRSTEVENTNUMBER_ISSET_ID);
  }

  /** Returns true if field firstEventNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstEventNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __FIRSTEVENTNUMBER_ISSET_ID);
  }

  public void setFirstEventNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FIRSTEVENTNUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case RUN_ID:
      if (value == null) {
        unsetRunId();
      } else {
        setRunId((RunId)value);
      }
      break;

    case FIRST_EVENT_NUMBER:
      if (value == null) {
        unsetFirstEventNumber();
      } else {
        setFirstEventNumber((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case RUN_ID:
      return getRunId();

    case FIRST_EVENT_NUMBER:
      return getFirstEventNumber();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case RUN_ID:
      return isSetRunId();
    case FIRST_EVENT_NUMBER:
      return isSetFirstEventNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveEventsQuery)
      return this.equals((BuildSlaveEventsQuery)that);
    return false;
  }

  public boolean equals(BuildSlaveEventsQuery that) {
    if (that == null)
      return false;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_runId = true && this.isSetRunId();
    boolean that_present_runId = true && that.isSetRunId();
    if (this_present_runId || that_present_runId) {
      if (!(this_present_runId && that_present_runId))
        return false;
      if (!this.runId.equals(that.runId))
        return false;
    }

    boolean this_present_firstEventNumber = true && this.isSetFirstEventNumber();
    boolean that_present_firstEventNumber = true && that.isSetFirstEventNumber();
    if (this_present_firstEventNumber || that_present_firstEventNumber) {
      if (!(this_present_firstEventNumber && that_present_firstEventNumber))
        return false;
      if (this.firstEventNumber != that.firstEventNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_runId = true && (isSetRunId());
    list.add(present_runId);
    if (present_runId)
      list.add(runId);

    boolean present_firstEventNumber = true && (isSetFirstEventNumber());
    list.add(present_firstEventNumber);
    if (present_firstEventNumber)
      list.add(firstEventNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildSlaveEventsQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunId()).compareTo(other.isSetRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runId, other.runId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstEventNumber()).compareTo(other.isSetFirstEventNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstEventNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstEventNumber, other.firstEventNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildSlaveEventsQuery(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetRunId()) {
      if (!first) sb.append(", ");
      sb.append("runId:");
      if (this.runId == null) {
        sb.append("null");
      } else {
        sb.append(this.runId);
      }
      first = false;
    }
    if (isSetFirstEventNumber()) {
      if (!first) sb.append(", ");
      sb.append("firstEventNumber:");
      sb.append(this.firstEventNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
    if (runId != null) {
      runId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildSlaveEventsQueryStandardSchemeFactory implements SchemeFactory {
    public BuildSlaveEventsQueryStandardScheme getScheme() {
      return new BuildSlaveEventsQueryStandardScheme();
    }
  }

  private static class BuildSlaveEventsQueryStandardScheme extends StandardScheme<BuildSlaveEventsQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveEventsQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.runId = new RunId();
              struct.runId.read(iprot);
              struct.setRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIRST_EVENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.firstEventNumber = iprot.readI32();
              struct.setFirstEventNumberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveEventsQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.runId != null) {
        if (struct.isSetRunId()) {
          oprot.writeFieldBegin(RUN_ID_FIELD_DESC);
          struct.runId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetFirstEventNumber()) {
        oprot.writeFieldBegin(FIRST_EVENT_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.firstEventNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildSlaveEventsQueryTupleSchemeFactory implements SchemeFactory {
    public BuildSlaveEventsQueryTupleScheme getScheme() {
      return new BuildSlaveEventsQueryTupleScheme();
    }
  }

  private static class BuildSlaveEventsQueryTupleScheme extends TupleScheme<BuildSlaveEventsQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEventsQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetRunId()) {
        optionals.set(1);
      }
      if (struct.isSetFirstEventNumber()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetRunId()) {
        struct.runId.write(oprot);
      }
      if (struct.isSetFirstEventNumber()) {
        oprot.writeI32(struct.firstEventNumber);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEventsQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.runId = new RunId();
        struct.runId.read(iprot);
        struct.setRunIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.firstEventNumber = iprot.readI32();
        struct.setFirstEventNumberIsSet(true);
      }
    }
  }

}

