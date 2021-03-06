/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Test;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.records.TnmStagingRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class TnmStaging extends TableImpl<TnmStagingRecord> {

    private static final long serialVersionUID = 628945041;

    /**
     * The reference instance of <code>test.tnm_staging</code>
     */
    public static final TnmStaging TNM_STAGING = new TnmStaging();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TnmStagingRecord> getRecordType() {
        return TnmStagingRecord.class;
    }

    /**
     * The column <code>test.tnm_staging.tnm_id</code>.
     */
    public final TableField<TnmStagingRecord, Integer> TNM_ID = createField("tnm_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test.tnm_staging_tnm_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.tnm_staging.t</code>.
     */
    public final TableField<TnmStagingRecord, String> T = createField("t", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.n</code>.
     */
    public final TableField<TnmStagingRecord, String> N = createField("n", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.m</code>.
     */
    public final TableField<TnmStagingRecord, String> M = createField("m", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.g</code>.
     */
    public final TableField<TnmStagingRecord, String> G = createField("g", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.r</code>.
     */
    public final TableField<TnmStagingRecord, String> R = createField("r", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.l</code>.
     */
    public final TableField<TnmStagingRecord, String> L = createField("l", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.tnm_staging.v</code>.
     */
    public final TableField<TnmStagingRecord, String> V = createField("v", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>test.tnm_staging</code> table reference
     */
    public TnmStaging() {
        this(DSL.name("tnm_staging"), null);
    }

    /**
     * Create an aliased <code>test.tnm_staging</code> table reference
     */
    public TnmStaging(String alias) {
        this(DSL.name(alias), TNM_STAGING);
    }

    /**
     * Create an aliased <code>test.tnm_staging</code> table reference
     */
    public TnmStaging(Name alias) {
        this(alias, TNM_STAGING);
    }

    private TnmStaging(Name alias, Table<TnmStagingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TnmStaging(Name alias, Table<TnmStagingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TnmStaging(Table<O> child, ForeignKey<O, TnmStagingRecord> key) {
        super(child, key, TNM_STAGING);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TNM_STAGING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TnmStagingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TNM_STAGING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TnmStagingRecord> getPrimaryKey() {
        return Keys.TNM_STAGING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TnmStagingRecord>> getKeys() {
        return Arrays.<UniqueKey<TnmStagingRecord>>asList(Keys.TNM_STAGING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TnmStaging as(String alias) {
        return new TnmStaging(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TnmStaging as(Name alias) {
        return new TnmStaging(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TnmStaging rename(String name) {
        return new TnmStaging(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TnmStaging rename(Name name) {
        return new TnmStaging(name, null);
    }
}
