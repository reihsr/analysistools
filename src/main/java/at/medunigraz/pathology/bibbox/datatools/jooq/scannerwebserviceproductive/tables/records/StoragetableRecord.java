/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Storagetable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class StoragetableRecord extends UpdatableRecordImpl<StoragetableRecord> implements Record5<Integer, String, Boolean, String, String> {

    private static final long serialVersionUID = 1909291644;

    /**
     * Setter for <code>scannerwebserviceproductive.storagetable.storageid</code>.
     */
    public void setStorageid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.storagetable.storageid</code>.
     */
    public Integer getStorageid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.storagetable.storagepath</code>.
     */
    public void setStoragepath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.storagetable.storagepath</code>.
     */
    public String getStoragepath() {
        return (String) get(1);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.storagetable.storageshouldbeonline</code>.
     */
    public void setStorageshouldbeonline(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.storagetable.storageshouldbeonline</code>.
     */
    public Boolean getStorageshouldbeonline() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.storagetable.storagefreespace</code>.
     */
    public void setStoragefreespace(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.storagetable.storagefreespace</code>.
     */
    public String getStoragefreespace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.storagetable.storageinfo</code>.
     */
    public void setStorageinfo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.storagetable.storageinfo</code>.
     */
    public String getStorageinfo() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Boolean, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Boolean, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Storagetable.STORAGETABLE.STORAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Storagetable.STORAGETABLE.STORAGEPATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Storagetable.STORAGETABLE.STORAGESHOULDBEONLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Storagetable.STORAGETABLE.STORAGEFREESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Storagetable.STORAGETABLE.STORAGEINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStorageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStoragepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getStorageshouldbeonline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStoragefreespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStorageinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStorageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStoragepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getStorageshouldbeonline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStoragefreespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStorageinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord value1(Integer value) {
        setStorageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord value2(String value) {
        setStoragepath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord value3(Boolean value) {
        setStorageshouldbeonline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord value4(String value) {
        setStoragefreespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord value5(String value) {
        setStorageinfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragetableRecord values(Integer value1, String value2, Boolean value3, String value4, String value5) {
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
     * Create a detached StoragetableRecord
     */
    public StoragetableRecord() {
        super(Storagetable.STORAGETABLE);
    }

    /**
     * Create a detached, initialised StoragetableRecord
     */
    public StoragetableRecord(Integer storageid, String storagepath, Boolean storageshouldbeonline, String storagefreespace, String storageinfo) {
        super(Storagetable.STORAGETABLE);

        set(0, storageid);
        set(1, storagepath);
        set(2, storageshouldbeonline);
        set(3, storagefreespace);
        set(4, storageinfo);
    }
}
