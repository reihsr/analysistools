/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Xxx20200705Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records.QualitytableRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Qualitytable extends TableImpl<QualitytableRecord> {

    private static final long serialVersionUID = 1804163670;

    /**
     * The reference instance of <code>xxx20200705_scannerwebserviceproductive.qualitytable</code>
     */
    public static final Qualitytable QUALITYTABLE = new Qualitytable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QualitytableRecord> getRecordType() {
        return QualitytableRecord.class;
    }

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.qualitytable.qualityid</code>.
     */
    public final TableField<QualitytableRecord, Integer> QUALITYID = createField("qualityid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.qualitytable.qualitydescription</code>.
     */
    public final TableField<QualitytableRecord, String> QUALITYDESCRIPTION = createField("qualitydescription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.qualitytable.qualityissuelisted</code>.
     */
    public final TableField<QualitytableRecord, Boolean> QUALITYISSUELISTED = createField("qualityissuelisted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>xxx20200705_scannerwebserviceproductive.qualitytable</code> table reference
     */
    public Qualitytable() {
        this(DSL.name("qualitytable"), null);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.qualitytable</code> table reference
     */
    public Qualitytable(String alias) {
        this(DSL.name(alias), QUALITYTABLE);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.qualitytable</code> table reference
     */
    public Qualitytable(Name alias) {
        this(alias, QUALITYTABLE);
    }

    private Qualitytable(Name alias, Table<QualitytableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Qualitytable(Name alias, Table<QualitytableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Qualitytable(Table<O> child, ForeignKey<O, QualitytableRecord> key) {
        super(child, key, QUALITYTABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Xxx20200705Scannerwebserviceproductive.XXX20200705_SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QUALITYTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<QualitytableRecord> getPrimaryKey() {
        return Keys.QUALITYTABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QualitytableRecord>> getKeys() {
        return Arrays.<UniqueKey<QualitytableRecord>>asList(Keys.QUALITYTABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Qualitytable as(String alias) {
        return new Qualitytable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Qualitytable as(Name alias) {
        return new Qualitytable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualitytable rename(String name) {
        return new Qualitytable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualitytable rename(Name name) {
        return new Qualitytable(name, null);
    }
}
