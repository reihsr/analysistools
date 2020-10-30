/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.PatientRepositorySaat;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsSentenceRecord;

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
public class FindingsSentence extends TableImpl<FindingsSentenceRecord> {

    private static final long serialVersionUID = -25779672;

    /**
     * The reference instance of <code>patient_repository_saat.findings_sentence</code>
     */
    public static final FindingsSentence FINDINGS_SENTENCE = new FindingsSentence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FindingsSentenceRecord> getRecordType() {
        return FindingsSentenceRecord.class;
    }

    /**
     * The column <code>patient_repository_saat.findings_sentence.findings_sentence_id</code>.
     */
    public final TableField<FindingsSentenceRecord, Integer> FINDINGS_SENTENCE_ID = createField("findings_sentence_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('patient_repository_saat.findings_sentence_findings_sentence_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>patient_repository_saat.findings_sentence.finding_id</code>.
     */
    public final TableField<FindingsSentenceRecord, Integer> FINDING_ID = createField("finding_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>patient_repository_saat.findings_sentence.text</code>.
     */
    public final TableField<FindingsSentenceRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>patient_repository_saat.findings_sentence.finding_position_index</code>.
     */
    public final TableField<FindingsSentenceRecord, Integer> FINDING_POSITION_INDEX = createField("finding_position_index", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>patient_repository_saat.findings_sentence</code> table reference
     */
    public FindingsSentence() {
        this(DSL.name("findings_sentence"), null);
    }

    /**
     * Create an aliased <code>patient_repository_saat.findings_sentence</code> table reference
     */
    public FindingsSentence(String alias) {
        this(DSL.name(alias), FINDINGS_SENTENCE);
    }

    /**
     * Create an aliased <code>patient_repository_saat.findings_sentence</code> table reference
     */
    public FindingsSentence(Name alias) {
        this(alias, FINDINGS_SENTENCE);
    }

    private FindingsSentence(Name alias, Table<FindingsSentenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private FindingsSentence(Name alias, Table<FindingsSentenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FindingsSentence(Table<O> child, ForeignKey<O, FindingsSentenceRecord> key) {
        super(child, key, FINDINGS_SENTENCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PatientRepositorySaat.PATIENT_REPOSITORY_SAAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FINDINGS_SENTENCE_ID_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FindingsSentenceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FINDINGS_SENTENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FindingsSentenceRecord> getPrimaryKey() {
        return Keys.FINDINGS_SENTENCE_ID_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FindingsSentenceRecord>> getKeys() {
        return Arrays.<UniqueKey<FindingsSentenceRecord>>asList(Keys.FINDINGS_SENTENCE_ID_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsSentence as(String alias) {
        return new FindingsSentence(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsSentence as(Name alias) {
        return new FindingsSentence(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsSentence rename(String name) {
        return new FindingsSentence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsSentence rename(Name name) {
        return new FindingsSentence(name, null);
    }
}