/*
 * This file is generated by jOOQ.
 */
package com.dribeho.database.jooq.tables.records;


import com.dribeho.database.jooq.tables.Users;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record7<String, String, String, String, String, LocalDate, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dribehodb.users.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dribehodb.users.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dribehodb.users.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dribehodb.users.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dribehodb.users.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dribehodb.users.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dribehodb.users.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dribehodb.users.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dribehodb.users.profile_picture</code>.
     */
    public void setProfilePicture(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>dribehodb.users.profile_picture</code>.
     */
    public String getProfilePicture() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dribehodb.users.date_joined</code>.
     */
    public void setDateJoined(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for <code>dribehodb.users.date_joined</code>.
     */
    public LocalDate getDateJoined() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>dribehodb.users.last_login</code>.
     */
    public void setLastLogin(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>dribehodb.users.last_login</code>.
     */
    public LocalDate getLastLogin() {
        return (LocalDate) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, LocalDate, LocalDate> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, LocalDate, LocalDate> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return Users.USERS.PROFILE_PICTURE;
    }

    @Override
    public Field<LocalDate> field6() {
        return Users.USERS.DATE_JOINED;
    }

    @Override
    public Field<LocalDate> field7() {
        return Users.USERS.LAST_LOGIN;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getProfilePicture();
    }

    @Override
    public LocalDate component6() {
        return getDateJoined();
    }

    @Override
    public LocalDate component7() {
        return getLastLogin();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getProfilePicture();
    }

    @Override
    public LocalDate value6() {
        return getDateJoined();
    }

    @Override
    public LocalDate value7() {
        return getLastLogin();
    }

    @Override
    public UsersRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UsersRecord value5(String value) {
        setProfilePicture(value);
        return this;
    }

    @Override
    public UsersRecord value6(LocalDate value) {
        setDateJoined(value);
        return this;
    }

    @Override
    public UsersRecord value7(LocalDate value) {
        setLastLogin(value);
        return this;
    }

    @Override
    public UsersRecord values(String value1, String value2, String value3, String value4, String value5, LocalDate value6, LocalDate value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(String id, String username, String email, String password, String profilePicture, LocalDate dateJoined, LocalDate lastLogin) {
        super(Users.USERS);

        setId(id);
        setUsername(username);
        setEmail(email);
        setPassword(password);
        setProfilePicture(profilePicture);
        setDateJoined(dateJoined);
        setLastLogin(lastLogin);
    }
}
