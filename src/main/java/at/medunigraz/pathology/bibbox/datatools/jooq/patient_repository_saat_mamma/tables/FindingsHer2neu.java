/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma.PatientRepositorySaatMamma;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma.tables.records.FindingsHer2neuRecord;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class FindingsHer2neu extends TableImpl<FindingsHer2neuRecord> {

    private static final long serialVersionUID = -1413623084;

    /**
     * The reference instance of <code>patient_repository_saat_mamma.findings_her2neu</code>
     */
    public static final FindingsHer2neu FINDINGS_HER2NEU = new FindingsHer2neu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FindingsHer2neuRecord> getRecordType() {
        return FindingsHer2neuRecord.class;
    }

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.rezeptor_name</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> REZEPTOR_NAME = createField("rezeptor_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.token</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.finding_id</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> FINDING_ID = createField("finding_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.aura_index</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> AURA_INDEX = createField("aura_index", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.patient_id</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.age</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.examination_type</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> EXAMINATION_TYPE = createField("examination_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.examination_date</code>.
     */
    public final TableField<FindingsHer2neuRecord, Date> EXAMINATION_DATE = createField("examination_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.examination_number</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> EXAMINATION_NUMBER = createField("examination_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.diagnosis</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> DIAGNOSIS = createField("diagnosis", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.diagnosis_clean</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> DIAGNOSIS_CLEAN = createField("diagnosis_clean", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.organ</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> ORGAN = createField("organ", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.organ_zuordnung</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> ORGAN_ZUORDNUNG = createField("organ_zuordnung", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.doctor</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> DOCTOR = createField("doctor", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.doctor_id</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.sender</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> SENDER = createField("sender", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.sender_id</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> SENDER_ID = createField("sender_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.afterfindingcount</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> AFTERFINDINGCOUNT = createField("afterfindingcount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.es_anz</code>.
     */
    public final TableField<FindingsHer2neuRecord, Integer> ES_ANZ = createField("es_anz", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.source</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.t</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> T = createField("t", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.n</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> N = createField("n", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.m</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> M = createField("m", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.g</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> G = createField("g", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.r</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> R = createField("r", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.l</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> L = createField("l", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>patient_repository_saat_mamma.findings_her2neu.v</code>.
     */
    public final TableField<FindingsHer2neuRecord, String> V = createField("v", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>patient_repository_saat_mamma.findings_her2neu</code> table reference
     */
    public FindingsHer2neu() {
        this(DSL.name("findings_her2neu"), null);
    }

    /**
     * Create an aliased <code>patient_repository_saat_mamma.findings_her2neu</code> table reference
     */
    public FindingsHer2neu(String alias) {
        this(DSL.name(alias), FINDINGS_HER2NEU);
    }

    /**
     * Create an aliased <code>patient_repository_saat_mamma.findings_her2neu</code> table reference
     */
    public FindingsHer2neu(Name alias) {
        this(alias, FINDINGS_HER2NEU);
    }

    private FindingsHer2neu(Name alias, Table<FindingsHer2neuRecord> aliased) {
        this(alias, aliased, null);
    }

    private FindingsHer2neu(Name alias, Table<FindingsHer2neuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FindingsHer2neu(Table<O> child, ForeignKey<O, FindingsHer2neuRecord> key) {
        super(child, key, FINDINGS_HER2NEU);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PatientRepositorySaatMamma.PATIENT_REPOSITORY_SAAT_MAMMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsHer2neu as(String alias) {
        return new FindingsHer2neu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FindingsHer2neu as(Name alias) {
        return new FindingsHer2neu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsHer2neu rename(String name) {
        return new FindingsHer2neu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FindingsHer2neu rename(Name name) {
        return new FindingsHer2neu(name, null);
    }
}
