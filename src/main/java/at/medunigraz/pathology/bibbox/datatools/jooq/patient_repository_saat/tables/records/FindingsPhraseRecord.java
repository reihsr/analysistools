/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsPhrase;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FindingsPhraseRecord extends UpdatableRecordImpl<FindingsPhraseRecord> implements Record4<Integer, Integer, String, Integer> {

    private static final long serialVersionUID = -2092498985;

    /**
     * Setter for <code>patient_repository_saat.findings_phrase.findings_phrase_id</code>.
     */
    public void setFindingsPhraseId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_phrase.findings_phrase_id</code>.
     */
    public Integer getFindingsPhraseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>patient_repository_saat.findings_phrase.finding_id</code>.
     */
    public void setFindingId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_phrase.finding_id</code>.
     */
    public Integer getFindingId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>patient_repository_saat.findings_phrase.text</code>.
     */
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_phrase.text</code>.
     */
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>patient_repository_saat.findings_phrase.finding_position_index</code>.
     */
    public void setFindingPositionIndex(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_phrase.finding_position_index</code>.
     */
    public Integer getFindingPositionIndex() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FindingsPhrase.FINDINGS_PHRASE.FINDINGS_PHRASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FindingsPhrase.FINDINGS_PHRASE.FINDING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FindingsPhrase.FINDINGS_PHRASE.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FindingsPhrase.FINDINGS_PHRASE.FINDING_POSITION_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFindingsPhraseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFindingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFindingPositionIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFindingsPhraseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFindingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFindingPositionIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhraseRecord value1(Integer value) {
        setFindingsPhraseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhraseRecord value2(Integer value) {
        setFindingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhraseRecord value3(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhraseRecord value4(Integer value) {
        setFindingPositionIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsPhraseRecord values(Integer value1, Integer value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FindingsPhraseRecord
     */
    public FindingsPhraseRecord() {
        super(FindingsPhrase.FINDINGS_PHRASE);
    }

    /**
     * Create a detached, initialised FindingsPhraseRecord
     */
    public FindingsPhraseRecord(Integer findingsPhraseId, Integer findingId, String text, Integer findingPositionIndex) {
        super(FindingsPhrase.FINDINGS_PHRASE);

        set(0, findingsPhraseId);
        set(1, findingId);
        set(2, text);
        set(3, findingPositionIndex);
    }
}