/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Scannerrackpositiontable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ScannerrackpositiontableRecord extends UpdatableRecordImpl<ScannerrackpositiontableRecord> implements Record6<Integer, String, String, String, String, String> {

    private static final long serialVersionUID = -658081196;

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.scannerrackpositionid</code>.
     */
    public void setScannerrackpositionid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.scannerrackpositionid</code>.
     */
    public Integer getScannerrackpositionid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.scannerid_fk</code>.
     */
    public void setScanneridFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.scannerid_fk</code>.
     */
    public String getScanneridFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.slotid</code>.
     */
    public void setSlotid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.slotid</code>.
     */
    public String getSlotid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.rackid_fk</code>.
     */
    public void setRackidFk(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.rackid_fk</code>.
     */
    public String getRackidFk() {
        return (String) get(3);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.lastloadtimestamp</code>.
     */
    public void setLastloadtimestamp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.lastloadtimestamp</code>.
     */
    public String getLastloadtimestamp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.scannerrackpositiontable.lastunloadtimestamp</code>.
     */
    public void setLastunloadtimestamp(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.scannerrackpositiontable.lastunloadtimestamp</code>.
     */
    public String getLastunloadtimestamp() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.SCANNERRACKPOSITIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.SCANNERID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.SLOTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.RACKID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.LASTLOADTIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.LASTUNLOADTIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getScannerrackpositionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getScanneridFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSlotid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRackidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastloadtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLastunloadtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getScannerrackpositionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getScanneridFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSlotid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRackidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastloadtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLastunloadtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value1(Integer value) {
        setScannerrackpositionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value2(String value) {
        setScanneridFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value3(String value) {
        setSlotid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value4(String value) {
        setRackidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value5(String value) {
        setLastloadtimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord value6(String value) {
        setLastunloadtimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannerrackpositiontableRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScannerrackpositiontableRecord
     */
    public ScannerrackpositiontableRecord() {
        super(Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE);
    }

    /**
     * Create a detached, initialised ScannerrackpositiontableRecord
     */
    public ScannerrackpositiontableRecord(Integer scannerrackpositionid, String scanneridFk, String slotid, String rackidFk, String lastloadtimestamp, String lastunloadtimestamp) {
        super(Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE);

        set(0, scannerrackpositionid);
        set(1, scanneridFk);
        set(2, slotid);
        set(3, rackidFk);
        set(4, lastloadtimestamp);
        set(5, lastunloadtimestamp);
    }
}
