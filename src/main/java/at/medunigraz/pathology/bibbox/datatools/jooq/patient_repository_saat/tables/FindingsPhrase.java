/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.PatientRepositorySaat;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsPhraseRecord;

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
public class FindingsPhrase extends TableImpl<FindingsPhraseRecord> {

    private static final long serialVersionUID = -955851801;

    /**
     * The reference instance of <code>patient_repository_saat.findings_phrase</code>
     */
    public static final FindingsPhrase FINDINGS_PHRASE = new FindingsPhrase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FindingsPhraseRecord> getRecordType() {
        return FindingsPhraseRecord.class;
    }

    /**
     * The column <code>patient_repository_saat.findings_phrase.findings_phrase_id</code>.
     */
    public final TableField<FindingsPhraseRecord, Integer> FINDINGS_PHRASE_ID = createField("findings_phrase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('patient_repository_saat.findings_phrase_findings_phrase_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>patient_repository_saat.findings_phrase.finding_id</code>.
     */
    public final TableField<FindingsPhraseRecord, Integer> FINDING_ID = createField("finding_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat.findings_phrase.text</code>.
     */
    public final TableField<FindingsPhraseRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>patient_repository_saat.findings_phrase.finding_position_index</code>.
     */
    public final TableField<FindingsPhraseRecord, Integer> FINDING_POSITION_INDEX = createField("finding_position_index", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>patient_repository_saat.findings_phrase</code> table reference
     */
    public FindingsPhrase() {
        this(DSL.name("findings_phrase"), null);
    }

    /**
     * Create an aliased <code>patient_repository_saat.findings_phrase</code> table reference
     */
    public FindingsPhrase(String alias) {
        this(DSL.name(alias), FINDINGS_PHRASE);
    }

    /**
     * Create an aliased <code>patient_repository_saat.findings_phrase</code> table reference
     */
    public FindingsPhrase(Name alias) {
        this(alias, FINDINGS_PHRASE);
    }

    private FindingsPhrase(Name alias, Table<FindingsPhraseRecord> aliased) {
        this(alias, aliased, null);
    }

    private FindingsPhrase(Name alias, Table<FindingsPhraseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FindingsPhrase(Table<O> child, ForeignKey<O, FindingsPhraseRecord> key) {
        super(child, key, FINDINGS_PHRASE);
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
        return Arrays.<Index>asList(Indexes.FINDINGS_PHRASE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FindingsPhraseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FINDINGS_PHRASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FindingsPhraseRecord> getPrimaryKey() {
        return Keys.FINDINGS_PHRASE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FindingsPhraseRecord>> getKeys() {
        return Arrays.<UniqueKey<FindingsPhraseRecord>>asList(Keys.FINDINGS_PHRASE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhrase as(String alias) {
        return new FindingsPhrase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhrase as(Name alias) {
        return new FindingsPhrase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsPhrase rename(String name) {
        return new FindingsPhrase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsPhrase rename(Name name) {
        return new FindingsPhrase(name, null);
    }
}
