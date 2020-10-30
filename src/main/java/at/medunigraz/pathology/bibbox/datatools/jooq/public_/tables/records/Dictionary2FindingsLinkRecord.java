/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2FindingsLink;

import java.sql.Timestamp;

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
public class Dictionary2FindingsLinkRecord extends UpdatableRecordImpl<Dictionary2FindingsLinkRecord> implements Record4<Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -1984157360;

    /**
     * Setter for <code>public.dictionary2_findings_link.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dictionary2_findings_link.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.dictionary2_findings_link.dictionary_id</code>.
     */
    public void setDictionaryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dictionary2_findings_link.dictionary_id</code>.
     */
    public Integer getDictionaryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.dictionary2_findings_link.finding_id</code>.
     */
    public void setFindingId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dictionary2_findings_link.finding_id</code>.
     */
    public Integer getFindingId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.dictionary2_findings_link.lastchanged</code>.
     */
    public void setLastchanged(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dictionary2_findings_link.lastchanged</code>.
     */
    public Timestamp getLastchanged() {
        return (Timestamp) get(3);
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
    public Row4<Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.DICTIONARY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.FINDING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.LASTCHANGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDictionaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFindingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastchanged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDictionaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFindingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastchanged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2FindingsLinkRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2FindingsLinkRecord value2(Integer value) {
        setDictionaryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2FindingsLinkRecord value3(Integer value) {
        setFindingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2FindingsLinkRecord value4(Timestamp value) {
        setLastchanged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2FindingsLinkRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4) {
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
     * Create a detached Dictionary2FindingsLinkRecord
     */
    public Dictionary2FindingsLinkRecord() {
        super(Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK);
    }

    /**
     * Create a detached, initialised Dictionary2FindingsLinkRecord
     */
    public Dictionary2FindingsLinkRecord(Integer id, Integer dictionaryId, Integer findingId, Timestamp lastchanged) {
        super(Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK);

        set(0, id);
        set(1, dictionaryId);
        set(2, findingId);
        set(3, lastchanged);
    }
}
