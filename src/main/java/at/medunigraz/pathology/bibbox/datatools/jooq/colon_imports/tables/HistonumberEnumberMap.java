/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.ColonImports;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.tables.records.HistonumberEnumberMapRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class HistonumberEnumberMap extends TableImpl<HistonumberEnumberMapRecord> {

    private static final long serialVersionUID = -1469238479;

    /**
     * The reference instance of <code>colon_imports.histonumber_enumber_map</code>
     */
    public static final HistonumberEnumberMap HISTONUMBER_ENUMBER_MAP = new HistonumberEnumberMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistonumberEnumberMapRecord> getRecordType() {
        return HistonumberEnumberMapRecord.class;
    }

    /**
     * The column <code>colon_imports.histonumber_enumber_map.id</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('colon_imports.histonumber_enumber_map_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.untjahr</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> UNTJAHR = createField("untjahr", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.e_number_start</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> E_NUMBER_START = createField("e_number_start", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.e_number_bis</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> E_NUMBER_BIS = createField("e_number_bis", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.vhistid</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> VHISTID = createField("vhistid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.vpatid</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> VPATID = createField("vpatid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon_imports.histonumber_enumber_map.exportid</code>.
     */
    public final TableField<HistonumberEnumberMapRecord, Integer> EXPORTID = createField("exportid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>colon_imports.histonumber_enumber_map</code> table reference
     */
    public HistonumberEnumberMap() {
        this(DSL.name("histonumber_enumber_map"), null);
    }

    /**
     * Create an aliased <code>colon_imports.histonumber_enumber_map</code> table reference
     */
    public HistonumberEnumberMap(String alias) {
        this(DSL.name(alias), HISTONUMBER_ENUMBER_MAP);
    }

    /**
     * Create an aliased <code>colon_imports.histonumber_enumber_map</code> table reference
     */
    public HistonumberEnumberMap(Name alias) {
        this(alias, HISTONUMBER_ENUMBER_MAP);
    }

    private HistonumberEnumberMap(Name alias, Table<HistonumberEnumberMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private HistonumberEnumberMap(Name alias, Table<HistonumberEnumberMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> HistonumberEnumberMap(Table<O> child, ForeignKey<O, HistonumberEnumberMapRecord> key) {
        super(child, key, HISTONUMBER_ENUMBER_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ColonImports.COLON_IMPORTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HISTONUMBER_ENUMBER_MAP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HistonumberEnumberMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HISTONUMBER_ENUMBER_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HistonumberEnumberMapRecord> getPrimaryKey() {
        return Keys.HISTONUMBER_ENUMBER_MAP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HistonumberEnumberMapRecord>> getKeys() {
        return Arrays.<UniqueKey<HistonumberEnumberMapRecord>>asList(Keys.HISTONUMBER_ENUMBER_MAP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistonumberEnumberMap as(String alias) {
        return new HistonumberEnumberMap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistonumberEnumberMap as(Name alias) {
        return new HistonumberEnumberMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HistonumberEnumberMap rename(String name) {
        return new HistonumberEnumberMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HistonumberEnumberMap rename(Name name) {
        return new HistonumberEnumberMap(name, null);
    }
}
