/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Public;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.DictionaryInstituteRulesRecord;

import java.sql.Date;
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
public class DictionaryInstituteRules extends TableImpl<DictionaryInstituteRulesRecord> {

    private static final long serialVersionUID = -351871998;

    /**
     * The reference instance of <code>public.dictionary_institute_rules</code>
     */
    public static final DictionaryInstituteRules DICTIONARY_INSTITUTE_RULES = new DictionaryInstituteRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictionaryInstituteRulesRecord> getRecordType() {
        return DictionaryInstituteRulesRecord.class;
    }

    /**
     * The column <code>public.dictionary_institute_rules.id</code>.
     */
    public final TableField<DictionaryInstituteRulesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dictionary_institute_rules_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.dictionary_institute_rules.dictionary2_dictionary2_addiction_link_id</code>.
     */
    public final TableField<DictionaryInstituteRulesRecord, Integer> DICTIONARY2_DICTIONARY2_ADDICTION_LINK_ID = createField("dictionary2_dictionary2_addiction_link_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.dictionary_institute_rules.institute</code>.
     */
    public final TableField<DictionaryInstituteRulesRecord, String> INSTITUTE = createField("institute", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.dictionary_institute_rules.institute_id</code>.
     */
    public final TableField<DictionaryInstituteRulesRecord, Integer> INSTITUTE_ID = createField("institute_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.dictionary_institute_rules.date</code>.
     */
    public final TableField<DictionaryInstituteRulesRecord, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.dictionary_institute_rules</code> table reference
     */
    public DictionaryInstituteRules() {
        this(DSL.name("dictionary_institute_rules"), null);
    }

    /**
     * Create an aliased <code>public.dictionary_institute_rules</code> table reference
     */
    public DictionaryInstituteRules(String alias) {
        this(DSL.name(alias), DICTIONARY_INSTITUTE_RULES);
    }

    /**
     * Create an aliased <code>public.dictionary_institute_rules</code> table reference
     */
    public DictionaryInstituteRules(Name alias) {
        this(alias, DICTIONARY_INSTITUTE_RULES);
    }

    private DictionaryInstituteRules(Name alias, Table<DictionaryInstituteRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictionaryInstituteRules(Name alias, Table<DictionaryInstituteRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DictionaryInstituteRules(Table<O> child, ForeignKey<O, DictionaryInstituteRulesRecord> key) {
        super(child, key, DICTIONARY_INSTITUTE_RULES);
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
        return Arrays.<Index>asList(Indexes.DICTIONARY_INSTITUTE_RULES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictionaryInstituteRulesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DICTIONARY_INSTITUTE_RULES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictionaryInstituteRulesRecord> getPrimaryKey() {
        return Keys.DICTIONARY_INSTITUTE_RULES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictionaryInstituteRulesRecord>> getKeys() {
        return Arrays.<UniqueKey<DictionaryInstituteRulesRecord>>asList(Keys.DICTIONARY_INSTITUTE_RULES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRules as(String alias) {
        return new DictionaryInstituteRules(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictionaryInstituteRules as(Name alias) {
        return new DictionaryInstituteRules(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictionaryInstituteRules rename(String name) {
        return new DictionaryInstituteRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictionaryInstituteRules rename(Name name) {
        return new DictionaryInstituteRules(name, null);
    }
}
