/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.JsonuploadtableRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Jsonuploadtable extends TableImpl<JsonuploadtableRecord> {

    private static final long serialVersionUID = -1591975418;

    /**
     * The reference instance of <code>scannerwebserviceproductive.jsonuploadtable</code>
     */
    public static final Jsonuploadtable JSONUPLOADTABLE = new Jsonuploadtable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonuploadtableRecord> getRecordType() {
        return JsonuploadtableRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.jsonuploadtable.uploadid</code>.
     */
    public final TableField<JsonuploadtableRecord, Integer> UPLOADID = createField("uploadid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('scannerwebserviceproductive.googlejsonuploadid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>scannerwebserviceproductive.jsonuploadtable.scanid_fk</code>.
     */
    public final TableField<JsonuploadtableRecord, String> SCANID_FK = createField("scanid_fk", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.jsonuploadtable.uploaddate</code>.
     */
    public final TableField<JsonuploadtableRecord, String> UPLOADDATE = createField("uploaddate", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.jsonuploadtable.uploadcontent</code>.
     */
    public final TableField<JsonuploadtableRecord, String> UPLOADCONTENT = createField("uploadcontent", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.jsonuploadtable.projectid_fk</code>.
     */
    public final TableField<JsonuploadtableRecord, Integer> PROJECTID_FK = createField("projectid_fk", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>scannerwebserviceproductive.jsonuploadtable</code> table reference
     */
    public Jsonuploadtable() {
        this(DSL.name("jsonuploadtable"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.jsonuploadtable</code> table reference
     */
    public Jsonuploadtable(String alias) {
        this(DSL.name(alias), JSONUPLOADTABLE);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.jsonuploadtable</code> table reference
     */
    public Jsonuploadtable(Name alias) {
        this(alias, JSONUPLOADTABLE);
    }

    private Jsonuploadtable(Name alias, Table<JsonuploadtableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Jsonuploadtable(Name alias, Table<JsonuploadtableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Jsonuploadtable(Table<O> child, ForeignKey<O, JsonuploadtableRecord> key) {
        super(child, key, JSONUPLOADTABLE);
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
    public Identity<JsonuploadtableRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JSONUPLOADTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Jsonuploadtable as(String alias) {
        return new Jsonuploadtable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Jsonuploadtable as(Name alias) {
        return new Jsonuploadtable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Jsonuploadtable rename(String name) {
        return new Jsonuploadtable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Jsonuploadtable rename(Name name) {
        return new Jsonuploadtable(name, null);
    }
}
