/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.PoGleason;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class PoGleasonRecord extends UpdatableRecordImpl<PoGleasonRecord> implements Record10<Integer, Long, Long, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1557180536;

    /**
     * Setter for <code>prostate_google.po_gleason.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.vpatientid</code>.
     */
    public void setVpatientid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.vpatientid</code>.
     */
    public Long getVpatientid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.vhistoid</code>.
     */
    public void setVhistoid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.vhistoid</code>.
     */
    public Long getVhistoid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.extraction_type</code>.
     */
    public void setExtractionType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.extraction_type</code>.
     */
    public String getExtractionType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.gleason_score_extracted</code>.
     */
    public void setGleasonScoreExtracted(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.gleason_score_extracted</code>.
     */
    public String getGleasonScoreExtracted() {
        return (String) get(4);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.gleason_score_corrected</code>.
     */
    public void setGleasonScoreCorrected(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.gleason_score_corrected</code>.
     */
    public String getGleasonScoreCorrected() {
        return (String) get(5);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.remarks</code>.
     */
    public void setRemarks(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.remarks</code>.
     */
    public String getRemarks() {
        return (String) get(6);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.grade</code>.
     */
    public void setGrade(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.grade</code>.
     */
    public String getGrade() {
        return (String) get(7);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.score</code>.
     */
    public void setScore(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.score</code>.
     */
    public String getScore() {
        return (String) get(8);
    }

    /**
     * Setter for <code>prostate_google.po_gleason.suspicious</code>.
     */
    public void setSuspicious(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>prostate_google.po_gleason.suspicious</code>.
     */
    public String getSuspicious() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Long, Long, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Long, Long, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PoGleason.PO_GLEASON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PoGleason.PO_GLEASON.VPATIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PoGleason.PO_GLEASON.VHISTOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PoGleason.PO_GLEASON.EXTRACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PoGleason.PO_GLEASON.GLEASON_SCORE_EXTRACTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PoGleason.PO_GLEASON.GLEASON_SCORE_CORRECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PoGleason.PO_GLEASON.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PoGleason.PO_GLEASON.GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PoGleason.PO_GLEASON.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return PoGleason.PO_GLEASON.SUSPICIOUS;
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
    public Long component2() {
        return getVpatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getVhistoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getExtractionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGleasonScoreExtracted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGleasonScoreCorrected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSuspicious();
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
    public Long value2() {
        return getVpatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getVhistoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExtractionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGleasonScoreExtracted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGleasonScoreCorrected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSuspicious();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value2(Long value) {
        setVpatientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value3(Long value) {
        setVhistoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value4(String value) {
        setExtractionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value5(String value) {
        setGleasonScoreExtracted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value6(String value) {
        setGleasonScoreCorrected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value7(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value8(String value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value9(String value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord value10(String value) {
        setSuspicious(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PoGleasonRecord values(Integer value1, Long value2, Long value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PoGleasonRecord
     */
    public PoGleasonRecord() {
        super(PoGleason.PO_GLEASON);
    }

    /**
     * Create a detached, initialised PoGleasonRecord
     */
    public PoGleasonRecord(Integer id, Long vpatientid, Long vhistoid, String extractionType, String gleasonScoreExtracted, String gleasonScoreCorrected, String remarks, String grade, String score, String suspicious) {
        super(PoGleason.PO_GLEASON);

        set(0, id);
        set(1, vpatientid);
        set(2, vhistoid);
        set(3, extractionType);
        set(4, gleasonScoreExtracted);
        set(5, gleasonScoreCorrected);
        set(6, remarks);
        set(7, grade);
        set(8, score);
        set(9, suspicious);
    }
}