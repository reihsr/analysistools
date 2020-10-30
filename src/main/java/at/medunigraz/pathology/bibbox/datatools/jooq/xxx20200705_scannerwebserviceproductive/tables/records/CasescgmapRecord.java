/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.Casescgmap;

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
public class CasescgmapRecord extends TableRecordImpl<CasescgmapRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 558806303;

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.casescgmap.vhistonumberid_fk</code>.
     */
    public void setVhistonumberidFk(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.casescgmap.vhistonumberid_fk</code>.
     */
    public Long getVhistonumberidFk() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.casescgmap.scgid_fk</code>.
     */
    public void setScgidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.casescgmap.scgid_fk</code>.
     */
    public String getScgidFk() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Casescgmap.CASESCGMAP.VHISTONUMBERID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Casescgmap.CASESCGMAP.SCGID_FK;
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
    public String component2() {
        return getScgidFk();
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
    public String value2() {
        return getScgidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CasescgmapRecord value1(Long value) {
        setVhistonumberidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CasescgmapRecord value2(String value) {
        setScgidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CasescgmapRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CasescgmapRecord
     */
    public CasescgmapRecord() {
        super(Casescgmap.CASESCGMAP);
    }

    /**
     * Create a detached, initialised CasescgmapRecord
     */
    public CasescgmapRecord(Long vhistonumberidFk, String scgidFk) {
        super(Casescgmap.CASESCGMAP);

        set(0, vhistonumberidFk);
        set(1, scgidFk);
    }
}
