/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.saat.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.saat.tables.Dictionary;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class DictionaryRecord extends UpdatableRecordImpl<DictionaryRecord> implements Record16<Integer, Integer, Integer, String, String, Boolean, Boolean, Boolean, Boolean, Boolean, String, Integer, Boolean, Boolean, Boolean, String> {

    private static final long serialVersionUID = -2063474409;

    /**
     * Setter for <code>saat.dictionary.dictionary_id</code>.
     */
    public void setDictionaryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>saat.dictionary.dictionary_id</code>.
     */
    public Integer getDictionaryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>saat.dictionary.after_synonym</code>.
     */
    public void setAfterSynonym(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>saat.dictionary.after_synonym</code>.
     */
    public Integer getAfterSynonym() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>saat.dictionary.before_synonym</code>.
     */
    public void setBeforeSynonym(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>saat.dictionary.before_synonym</code>.
     */
    public Integer getBeforeSynonym() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>saat.dictionary.code_typ</code>.
     */
    public void setCodeTyp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>saat.dictionary.code_typ</code>.
     */
    public String getCodeTyp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>saat.dictionary.code_value</code>.
     */
    public void setCodeValue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>saat.dictionary.code_value</code>.
     */
    public String getCodeValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>saat.dictionary.ending</code>.
     */
    public void setEnding(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>saat.dictionary.ending</code>.
     */
    public Boolean getEnding() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>saat.dictionary.foreword</code>.
     */
    public void setForeword(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>saat.dictionary.foreword</code>.
     */
    public Boolean getForeword() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>saat.dictionary.iscode</code>.
     */
    public void setIscode(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>saat.dictionary.iscode</code>.
     */
    public Boolean getIscode() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>saat.dictionary.negation</code>.
     */
    public void setNegation(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>saat.dictionary.negation</code>.
     */
    public Boolean getNegation() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>saat.dictionary.occur</code>.
     */
    public void setOccur(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>saat.dictionary.occur</code>.
     */
    public Boolean getOccur() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>saat.dictionary.pattern</code>.
     */
    public void setPattern(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>saat.dictionary.pattern</code>.
     */
    public String getPattern() {
        return (String) get(10);
    }

    /**
     * Setter for <code>saat.dictionary.priority</code>.
     */
    public void setPriority(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>saat.dictionary.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>saat.dictionary.priority_node</code>.
     */
    public void setPriorityNode(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>saat.dictionary.priority_node</code>.
     */
    public Boolean getPriorityNode() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>saat.dictionary.root</code>.
     */
    public void setRoot(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>saat.dictionary.root</code>.
     */
    public Boolean getRoot() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>saat.dictionary.sentence</code>.
     */
    public void setSentence(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>saat.dictionary.sentence</code>.
     */
    public Boolean getSentence() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>saat.dictionary.synonym</code>.
     */
    public void setSynonym(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>saat.dictionary.synonym</code>.
     */
    public String getSynonym() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, String, String, Boolean, Boolean, Boolean, Boolean, Boolean, String, Integer, Boolean, Boolean, Boolean, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, String, String, Boolean, Boolean, Boolean, Boolean, Boolean, String, Integer, Boolean, Boolean, Boolean, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dictionary.DICTIONARY.DICTIONARY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dictionary.DICTIONARY.AFTER_SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Dictionary.DICTIONARY.BEFORE_SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Dictionary.DICTIONARY.CODE_TYP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Dictionary.DICTIONARY.CODE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Dictionary.DICTIONARY.ENDING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Dictionary.DICTIONARY.FOREWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Dictionary.DICTIONARY.ISCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Dictionary.DICTIONARY.NEGATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Dictionary.DICTIONARY.OCCUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Dictionary.DICTIONARY.PATTERN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Dictionary.DICTIONARY.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Dictionary.DICTIONARY.PRIORITY_NODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Dictionary.DICTIONARY.ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return Dictionary.DICTIONARY.SENTENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Dictionary.DICTIONARY.SYNONYM;
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
    public Integer component2() {
        return getAfterSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBeforeSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCodeTyp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCodeValue();
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
        return getForeword();
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
    public Boolean component9() {
        return getNegation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getOccur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getPriorityNode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component15() {
        return getSentence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getSynonym();
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
    public Integer value2() {
        return getAfterSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBeforeSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCodeTyp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCodeValue();
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
        return getForeword();
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
    public Boolean value9() {
        return getNegation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getOccur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getPriorityNode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getSentence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSynonym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value1(Integer value) {
        setDictionaryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value2(Integer value) {
        setAfterSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value3(Integer value) {
        setBeforeSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value4(String value) {
        setCodeTyp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value5(String value) {
        setCodeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value6(Boolean value) {
        setEnding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value7(Boolean value) {
        setForeword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value8(Boolean value) {
        setIscode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value9(Boolean value) {
        setNegation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value10(Boolean value) {
        setOccur(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value11(String value) {
        setPattern(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value12(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value13(Boolean value) {
        setPriorityNode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value14(Boolean value) {
        setRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value15(Boolean value) {
        setSentence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord value16(String value) {
        setSynonym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Boolean value6, Boolean value7, Boolean value8, Boolean value9, Boolean value10, String value11, Integer value12, Boolean value13, Boolean value14, Boolean value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictionaryRecord
     */
    public DictionaryRecord() {
        super(Dictionary.DICTIONARY);
    }

    /**
     * Create a detached, initialised DictionaryRecord
     */
    public DictionaryRecord(Integer dictionaryId, Integer afterSynonym, Integer beforeSynonym, String codeTyp, String codeValue, Boolean ending, Boolean foreword, Boolean iscode, Boolean negation, Boolean occur, String pattern, Integer priority, Boolean priorityNode, Boolean root, Boolean sentence, String synonym) {
        super(Dictionary.DICTIONARY);

        set(0, dictionaryId);
        set(1, afterSynonym);
        set(2, beforeSynonym);
        set(3, codeTyp);
        set(4, codeValue);
        set(5, ending);
        set(6, foreword);
        set(7, iscode);
        set(8, negation);
        set(9, occur);
        set(10, pattern);
        set(11, priority);
        set(12, priorityNode);
        set(13, root);
        set(14, sentence);
        set(15, synonym);
    }
}