/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Idmaptable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class IdmaptableRecord extends UpdatableRecordImpl<IdmaptableRecord> implements Record3<String, String, Short> {

    private static final long serialVersionUID = -1615777403;

    /**
     * Setter for <code>scannerwebserviceproductive.idmaptable.internalid</code>.
     */
    public void setInternalid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.idmaptable.internalid</code>.
     */
    public String getInternalid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.idmaptable.externalid</code>.
     */
    public void setExternalid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.idmaptable.externalid</code>.
     */
    public String getExternalid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.idmaptable.projectid</code>.
     */
    public void setProjectid(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.idmaptable.projectid</code>.
     */
    public Short getProjectid() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<String, String, Short> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Idmaptable.IDMAPTABLE.INTERNALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Idmaptable.IDMAPTABLE.EXTERNALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Idmaptable.IDMAPTABLE.PROJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getInternalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getExternalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getInternalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getExternalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdmaptableRecord value1(String value) {
        setInternalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdmaptableRecord value2(String value) {
        setExternalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdmaptableRecord value3(Short value) {
        setProjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdmaptableRecord values(String value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IdmaptableRecord
     */
    public IdmaptableRecord() {
        super(Idmaptable.IDMAPTABLE);
    }

    /**
     * Create a detached, initialised IdmaptableRecord
     */
    public IdmaptableRecord(String internalid, String externalid, Short projectid) {
        super(Idmaptable.IDMAPTABLE);

        set(0, internalid);
        set(1, externalid);
        set(2, projectid);
    }
}
