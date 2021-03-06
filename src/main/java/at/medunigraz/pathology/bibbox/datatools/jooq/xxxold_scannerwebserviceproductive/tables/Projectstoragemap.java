/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.XxxoldScannerwebserviceproductive;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.records.ProjectstoragemapRecord;

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
public class Projectstoragemap extends TableImpl<ProjectstoragemapRecord> {

    private static final long serialVersionUID = -548477618;

    /**
     * The reference instance of <code>xxxold_scannerwebserviceproductive.projectstoragemap</code>
     */
    public static final Projectstoragemap PROJECTSTORAGEMAP = new Projectstoragemap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectstoragemapRecord> getRecordType() {
        return ProjectstoragemapRecord.class;
    }

    /**
     * The column <code>xxxold_scannerwebserviceproductive.projectstoragemap.projectid_fk</code>.
     */
    public final TableField<ProjectstoragemapRecord, Integer> PROJECTID_FK = createField("projectid_fk", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.projectstoragemap.storageid_fk</code>.
     */
    public final TableField<ProjectstoragemapRecord, Integer> STORAGEID_FK = createField("storageid_fk", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>xxxold_scannerwebserviceproductive.projectstoragemap.isdefaultstorage</code>.
     */
    public final TableField<ProjectstoragemapRecord, Boolean> ISDEFAULTSTORAGE = createField("isdefaultstorage", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>xxxold_scannerwebserviceproductive.projectstoragemap</code> table reference
     */
    public Projectstoragemap() {
        this(DSL.name("projectstoragemap"), null);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.projectstoragemap</code> table reference
     */
    public Projectstoragemap(String alias) {
        this(DSL.name(alias), PROJECTSTORAGEMAP);
    }

    /**
     * Create an aliased <code>xxxold_scannerwebserviceproductive.projectstoragemap</code> table reference
     */
    public Projectstoragemap(Name alias) {
        this(alias, PROJECTSTORAGEMAP);
    }

    private Projectstoragemap(Name alias, Table<ProjectstoragemapRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projectstoragemap(Name alias, Table<ProjectstoragemapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Projectstoragemap(Table<O> child, ForeignKey<O, ProjectstoragemapRecord> key) {
        super(child, key, PROJECTSTORAGEMAP);
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
    public Projectstoragemap as(String alias) {
        return new Projectstoragemap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Projectstoragemap as(Name alias) {
        return new Projectstoragemap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Projectstoragemap rename(String name) {
        return new Projectstoragemap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Projectstoragemap rename(Name name) {
        return new Projectstoragemap(name, null);
    }
}
