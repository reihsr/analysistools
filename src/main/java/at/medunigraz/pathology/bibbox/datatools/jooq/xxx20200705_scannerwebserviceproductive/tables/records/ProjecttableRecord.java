/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.Projecttable;

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
public class ProjecttableRecord extends UpdatableRecordImpl<ProjecttableRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = -1511371396;

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectid</code>.
     */
    public void setProjectid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectid</code>.
     */
    public Integer getProjectid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectname</code>.
     */
    public void setProjectname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectname</code>.
     */
    public String getProjectname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectadditionalinfo</code>.
     */
    public void setProjectadditionalinfo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectadditionalinfo</code>.
     */
    public String getProjectadditionalinfo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectinboxfolder</code>.
     */
    public void setProjectinboxfolder(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectinboxfolder</code>.
     */
    public String getProjectinboxfolder() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectinboxisactive</code>.
     */
    public void setProjectinboxisactive(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.projecttable.projectinboxisactive</code>.
     */
    public String getProjectinboxisactive() {
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
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Projecttable.PROJECTTABLE.PROJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Projecttable.PROJECTTABLE.PROJECTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Projecttable.PROJECTTABLE.PROJECTADDITIONALINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Projecttable.PROJECTTABLE.PROJECTINBOXFOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Projecttable.PROJECTTABLE.PROJECTINBOXISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProjectname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProjectadditionalinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProjectinboxfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProjectinboxisactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProjectname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProjectadditionalinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProjectinboxfolder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProjectinboxisactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord value1(Integer value) {
        setProjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord value2(String value) {
        setProjectname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord value3(String value) {
        setProjectadditionalinfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord value4(String value) {
        setProjectinboxfolder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord value5(String value) {
        setProjectinboxisactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttableRecord values(Integer value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached ProjecttableRecord
     */
    public ProjecttableRecord() {
        super(Projecttable.PROJECTTABLE);
    }

    /**
     * Create a detached, initialised ProjecttableRecord
     */
    public ProjecttableRecord(Integer projectid, String projectname, String projectadditionalinfo, String projectinboxfolder, String projectinboxisactive) {
        super(Projecttable.PROJECTTABLE);

        set(0, projectid);
        set(1, projectname);
        set(2, projectadditionalinfo);
        set(3, projectinboxfolder);
        set(4, projectinboxisactive);
    }
}
