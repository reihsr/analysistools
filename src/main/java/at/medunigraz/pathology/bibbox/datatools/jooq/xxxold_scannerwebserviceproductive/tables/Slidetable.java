/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.XxxoldScannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records.SlidetableRecord;

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
public class Slidetable extends TableImpl<SlidetableRecord> {

    private static final long serialVersionUID = -1467963798;

    /**
     * The reference instance of <code>xxxold_scannerwebserviceproductive.slidetable</code>
     */
    public static final Slidetable SLIDETABLE = new Slidetable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlidetableRecord> getRecordType() {
        return SlidetableRecord.class;
    }

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.slideid</code>.
     */
    public final TableField<SlidetableRecord, String> SLIDEID = createField("slideid", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.slidebarcode</code>.
     */
    public final TableField<SlidetableRecord, String> SLIDEBARCODE = createField("slidebarcode", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.slidetypeannotated</code>.
     */
    public final TableField<SlidetableRecord, String> SLIDETYPEANNOTATED = createField("slidetypeannotated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.slidetype_fk</code>.
     */
    public final TableField<SlidetableRecord, Short> SLIDETYPE_FK = createField("slidetype_fk", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.slidehistonumber</code>.
     */
    public final TableField<SlidetableRecord, String> SLIDEHISTONUMBER = createField("slidehistonumber", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.storageid_fk</code>.
     */
    public final TableField<SlidetableRecord, Short> STORAGEID_FK = createField("storageid_fk", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.slidetable.storagesubfolder</code>.
     */
    public final TableField<SlidetableRecord, String> STORAGESUBFOLDER = createField("storagesubfolder", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>xxxold_scannerwebserviceproductive.slidetable</code> table reference
     */
    public Slidetable() {
        this(DSL.name("slidetable"), null);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.slidetable</code> table reference
     */
    public Slidetable(String alias) {
        this(DSL.name(alias), SLIDETABLE);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.slidetable</code> table reference
     */
    public Slidetable(Name alias) {
        this(alias, SLIDETABLE);
    }

    private Slidetable(Name alias, Table<SlidetableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Slidetable(Name alias, Table<SlidetableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Slidetable(Table<O> child, ForeignKey<O, SlidetableRecord> key) {
        super(child, key, SLIDETABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return XxxoldScannerwebserviceproductive.XXXOLD_SCANNERWEBSERVICEPRODUCTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SLIDETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SlidetableRecord> getPrimaryKey() {
        return Keys.SLIDETABLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SlidetableRecord>> getKeys() {
        return Arrays.<UniqueKey<SlidetableRecord>>asList(Keys.SLIDETABLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Slidetable as(String alias) {
        return new Slidetable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Slidetable as(Name alias) {
        return new Slidetable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Slidetable rename(String name) {
        return new Slidetable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Slidetable rename(Name name) {
        return new Slidetable(name, null);
    }
}
