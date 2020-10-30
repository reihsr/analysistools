/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Caseprojectmap;

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
public class CaseprojectmapRecord extends TableRecordImpl<CaseprojectmapRecord> implements Record2<Long, Integer> {

    private static final long serialVersionUID = 1879912887;

    /**
     * Setter for <code>scannerwebserviceproductive.caseprojectmap.vhistonumberid_fk</code>.
     */
    public void setVhistonumberidFk(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.caseprojectmap.vhistonumberid_fk</code>.
     */
    public Long getVhistonumberidFk() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>scannerwebserviceproductive.caseprojectmap.projectid_fk</code>.
     */
    public void setProjectidFk(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>scannerwebserviceproductive.caseprojectmap.projectid_fk</code>.
     */
    public Integer getProjectidFk() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Caseprojectmap.CASEPROJECTMAP.VHISTONUMBERID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Caseprojectmap.CASEPROJECTMAP.PROJECTID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getVhistonumberidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getVhistonumberidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProjectidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseprojectmapRecord value1(Long value) {
        setVhistonumberidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseprojectmapRecord value2(Integer value) {
        setProjectidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseprojectmapRecord values(Long value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CaseprojectmapRecord
     */
    public CaseprojectmapRecord() {
        super(Caseprojectmap.CASEPROJECTMAP);
    }

    /**
     * Create a detached, initialised CaseprojectmapRecord
     */
    public CaseprojectmapRecord(Long vhistonumberidFk, Integer projectidFk) {
        super(Caseprojectmap.CASEPROJECTMAP);

        set(0, vhistonumberidFk);
        set(1, projectidFk);
    }
}
