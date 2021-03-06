/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.IdmaptableRecord;

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
public class Idmaptable extends TableImpl<IdmaptableRecord> {

    private static final long serialVersionUID = -99118054;

    /**
     * The reference instance of <code>scannerwebserviceproductive.idmaptable</code>
     */
    public static final Idmaptable IDMAPTABLE = new Idmaptable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IdmaptableRecord> getRecordType() {
        return IdmaptableRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.idmaptable.internalid</code>.
     */
    public final TableField<IdmaptableRecord, String> INTERNALID = createField("internalid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.idmaptable.externalid</code>.
     */
    public final TableField<IdmaptableRecord, String> EXTERNALID = createField("externalid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.idmaptable.projectid</code>.
     */
    public final TableField<IdmaptableRecord, Short> PROJECTID = createField("projectid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>scannerwebserviceproductive.idmaptable</code> table reference
     */
    public Idmaptable() {
        this(DSL.name("idmaptable"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.idmaptable</code> table reference
     */
    public Idmaptable(String alias) {
        this(DSL.name(alias), IDMAPTABLE);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.idmaptable</code> table reference
     */
    public Idmaptable(Name alias) {
        this(alias, IDMAPTABLE);
    }

    private Idmaptable(Name alias, Table<IdmaptableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Idmaptable(Name alias, Table<IdmaptableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Idmaptable(Table<O> child, ForeignKey<O, IdmaptableRecord> key) {
        super(child, key, IDMAPTABLE);
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
        return Arrays.<Index>asList(Indexes.IDMAPTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IdmaptableRecord> getPrimaryKey() {
        return Keys.IDMAPTABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IdmaptableRecord>> getKeys() {
        return Arrays.<UniqueKey<IdmaptableRecord>>asList(Keys.IDMAPTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Idmaptable as(String alias) {
        return new Idmaptable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Idmaptable as(Name alias) {
        return new Idmaptable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Idmaptable rename(String name) {
        return new Idmaptable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Idmaptable rename(Name name) {
        return new Idmaptable(name, null);
    }
}
