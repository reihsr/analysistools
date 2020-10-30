/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Slidescanmap;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class SlidescanmapRecord extends TableRecordImpl<SlidescanmapRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -580623923;

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.slidescanmap.slideid_fk</code>.
     */
    public void setSlideidFk(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.slidescanmap.slideid_fk</code>.
     */
    public String getSlideidFk() {
        return (String) get(0);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.slidescanmap.scanid_fk</code>.
     */
    public void setScanidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.slidescanmap.scanid_fk</code>.
     */
    public String getScanidFk() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Slidescanmap.SLIDESCANMAP.SLIDEID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Slidescanmap.SLIDESCANMAP.SCANID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSlideidFk();
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
    public String value1() {
        return getSlideidFk();
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
    public SlidescanmapRecord value1(String value) {
        setSlideidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlidescanmapRecord value2(String value) {
        setScanidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlidescanmapRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlidescanmapRecord
     */
    public SlidescanmapRecord() {
        super(Slidescanmap.SLIDESCANMAP);
    }

    /**
     * Create a detached, initialised SlidescanmapRecord
     */
    public SlidescanmapRecord(String slideidFk, String scanidFk) {
        super(Slidescanmap.SLIDESCANMAP);

        set(0, slideidFk);
        set(1, scanidFk);
    }
}
