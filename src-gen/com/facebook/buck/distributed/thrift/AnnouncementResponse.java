/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class AnnouncementResponse implements org.apache.thrift.TBase<AnnouncementResponse, AnnouncementResponse._Fields>, java.io.Serializable, Cloneable, Comparable<AnnouncementResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnnouncementResponse");

  private static final org.apache.thrift.protocol.TField ANNOUNCEMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("announcements", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AnnouncementResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AnnouncementResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<Announcement> announcements; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ANNOUNCEMENTS((short)1, "announcements");

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
        case 1: // ANNOUNCEMENTS
          return ANNOUNCEMENTS;
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
  private static final _Fields optionals[] = {_Fields.ANNOUNCEMENTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOUNCEMENTS, new org.apache.thrift.meta_data.FieldMetaData("announcements", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Announcement.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnnouncementResponse.class, metaDataMap);
  }

  public AnnouncementResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnnouncementResponse(AnnouncementResponse other) {
    if (other.isSetAnnouncements()) {
      java.util.List<Announcement> __this__announcements = new java.util.ArrayList<Announcement>(other.announcements.size());
      for (Announcement other_element : other.announcements) {
        __this__announcements.add(new Announcement(other_element));
      }
      this.announcements = __this__announcements;
    }
  }

  public AnnouncementResponse deepCopy() {
    return new AnnouncementResponse(this);
  }

  @Override
  public void clear() {
    this.announcements = null;
  }

  public int getAnnouncementsSize() {
    return (this.announcements == null) ? 0 : this.announcements.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Announcement> getAnnouncementsIterator() {
    return (this.announcements == null) ? null : this.announcements.iterator();
  }

  public void addToAnnouncements(Announcement elem) {
    if (this.announcements == null) {
      this.announcements = new java.util.ArrayList<Announcement>();
    }
    this.announcements.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<Announcement> getAnnouncements() {
    return this.announcements;
  }

  public AnnouncementResponse setAnnouncements(@org.apache.thrift.annotation.Nullable java.util.List<Announcement> announcements) {
    this.announcements = announcements;
    return this;
  }

  public void unsetAnnouncements() {
    this.announcements = null;
  }

  /** Returns true if field announcements is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnouncements() {
    return this.announcements != null;
  }

  public void setAnnouncementsIsSet(boolean value) {
    if (!value) {
      this.announcements = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ANNOUNCEMENTS:
      if (value == null) {
        unsetAnnouncements();
      } else {
        setAnnouncements((java.util.List<Announcement>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOUNCEMENTS:
      return getAnnouncements();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ANNOUNCEMENTS:
      return isSetAnnouncements();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AnnouncementResponse)
      return this.equals((AnnouncementResponse)that);
    return false;
  }

  public boolean equals(AnnouncementResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_announcements = true && this.isSetAnnouncements();
    boolean that_present_announcements = true && that.isSetAnnouncements();
    if (this_present_announcements || that_present_announcements) {
      if (!(this_present_announcements && that_present_announcements))
        return false;
      if (!this.announcements.equals(that.announcements))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAnnouncements()) ? 131071 : 524287);
    if (isSetAnnouncements())
      hashCode = hashCode * 8191 + announcements.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AnnouncementResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAnnouncements()).compareTo(other.isSetAnnouncements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnouncements()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announcements, other.announcements);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AnnouncementResponse(");
    boolean first = true;

    if (isSetAnnouncements()) {
      sb.append("announcements:");
      if (this.announcements == null) {
        sb.append("null");
      } else {
        sb.append(this.announcements);
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

  private static class AnnouncementResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AnnouncementResponseStandardScheme getScheme() {
      return new AnnouncementResponseStandardScheme();
    }
  }

  private static class AnnouncementResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<AnnouncementResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOUNCEMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list144 = iprot.readListBegin();
                struct.announcements = new java.util.ArrayList<Announcement>(_list144.size);
                @org.apache.thrift.annotation.Nullable Announcement _elem145;
                for (int _i146 = 0; _i146 < _list144.size; ++_i146)
                {
                  _elem145 = new Announcement();
                  _elem145.read(iprot);
                  struct.announcements.add(_elem145);
                }
                iprot.readListEnd();
              }
              struct.setAnnouncementsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.announcements != null) {
        if (struct.isSetAnnouncements()) {
          oprot.writeFieldBegin(ANNOUNCEMENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.announcements.size()));
            for (Announcement _iter147 : struct.announcements)
            {
              _iter147.write(oprot);
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

  private static class AnnouncementResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AnnouncementResponseTupleScheme getScheme() {
      return new AnnouncementResponseTupleScheme();
    }
  }

  private static class AnnouncementResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<AnnouncementResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAnnouncements()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAnnouncements()) {
        {
          oprot.writeI32(struct.announcements.size());
          for (Announcement _iter148 : struct.announcements)
          {
            _iter148.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnnouncementResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list149 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.announcements = new java.util.ArrayList<Announcement>(_list149.size);
          @org.apache.thrift.annotation.Nullable Announcement _elem150;
          for (int _i151 = 0; _i151 < _list149.size; ++_i151)
          {
            _elem150 = new Announcement();
            _elem150.read(iprot);
            struct.announcements.add(_elem150);
          }
        }
        struct.setAnnouncementsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

