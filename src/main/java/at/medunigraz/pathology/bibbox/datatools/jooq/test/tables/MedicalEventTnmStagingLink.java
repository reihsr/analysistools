/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.Test;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.records.MedicalEventTnmStagingLinkRecord;

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
public class MedicalEventTnmStagingLink extends TableImpl<MedicalEventTnmStagingLinkRecord> {

    private static final long serialVersionUID = -1029652088;

    /**
     * The reference instance of <code>test.medical_event_tnm_staging_link</code>
     */
    public static final MedicalEventTnmStagingLink MEDICAL_EVENT_TNM_STAGING_LINK = new MedicalEventTnmStagingLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MedicalEventTnmStagingLinkRecord> getRecordType() {
        return MedicalEventTnmStagingLinkRecord.class;
    }

    /**
     * The column <code>test.medical_event_tnm_staging_link.medical_event_tnm_staging_link_id</code>.
     */
    public final TableField<MedicalEventTnmStagingLinkRecord, Integer> MEDICAL_EVENT_TNM_STAGING_LINK_ID = createField("medical_event_tnm_staging_link_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test.medical_event_tnm_staging_lin_medical_event_tnm_staging_lin_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.medical_event_tnm_staging_link.medical_event_id</code>.
     */
    public final TableField<MedicalEventTnmStagingLinkRecord, Integer> MEDICAL_EVENT_ID = createField("medical_event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.medical_event_tnm_staging_link.tnm_staging_id</code>.
     */
    public final TableField<MedicalEventTnmStagingLinkRecord, Integer> TNM_STAGING_ID = createField("tnm_staging_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>test.medical_event_tnm_staging_link</code> table reference
     */
    public MedicalEventTnmStagingLink() {
        this(DSL.name("medical_event_tnm_staging_link"), null);
    }

    /**
     * Create an aliased <code>test.medical_event_tnm_staging_link</code> table reference
     */
    public MedicalEventTnmStagingLink(String alias) {
        this(DSL.name(alias), MEDICAL_EVENT_TNM_STAGING_LINK);
    }

    /**
     * Create an aliased <code>test.medical_event_tnm_staging_link</code> table reference
     */
    public MedicalEventTnmStagingLink(Name alias) {
        this(alias, MEDICAL_EVENT_TNM_STAGING_LINK);
    }

    private MedicalEventTnmStagingLink(Name alias, Table<MedicalEventTnmStagingLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private MedicalEventTnmStagingLink(Name alias, Table<MedicalEventTnmStagingLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MedicalEventTnmStagingLink(Table<O> child, ForeignKey<O, MedicalEventTnmStagingLinkRecord> key) {
        super(child, key, MEDICAL_EVENT_TNM_STAGING_LINK);
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
        return Arrays.<Index>asList(Indexes.MEDICAL_EVENT_TNM_STAGING_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MedicalEventTnmStagingLinkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEDICAL_EVENT_TNM_STAGING_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MedicalEventTnmStagingLinkRecord> getPrimaryKey() {
        return Keys.MEDICAL_EVENT_TNM_STAGING_LINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MedicalEventTnmStagingLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<MedicalEventTnmStagingLinkRecord>>asList(Keys.MEDICAL_EVENT_TNM_STAGING_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalEventTnmStagingLink as(String alias) {
        return new MedicalEventTnmStagingLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedicalEventTnmStagingLink as(Name alias) {
        return new MedicalEventTnmStagingLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalEventTnmStagingLink rename(String name) {
        return new MedicalEventTnmStagingLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MedicalEventTnmStagingLink rename(Name name) {
        return new MedicalEventTnmStagingLink(name, null);
    }
}
