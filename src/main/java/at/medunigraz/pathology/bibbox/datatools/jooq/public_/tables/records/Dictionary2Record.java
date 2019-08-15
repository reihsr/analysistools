/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class Dictionary2Record extends UpdatableRecordImpl<Dictionary2Record> implements Record20<Integer, String, Short, Short, Boolean, Boolean, Boolean, Boolean, Integer, String, String, String, Boolean, Boolean, Boolean, String, Boolean, Integer, Integer, Boolean> {

    private static final long serialVersionUID = -94377233;

    /**
     * Setter for <code>public.dictionary2.dictionary_id</code>.
     */
    public void setDictionaryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dictionary2.dictionary_id</code>.
     */
    public Integer getDictionaryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.dictionary2.synonym</code>.
     */
    public void setSynonym(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dictionary2.synonym</code>.
     */
    public String getSynonym() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.dictionary2.before_synonym</code>.
     */
    public void setBeforeSynonym(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dictionary2.before_synonym</code>.
     */
    public Short getBeforeSynonym() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.dictionary2.after_synonym</code>.
     */
    public void setAfterSynonym(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dictionary2.after_synonym</code>.
     */
    public Short getAfterSynonym() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.dictionary2.foreword</code>.
     */
    public void setForeword(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.dictionary2.foreword</code>.
     */
    public Boolean getForeword() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.dictionary2.ending</code>.
     */
    public void setEnding(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.dictionary2.ending</code>.
     */
    public Boolean getEnding() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.dictionary2.sentence</code>.
     */
    public void setSentence(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.dictionary2.sentence</code>.
     */
    public Boolean getSentence() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.dictionary2.iscode</code>.
     */
    public void setIscode(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.dictionary2.iscode</code>.
     */
    public Boolean getIscode() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.dictionary2.addiction</code>.
     */
    public void setAddiction(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.dictionary2.addiction</code>.
     */
    public Integer getAddiction() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.dictionary2.pattern</code>.
     */
    public void setPattern(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.dictionary2.pattern</code>.
     */
    public String getPattern() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.dictionary2.code_typ</code>.
     */
    public void setCodeTyp(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.dictionary2.code_typ</code>.
     */
    public String getCodeTyp() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.dictionary2.code_value</code>.
     */
    public void setCodeValue(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.dictionary2.code_value</code>.
     */
    public String getCodeValue() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.dictionary2.root</code>.
     */
    public void setRoot(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.dictionary2.root</code>.
     */
    public Boolean getRoot() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.dictionary2.negation</code>.
     */
    public void setNegation(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.dictionary2.negation</code>.
     */
    public Boolean getNegation() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.dictionary2.occur</code>.
     */
    public void setOccur(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.dictionary2.occur</code>.
     */
    public Boolean getOccur() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>public.dictionary2.disease_ids</code>.
     */
    public void setDiseaseIds(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.dictionary2.disease_ids</code>.
     */
    public String getDiseaseIds() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.dictionary2.dirty</code>.
     */
    public void setDirty(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.dictionary2.dirty</code>.
     */
    public Boolean getDirty() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.dictionary2.priority</code>.
     */
    public void setPriority(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.dictionary2.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.dictionary2.disease_ids_count</code>.
     */
    public void setDiseaseIdsCount(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.dictionary2.disease_ids_count</code>.
     */
    public Integer getDiseaseIdsCount() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.dictionary2.priority_mode</code>.
     */
    public void setPriorityMode(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.dictionary2.priority_mode</code>.
     */
    public Boolean getPriorityMode() {
        return (Boolean) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, Short, Short, Boolean, Boolean, Boolean, Boolean, Integer, String, String, String, Boolean, Boolean, Boolean, String, Boolean, Integer, Integer, Boolean> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, Short, Short, Boolean, Boolean, Boolean, Boolean, Integer, String, String, String, Boolean, Boolean, Boolean, String, Boolean, Integer, Integer, Boolean> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dictionary2.DICTIONARY2.DICTIONARY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Dictionary2.DICTIONARY2.SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Dictionary2.DICTIONARY2.BEFORE_SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Dictionary2.DICTIONARY2.AFTER_SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Dictionary2.DICTIONARY2.FOREWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Dictionary2.DICTIONARY2.ENDING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Dictionary2.DICTIONARY2.SENTENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Dictionary2.DICTIONARY2.ISCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Dictionary2.DICTIONARY2.ADDICTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Dictionary2.DICTIONARY2.PATTERN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Dictionary2.DICTIONARY2.CODE_TYP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Dictionary2.DICTIONARY2.CODE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Dictionary2.DICTIONARY2.ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Dictionary2.DICTIONARY2.NEGATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return Dictionary2.DICTIONARY2.OCCUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Dictionary2.DICTIONARY2.DISEASE_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return Dictionary2.DICTIONARY2.DIRTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Dictionary2.DICTIONARY2.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return Dictionary2.DICTIONARY2.DISEASE_IDS_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return Dictionary2.DICTIONARY2.PRIORITY_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDictionaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getBeforeSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getAfterSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getForeword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getEnding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getSentence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIscode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getAddiction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCodeTyp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCodeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getNegation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getOccur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getDiseaseIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getDirty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getDiseaseIdsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component20() {
        return getPriorityMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDictionaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getBeforeSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getAfterSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getForeword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getEnding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getSentence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIscode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getAddiction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCodeTyp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCodeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getNegation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getOccur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getDiseaseIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getDirty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getDiseaseIdsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getPriorityMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value1(Integer value) {
        setDictionaryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value2(String value) {
        setSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value3(Short value) {
        setBeforeSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value4(Short value) {
        setAfterSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value5(Boolean value) {
        setForeword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value6(Boolean value) {
        setEnding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value7(Boolean value) {
        setSentence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value8(Boolean value) {
        setIscode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value9(Integer value) {
        setAddiction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value10(String value) {
        setPattern(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value11(String value) {
        setCodeTyp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value12(String value) {
        setCodeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value13(Boolean value) {
        setRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value14(Boolean value) {
        setNegation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value15(Boolean value) {
        setOccur(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value16(String value) {
        setDiseaseIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value17(Boolean value) {
        setDirty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value18(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value19(Integer value) {
        setDiseaseIdsCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record value20(Boolean value) {
        setPriorityMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Record values(Integer value1, String value2, Short value3, Short value4, Boolean value5, Boolean value6, Boolean value7, Boolean value8, Integer value9, String value10, String value11, String value12, Boolean value13, Boolean value14, Boolean value15, String value16, Boolean value17, Integer value18, Integer value19, Boolean value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Dictionary2Record
     */
    public Dictionary2Record() {
        super(Dictionary2.DICTIONARY2);
    }

    /**
     * Create a detached, initialised Dictionary2Record
     */
    public Dictionary2Record(Integer dictionaryId, String synonym, Short beforeSynonym, Short afterSynonym, Boolean foreword, Boolean ending, Boolean sentence, Boolean iscode, Integer addiction, String pattern, String codeTyp, String codeValue, Boolean root, Boolean negation, Boolean occur, String diseaseIds, Boolean dirty, Integer priority, Integer diseaseIdsCount, Boolean priorityMode) {
        super(Dictionary2.DICTIONARY2);

        set(0, dictionaryId);
        set(1, synonym);
        set(2, beforeSynonym);
        set(3, afterSynonym);
        set(4, foreword);
        set(5, ending);
        set(6, sentence);
        set(7, iscode);
        set(8, addiction);
        set(9, pattern);
        set(10, codeTyp);
        set(11, codeValue);
        set(12, root);
        set(13, negation);
        set(14, occur);
        set(15, diseaseIds);
        set(16, dirty);
        set(17, priority);
        set(18, diseaseIdsCount);
        set(19, priorityMode);
    }
}
