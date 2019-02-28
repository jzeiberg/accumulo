/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.dataImpl.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
public class TRange implements org.apache.thrift.TBase<TRange, TRange._Fields>, java.io.Serializable, Cloneable, Comparable<TRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRange");

  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STOP_FIELD_DESC = new org.apache.thrift.protocol.TField("stop", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField START_KEY_INCLUSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("startKeyInclusive", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField STOP_KEY_INCLUSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("stopKeyInclusive", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField INFINITE_START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("infiniteStartKey", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField INFINITE_STOP_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("infiniteStopKey", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TKey start; // required
  public @org.apache.thrift.annotation.Nullable TKey stop; // required
  public boolean startKeyInclusive; // required
  public boolean stopKeyInclusive; // required
  public boolean infiniteStartKey; // required
  public boolean infiniteStopKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START((short)1, "start"),
    STOP((short)2, "stop"),
    START_KEY_INCLUSIVE((short)3, "startKeyInclusive"),
    STOP_KEY_INCLUSIVE((short)4, "stopKeyInclusive"),
    INFINITE_START_KEY((short)5, "infiniteStartKey"),
    INFINITE_STOP_KEY((short)6, "infiniteStopKey");

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
        case 1: // START
          return START;
        case 2: // STOP
          return STOP;
        case 3: // START_KEY_INCLUSIVE
          return START_KEY_INCLUSIVE;
        case 4: // STOP_KEY_INCLUSIVE
          return STOP_KEY_INCLUSIVE;
        case 5: // INFINITE_START_KEY
          return INFINITE_START_KEY;
        case 6: // INFINITE_STOP_KEY
          return INFINITE_STOP_KEY;
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
  private static final int __STARTKEYINCLUSIVE_ISSET_ID = 0;
  private static final int __STOPKEYINCLUSIVE_ISSET_ID = 1;
  private static final int __INFINITESTARTKEY_ISSET_ID = 2;
  private static final int __INFINITESTOPKEY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKey.class)));
    tmpMap.put(_Fields.STOP, new org.apache.thrift.meta_data.FieldMetaData("stop", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKey.class)));
    tmpMap.put(_Fields.START_KEY_INCLUSIVE, new org.apache.thrift.meta_data.FieldMetaData("startKeyInclusive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STOP_KEY_INCLUSIVE, new org.apache.thrift.meta_data.FieldMetaData("stopKeyInclusive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INFINITE_START_KEY, new org.apache.thrift.meta_data.FieldMetaData("infiniteStartKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INFINITE_STOP_KEY, new org.apache.thrift.meta_data.FieldMetaData("infiniteStopKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRange.class, metaDataMap);
  }

  public TRange() {
  }

  public TRange(
    TKey start,
    TKey stop,
    boolean startKeyInclusive,
    boolean stopKeyInclusive,
    boolean infiniteStartKey,
    boolean infiniteStopKey)
  {
    this();
    this.start = start;
    this.stop = stop;
    this.startKeyInclusive = startKeyInclusive;
    setStartKeyInclusiveIsSet(true);
    this.stopKeyInclusive = stopKeyInclusive;
    setStopKeyInclusiveIsSet(true);
    this.infiniteStartKey = infiniteStartKey;
    setInfiniteStartKeyIsSet(true);
    this.infiniteStopKey = infiniteStopKey;
    setInfiniteStopKeyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRange(TRange other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStart()) {
      this.start = new TKey(other.start);
    }
    if (other.isSetStop()) {
      this.stop = new TKey(other.stop);
    }
    this.startKeyInclusive = other.startKeyInclusive;
    this.stopKeyInclusive = other.stopKeyInclusive;
    this.infiniteStartKey = other.infiniteStartKey;
    this.infiniteStopKey = other.infiniteStopKey;
  }

  public TRange deepCopy() {
    return new TRange(this);
  }

  @Override
  public void clear() {
    this.start = null;
    this.stop = null;
    setStartKeyInclusiveIsSet(false);
    this.startKeyInclusive = false;
    setStopKeyInclusiveIsSet(false);
    this.stopKeyInclusive = false;
    setInfiniteStartKeyIsSet(false);
    this.infiniteStartKey = false;
    setInfiniteStopKeyIsSet(false);
    this.infiniteStopKey = false;
  }

  @org.apache.thrift.annotation.Nullable
  public TKey getStart() {
    return this.start;
  }

  public TRange setStart(@org.apache.thrift.annotation.Nullable TKey start) {
    this.start = start;
    return this;
  }

  public void unsetStart() {
    this.start = null;
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return this.start != null;
  }

  public void setStartIsSet(boolean value) {
    if (!value) {
      this.start = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TKey getStop() {
    return this.stop;
  }

  public TRange setStop(@org.apache.thrift.annotation.Nullable TKey stop) {
    this.stop = stop;
    return this;
  }

  public void unsetStop() {
    this.stop = null;
  }

  /** Returns true if field stop is set (has been assigned a value) and false otherwise */
  public boolean isSetStop() {
    return this.stop != null;
  }

  public void setStopIsSet(boolean value) {
    if (!value) {
      this.stop = null;
    }
  }

  public boolean isStartKeyInclusive() {
    return this.startKeyInclusive;
  }

  public TRange setStartKeyInclusive(boolean startKeyInclusive) {
    this.startKeyInclusive = startKeyInclusive;
    setStartKeyInclusiveIsSet(true);
    return this;
  }

  public void unsetStartKeyInclusive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTKEYINCLUSIVE_ISSET_ID);
  }

  /** Returns true if field startKeyInclusive is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKeyInclusive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTKEYINCLUSIVE_ISSET_ID);
  }

  public void setStartKeyInclusiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTKEYINCLUSIVE_ISSET_ID, value);
  }

  public boolean isStopKeyInclusive() {
    return this.stopKeyInclusive;
  }

  public TRange setStopKeyInclusive(boolean stopKeyInclusive) {
    this.stopKeyInclusive = stopKeyInclusive;
    setStopKeyInclusiveIsSet(true);
    return this;
  }

  public void unsetStopKeyInclusive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STOPKEYINCLUSIVE_ISSET_ID);
  }

  /** Returns true if field stopKeyInclusive is set (has been assigned a value) and false otherwise */
  public boolean isSetStopKeyInclusive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STOPKEYINCLUSIVE_ISSET_ID);
  }

  public void setStopKeyInclusiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STOPKEYINCLUSIVE_ISSET_ID, value);
  }

  public boolean isInfiniteStartKey() {
    return this.infiniteStartKey;
  }

  public TRange setInfiniteStartKey(boolean infiniteStartKey) {
    this.infiniteStartKey = infiniteStartKey;
    setInfiniteStartKeyIsSet(true);
    return this;
  }

  public void unsetInfiniteStartKey() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INFINITESTARTKEY_ISSET_ID);
  }

  /** Returns true if field infiniteStartKey is set (has been assigned a value) and false otherwise */
  public boolean isSetInfiniteStartKey() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INFINITESTARTKEY_ISSET_ID);
  }

  public void setInfiniteStartKeyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INFINITESTARTKEY_ISSET_ID, value);
  }

  public boolean isInfiniteStopKey() {
    return this.infiniteStopKey;
  }

  public TRange setInfiniteStopKey(boolean infiniteStopKey) {
    this.infiniteStopKey = infiniteStopKey;
    setInfiniteStopKeyIsSet(true);
    return this;
  }

  public void unsetInfiniteStopKey() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INFINITESTOPKEY_ISSET_ID);
  }

  /** Returns true if field infiniteStopKey is set (has been assigned a value) and false otherwise */
  public boolean isSetInfiniteStopKey() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INFINITESTOPKEY_ISSET_ID);
  }

  public void setInfiniteStopKeyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INFINITESTOPKEY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((TKey)value);
      }
      break;

    case STOP:
      if (value == null) {
        unsetStop();
      } else {
        setStop((TKey)value);
      }
      break;

    case START_KEY_INCLUSIVE:
      if (value == null) {
        unsetStartKeyInclusive();
      } else {
        setStartKeyInclusive((java.lang.Boolean)value);
      }
      break;

    case STOP_KEY_INCLUSIVE:
      if (value == null) {
        unsetStopKeyInclusive();
      } else {
        setStopKeyInclusive((java.lang.Boolean)value);
      }
      break;

    case INFINITE_START_KEY:
      if (value == null) {
        unsetInfiniteStartKey();
      } else {
        setInfiniteStartKey((java.lang.Boolean)value);
      }
      break;

    case INFINITE_STOP_KEY:
      if (value == null) {
        unsetInfiniteStopKey();
      } else {
        setInfiniteStopKey((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START:
      return getStart();

    case STOP:
      return getStop();

    case START_KEY_INCLUSIVE:
      return isStartKeyInclusive();

    case STOP_KEY_INCLUSIVE:
      return isStopKeyInclusive();

    case INFINITE_START_KEY:
      return isInfiniteStartKey();

    case INFINITE_STOP_KEY:
      return isInfiniteStopKey();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START:
      return isSetStart();
    case STOP:
      return isSetStop();
    case START_KEY_INCLUSIVE:
      return isSetStartKeyInclusive();
    case STOP_KEY_INCLUSIVE:
      return isSetStopKeyInclusive();
    case INFINITE_START_KEY:
      return isSetInfiniteStartKey();
    case INFINITE_STOP_KEY:
      return isSetInfiniteStopKey();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TRange)
      return this.equals((TRange)that);
    return false;
  }

  public boolean equals(TRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (!this.start.equals(that.start))
        return false;
    }

    boolean this_present_stop = true && this.isSetStop();
    boolean that_present_stop = true && that.isSetStop();
    if (this_present_stop || that_present_stop) {
      if (!(this_present_stop && that_present_stop))
        return false;
      if (!this.stop.equals(that.stop))
        return false;
    }

    boolean this_present_startKeyInclusive = true;
    boolean that_present_startKeyInclusive = true;
    if (this_present_startKeyInclusive || that_present_startKeyInclusive) {
      if (!(this_present_startKeyInclusive && that_present_startKeyInclusive))
        return false;
      if (this.startKeyInclusive != that.startKeyInclusive)
        return false;
    }

    boolean this_present_stopKeyInclusive = true;
    boolean that_present_stopKeyInclusive = true;
    if (this_present_stopKeyInclusive || that_present_stopKeyInclusive) {
      if (!(this_present_stopKeyInclusive && that_present_stopKeyInclusive))
        return false;
      if (this.stopKeyInclusive != that.stopKeyInclusive)
        return false;
    }

    boolean this_present_infiniteStartKey = true;
    boolean that_present_infiniteStartKey = true;
    if (this_present_infiniteStartKey || that_present_infiniteStartKey) {
      if (!(this_present_infiniteStartKey && that_present_infiniteStartKey))
        return false;
      if (this.infiniteStartKey != that.infiniteStartKey)
        return false;
    }

    boolean this_present_infiniteStopKey = true;
    boolean that_present_infiniteStopKey = true;
    if (this_present_infiniteStopKey || that_present_infiniteStopKey) {
      if (!(this_present_infiniteStopKey && that_present_infiniteStopKey))
        return false;
      if (this.infiniteStopKey != that.infiniteStopKey)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStart()) ? 131071 : 524287);
    if (isSetStart())
      hashCode = hashCode * 8191 + start.hashCode();

    hashCode = hashCode * 8191 + ((isSetStop()) ? 131071 : 524287);
    if (isSetStop())
      hashCode = hashCode * 8191 + stop.hashCode();

    hashCode = hashCode * 8191 + ((startKeyInclusive) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((stopKeyInclusive) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((infiniteStartKey) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((infiniteStopKey) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStop()).compareTo(other.isSetStop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stop, other.stop);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartKeyInclusive()).compareTo(other.isSetStartKeyInclusive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKeyInclusive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startKeyInclusive, other.startKeyInclusive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStopKeyInclusive()).compareTo(other.isSetStopKeyInclusive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopKeyInclusive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stopKeyInclusive, other.stopKeyInclusive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInfiniteStartKey()).compareTo(other.isSetInfiniteStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfiniteStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infiniteStartKey, other.infiniteStartKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInfiniteStopKey()).compareTo(other.isSetInfiniteStopKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfiniteStopKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infiniteStopKey, other.infiniteStopKey);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRange(");
    boolean first = true;

    sb.append("start:");
    if (this.start == null) {
      sb.append("null");
    } else {
      sb.append(this.start);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stop:");
    if (this.stop == null) {
      sb.append("null");
    } else {
      sb.append(this.stop);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startKeyInclusive:");
    sb.append(this.startKeyInclusive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stopKeyInclusive:");
    sb.append(this.stopKeyInclusive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("infiniteStartKey:");
    sb.append(this.infiniteStartKey);
    first = false;
    if (!first) sb.append(", ");
    sb.append("infiniteStopKey:");
    sb.append(this.infiniteStopKey);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (start != null) {
      start.validate();
    }
    if (stop != null) {
      stop.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangeStandardScheme getScheme() {
      return new TRangeStandardScheme();
    }
  }

  private static class TRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.start = new TKey();
              struct.start.read(iprot);
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STOP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stop = new TKey();
              struct.stop.read(iprot);
              struct.setStopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_KEY_INCLUSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.startKeyInclusive = iprot.readBool();
              struct.setStartKeyInclusiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STOP_KEY_INCLUSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stopKeyInclusive = iprot.readBool();
              struct.setStopKeyInclusiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INFINITE_START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.infiniteStartKey = iprot.readBool();
              struct.setInfiniteStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INFINITE_STOP_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.infiniteStopKey = iprot.readBool();
              struct.setInfiniteStopKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.start != null) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        struct.start.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.stop != null) {
        oprot.writeFieldBegin(STOP_FIELD_DESC);
        struct.stop.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_KEY_INCLUSIVE_FIELD_DESC);
      oprot.writeBool(struct.startKeyInclusive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STOP_KEY_INCLUSIVE_FIELD_DESC);
      oprot.writeBool(struct.stopKeyInclusive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INFINITE_START_KEY_FIELD_DESC);
      oprot.writeBool(struct.infiniteStartKey);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INFINITE_STOP_KEY_FIELD_DESC);
      oprot.writeBool(struct.infiniteStopKey);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangeTupleScheme getScheme() {
      return new TRangeTupleScheme();
    }
  }

  private static class TRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStart()) {
        optionals.set(0);
      }
      if (struct.isSetStop()) {
        optionals.set(1);
      }
      if (struct.isSetStartKeyInclusive()) {
        optionals.set(2);
      }
      if (struct.isSetStopKeyInclusive()) {
        optionals.set(3);
      }
      if (struct.isSetInfiniteStartKey()) {
        optionals.set(4);
      }
      if (struct.isSetInfiniteStopKey()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStart()) {
        struct.start.write(oprot);
      }
      if (struct.isSetStop()) {
        struct.stop.write(oprot);
      }
      if (struct.isSetStartKeyInclusive()) {
        oprot.writeBool(struct.startKeyInclusive);
      }
      if (struct.isSetStopKeyInclusive()) {
        oprot.writeBool(struct.stopKeyInclusive);
      }
      if (struct.isSetInfiniteStartKey()) {
        oprot.writeBool(struct.infiniteStartKey);
      }
      if (struct.isSetInfiniteStopKey()) {
        oprot.writeBool(struct.infiniteStopKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.start = new TKey();
        struct.start.read(iprot);
        struct.setStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stop = new TKey();
        struct.stop.read(iprot);
        struct.setStopIsSet(true);
      }
      if (incoming.get(2)) {
        struct.startKeyInclusive = iprot.readBool();
        struct.setStartKeyInclusiveIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stopKeyInclusive = iprot.readBool();
        struct.setStopKeyInclusiveIsSet(true);
      }
      if (incoming.get(4)) {
        struct.infiniteStartKey = iprot.readBool();
        struct.setInfiniteStartKeyIsSet(true);
      }
      if (incoming.get(5)) {
        struct.infiniteStopKey = iprot.readBool();
        struct.setInfiniteStopKeyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

