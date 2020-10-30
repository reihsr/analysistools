/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.Scantable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ScantableRecord extends UpdatableRecordImpl<ScantableRecord> implements Record12<String, String, String, String, String, Short, Integer, String, Short, String, String, Boolean> {

    private static final long serialVersionUID = -234414562;

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanid</code>.
     */
    public void setScanid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanid</code>.
     */
    public String getScanid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanfiletype</code>.
     */
    public void setScanfiletype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanfiletype</code>.
     */
    public String getScanfiletype() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scannerid</code>.
     */
    public void setScannerid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scannerid</code>.
     */
    public String getScannerid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scannerslot</code>.
     */
    public void setScannerslot(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scannerslot</code>.
     */
    public String getScannerslot() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanrackid_fk</code>.
     */
    public void setScanrackidFk(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanrackid_fk</code>.
     */
    public String getScanrackidFk() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanrackposition</code>.
     */
    public void setScanrackposition(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanrackposition</code>.
     */
    public Short getScanrackposition() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scandate</code>.
     */
    public void setScandate(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scandate</code>.
     */
    public Integer getScandate() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanmagnification</code>.
     */
    public void setScanmagnification(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanmagnification</code>.
     */
    public String getScanmagnification() {
        return (String) get(7);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.storageid_fk</code>.
     */
    public void setStorageidFk(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.storageid_fk</code>.
     */
    public Short getStorageidFk() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.storagesubfolder</code>.
     */
    public void setStoragesubfolder(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.storagesubfolder</code>.
     */
    public String getStoragesubfolder() {
        return (String) get(9);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.slidebarcode</code>.
     */
    public void setSlidebarcode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.slidebarcode</code>.
     */
    public String getSlidebarcode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanqualityok</code>.
     */
    public void setScanqualityok(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.scantable.scanqualityok</code>.
     */
    public Boolean getScanqualityok() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, Short, Integer, String, Short, String, String, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, Short, Integer, String, Short, String, String, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Scantable.SCANTABLE.SCANID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Scantable.SCANTABLE.SCANFILETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Scantable.SCANTABLE.SCANNERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Scantable.SCANTABLE.SCANNERSLOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Scantable.SCANTABLE.SCANRACKID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Scantable.SCANTABLE.SCANRACKPOSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Scantable.SCANTABLE.SCANDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Scantable.SCANTABLE.SCANMAGNIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return Scantable.SCANTABLE.STORAGEID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Scantable.SCANTABLE.STORAGESUBFOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Scantable.SCANTABLE.SLIDEBARCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Scantable.SCANTABLE.SCANQUALITYOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getScanid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getScanfiletype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getScannerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getScannerslot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getScanrackidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getScanrackposition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getScandate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getScanmagnification();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getStorageidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getStoragesubfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSlidebarcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getScanqualityok();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getScanid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getScanfiletype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getScannerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getScannerslot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScanrackidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getScanrackposition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getScandate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getScanmagnification();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getStorageidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getStoragesubfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSlidebarcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getScanqualityok();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value1(String value) {
        setScanid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value2(String value) {
        setScanfiletype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value3(String value) {
        setScannerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value4(String value) {
        setScannerslot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value5(String value) {
        setScanrackidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value6(Short value) {
        setScanrackposition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value7(Integer value) {
        setScandate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value8(String value) {
        setScanmagnification(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value9(Short value) {
        setStorageidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value10(String value) {
        setStoragesubfolder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value11(String value) {
        setSlidebarcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord value12(Boolean value) {
        setScanqualityok(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScantableRecord values(String value1, String value2, String value3, String value4, String value5, Short value6, Integer value7, String value8, Short value9, String value10, String value11, Boolean value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScantableRecord
     */
    public ScantableRecord() {
        super(Scantable.SCANTABLE);
    }

    /**
     * Create a detached, initialised ScantableRecord
     */
    public ScantableRecord(String scanid, String scanfiletype, String scannerid, String scannerslot, String scanrackidFk, Short scanrackposition, Integer scandate, String scanmagnification, Short storageidFk, String storagesubfolder, String slidebarcode, Boolean scanqualityok) {
        super(Scantable.SCANTABLE);

        set(0, scanid);
        set(1, scanfiletype);
        set(2, scannerid);
        set(3, scannerslot);
        set(4, scanrackidFk);
        set(5, scanrackposition);
        set(6, scandate);
        set(7, scanmagnification);
        set(8, storageidFk);
        set(9, storagesubfolder);
        set(10, slidebarcode);
        set(11, scanqualityok);
    }
}
