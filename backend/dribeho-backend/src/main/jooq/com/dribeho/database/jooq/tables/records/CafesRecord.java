/*
 * This file is generated by jOOQ.
 */
package com.dribeho.database.jooq.tables.records;


import com.dribeho.database.jooq.tables.Cafes;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CafesRecord extends UpdatableRecordImpl<CafesRecord> implements Record8<String, String, String, String, String, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dribehodb.cafes.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dribehodb.cafes.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dribehodb.cafes.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dribehodb.cafes.city</code>.
     */
    public void setCity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.city</code>.
     */
    public String getCity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dribehodb.cafes.state</code>.
     */
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.state</code>.
     */
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dribehodb.cafes.zipcode</code>.
     */
    public void setZipcode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.zipcode</code>.
     */
    public String getZipcode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dribehodb.cafes.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>dribehodb.cafes.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>dribehodb.cafes.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Cafes.CAFES.ID;
    }

    @Override
    public Field<String> field2() {
        return Cafes.CAFES.NAME;
    }

    @Override
    public Field<String> field3() {
        return Cafes.CAFES.ADDRESS;
    }

    @Override
    public Field<String> field4() {
        return Cafes.CAFES.CITY;
    }

    @Override
    public Field<String> field5() {
        return Cafes.CAFES.STATE;
    }

    @Override
    public Field<String> field6() {
        return Cafes.CAFES.ZIPCODE;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Cafes.CAFES.LONGITUDE;
    }

    @Override
    public Field<BigDecimal> field8() {
        return Cafes.CAFES.LATITUDE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public String component4() {
        return getCity();
    }

    @Override
    public String component5() {
        return getState();
    }

    @Override
    public String component6() {
        return getZipcode();
    }

    @Override
    public BigDecimal component7() {
        return getLongitude();
    }

    @Override
    public BigDecimal component8() {
        return getLatitude();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public String value4() {
        return getCity();
    }

    @Override
    public String value5() {
        return getState();
    }

    @Override
    public String value6() {
        return getZipcode();
    }

    @Override
    public BigDecimal value7() {
        return getLongitude();
    }

    @Override
    public BigDecimal value8() {
        return getLatitude();
    }

    @Override
    public CafesRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public CafesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CafesRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CafesRecord value4(String value) {
        setCity(value);
        return this;
    }

    @Override
    public CafesRecord value5(String value) {
        setState(value);
        return this;
    }

    @Override
    public CafesRecord value6(String value) {
        setZipcode(value);
        return this;
    }

    @Override
    public CafesRecord value7(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public CafesRecord value8(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public CafesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, BigDecimal value7, BigDecimal value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CafesRecord
     */
    public CafesRecord() {
        super(Cafes.CAFES);
    }

    /**
     * Create a detached, initialised CafesRecord
     */
    public CafesRecord(String id, String name, String address, String city, String state, String zipcode, BigDecimal longitude, BigDecimal latitude) {
        super(Cafes.CAFES);

        setId(id);
        setName(name);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipcode(zipcode);
        setLongitude(longitude);
        setLatitude(latitude);
    }
}
