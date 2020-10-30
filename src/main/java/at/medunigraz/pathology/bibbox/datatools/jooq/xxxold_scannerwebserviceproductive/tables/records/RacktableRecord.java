/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Racktable;

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
public class RacktableRecord extends UpdatableRecordImpl<RacktableRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 465540203;

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.rackid</code>.
     */
    public void setRackid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.rackid</code>.
     */
    public String getRackid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.rackstatusid_fk</code>.
     */
    public void setRackstatusidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.rackstatusid_fk</code>.
     */
    public String getRackstatusidFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.racktype</code>.
     */
    public void setRacktype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.racktype</code>.
     */
    public String getRacktype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.rackcapacity</code>.
     */
    public void setRackcapacity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.rackcapacity</code>.
     */
    public String getRackcapacity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.projectid_fk</code>.
     */
    public void setProjectidFk(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.projectid_fk</code>.
     */
    public String getProjectidFk() {
        return (String) get(4);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.racktable.rackfillstatus</code>.
     */
    public void setRackfillstatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.racktable.rackfillstatus</code>.
     */
    public String getRackfillstatus() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Racktable.RACKTABLE.RACKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Racktable.RACKTABLE.RACKSTATUSID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Racktable.RACKTABLE.RACKTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Racktable.RACKTABLE.RACKCAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Racktable.RACKTABLE.PROJECTID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Racktable.RACKTABLE.RACKFILLSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRackid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRackstatusidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRacktype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRackcapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRackfillstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRackid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRackstatusidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRacktype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRackcapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRackfillstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value1(String value) {
        setRackid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value2(String value) {
        setRackstatusidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value3(String value) {
        setRacktype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value4(String value) {
        setRackcapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value5(String value) {
        setProjectidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord value6(String value) {
        setRackfillstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RacktableRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached RacktableRecord
     */
    public RacktableRecord() {
        super(Racktable.RACKTABLE);
    }

    /**
     * Create a detached, initialised RacktableRecord
     */
    public RacktableRecord(String rackid, String rackstatusidFk, String racktype, String rackcapacity, String projectidFk, String rackfillstatus) {
        super(Racktable.RACKTABLE);

        set(0, rackid);
        set(1, rackstatusidFk);
        set(2, racktype);
        set(3, rackcapacity);
        set(4, projectidFk);
        set(5, rackfillstatus);
    }
}
