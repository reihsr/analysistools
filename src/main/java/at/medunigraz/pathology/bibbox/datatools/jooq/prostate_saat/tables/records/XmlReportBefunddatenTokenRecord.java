/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.XmlReportBefunddatenToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class XmlReportBefunddatenTokenRecord extends UpdatableRecordImpl<XmlReportBefunddatenTokenRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 840346717;

    /**
     * Setter for <code>prostate_saat.xml_report_befunddaten_token.xml_report_befunddaten_id</code>.
     */
    public void setXmlReportBefunddatenId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prostate_saat.xml_report_befunddaten_token.xml_report_befunddaten_id</code>.
     */
    public Integer getXmlReportBefunddatenId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prostate_saat.xml_report_befunddaten_token.token</code>.
     */
    public void setToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>prostate_saat.xml_report_befunddaten_token.token</code>.
     */
    public String getToken() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN.XML_REPORT_BEFUNDDATEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getXmlReportBefunddatenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getXmlReportBefunddatenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlReportBefunddatenTokenRecord value1(Integer value) {
        setXmlReportBefunddatenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlReportBefunddatenTokenRecord value2(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlReportBefunddatenTokenRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XmlReportBefunddatenTokenRecord
     */
    public XmlReportBefunddatenTokenRecord() {
        super(XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN);
    }

    /**
     * Create a detached, initialised XmlReportBefunddatenTokenRecord
     */
    public XmlReportBefunddatenTokenRecord(Integer xmlReportBefunddatenId, String token) {
        super(XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN);

        set(0, xmlReportBefunddatenId);
        set(1, token);
    }
}
