/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.Xxx20200705Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records.StagingreferenzRecord;

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
public class Stagingreferenz extends TableImpl<StagingreferenzRecord> {

    private static final long serialVersionUID = -1050343153;

    /**
     * The reference instance of <code>xxx20200705_scannerwebserviceproductive.stagingreferenz</code>
     */
    public static final Stagingreferenz STAGINGREFERENZ = new Stagingreferenz();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StagingreferenzRecord> getRecordType() {
        return StagingreferenzRecord.class;
    }

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.stageingreferenzid</code>.
     */
    public final TableField<StagingreferenzRecord, Integer> STAGEINGREFERENZID = createField("stageingreferenzid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.referenzname</code>.
     */
    public final TableField<StagingreferenzRecord, String> REFERENZNAME = createField("referenzname", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.referenzversion</code>.
     */
    public final TableField<StagingreferenzRecord, String> REFERENZVERSION = createField("referenzversion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.shortdiscription</code>.
     */
    public final TableField<StagingreferenzRecord, String> SHORTDISCRIPTION = createField("shortdiscription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.referenzurl</code>.
     */
    public final TableField<StagingreferenzRecord, String> REFERENZURL = createField("referenzurl", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.referenzdiscription</code>.
     */
    public final TableField<StagingreferenzRecord, String> REFERENZDISCRIPTION = createField("referenzdiscription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>xxx20200705_scannerwebserviceproductive.stagingreferenz.referenzsql</code>.
     */
    public final TableField<StagingreferenzRecord, String> REFERENZSQL = createField("referenzsql", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>xxx20200705_scannerwebserviceproductive.stagingreferenz</code> table reference
     */
    public Stagingreferenz() {
        this(DSL.name("stagingreferenz"), null);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.stagingreferenz</code> table reference
     */
    public Stagingreferenz(String alias) {
        this(DSL.name(alias), STAGINGREFERENZ);
    }

    /**
     * Create an aliased <code>xxx20200705_scannerwebserviceproductive.stagingreferenz</code> table reference
     */
    public Stagingreferenz(Name alias) {
        this(alias, STAGINGREFERENZ);
    }

    private Stagingreferenz(Name alias, Table<StagingreferenzRecord> aliased) {
        this(alias, aliased, null);
    }

    private Stagingreferenz(Name alias, Table<StagingreferenzRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Stagingreferenz(Table<O> child, ForeignKey<O, StagingreferenzRecord> key) {
        super(child, key, STAGINGREFERENZ);
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
        return Arrays.<Index>asList(Indexes.STAGINGREFERENZ_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StagingreferenzRecord> getPrimaryKey() {
        return Keys.STAGINGREFERENZ_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StagingreferenzRecord>> getKeys() {
        return Arrays.<UniqueKey<StagingreferenzRecord>>asList(Keys.STAGINGREFERENZ_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stagingreferenz as(String alias) {
        return new Stagingreferenz(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stagingreferenz as(Name alias) {
        return new Stagingreferenz(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Stagingreferenz rename(String name) {
        return new Stagingreferenz(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Stagingreferenz rename(Name name) {
        return new Stagingreferenz(name, null);
    }
}