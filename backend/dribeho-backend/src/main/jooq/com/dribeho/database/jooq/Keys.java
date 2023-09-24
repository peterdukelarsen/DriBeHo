/*
 * This file is generated by jOOQ.
 */
package com.dribeho.database.jooq;


import com.dribeho.database.jooq.tables.Cafes;
import com.dribeho.database.jooq.tables.FlywaySchemaHistory;
import com.dribeho.database.jooq.tables.records.CafesRecord;
import com.dribeho.database.jooq.tables.records.FlywaySchemaHistoryRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * dribehodb.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CafesRecord> KEY_CAFES_PRIMARY = Internal.createUniqueKey(Cafes.CAFES, DSL.name("KEY_cafes_PRIMARY"), new TableField[] { Cafes.CAFES.ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("KEY_flyway_schema_history_PRIMARY"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
}
