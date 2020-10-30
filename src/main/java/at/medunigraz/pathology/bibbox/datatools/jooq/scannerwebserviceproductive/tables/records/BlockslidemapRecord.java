/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Blockslidemap;

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
public class BlockslidemapRecord extends TableRecordImpl<BlockslidemapRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -521276251;

    /**
     * Setter for <code>scannerwebserviceproductive.blockslidemap.blockid_fk</code>.
     */
    public void setBlockidFk(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.blockslidemap.blockid_fk</code>.
     */
    public String getBlockidFk() {
        return (String) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.blockslidemap.slideid_fk</code>.
     */
    public void setSlideidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.blockslidemap.slideid_fk</code>.
     */
    public String getSlideidFk() {
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
        return Blockslidemap.BLOCKSLIDEMAP.BLOCKID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Blockslidemap.BLOCKSLIDEMAP.SLIDEID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBlockidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSlideidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBlockidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSlideidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockslidemapRecord value1(String value) {
        setBlockidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockslidemapRecord value2(String value) {
        setSlideidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockslidemapRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockslidemapRecord
     */
    public BlockslidemapRecord() {
        super(Blockslidemap.BLOCKSLIDEMAP);
    }

    /**
     * Create a detached, initialised BlockslidemapRecord
     */
    public BlockslidemapRecord(String blockidFk, String slideidFk) {
        super(Blockslidemap.BLOCKSLIDEMAP);

        set(0, blockidFk);
        set(1, slideidFk);
    }
}
