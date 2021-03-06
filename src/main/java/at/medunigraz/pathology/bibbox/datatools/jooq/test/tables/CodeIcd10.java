/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.Test;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.records.CodeIcd10Record;

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
public class CodeIcd10 extends TableImpl<CodeIcd10Record> {

    private static final long serialVersionUID = -237513209;

    /**
     * The reference instance of <code>test.code_icd10</code>
     */
    public static final CodeIcd10 CODE_ICD10 = new CodeIcd10();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeIcd10Record> getRecordType() {
        return CodeIcd10Record.class;
    }

    /**
     * The column <code>test.code_icd10.id</code>.
     */
    public final TableField<CodeIcd10Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.code_icd10.code</code>.
     */
    public final TableField<CodeIcd10Record, String> CODE = createField("code", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>test.code_icd10.description</code>.
     */
    public final TableField<CodeIcd10Record, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>test.code_icd10.INKLUSIVA</code>.
     */
    public final TableField<CodeIcd10Record, String> INKLUSIVA = createField("INKLUSIVA", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>test.code_icd10.EXKLUSIVA</code>.
     */
    public final TableField<CodeIcd10Record, String> EXKLUSIVA = createField("EXKLUSIVA", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>test.code_icd10.TYPE</code>.
     */
    public final TableField<CodeIcd10Record, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>test.code_icd10.USED</code>.
     */
    public final TableField<CodeIcd10Record, Double> USED = createField("USED", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>test.code_icd10.FROM_CODE</code>.
     */
    public final TableField<CodeIcd10Record, String> FROM_CODE = createField("FROM_CODE", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>test.code_icd10.TO_CODE</code>.
     */
    public final TableField<CodeIcd10Record, String> TO_CODE = createField("TO_CODE", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * Create a <code>test.code_icd10</code> table reference
     */
    public CodeIcd10() {
        this(DSL.name("code_icd10"), null);
    }

    /**
     * Create an aliased <code>test.code_icd10</code> table reference
     */
    public CodeIcd10(String alias) {
        this(DSL.name(alias), CODE_ICD10);
    }

    /**
     * Create an aliased <code>test.code_icd10</code> table reference
     */
    public CodeIcd10(Name alias) {
        this(alias, CODE_ICD10);
    }

    private CodeIcd10(Name alias, Table<CodeIcd10Record> aliased) {
        this(alias, aliased, null);
    }

    private CodeIcd10(Name alias, Table<CodeIcd10Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CodeIcd10(Table<O> child, ForeignKey<O, CodeIcd10Record> key) {
        super(child, key, CODE_ICD10);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeIcd10 as(String alias) {
        return new CodeIcd10(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeIcd10 as(Name alias) {
        return new CodeIcd10(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeIcd10 rename(String name) {
        return new CodeIcd10(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeIcd10 rename(Name name) {
        return new CodeIcd10(name, null);
    }
}
