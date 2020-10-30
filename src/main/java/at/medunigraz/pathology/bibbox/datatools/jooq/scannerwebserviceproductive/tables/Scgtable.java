/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ScgtableRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Scgtable extends TableImpl<ScgtableRecord> {

    private static final long serialVersionUID = 331505741;

    /**
     * The reference instance of <code>scannerwebserviceproductive.scgtable</code>
     */
    public static final Scgtable SCGTABLE = new Scgtable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScgtableRecord> getRecordType() {
        return ScgtableRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.scgtable.scgid</code>.
     */
    public final TableField<ScgtableRecord, String> SCGID = createField("scgid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.scgtable.code</code>.
     */
    public final TableField<ScgtableRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.scgtable.description</code>.
     */
    public final TableField<ScgtableRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>scannerwebserviceproductive.scgtable</code> table reference
     */
    public Scgtable() {
        this(DSL.name("scgtable"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.scgtable</code> table reference
     */
    public Scgtable(String alias) {
        this(DSL.name(alias), SCGTABLE);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.scgtable</code> table reference
     */
    public Scgtable(Name alias) {
        this(alias, SCGTABLE);
    }

    private Scgtable(Name alias, Table<ScgtableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scgtable(Name alias, Table<ScgtableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scgtable(Table<O> child, ForeignKey<O, ScgtableRecord> key) {
        super(child, key, SCGTABLE);
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
    public Scgtable as(String alias) {
        return new Scgtable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scgtable as(Name alias) {
        return new Scgtable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scgtable rename(String name) {
        return new Scgtable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scgtable rename(Name name) {
        return new Scgtable(name, null);
    }
}
