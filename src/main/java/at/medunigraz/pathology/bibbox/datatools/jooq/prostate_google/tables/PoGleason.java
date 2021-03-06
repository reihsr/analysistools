/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.ProstateGoogle;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.records.PoGleasonRecord;

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
public class PoGleason extends TableImpl<PoGleasonRecord> {

    private static final long serialVersionUID = -1508365127;

    /**
     * The reference instance of <code>prostate_google.po_gleason</code>
     */
    public static final PoGleason PO_GLEASON = new PoGleason();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PoGleasonRecord> getRecordType() {
        return PoGleasonRecord.class;
    }

    /**
     * The column <code>prostate_google.po_gleason.id</code>.
     */
    public final TableField<PoGleasonRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('prostate_google.po_gleason_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>prostate_google.po_gleason.vpatientid</code>.
     */
    public final TableField<PoGleasonRecord, Long> VPATIENTID = createField("vpatientid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>prostate_google.po_gleason.vhistoid</code>.
     */
    public final TableField<PoGleasonRecord, Long> VHISTOID = createField("vhistoid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>prostate_google.po_gleason.extraction_type</code>.
     */
    public final TableField<PoGleasonRecord, String> EXTRACTION_TYPE = createField("extraction_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.gleason_score_extracted</code>.
     */
    public final TableField<PoGleasonRecord, String> GLEASON_SCORE_EXTRACTED = createField("gleason_score_extracted", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.gleason_score_corrected</code>.
     */
    public final TableField<PoGleasonRecord, String> GLEASON_SCORE_CORRECTED = createField("gleason_score_corrected", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.remarks</code>.
     */
    public final TableField<PoGleasonRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.grade</code>.
     */
    public final TableField<PoGleasonRecord, String> GRADE = createField("grade", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.score</code>.
     */
    public final TableField<PoGleasonRecord, String> SCORE = createField("score", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.po_gleason.suspicious</code>.
     */
    public final TableField<PoGleasonRecord, String> SUSPICIOUS = createField("suspicious", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>prostate_google.po_gleason</code> table reference
     */
    public PoGleason() {
        this(DSL.name("po_gleason"), null);
    }

    /**
     * Create an aliased <code>prostate_google.po_gleason</code> table reference
     */
    public PoGleason(String alias) {
        this(DSL.name(alias), PO_GLEASON);
    }

    /**
     * Create an aliased <code>prostate_google.po_gleason</code> table reference
     */
    public PoGleason(Name alias) {
        this(alias, PO_GLEASON);
    }

    private PoGleason(Name alias, Table<PoGleasonRecord> aliased) {
        this(alias, aliased, null);
    }

    private PoGleason(Name alias, Table<PoGleasonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PoGleason(Table<O> child, ForeignKey<O, PoGleasonRecord> key) {
        super(child, key, PO_GLEASON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ProstateGoogle.PROSTATE_GOOGLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PO_GLEASON_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PoGleasonRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PO_GLEASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PoGleasonRecord> getPrimaryKey() {
        return Keys.PO_GLEASON_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PoGleasonRecord>> getKeys() {
        return Arrays.<UniqueKey<PoGleasonRecord>>asList(Keys.PO_GLEASON_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleason as(String alias) {
        return new PoGleason(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleason as(Name alias) {
        return new PoGleason(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PoGleason rename(String name) {
        return new PoGleason(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PoGleason rename(Name name) {
        return new PoGleason(name, null);
    }
}
