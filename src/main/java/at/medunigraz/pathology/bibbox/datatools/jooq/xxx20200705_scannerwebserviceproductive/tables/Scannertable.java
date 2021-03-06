/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Xxx20200705Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records.ScannertableRecord;

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
public class Scannertable extends TableImpl<ScannertableRecord> {

    private static final long serialVersionUID = -1933411696;

    /**
     * The reference instance of <code>xxx20200705_scannerwebserviceproductive.scannertable</code>
     */
    public static final Scannertable SCANNERTABLE = new Scannertable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScannertableRecord> getRecordType() {
        return ScannertableRecord.class;
    }

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.scannerid</code>.
     */
    public final TableField<ScannertableRecord, String> SCANNERID = createField("scannerid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.scannertype</code>.
     */
    public final TableField<ScannertableRecord, String> SCANNERTYPE = createField("scannertype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.scannermanufacturer</code>.
     */
    public final TableField<ScannertableRecord, String> SCANNERMANUFACTURER = createField("scannermanufacturer", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.scannerrackslots</code>.
     */
    public final TableField<ScannertableRecord, String> SCANNERRACKSLOTS = createField("scannerrackslots", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.shouldbeonline</code>.
     */
    public final TableField<ScannertableRecord, Boolean> SHOULDBEONLINE = createField("shouldbeonline", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.timeout</code>.
     */
    public final TableField<ScannertableRecord, Integer> TIMEOUT = createField("timeout", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.scannertable.lasttimeonline</code>.
     */
    public final TableField<ScannertableRecord, Timestamp> LASTTIMEONLINE = createField("lasttimeonline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>xxx20200705_scannerwebserviceproductive.scannertable</code> table reference
     */
    public Scannertable() {
        this(DSL.name("scannertable"), null);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.scannertable</code> table reference
     */
    public Scannertable(String alias) {
        this(DSL.name(alias), SCANNERTABLE);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.scannertable</code> table reference
     */
    public Scannertable(Name alias) {
        this(alias, SCANNERTABLE);
    }

    private Scannertable(Name alias, Table<ScannertableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scannertable(Name alias, Table<ScannertableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scannertable(Table<O> child, ForeignKey<O, ScannertableRecord> key) {
        super(child, key, SCANNERTABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Xxx20200705Scannerwebserviceproductive.XXX20200705_SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCANNERTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScannertableRecord> getPrimaryKey() {
        return Keys.SCANNERTABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScannertableRecord>> getKeys() {
        return Arrays.<UniqueKey<ScannertableRecord>>asList(Keys.SCANNERTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scannertable as(String alias) {
        return new Scannertable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scannertable as(Name alias) {
        return new Scannertable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scannertable rename(String name) {
        return new Scannertable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scannertable rename(Name name) {
        return new Scannertable(name, null);
    }
}
