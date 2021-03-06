/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Inboxtable;

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
public class InboxtableRecord extends TableRecordImpl<InboxtableRecord> implements Record5<Integer, String, Boolean, String, Integer> {

    private static final long serialVersionUID = 1421650418;

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxid</code>.
     */
    public void setInboxid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxid</code>.
     */
    public Integer getInboxid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxfolder</code>.
     */
    public void setInboxfolder(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxfolder</code>.
     */
    public String getInboxfolder() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxisactive</code>.
     */
    public void setInboxisactive(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxisactive</code>.
     */
    public Boolean getInboxisactive() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxinfo</code>.
     */
    public void setInboxinfo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxinfo</code>.
     */
    public String getInboxinfo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxthreads</code>.
     */
    public void setInboxthreads(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxxold_scannerwebserviceproductive.inboxtable.inboxthreads</code>.
     */
    public Integer getInboxthreads() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Boolean, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Boolean, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Inboxtable.INBOXTABLE.INBOXID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Inboxtable.INBOXTABLE.INBOXFOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Inboxtable.INBOXTABLE.INBOXISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Inboxtable.INBOXTABLE.INBOXINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Inboxtable.INBOXTABLE.INBOXTHREADS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getInboxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getInboxfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getInboxisactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInboxinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getInboxthreads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getInboxid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getInboxfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getInboxisactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInboxinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getInboxthreads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord value1(Integer value) {
        setInboxid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord value2(String value) {
        setInboxfolder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord value3(Boolean value) {
        setInboxisactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord value4(String value) {
        setInboxinfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord value5(Integer value) {
        setInboxthreads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InboxtableRecord values(Integer value1, String value2, Boolean value3, String value4, Integer value5) {
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
     * Create a detached InboxtableRecord
     */
    public InboxtableRecord() {
        super(Inboxtable.INBOXTABLE);
    }

    /**
     * Create a detached, initialised InboxtableRecord
     */
    public InboxtableRecord(Integer inboxid, String inboxfolder, Boolean inboxisactive, String inboxinfo, Integer inboxthreads) {
        super(Inboxtable.INBOXTABLE);

        set(0, inboxid);
        set(1, inboxfolder);
        set(2, inboxisactive);
        set(3, inboxinfo);
        set(4, inboxthreads);
    }
}
