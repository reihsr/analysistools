/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.TypetableRecord;

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
public class Typetable extends TableImpl<TypetableRecord> {

    private static final long serialVersionUID = 616592538;

    /**
     * The reference instance of <code>scannerwebserviceproductive.typetable</code>
     */
    public static final Typetable TYPETABLE = new Typetable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypetableRecord> getRecordType() {
        return TypetableRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.typetable.typeid</code>.
     */
    public final TableField<TypetableRecord, Integer> TYPEID = createField("typeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typerex</code>.
     */
    public final TableField<TypetableRecord, String> TYPEREX = createField("typerex", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typeshortvalue</code>.
     */
    public final TableField<TypetableRecord, String> TYPESHORTVALUE = createField("typeshortvalue", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typedescription</code>.
     */
    public final TableField<TypetableRecord, String> TYPEDESCRIPTION = createField("typedescription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typelisted</code>.
     */
    public final TableField<TypetableRecord, Boolean> TYPELISTED = createField("typelisted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typelocalsisation</code>.
     */
    public final TableField<TypetableRecord, String> TYPELOCALSISATION = createField("typelocalsisation", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.typetable.typematerialembeded</code>.
     */
    public final TableField<TypetableRecord, String> TYPEMATERIALEMBEDED = createField("typematerialembeded", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>scannerwebserviceproductive.typetable</code> table reference
     */
    public Typetable() {
        this(DSL.name("typetable"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.typetable</code> table reference
     */
    public Typetable(String alias) {
        this(DSL.name(alias), TYPETABLE);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.typetable</code> table reference
     */
    public Typetable(Name alias) {
        this(alias, TYPETABLE);
    }

    private Typetable(Name alias, Table<TypetableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Typetable(Name alias, Table<TypetableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Typetable(Table<O> child, ForeignKey<O, TypetableRecord> key) {
        super(child, key, TYPETABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Scannerwebserviceproductive.SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TYPETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TypetableRecord> getPrimaryKey() {
        return Keys.TYPETABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TypetableRecord>> getKeys() {
        return Arrays.<UniqueKey<TypetableRecord>>asList(Keys.TYPETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Typetable as(String alias) {
        return new Typetable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Typetable as(Name alias) {
        return new Typetable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Typetable rename(String name) {
        return new Typetable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Typetable rename(Name name) {
        return new Typetable(name, null);
    }
}
