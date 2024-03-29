/*
 * This file is generated by jOOQ.
 */
package com.dribeho.database.jooq.tables.records;


import com.dribeho.database.jooq.tables.Quarkus;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuarkusRecord extends TableRecordImpl<QuarkusRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dribehodb.quarkus.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dribehodb.quarkus.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dribehodb.quarkus.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dribehodb.quarkus.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Quarkus.QUARKUS.ID;
    }

    @Override
    public Field<String> field2() {
        return Quarkus.QUARKUS.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public QuarkusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuarkusRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public QuarkusRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuarkusRecord
     */
    public QuarkusRecord() {
        super(Quarkus.QUARKUS);
    }

    /**
     * Create a detached, initialised QuarkusRecord
     */
    public QuarkusRecord(Integer id, String name) {
        super(Quarkus.QUARKUS);

        setId(id);
        setName(name);
    }
}
