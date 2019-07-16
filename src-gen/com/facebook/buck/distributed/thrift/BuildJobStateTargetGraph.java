/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class BuildJobStateTargetGraph implements org.apache.thrift.TBase<BuildJobStateTargetGraph, BuildJobStateTargetGraph._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateTargetGraph> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateTargetGraph");

  private static final org.apache.thrift.protocol.TField NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildJobStateTargetGraphStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildJobStateTargetGraphTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<BuildJobStateTargetNode> nodes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODES((short)1, "nodes");

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
        case 1: // NODES
          return NODES;
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
  private static final _Fields optionals[] = {_Fields.NODES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODES, new org.apache.thrift.meta_data.FieldMetaData("nodes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateTargetNode.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateTargetGraph.class, metaDataMap);
  }

  public BuildJobStateTargetGraph() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateTargetGraph(BuildJobStateTargetGraph other) {
    if (other.isSetNodes()) {
      java.util.List<BuildJobStateTargetNode> __this__nodes = new java.util.ArrayList<BuildJobStateTargetNode>(other.nodes.size());
      for (BuildJobStateTargetNode other_element : other.nodes) {
        __this__nodes.add(new BuildJobStateTargetNode(other_element));
      }
      this.nodes = __this__nodes;
    }
  }

  public BuildJobStateTargetGraph deepCopy() {
    return new BuildJobStateTargetGraph(this);
  }

  @Override
  public void clear() {
    this.nodes = null;
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<BuildJobStateTargetNode> getNodesIterator() {
    return (this.nodes == null) ? null : this.nodes.iterator();
  }

  public void addToNodes(BuildJobStateTargetNode elem) {
    if (this.nodes == null) {
      this.nodes = new java.util.ArrayList<BuildJobStateTargetNode>();
    }
    this.nodes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<BuildJobStateTargetNode> getNodes() {
    return this.nodes;
  }

  public BuildJobStateTargetGraph setNodes(@org.apache.thrift.annotation.Nullable java.util.List<BuildJobStateTargetNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been assigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((java.util.List<BuildJobStateTargetNode>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NODES:
      return getNodes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NODES:
      return isSetNodes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateTargetGraph)
      return this.equals((BuildJobStateTargetGraph)that);
    return false;
  }

  public boolean equals(BuildJobStateTargetGraph that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNodes()) ? 131071 : 524287);
    if (isSetNodes())
      hashCode = hashCode * 8191 + nodes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildJobStateTargetGraph other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes, other.nodes);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildJobStateTargetGraph(");
    boolean first = true;

    if (isSetNodes()) {
      sb.append("nodes:");
      if (this.nodes == null) {
        sb.append("null");
      } else {
        sb.append(this.nodes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class BuildJobStateTargetGraphStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateTargetGraphStandardScheme getScheme() {
      return new BuildJobStateTargetGraphStandardScheme();
    }
  }

  private static class BuildJobStateTargetGraphStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildJobStateTargetGraph> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list52 = iprot.readListBegin();
                struct.nodes = new java.util.ArrayList<BuildJobStateTargetNode>(_list52.size);
                @org.apache.thrift.annotation.Nullable BuildJobStateTargetNode _elem53;
                for (int _i54 = 0; _i54 < _list52.size; ++_i54)
                {
                  _elem53 = new BuildJobStateTargetNode();
                  _elem53.read(iprot);
                  struct.nodes.add(_elem53);
                }
                iprot.readListEnd();
              }
              struct.setNodesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodes != null) {
        if (struct.isSetNodes()) {
          oprot.writeFieldBegin(NODES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodes.size()));
            for (BuildJobStateTargetNode _iter55 : struct.nodes)
            {
              _iter55.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateTargetGraphTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateTargetGraphTupleScheme getScheme() {
      return new BuildJobStateTargetGraphTupleScheme();
    }
  }

  private static class BuildJobStateTargetGraphTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildJobStateTargetGraph> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNodes()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNodes()) {
        {
          oprot.writeI32(struct.nodes.size());
          for (BuildJobStateTargetNode _iter56 : struct.nodes)
          {
            _iter56.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list57 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.nodes = new java.util.ArrayList<BuildJobStateTargetNode>(_list57.size);
          @org.apache.thrift.annotation.Nullable BuildJobStateTargetNode _elem58;
          for (int _i59 = 0; _i59 < _list57.size; ++_i59)
          {
            _elem58 = new BuildJobStateTargetNode();
            _elem58.read(iprot);
            struct.nodes.add(_elem58);
          }
        }
        struct.setNodesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

