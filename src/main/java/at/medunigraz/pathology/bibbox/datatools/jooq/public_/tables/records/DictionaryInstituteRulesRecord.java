/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.DictionaryInstituteRules;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class DictionaryInstituteRulesRecord extends UpdatableRecordImpl<DictionaryInstituteRulesRecord> implements Record5<Integer, Integer, String, Integer, Date> {

    private static final long serialVersionUID = 271102858;

    /**
     * Setter for <code>public.dictionary_institute_rules.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dictionary_institute_rules.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.dictionary_institute_rules.dictionary2_dictionary2_addiction_link_id</code>.
     */
    public void setDictionary2Dictionary2AddictionLinkId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dictionary_institute_rules.dictionary2_dictionary2_addiction_link_id</code>.
     */
    public Integer getDictionary2Dictionary2AddictionLinkId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.dictionary_institute_rules.institute</code>.
     */
    public void setInstitute(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dictionary_institute_rules.institute</code>.
     */
    public String getInstitute() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.dictionary_institute_rules.institute_id</code>.
     */
    public void setInstituteId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dictionary_institute_rules.institute_id</code>.
     */
    public Integer getInstituteId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.dictionary_institute_rules.date</code>.
     */
    public void setDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.dictionary_institute_rules.date</code>.
     */
    public Date getDate() {
        return (Date) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, Date> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.INSTITUTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.INSTITUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.DATE;
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
        return getDictionary2Dictionary2AddictionLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInstitute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getInstituteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getDate();
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
        return getDictionary2Dictionary2AddictionLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInstitute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getInstituteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord value2(Integer value) {
        setDictionary2Dictionary2AddictionLinkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord value3(String value) {
        setInstitute(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord value4(Integer value) {
        setInstituteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord value5(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRulesRecord values(Integer value1, Integer value2, String value3, Integer value4, Date value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictionaryInstituteRulesRecord
     */
    public DictionaryInstituteRulesRecord() {
        super(DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES);
    }

    /**
     * Create a detached, initialised DictionaryInstituteRulesRecord
     */
    public DictionaryInstituteRulesRecord(Integer id, Integer dictionary2Dictionary2AddictionLinkId, String institute, Integer instituteId, Date date) {
        super(DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES);

        set(0, id);
        set(1, dictionary2Dictionary2AddictionLinkId);
        set(2, institute);
        set(3, instituteId);
        set(4, date);
    }
}
