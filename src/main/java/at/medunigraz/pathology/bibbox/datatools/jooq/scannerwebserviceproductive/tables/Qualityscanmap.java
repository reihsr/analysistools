/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.Scannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.QualityscanmapRecord;

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
public class Qualityscanmap extends TableImpl<QualityscanmapRecord> {

    private static final long serialVersionUID = -2096285288;

    /**
     * The reference instance of <code>scannerwebserviceproductive.qualityscanmap</code>
     */
    public static final Qualityscanmap QUALITYSCANMAP = new Qualityscanmap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QualityscanmapRecord> getRecordType() {
        return QualityscanmapRecord.class;
    }

    /**
     * The column <code>scannerwebserviceproductive.qualityscanmap.scanid_fk</code>.
     */
    public final TableField<QualityscanmapRecord, String> SCANID_FK = createField("scanid_fk", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>scannerwebserviceproductive.qualityscanmap.qualityid_fk</code>.
     */
    public final TableField<QualityscanmapRecord, Integer> QUALITYID_FK = createField("qualityid_fk", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>scannerwebserviceproductive.qualityscanmap.qualityprocessed</code>.
     */
    public final TableField<QualityscanmapRecord, Short> QUALITYPROCESSED = createField("qualityprocessed", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>scannerwebserviceproductive.qualityscanmap</code> table reference
     */
    public Qualityscanmap() {
        this(DSL.name("qualityscanmap"), null);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.qualityscanmap</code> table reference
     */
    public Qualityscanmap(String alias) {
        this(DSL.name(alias), QUALITYSCANMAP);
    }

    /**
     * Create an aliased <code>scannerwebserviceproductive.qualityscanmap</code> table reference
     */
    public Qualityscanmap(Name alias) {
        this(alias, QUALITYSCANMAP);
    }

    private Qualityscanmap(Name alias, Table<QualityscanmapRecord> aliased) {
        this(alias, aliased, null);
    }

    private Qualityscanmap(Name alias, Table<QualityscanmapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Qualityscanmap(Table<O> child, ForeignKey<O, QualityscanmapRecord> key) {
        super(child, key, QUALITYSCANMAP);
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
    public Qualityscanmap as(String alias) {
        return new Qualityscanmap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Qualityscanmap as(Name alias) {
        return new Qualityscanmap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualityscanmap rename(String name) {
        return new Qualityscanmap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualityscanmap rename(Name name) {
        return new Qualityscanmap(name, null);
    }
}