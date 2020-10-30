/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Jsonuploadtable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class JsonuploadtableRecord extends TableRecordImpl<JsonuploadtableRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 267227557;

    /**
     * Setter for <code>scannerwebserviceproductive.jsonuploadtable.uploadid</code>.
     */
    public void setUploadid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.jsonuploadtable.uploadid</code>.
     */
    public Integer getUploadid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.jsonuploadtable.scanid_fk</code>.
     */
    public void setScanidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.jsonuploadtable.scanid_fk</code>.
     */
    public String getScanidFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.jsonuploadtable.uploaddate</code>.
     */
    public void setUploaddate(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.jsonuploadtable.uploaddate</code>.
     */
    public String getUploaddate() {
        return (String) get(2);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.jsonuploadtable.uploadcontent</code>.
     */
    public void setUploadcontent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.jsonuploadtable.uploadcontent</code>.
     */
    public String getUploadcontent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.jsonuploadtable.projectid_fk</code>.
     */
    public void setProjectidFk(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.jsonuploadtable.projectid_fk</code>.
     */
    public Integer getProjectidFk() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Jsonuploadtable.JSONUPLOADTABLE.UPLOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Jsonuploadtable.JSONUPLOADTABLE.SCANID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Jsonuploadtable.JSONUPLOADTABLE.UPLOADDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Jsonuploadtable.JSONUPLOADTABLE.UPLOADCONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Jsonuploadtable.JSONUPLOADTABLE.PROJECTID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUploadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getScanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUploaddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUploadcontent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUploadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getScanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUploaddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUploadcontent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord value1(Integer value) {
        setUploadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord value2(String value) {
        setScanidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord value3(String value) {
        setUploaddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord value4(String value) {
        setUploadcontent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord value5(Integer value) {
        setProjectidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonuploadtableRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached JsonuploadtableRecord
     */
    public JsonuploadtableRecord() {
        super(Jsonuploadtable.JSONUPLOADTABLE);
    }

    /**
     * Create a detached, initialised JsonuploadtableRecord
     */
    public JsonuploadtableRecord(Integer uploadid, String scanidFk, String uploaddate, String uploadcontent, Integer projectidFk) {
        super(Jsonuploadtable.JSONUPLOADTABLE);

        set(0, uploadid);
        set(1, scanidFk);
        set(2, uploaddate);
        set(3, uploadcontent);
        set(4, projectidFk);
    }
}
