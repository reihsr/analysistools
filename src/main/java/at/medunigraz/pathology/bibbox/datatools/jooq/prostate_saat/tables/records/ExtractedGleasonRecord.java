/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.ExtractedGleason;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class ExtractedGleasonRecord extends UpdatableRecordImpl<ExtractedGleasonRecord> implements Record7<Integer, Integer, String, Integer, String, Boolean, String> {

    private static final long serialVersionUID = -600203357;

    /**
     * Setter for <code>prostate_saat.extracted_gleason.extracted_gleason_id</code>.
     */
    public void setExtractedGleasonId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.extracted_gleason_id</code>.
     */
    public Integer getExtractedGleasonId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.xml_report_befunddaten_id</code>.
     */
    public void setXmlReportBefunddatenId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.xml_report_befunddaten_id</code>.
     */
    public Integer getXmlReportBefunddatenId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.gleason_score</code>.
     */
    public void setGleasonScore(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.gleason_score</code>.
     */
    public String getGleasonScore() {
        return (String) get(2);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.number_of_gleason_scoures</code>.
     */
    public void setNumberOfGleasonScoures(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.number_of_gleason_scoures</code>.
     */
    public Integer getNumberOfGleasonScoures() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.slide_id</code>.
     */
    public void setSlideId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.slide_id</code>.
     */
    public String getSlideId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.selected</code>.
     */
    public void setSelected(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.selected</code>.
     */
    public Boolean getSelected() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>prostate_saat.extracted_gleason.highlight</code>.
     */
    public void setHighlight(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>prostate_saat.extracted_gleason.highlight</code>.
     */
    public String getHighlight() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ExtractedGleason.EXTRACTED_GLEASON.EXTRACTED_GLEASON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ExtractedGleason.EXTRACTED_GLEASON.XML_REPORT_BEFUNDDATEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExtractedGleason.EXTRACTED_GLEASON.GLEASON_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ExtractedGleason.EXTRACTED_GLEASON.NUMBER_OF_GLEASON_SCOURES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ExtractedGleason.EXTRACTED_GLEASON.SLIDE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return ExtractedGleason.EXTRACTED_GLEASON.SELECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ExtractedGleason.EXTRACTED_GLEASON.HIGHLIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getExtractedGleasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getXmlReportBefunddatenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGleasonScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getNumberOfGleasonScoures();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSlideId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getHighlight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getExtractedGleasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getXmlReportBefunddatenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGleasonScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNumberOfGleasonScoures();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSlideId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHighlight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value1(Integer value) {
        setExtractedGleasonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value2(Integer value) {
        setXmlReportBefunddatenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value3(String value) {
        setGleasonScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value4(Integer value) {
        setNumberOfGleasonScoures(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value5(String value) {
        setSlideId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value6(Boolean value) {
        setSelected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord value7(String value) {
        setHighlight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExtractedGleasonRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExtractedGleasonRecord
     */
    public ExtractedGleasonRecord() {
        super(ExtractedGleason.EXTRACTED_GLEASON);
    }

    /**
     * Create a detached, initialised ExtractedGleasonRecord
     */
    public ExtractedGleasonRecord(Integer extractedGleasonId, Integer xmlReportBefunddatenId, String gleasonScore, Integer numberOfGleasonScoures, String slideId, Boolean selected, String highlight) {
        super(ExtractedGleason.EXTRACTED_GLEASON);

        set(0, extractedGleasonId);
        set(1, xmlReportBefunddatenId);
        set(2, gleasonScore);
        set(3, numberOfGleasonScoures);
        set(4, slideId);
        set(5, selected);
        set(6, highlight);
    }
}
