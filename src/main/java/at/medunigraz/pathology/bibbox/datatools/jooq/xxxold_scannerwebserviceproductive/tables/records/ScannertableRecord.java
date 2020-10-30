/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scannertable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ScannertableRecord extends TableRecordImpl<ScannertableRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 6643005;

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.scannertable.scannerid</code>.
     */
    public void setScannerid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.scannertable.scannerid</code>.
     */
    public String getScannerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.scannertable.scannertype</code>.
     */
    public void setScannertype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.scannertable.scannertype</code>.
     */
    public String getScannertype() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.scannertable.scannermanufacturer</code>.
     */
    public void setScannermanufacturer(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.scannertable.scannermanufacturer</code>.
     */
    public String getScannermanufacturer() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.scannertable.scannerrackslots</code>.
     */
    public void setScannerrackslots(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.scannertable.scannerrackslots</code>.
     */
    public String getScannerrackslots() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Scannertable.SCANNERTABLE.SCANNERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Scannertable.SCANNERTABLE.SCANNERTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Scannertable.SCANNERTABLE.SCANNERMANUFACTURER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Scannertable.SCANNERTABLE.SCANNERRACKSLOTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getScannerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getScannertype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getScannermanufacturer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getScannerrackslots();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getScannerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getScannertype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getScannermanufacturer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getScannerrackslots();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannertableRecord value1(String value) {
        setScannerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannertableRecord value2(String value) {
        setScannertype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannertableRecord value3(String value) {
        setScannermanufacturer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannertableRecord value4(String value) {
        setScannerrackslots(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScannertableRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScannertableRecord
     */
    public ScannertableRecord() {
        super(Scannertable.SCANNERTABLE);
    }

    /**
     * Create a detached, initialised ScannertableRecord
     */
    public ScannertableRecord(String scannerid, String scannertype, String scannermanufacturer, String scannerrackslots) {
        super(Scannertable.SCANNERTABLE);

        set(0, scannerid);
        set(1, scannertype);
        set(2, scannermanufacturer);
        set(3, scannerrackslots);
    }
}
