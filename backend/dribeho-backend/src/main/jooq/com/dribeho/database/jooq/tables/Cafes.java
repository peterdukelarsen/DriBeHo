/*
 * This file is generated by jOOQ.
 */
package com.dribeho.database.jooq.tables;


import com.dribeho.database.jooq.Dribehodb;
import com.dribeho.database.jooq.Keys;
import com.dribeho.database.jooq.tables.records.CafesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cafes extends TableImpl<CafesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dribehodb.cafes</code>
     */
    public static final Cafes CAFES = new Cafes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CafesRecord> getRecordType() {
        return CafesRecord.class;
    }

    /**
     * The column <code>dribehodb.cafes.id</code>.
     */
    public final TableField<CafesRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>dribehodb.cafes.name</code>.
     */
    public final TableField<CafesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>dribehodb.cafes.address</code>.
     */
    public final TableField<CafesRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>dribehodb.cafes.city</code>.
     */
    public final TableField<CafesRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>dribehodb.cafes.state</code>.
     */
    public final TableField<CafesRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>dribehodb.cafes.zipcode</code>.
     */
    public final TableField<CafesRecord, String> ZIPCODE = createField(DSL.name("zipcode"), SQLDataType.VARCHAR(5).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    private Cafes(Name alias, Table<CafesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cafes(Name alias, Table<CafesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dribehodb.cafes</code> table reference
     */
    public Cafes(String alias) {
        this(DSL.name(alias), CAFES);
    }

    /**
     * Create an aliased <code>dribehodb.cafes</code> table reference
     */
    public Cafes(Name alias) {
        this(alias, CAFES);
    }

    /**
     * Create a <code>dribehodb.cafes</code> table reference
     */
    public Cafes() {
        this(DSL.name("cafes"), null);
    }

    public <O extends Record> Cafes(Table<O> child, ForeignKey<O, CafesRecord> key) {
        super(child, key, CAFES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Dribehodb.DRIBEHODB;
    }

    @Override
    public UniqueKey<CafesRecord> getPrimaryKey() {
        return Keys.KEY_CAFES_PRIMARY;
    }

    @Override
    public Cafes as(String alias) {
        return new Cafes(DSL.name(alias), this);
    }

    @Override
    public Cafes as(Name alias) {
        return new Cafes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cafes rename(String name) {
        return new Cafes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cafes rename(Name name) {
        return new Cafes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
