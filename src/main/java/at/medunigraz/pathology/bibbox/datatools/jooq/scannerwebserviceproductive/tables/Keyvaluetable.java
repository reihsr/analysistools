/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.KeyvaluetableRecord;

import java.sql.Timestamp;
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
public class Keyvaluetable extends TableImpl<KeyvaluetableRecord> {

    private static final long serialVersionUID = 1687948643;

    /**
     * The reference instance of <code>scannerwebserviceproductive.keyvaluetable</code>
     */
    public static final Keyvaluetable KEYVALUETABLE = new Keyvaluetable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyvaluetableRecord> getRecordType() {
        return KeyvaluetableRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.keyvalueid</code>.
     */
    public final TableField<KeyvaluetableRecord, String> KEYVALUEID = createField("keyvalueid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.sourcetype</code>.
     */
    public final TableField<KeyvaluetableRecord, String> SOURCETYPE = createField("sourcetype", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.sourceid</code>.
     */
    public final TableField<KeyvaluetableRecord, String> SOURCEID = createField("sourceid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.keyname</code>.
     */
    public final TableField<KeyvaluetableRecord, String> KEYNAME = createField("keyname", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.storedvalue</code>.
     */
    public final TableField<KeyvaluetableRecord, String> STOREDVALUE = createField("storedvalue", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.timestamp</code>.
     */
    public final TableField<KeyvaluetableRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>scannerwebserviceproductive.keyvaluetable.note</code>.
     */
    public final TableField<KeyvaluetableRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>scannerwebserviceproductive.keyvaluetable</code> table reference
     */
    public Keyvaluetable() {
        this(DSL.name("keyvaluetable"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.keyvaluetable</code> table reference
     */
    public Keyvaluetable(String alias) {
        this(DSL.name(alias), KEYVALUETABLE);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.keyvaluetable</code> table reference
     */
    public Keyvaluetable(Name alias) {
        this(alias, KEYVALUETABLE);
    }

    private Keyvaluetable(Name alias, Table<KeyvaluetableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Keyvaluetable(Name alias, Table<KeyvaluetableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Keyvaluetable(Table<O> child, ForeignKey<O, KeyvaluetableRecord> key) {
        super(child, key, KEYVALUETABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Scannerwebserviceproductive.SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.KEYVALUETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<KeyvaluetableRecord> getPrimaryKey() {
        return Keys.KEYVALUETABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KeyvaluetableRecord>> getKeys() {
        return Arrays.<UniqueKey<KeyvaluetableRecord>>asList(Keys.KEYVALUETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Keyvaluetable as(String alias) {
        return new Keyvaluetable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Keyvaluetable as(Name alias) {
        return new Keyvaluetable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Keyvaluetable rename(String name) {
        return new Keyvaluetable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Keyvaluetable rename(Name name) {
        return new Keyvaluetable(name, null);
    }
}
