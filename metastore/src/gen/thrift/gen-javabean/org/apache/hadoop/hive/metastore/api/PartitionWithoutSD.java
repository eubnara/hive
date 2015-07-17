/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-14")
public class PartitionWithoutSD implements org.apache.thrift.TBase<PartitionWithoutSD, PartitionWithoutSD._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionWithoutSD> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionWithoutSD");

  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_ACCESS_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAccessTime", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RELATIVE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("relativePath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privileges", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionWithoutSDStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionWithoutSDTupleSchemeFactory());
  }

  private List<String> values; // required
  private int createTime; // required
  private int lastAccessTime; // required
  private String relativePath; // required
  private Map<String,String> parameters; // required
  private PrincipalPrivilegeSet privileges; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUES((short)1, "values"),
    CREATE_TIME((short)2, "createTime"),
    LAST_ACCESS_TIME((short)3, "lastAccessTime"),
    RELATIVE_PATH((short)4, "relativePath"),
    PARAMETERS((short)5, "parameters"),
    PRIVILEGES((short)6, "privileges");

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
        case 1: // VALUES
          return VALUES;
        case 2: // CREATE_TIME
          return CREATE_TIME;
        case 3: // LAST_ACCESS_TIME
          return LAST_ACCESS_TIME;
        case 4: // RELATIVE_PATH
          return RELATIVE_PATH;
        case 5: // PARAMETERS
          return PARAMETERS;
        case 6: // PRIVILEGES
          return PRIVILEGES;
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
  private static final int __CREATETIME_ISSET_ID = 0;
  private static final int __LASTACCESSTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PRIVILEGES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_ACCESS_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastAccessTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RELATIVE_PATH, new org.apache.thrift.meta_data.FieldMetaData("relativePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("privileges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrincipalPrivilegeSet.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionWithoutSD.class, metaDataMap);
  }

  public PartitionWithoutSD() {
  }

  public PartitionWithoutSD(
    List<String> values,
    int createTime,
    int lastAccessTime,
    String relativePath,
    Map<String,String> parameters)
  {
    this();
    this.values = values;
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
    this.relativePath = relativePath;
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionWithoutSD(PartitionWithoutSD other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetValues()) {
      List<String> __this__values = new ArrayList<String>(other.values);
      this.values = __this__values;
    }
    this.createTime = other.createTime;
    this.lastAccessTime = other.lastAccessTime;
    if (other.isSetRelativePath()) {
      this.relativePath = other.relativePath;
    }
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>(other.parameters);
      this.parameters = __this__parameters;
    }
    if (other.isSetPrivileges()) {
      this.privileges = new PrincipalPrivilegeSet(other.privileges);
    }
  }

  public PartitionWithoutSD deepCopy() {
    return new PartitionWithoutSD(this);
  }

  @Override
  public void clear() {
    this.values = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    setLastAccessTimeIsSet(false);
    this.lastAccessTime = 0;
    this.relativePath = null;
    this.parameters = null;
    this.privileges = null;
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<String> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(String elem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(elem);
  }

  public List<String> getValues() {
    return this.values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  public int getLastAccessTime() {
    return this.lastAccessTime;
  }

  public void setLastAccessTime(int lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
  }

  public void unsetLastAccessTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  /** Returns true if field lastAccessTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAccessTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  public void setLastAccessTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID, value);
  }

  public String getRelativePath() {
    return this.relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public void unsetRelativePath() {
    this.relativePath = null;
  }

  /** Returns true if field relativePath is set (has been assigned a value) and false otherwise */
  public boolean isSetRelativePath() {
    return this.relativePath != null;
  }

  public void setRelativePathIsSet(boolean value) {
    if (!value) {
      this.relativePath = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public void setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public PrincipalPrivilegeSet getPrivileges() {
    return this.privileges;
  }

  public void setPrivileges(PrincipalPrivilegeSet privileges) {
    this.privileges = privileges;
  }

  public void unsetPrivileges() {
    this.privileges = null;
  }

  /** Returns true if field privileges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivileges() {
    return this.privileges != null;
  }

  public void setPrivilegesIsSet(boolean value) {
    if (!value) {
      this.privileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<String>)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Integer)value);
      }
      break;

    case LAST_ACCESS_TIME:
      if (value == null) {
        unsetLastAccessTime();
      } else {
        setLastAccessTime((Integer)value);
      }
      break;

    case RELATIVE_PATH:
      if (value == null) {
        unsetRelativePath();
      } else {
        setRelativePath((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    case PRIVILEGES:
      if (value == null) {
        unsetPrivileges();
      } else {
        setPrivileges((PrincipalPrivilegeSet)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUES:
      return getValues();

    case CREATE_TIME:
      return Integer.valueOf(getCreateTime());

    case LAST_ACCESS_TIME:
      return Integer.valueOf(getLastAccessTime());

    case RELATIVE_PATH:
      return getRelativePath();

    case PARAMETERS:
      return getParameters();

    case PRIVILEGES:
      return getPrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALUES:
      return isSetValues();
    case CREATE_TIME:
      return isSetCreateTime();
    case LAST_ACCESS_TIME:
      return isSetLastAccessTime();
    case RELATIVE_PATH:
      return isSetRelativePath();
    case PARAMETERS:
      return isSetParameters();
    case PRIVILEGES:
      return isSetPrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionWithoutSD)
      return this.equals((PartitionWithoutSD)that);
    return false;
  }

  public boolean equals(PartitionWithoutSD that) {
    if (that == null)
      return false;

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_lastAccessTime = true;
    boolean that_present_lastAccessTime = true;
    if (this_present_lastAccessTime || that_present_lastAccessTime) {
      if (!(this_present_lastAccessTime && that_present_lastAccessTime))
        return false;
      if (this.lastAccessTime != that.lastAccessTime)
        return false;
    }

    boolean this_present_relativePath = true && this.isSetRelativePath();
    boolean that_present_relativePath = true && that.isSetRelativePath();
    if (this_present_relativePath || that_present_relativePath) {
      if (!(this_present_relativePath && that_present_relativePath))
        return false;
      if (!this.relativePath.equals(that.relativePath))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_privileges = true && this.isSetPrivileges();
    boolean that_present_privileges = true && that.isSetPrivileges();
    if (this_present_privileges || that_present_privileges) {
      if (!(this_present_privileges && that_present_privileges))
        return false;
      if (!this.privileges.equals(that.privileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    boolean present_createTime = true;
    list.add(present_createTime);
    if (present_createTime)
      list.add(createTime);

    boolean present_lastAccessTime = true;
    list.add(present_lastAccessTime);
    if (present_lastAccessTime)
      list.add(lastAccessTime);

    boolean present_relativePath = true && (isSetRelativePath());
    list.add(present_relativePath);
    if (present_relativePath)
      list.add(relativePath);

    boolean present_parameters = true && (isSetParameters());
    list.add(present_parameters);
    if (present_parameters)
      list.add(parameters);

    boolean present_privileges = true && (isSetPrivileges());
    list.add(present_privileges);
    if (present_privileges)
      list.add(privileges);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionWithoutSD other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastAccessTime()).compareTo(other.isSetLastAccessTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAccessTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAccessTime, other.lastAccessTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRelativePath()).compareTo(other.isSetRelativePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelativePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relativePath, other.relativePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(other.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, other.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivileges()).compareTo(other.isSetPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privileges, other.privileges);
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
    StringBuilder sb = new StringBuilder("PartitionWithoutSD(");
    boolean first = true;

    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastAccessTime:");
    sb.append(this.lastAccessTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("relativePath:");
    if (this.relativePath == null) {
      sb.append("null");
    } else {
      sb.append(this.relativePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (isSetPrivileges()) {
      if (!first) sb.append(", ");
      sb.append("privileges:");
      if (this.privileges == null) {
        sb.append("null");
      } else {
        sb.append(this.privileges);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (privileges != null) {
      privileges.validate();
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

  private static class PartitionWithoutSDStandardSchemeFactory implements SchemeFactory {
    public PartitionWithoutSDStandardScheme getScheme() {
      return new PartitionWithoutSDStandardScheme();
    }
  }

  private static class PartitionWithoutSDStandardScheme extends StandardScheme<PartitionWithoutSD> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.values = new ArrayList<String>(_list226.size);
                String _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = iprot.readString();
                  struct.values.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.createTime = iprot.readI32();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_ACCESS_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastAccessTime = iprot.readI32();
              struct.setLastAccessTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RELATIVE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.relativePath = iprot.readString();
              struct.setRelativePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map229 = iprot.readMapBegin();
                struct.parameters = new HashMap<String,String>(2*_map229.size);
                String _key230;
                String _val231;
                for (int _i232 = 0; _i232 < _map229.size; ++_i232)
                {
                  _key230 = iprot.readString();
                  _val231 = iprot.readString();
                  struct.parameters.put(_key230, _val231);
                }
                iprot.readMapEnd();
              }
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.privileges = new PrincipalPrivilegeSet();
              struct.privileges.read(iprot);
              struct.setPrivilegesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.values.size()));
          for (String _iter233 : struct.values)
          {
            oprot.writeString(_iter233);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.createTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_ACCESS_TIME_FIELD_DESC);
      oprot.writeI32(struct.lastAccessTime);
      oprot.writeFieldEnd();
      if (struct.relativePath != null) {
        oprot.writeFieldBegin(RELATIVE_PATH_FIELD_DESC);
        oprot.writeString(struct.relativePath);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (Map.Entry<String, String> _iter234 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter234.getKey());
            oprot.writeString(_iter234.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.privileges != null) {
        if (struct.isSetPrivileges()) {
          oprot.writeFieldBegin(PRIVILEGES_FIELD_DESC);
          struct.privileges.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionWithoutSDTupleSchemeFactory implements SchemeFactory {
    public PartitionWithoutSDTupleScheme getScheme() {
      return new PartitionWithoutSDTupleScheme();
    }
  }

  private static class PartitionWithoutSDTupleScheme extends TupleScheme<PartitionWithoutSD> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(1);
      }
      if (struct.isSetLastAccessTime()) {
        optionals.set(2);
      }
      if (struct.isSetRelativePath()) {
        optionals.set(3);
      }
      if (struct.isSetParameters()) {
        optionals.set(4);
      }
      if (struct.isSetPrivileges()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (String _iter235 : struct.values)
          {
            oprot.writeString(_iter235);
          }
        }
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI32(struct.createTime);
      }
      if (struct.isSetLastAccessTime()) {
        oprot.writeI32(struct.lastAccessTime);
      }
      if (struct.isSetRelativePath()) {
        oprot.writeString(struct.relativePath);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (Map.Entry<String, String> _iter236 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter236.getKey());
            oprot.writeString(_iter236.getValue());
          }
        }
      }
      if (struct.isSetPrivileges()) {
        struct.privileges.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list237 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new ArrayList<String>(_list237.size);
          String _elem238;
          for (int _i239 = 0; _i239 < _list237.size; ++_i239)
          {
            _elem238 = iprot.readString();
            struct.values.add(_elem238);
          }
        }
        struct.setValuesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createTime = iprot.readI32();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastAccessTime = iprot.readI32();
        struct.setLastAccessTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.relativePath = iprot.readString();
        struct.setRelativePathIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map240 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.parameters = new HashMap<String,String>(2*_map240.size);
          String _key241;
          String _val242;
          for (int _i243 = 0; _i243 < _map240.size; ++_i243)
          {
            _key241 = iprot.readString();
            _val242 = iprot.readString();
            struct.parameters.put(_key241, _val242);
          }
        }
        struct.setParametersIsSet(true);
      }
      if (incoming.get(5)) {
        struct.privileges = new PrincipalPrivilegeSet();
        struct.privileges.read(iprot);
        struct.setPrivilegesIsSet(true);
      }
    }
  }

}

