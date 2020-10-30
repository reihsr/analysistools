/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Test;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.records.SampleRecord;

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
public class Sample extends TableImpl<SampleRecord> {

    private static final long serialVersionUID = -1401029129;

    /**
     * The reference instance of <code>test.sample</code>
     */
    public static final Sample SAMPLE = new Sample();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SampleRecord> getRecordType() {
        return SampleRecord.class;
    }

    /**
     * The column <code>test.sample.sample_id</code>.
     */
    public final TableField<SampleRecord, Integer> SAMPLE_ID = createField("sample_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test.sample_sample_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.sample.sample_class</code>.
     */
    public final TableField<SampleRecord, String> SAMPLE_CLASS = createField("sample_class", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.sample.sample_type</code>.
     */
    public final TableField<SampleRecord, String> SAMPLE_TYPE = createField("sample_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.sample.sample_quantity</code>.
     */
    public final TableField<SampleRecord, Integer> SAMPLE_QUANTITY = createField("sample_quantity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.sample.sample_quantity_unit</code>.
     */
    public final TableField<SampleRecord, String> SAMPLE_QUANTITY_UNIT = createField("sample_quantity_unit", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>test.sample.parent_specimen</code>.
     */
    public final TableField<SampleRecord, Integer> PARENT_SPECIMEN = createField("parent_specimen", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>test.sample</code> table reference
     */
    public Sample() {
        this(DSL.name("sample"), null);
    }

    /**
     * Create an aliased <code>test.sample</code> table reference
     */
    public Sample(String alias) {
        this(DSL.name(alias), SAMPLE);
    }

    /**
     * Create an aliased <code>test.sample</code> table reference
     */
    public Sample(Name alias) {
        this(alias, SAMPLE);
    }

    private Sample(Name alias, Table<SampleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sample(Name alias, Table<SampleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sample(Table<O> child, ForeignKey<O, SampleRecord> key) {
        super(child, key, SAMPLE);
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
        return Arrays.<Index>asList(Indexes.SAMPLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SampleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SAMPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SampleRecord> getPrimaryKey() {
        return Keys.SAMPLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SampleRecord>> getKeys() {
        return Arrays.<UniqueKey<SampleRecord>>asList(Keys.SAMPLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sample as(String alias) {
        return new Sample(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sample as(Name alias) {
        return new Sample(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sample rename(String name) {
        return new Sample(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sample rename(Name name) {
        return new Sample(name, null);
    }
}
