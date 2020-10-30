/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.XxxoldScannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records.UsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = -548783451;

    /**
     * The reference instance of <code>xxxold_scannerwebserviceproductive.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.userid</code>.
     */
    public final TableField<UsersRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.surname</code>.
     */
    public final TableField<UsersRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.forename</code>.
     */
    public final TableField<UsersRecord, String> FORENAME = createField("forename", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.users.active</code>.
     */
    public final TableField<UsersRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>xxxold_scannerwebserviceproductive.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return XxxoldScannerwebserviceproductive.XXXOLD_SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.USERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }
}
