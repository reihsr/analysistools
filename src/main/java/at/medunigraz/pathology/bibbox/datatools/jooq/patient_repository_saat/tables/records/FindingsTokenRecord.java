/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class FindingsTokenRecord extends UpdatableRecordImpl<FindingsTokenRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -205864820;

    /**
     * Setter for <code>patient_repository_saat.findings_token.findings_token_id</code>.
     */
    public void setFindingsTokenId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_token.findings_token_id</code>.
     */
    public Integer getFindingsTokenId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>patient_repository_saat.findings_token.token</code>.
     */
    public void setToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>patient_repository_saat.findings_token.token</code>.
     */
    public String getToken() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FindingsToken.FINDINGS_TOKEN.FINDINGS_TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FindingsToken.FINDINGS_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFindingsTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFindingsTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsTokenRecord value1(Integer value) {
        setFindingsTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsTokenRecord value2(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsTokenRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FindingsTokenRecord
     */
    public FindingsTokenRecord() {
        super(FindingsToken.FINDINGS_TOKEN);
    }

    /**
     * Create a detached, initialised FindingsTokenRecord
     */
    public FindingsTokenRecord(Integer findingsTokenId, String token) {
        super(FindingsToken.FINDINGS_TOKEN);

        set(0, findingsTokenId);
        set(1, token);
    }
}