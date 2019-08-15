/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2Dictionary2AddictionLink;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class Dictionary2Dictionary2AddictionLinkRecord extends UpdatableRecordImpl<Dictionary2Dictionary2AddictionLinkRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1100461319;

    /**
     * Setter for <code>public.dictionary2_dictionary2_addiction_link.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dictionary2_dictionary2_addiction_link.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.dictionary2_dictionary2_addiction_link.dictionary_id</code>.
     */
    public void setDictionaryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dictionary2_dictionary2_addiction_link.dictionary_id</code>.
     */
    public Integer getDictionaryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.dictionary2_dictionary2_addiction_link.addiction_id</code>.
     */
    public void setAddictionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dictionary2_dictionary2_addiction_link.addiction_id</code>.
     */
    public Integer getAddictionId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.DICTIONARY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ADDICTION_ID;
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
        return getAddictionId();
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
        return getAddictionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLinkRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLinkRecord value2(Integer value) {
        setDictionaryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLinkRecord value3(Integer value) {
        setAddictionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLinkRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Dictionary2Dictionary2AddictionLinkRecord
     */
    public Dictionary2Dictionary2AddictionLinkRecord() {
        super(Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK);
    }

    /**
     * Create a detached, initialised Dictionary2Dictionary2AddictionLinkRecord
     */
    public Dictionary2Dictionary2AddictionLinkRecord(Integer id, Integer dictionaryId, Integer addictionId) {
        super(Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK);

        set(0, id);
        set(1, dictionaryId);
        set(2, addictionId);
    }
}
