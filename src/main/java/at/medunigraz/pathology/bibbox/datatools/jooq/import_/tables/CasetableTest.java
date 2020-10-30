/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.import_.Import;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.records.CasetableTestRecord;

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
public class CasetableTest extends TableImpl<CasetableTestRecord> {

    private static final long serialVersionUID = 1330905157;

    /**
     * The reference instance of <code>import.casetable_test</code>
     */
    public static final CasetableTest CASETABLE_TEST = new CasetableTest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CasetableTestRecord> getRecordType() {
        return CasetableTestRecord.class;
    }

    /**
     * The column <code>import.casetable_test.caseid</code>.
     */
    public final TableField<CasetableTestRecord, String> CASEID = createField("caseid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.vhistonumberid</code>.
     */
    public final TableField<CasetableTestRecord, Long> VHISTONUMBERID = createField("vhistonumberid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>import.casetable_test.vpatientid_fk</code>.
     */
    public final TableField<CasetableTestRecord, Long> VPATIENTID_FK = createField("vpatientid_fk", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>import.casetable_test.age</code>.
     */
    public final TableField<CasetableTestRecord, Short> AGE = createField("age", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>import.casetable_test.examinationtype</code>.
     */
    public final TableField<CasetableTestRecord, String> EXAMINATIONTYPE = createField("examinationtype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.examinationdate</code>.
     */
    public final TableField<CasetableTestRecord, String> EXAMINATIONDATE = createField("examinationdate", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.diagnosis</code>.
     */
    public final TableField<CasetableTestRecord, String> DIAGNOSIS = createField("diagnosis", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.organ</code>.
     */
    public final TableField<CasetableTestRecord, String> ORGAN = createField("organ", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.organzusatz</code>.
     */
    public final TableField<CasetableTestRecord, String> ORGANZUSATZ = createField("organzusatz", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.t</code>.
     */
    public final TableField<CasetableTestRecord, String> T = createField("t", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.n</code>.
     */
    public final TableField<CasetableTestRecord, String> N = createField("n", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.m</code>.
     */
    public final TableField<CasetableTestRecord, String> M = createField("m", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.g</code>.
     */
    public final TableField<CasetableTestRecord, String> G = createField("g", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.r</code>.
     */
    public final TableField<CasetableTestRecord, String> R = createField("r", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.l</code>.
     */
    public final TableField<CasetableTestRecord, String> L = createField("l", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.v</code>.
     */
    public final TableField<CasetableTestRecord, String> V = createField("v", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.caselfdnr</code>.
     */
    public final TableField<CasetableTestRecord, String> CASELFDNR = createField("caselfdnr", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.dukes</code>.
     */
    public final TableField<CasetableTestRecord, String> DUKES = createField("dukes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.stageing</code>.
     */
    public final TableField<CasetableTestRecord, String> STAGEING = createField("stageing", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>import.casetable_test.stageingreferenzid_fk</code>.
     */
    public final TableField<CasetableTestRecord, Integer> STAGEINGREFERENZID_FK = createField("stageingreferenzid_fk", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>import.casetable_test.estimatednumberofslides</code>.
     */
    public final TableField<CasetableTestRecord, Integer> ESTIMATEDNUMBEROFSLIDES = createField("estimatednumberofslides", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>import.casetable_test</code> table reference
     */
    public CasetableTest() {
        this(DSL.name("casetable_test"), null);
    }

    /**
     * Create an aliased <code>import.casetable_test</code> table reference
     */
    public CasetableTest(String alias) {
        this(DSL.name(alias), CASETABLE_TEST);
    }

    /**
     * Create an aliased <code>import.casetable_test</code> table reference
     */
    public CasetableTest(Name alias) {
        this(alias, CASETABLE_TEST);
    }

    private CasetableTest(Name alias, Table<CasetableTestRecord> aliased) {
        this(alias, aliased, null);
    }

    private CasetableTest(Name alias, Table<CasetableTestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CasetableTest(Table<O> child, ForeignKey<O, CasetableTestRecord> key) {
        super(child, key, CASETABLE_TEST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Import.IMPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CasetableTest as(String alias) {
        return new CasetableTest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CasetableTest as(Name alias) {
        return new CasetableTest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CasetableTest rename(String name) {
        return new CasetableTest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CasetableTest rename(Name name) {
        return new CasetableTest(name, null);
    }
}