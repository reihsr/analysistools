/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.ProstateGoogle;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.records.ProstateCasesRecord;

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
public class ProstateCases extends TableImpl<ProstateCasesRecord> {

    private static final long serialVersionUID = 35242487;

    /**
     * The reference instance of <code>prostate_google.prostate_cases</code>
     */
    public static final ProstateCases PROSTATE_CASES = new ProstateCases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProstateCasesRecord> getRecordType() {
        return ProstateCasesRecord.class;
    }

    /**
     * The column <code>prostate_google.prostate_cases.vhistonumberid</code>.
     */
    public final TableField<ProstateCasesRecord, Long> VHISTONUMBERID = createField("vhistonumberid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.gewinnungsart</code>.
     */
    public final TableField<ProstateCasesRecord, String> GEWINNUNGSART = createField("gewinnungsart", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.eingangsdatum</code>.
     */
    public final TableField<ProstateCasesRecord, Date> EINGANGSDATUM = createField("eingangsdatum", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.material</code>.
     */
    public final TableField<ProstateCasesRecord, String> MATERIAL = createField("material", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.materialzusatz</code>.
     */
    public final TableField<ProstateCasesRecord, String> MATERIALZUSATZ = createField("materialzusatz", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.t</code>.
     */
    public final TableField<ProstateCasesRecord, String> T = createField("t", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.n</code>.
     */
    public final TableField<ProstateCasesRecord, String> N = createField("n", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.age</code>.
     */
    public final TableField<ProstateCasesRecord, Short> AGE = createField("age", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.survivalindays</code>.
     */
    public final TableField<ProstateCasesRecord, Integer> SURVIVALINDAYS = createField("survivalindays", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.status</code>.
     */
    public final TableField<ProstateCasesRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.stage</code>.
     */
    public final TableField<ProstateCasesRecord, String> STAGE = createField("stage", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.diagnose</code>.
     */
    public final TableField<ProstateCasesRecord, String> DIAGNOSE = createField("diagnose", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.makroskopiebeschreibung</code>.
     */
    public final TableField<ProstateCasesRecord, String> MAKROSKOPIEBESCHREIBUNG = createField("makroskopiebeschreibung", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.histologiebeschreibung</code>.
     */
    public final TableField<ProstateCasesRecord, String> HISTOLOGIEBESCHREIBUNG = createField("histologiebeschreibung", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.mikroskopiebeschreibung</code>.
     */
    public final TableField<ProstateCasesRecord, String> MIKROSKOPIEBESCHREIBUNG = createField("mikroskopiebeschreibung", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.mpbeschreibung</code>.
     */
    public final TableField<ProstateCasesRecord, String> MPBESCHREIBUNG = createField("mpbeschreibung", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.schnellschnittdiagnose</code>.
     */
    public final TableField<ProstateCasesRecord, String> SCHNELLSCHNITTDIAGNOSE = createField("schnellschnittdiagnose", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>prostate_google.prostate_cases.mpdiagnose</code>.
     */
    public final TableField<ProstateCasesRecord, String> MPDIAGNOSE = createField("mpdiagnose", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>prostate_google.prostate_cases</code> table reference
     */
    public ProstateCases() {
        this(DSL.name("prostate_cases"), null);
    }

    /**
     * Create an aliased <code>prostate_google.prostate_cases</code> table reference
     */
    public ProstateCases(String alias) {
        this(DSL.name(alias), PROSTATE_CASES);
    }

    /**
     * Create an aliased <code>prostate_google.prostate_cases</code> table reference
     */
    public ProstateCases(Name alias) {
        this(alias, PROSTATE_CASES);
    }

    private ProstateCases(Name alias, Table<ProstateCasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProstateCases(Name alias, Table<ProstateCasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ProstateCases(Table<O> child, ForeignKey<O, ProstateCasesRecord> key) {
        super(child, key, PROSTATE_CASES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ProstateGoogle.PROSTATE_GOOGLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProstateCases as(String alias) {
        return new ProstateCases(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProstateCases as(Name alias) {
        return new ProstateCases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProstateCases rename(String name) {
        return new ProstateCases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProstateCases rename(Name name) {
        return new ProstateCases(name, null);
    }
}