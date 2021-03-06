/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.colon.tables;


import at.medunigraz.pathology.bibbox.datatools.jooq.colon.Colon;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon.Indexes;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon.Keys;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon.tables.records.XmlReportBefunddatenRecord;

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
public class XmlReportBefunddaten extends TableImpl<XmlReportBefunddatenRecord> {

    private static final long serialVersionUID = -1559465723;

    /**
     * The reference instance of <code>colon.xml_report_befunddaten</code>
     */
    public static final XmlReportBefunddaten XML_REPORT_BEFUNDDATEN = new XmlReportBefunddaten();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XmlReportBefunddatenRecord> getRecordType() {
        return XmlReportBefunddatenRecord.class;
    }

    /**
     * The column <code>colon.xml_report_befunddaten.id</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('colon.xml_report_befunddaten_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.EINGANGSDATUM1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, Date> EINGANGSDATUM1 = createField("EINGANGSDATUM1", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.ALTERPAT1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, Integer> ALTERPAT1 = createField("ALTERPAT1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.EINSENDER1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> EINSENDER1 = createField("EINSENDER1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.GEWINNUNGSART1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> GEWINNUNGSART1 = createField("GEWINNUNGSART1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MATERIAL1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MATERIAL1 = createField("MATERIAL1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MATERIALZUSATZ1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MATERIALZUSATZ1 = createField("MATERIALZUSATZ1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MAKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MAKROSKOPISCHEBESCHREIBUNG1 = createField("MAKROSKOPISCHEBESCHREIBUNG1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.HISTOLOGISCHEBESCHREIBUNG1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> HISTOLOGISCHEBESCHREIBUNG1 = createField("HISTOLOGISCHEBESCHREIBUNG1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MIKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MIKROSKOPISCHEBESCHREIBUNG1 = createField("MIKROSKOPISCHEBESCHREIBUNG1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MPBESCHREIBUNG1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MPBESCHREIBUNG1 = createField("MPBESCHREIBUNG1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.SCHNELLSCHNITTDIAGNOSE1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> SCHNELLSCHNITTDIAGNOSE1 = createField("SCHNELLSCHNITTDIAGNOSE1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.MPDIAGNOSE1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> MPDIAGNOSE1 = createField("MPDIAGNOSE1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.DIAGNOSE1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> DIAGNOSE1 = createField("DIAGNOSE1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.GRAD1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> GRAD1 = createField("GRAD1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMP1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMP1 = createField("TNMP1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMT1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMT1 = createField("TNMT1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMM1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMM1 = createField("TNMM1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMN1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMN1 = createField("TNMN1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMR1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMR1 = createField("TNMR1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNML1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNML1 = createField("TNML1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMV1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMV1 = createField("TNMV1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.TNMPN1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> TNMPN1 = createField("TNMPN1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.DGCODE11</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> DGCODE11 = createField("DGCODE11", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.DGCODE21</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> DGCODE21 = createField("DGCODE21", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.KOMMENTAR1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> KOMMENTAR1 = createField("KOMMENTAR1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.BEFUNDER11</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> BEFUNDER11 = createField("BEFUNDER11", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.BEFUNDER21</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> BEFUNDER21 = createField("BEFUNDER21", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.VIDIT11</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> VIDIT11 = createField("VIDIT11", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.VIDIT21</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> VIDIT21 = createField("VIDIT21", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.BEFUNDSTATUS1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> BEFUNDSTATUS1 = createField("BEFUNDSTATUS1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.ABSCHLUSSDATUM1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> ABSCHLUSSDATUM1 = createField("ABSCHLUSSDATUM1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.VPATID1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> VPATID1 = createField("VPATID1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.VHISTID1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> VHISTID1 = createField("VHISTID1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.BEFUNDLFDNR1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> BEFUNDLFDNR1 = createField("BEFUNDLFDNR1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.ANZBL1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> ANZBL1 = createField("ANZBL1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.ANZOT1</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> ANZOT1 = createField("ANZOT1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.file</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.vpatid_extended</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, Long> VPATID_EXTENDED = createField("vpatid_extended", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>colon.xml_report_befunddaten.vhistid_extended</code>.
     */
    public final TableField<XmlReportBefunddatenRecord, Long> VHISTID_EXTENDED = createField("vhistid_extended", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>colon.xml_report_befunddaten</code> table reference
     */
    public XmlReportBefunddaten() {
        this(DSL.name("xml_report_befunddaten"), null);
    }

    /**
     * Create an aliased <code>colon.xml_report_befunddaten</code> table reference
     */
    public XmlReportBefunddaten(String alias) {
        this(DSL.name(alias), XML_REPORT_BEFUNDDATEN);
    }

    /**
     * Create an aliased <code>colon.xml_report_befunddaten</code> table reference
     */
    public XmlReportBefunddaten(Name alias) {
        this(alias, XML_REPORT_BEFUNDDATEN);
    }

    private XmlReportBefunddaten(Name alias, Table<XmlReportBefunddatenRecord> aliased) {
        this(alias, aliased, null);
    }

    private XmlReportBefunddaten(Name alias, Table<XmlReportBefunddatenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> XmlReportBefunddaten(Table<O> child, ForeignKey<O, XmlReportBefunddatenRecord> key) {
        super(child, key, XML_REPORT_BEFUNDDATEN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Colon.COLON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COLON_XML_REPORT_BEFUNDDATEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<XmlReportBefunddatenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_XML_REPORT_BEFUNDDATEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XmlReportBefunddatenRecord> getPrimaryKey() {
        return Keys.COLON_XML_REPORT_BEFUNDDATEN_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XmlReportBefunddatenRecord>> getKeys() {
        return Arrays.<UniqueKey<XmlReportBefunddatenRecord>>asList(Keys.COLON_XML_REPORT_BEFUNDDATEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlReportBefunddaten as(String alias) {
        return new XmlReportBefunddaten(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlReportBefunddaten as(Name alias) {
        return new XmlReportBefunddaten(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XmlReportBefunddaten rename(String name) {
        return new XmlReportBefunddaten(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XmlReportBefunddaten rename(Name name) {
        return new XmlReportBefunddaten(name, null);
    }
}
