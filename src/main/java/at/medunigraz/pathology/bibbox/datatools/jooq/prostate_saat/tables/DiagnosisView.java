/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.ProstateSaat;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.records.DiagnosisViewRecord;

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
public class DiagnosisView extends TableImpl<DiagnosisViewRecord> {

    private static final long serialVersionUID = 1577311258;

    /**
     * The reference instance of <code>prostate_saat.diagnosis_view</code>
     */
    public static final DiagnosisView DIAGNOSIS_VIEW = new DiagnosisView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DiagnosisViewRecord> getRecordType() {
        return DiagnosisViewRecord.class;
    }

    /**
     * The column <code>prostate_saat.diagnosis_view.id</code>.
     */
    public final TableField<DiagnosisViewRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.year_of_examination</code>.
     */
    public final TableField<DiagnosisViewRecord, Double> YEAR_OF_EXAMINATION = createField("year_of_examination", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.month_of_examination</code>.
     */
    public final TableField<DiagnosisViewRecord, Double> MONTH_OF_EXAMINATION = createField("month_of_examination", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.age</code>.
     */
    public final TableField<DiagnosisViewRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.examination_type</code>.
     */
    public final TableField<DiagnosisViewRecord, String> EXAMINATION_TYPE = createField("examination_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.material</code>.
     */
    public final TableField<DiagnosisViewRecord, String> MATERIAL = createField("material", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.materialzusatz</code>.
     */
    public final TableField<DiagnosisViewRecord, String> MATERIALZUSATZ = createField("materialzusatz", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.diagnosis</code>.
     */
    public final TableField<DiagnosisViewRecord, String> DIAGNOSIS = createField("diagnosis", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.makroskopik_description</code>.
     */
    public final TableField<DiagnosisViewRecord, String> MAKROSKOPIK_DESCRIPTION = createField("makroskopik_description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.histologic_description</code>.
     */
    public final TableField<DiagnosisViewRecord, String> HISTOLOGIC_DESCRIPTION = createField("histologic_description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.frosen_section</code>.
     */
    public final TableField<DiagnosisViewRecord, String> FROSEN_SECTION = createField("frosen_section", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.molecular_pat_diagnosis</code>.
     */
    public final TableField<DiagnosisViewRecord, String> MOLECULAR_PAT_DIAGNOSIS = createField("molecular_pat_diagnosis", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.molecular_pat_description</code>.
     */
    public final TableField<DiagnosisViewRecord, String> MOLECULAR_PAT_DESCRIPTION = createField("molecular_pat_description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.g</code>.
     */
    public final TableField<DiagnosisViewRecord, String> G = createField("g", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.p</code>.
     */
    public final TableField<DiagnosisViewRecord, String> P = createField("p", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.t</code>.
     */
    public final TableField<DiagnosisViewRecord, String> T = createField("t", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.m</code>.
     */
    public final TableField<DiagnosisViewRecord, String> M = createField("m", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.n</code>.
     */
    public final TableField<DiagnosisViewRecord, String> N = createField("n", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.r</code>.
     */
    public final TableField<DiagnosisViewRecord, String> R = createField("r", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.l</code>.
     */
    public final TableField<DiagnosisViewRecord, String> L = createField("l", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.v</code>.
     */
    public final TableField<DiagnosisViewRecord, String> V = createField("v", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.pn</code>.
     */
    public final TableField<DiagnosisViewRecord, String> PN = createField("pn", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.diagnostic_code</code>.
     */
    public final TableField<DiagnosisViewRecord, String> DIAGNOSTIC_CODE = createField("diagnostic_code", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.diagnostic_code1</code>.
     */
    public final TableField<DiagnosisViewRecord, String> DIAGNOSTIC_CODE1 = createField("diagnostic_code1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.lfnr</code>.
     */
    public final TableField<DiagnosisViewRecord, String> LFNR = createField("lfnr", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.count_blocks</code>.
     */
    public final TableField<DiagnosisViewRecord, String> COUNT_BLOCKS = createField("count_blocks", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_saat.diagnosis_view.count_slides</code>.
     */
    public final TableField<DiagnosisViewRecord, String> COUNT_SLIDES = createField("count_slides", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>prostate_saat.diagnosis_view</code> table reference
     */
    public DiagnosisView() {
        this(DSL.name("diagnosis_view"), null);
    }

    /**
     * Create an aliased <code>prostate_saat.diagnosis_view</code> table reference
     */
    public DiagnosisView(String alias) {
        this(DSL.name(alias), DIAGNOSIS_VIEW);
    }

    /**
     * Create an aliased <code>prostate_saat.diagnosis_view</code> table reference
     */
    public DiagnosisView(Name alias) {
        this(alias, DIAGNOSIS_VIEW);
    }

    private DiagnosisView(Name alias, Table<DiagnosisViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private DiagnosisView(Name alias, Table<DiagnosisViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DiagnosisView(Table<O> child, ForeignKey<O, DiagnosisViewRecord> key) {
        super(child, key, DIAGNOSIS_VIEW);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ProstateSaat.PROSTATE_SAAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiagnosisView as(String alias) {
        return new DiagnosisView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiagnosisView as(Name alias) {
        return new DiagnosisView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DiagnosisView rename(String name) {
        return new DiagnosisView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DiagnosisView rename(Name name) {
        return new DiagnosisView(name, null);
    }
}
