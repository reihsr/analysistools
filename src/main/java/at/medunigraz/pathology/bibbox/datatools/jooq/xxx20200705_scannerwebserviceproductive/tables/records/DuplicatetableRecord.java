/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.Duplicatetable;

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
public class DuplicatetableRecord extends UpdatableRecordImpl<DuplicatetableRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 789252728;

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicateid</code>.
     */
    public void setDuplicateid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicateid</code>.
     */
    public Integer getDuplicateid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.sourcescanid_fk</code>.
     */
    public void setSourcescanidFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.sourcescanid_fk</code>.
     */
    public String getSourcescanidFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicatescanid_fk</code>.
     */
    public void setDuplicatescanidFk(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicatescanid_fk</code>.
     */
    public String getDuplicatescanidFk() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicatechecked</code>.
     */
    public void setDuplicatechecked(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.duplicatechecked</code>.
     */
    public String getDuplicatechecked() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.similarityindex</code>.
     */
    public void setSimilarityindex(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.duplicatetable.similarityindex</code>.
     */
    public String getSimilarityindex() {
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
        return Duplicatetable.DUPLICATETABLE.DUPLICATEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Duplicatetable.DUPLICATETABLE.SOURCESCANID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Duplicatetable.DUPLICATETABLE.DUPLICATESCANID_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Duplicatetable.DUPLICATETABLE.DUPLICATECHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Duplicatetable.DUPLICATETABLE.SIMILARITYINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDuplicateid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSourcescanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDuplicatescanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDuplicatechecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSimilarityindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDuplicateid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSourcescanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDuplicatescanidFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDuplicatechecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSimilarityindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord value1(Integer value) {
        setDuplicateid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord value2(String value) {
        setSourcescanidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord value3(String value) {
        setDuplicatescanidFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord value4(String value) {
        setDuplicatechecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord value5(String value) {
        setSimilarityindex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DuplicatetableRecord values(Integer value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached DuplicatetableRecord
     */
    public DuplicatetableRecord() {
        super(Duplicatetable.DUPLICATETABLE);
    }

    /**
     * Create a detached, initialised DuplicatetableRecord
     */
    public DuplicatetableRecord(Integer duplicateid, String sourcescanidFk, String duplicatescanidFk, String duplicatechecked, String similarityindex) {
        super(Duplicatetable.DUPLICATETABLE);

        set(0, duplicateid);
        set(1, sourcescanidFk);
        set(2, duplicatescanidFk);
        set(3, duplicatechecked);
        set(4, similarityindex);
    }
}