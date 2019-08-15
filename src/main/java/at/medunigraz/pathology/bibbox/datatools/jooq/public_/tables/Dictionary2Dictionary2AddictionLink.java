/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Public;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.Dictionary2Dictionary2AddictionLinkRecord;

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
public class Dictionary2Dictionary2AddictionLink extends TableImpl<Dictionary2Dictionary2AddictionLinkRecord> {

    private static final long serialVersionUID = -1274525091;

    /**
     * The reference instance of <code>public.dictionary2_dictionary2_addiction_link</code>
     */
    public static final Dictionary2Dictionary2AddictionLink DICTIONARY2_DICTIONARY2_ADDICTION_LINK = new Dictionary2Dictionary2AddictionLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Dictionary2Dictionary2AddictionLinkRecord> getRecordType() {
        return Dictionary2Dictionary2AddictionLinkRecord.class;
    }

    /**
     * The column <code>public.dictionary2_dictionary2_addiction_link.id</code>.
     */
    public final TableField<Dictionary2Dictionary2AddictionLinkRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dictionary2_dictionary2_addiction_link_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.dictionary2_dictionary2_addiction_link.dictionary_id</code>.
     */
    public final TableField<Dictionary2Dictionary2AddictionLinkRecord, Integer> DICTIONARY_ID = createField("dictionary_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.dictionary2_dictionary2_addiction_link.addiction_id</code>.
     */
    public final TableField<Dictionary2Dictionary2AddictionLinkRecord, Integer> ADDICTION_ID = createField("addiction_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.dictionary2_dictionary2_addiction_link</code> table reference
     */
    public Dictionary2Dictionary2AddictionLink() {
        this(DSL.name("dictionary2_dictionary2_addiction_link"), null);
    }

    /**
     * Create an aliased <code>public.dictionary2_dictionary2_addiction_link</code> table reference
     */
    public Dictionary2Dictionary2AddictionLink(String alias) {
        this(DSL.name(alias), DICTIONARY2_DICTIONARY2_ADDICTION_LINK);
    }

    /**
     * Create an aliased <code>public.dictionary2_dictionary2_addiction_link</code> table reference
     */
    public Dictionary2Dictionary2AddictionLink(Name alias) {
        this(alias, DICTIONARY2_DICTIONARY2_ADDICTION_LINK);
    }

    private Dictionary2Dictionary2AddictionLink(Name alias, Table<Dictionary2Dictionary2AddictionLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dictionary2Dictionary2AddictionLink(Name alias, Table<Dictionary2Dictionary2AddictionLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Dictionary2Dictionary2AddictionLink(Table<O> child, ForeignKey<O, Dictionary2Dictionary2AddictionLinkRecord> key) {
        super(child, key, DICTIONARY2_DICTIONARY2_ADDICTION_LINK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK, Indexes.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Dictionary2Dictionary2AddictionLinkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DICTIONARY2_DICTIONARY2_ADDICTION_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Dictionary2Dictionary2AddictionLinkRecord> getPrimaryKey() {
        return Keys.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Dictionary2Dictionary2AddictionLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<Dictionary2Dictionary2AddictionLinkRecord>>asList(Keys.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK, Keys.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLink as(String alias) {
        return new Dictionary2Dictionary2AddictionLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary2Dictionary2AddictionLink as(Name alias) {
        return new Dictionary2Dictionary2AddictionLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary2Dictionary2AddictionLink rename(String name) {
        return new Dictionary2Dictionary2AddictionLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary2Dictionary2AddictionLink rename(Name name) {
        return new Dictionary2Dictionary2AddictionLink(name, null);
    }
}