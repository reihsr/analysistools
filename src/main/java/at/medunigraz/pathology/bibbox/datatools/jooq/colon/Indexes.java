/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.colon;


import at.medunigraz.pathology.bibbox.datatools.jooq.colon.tables.XlsxStatistikAustria;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon.tables.XmlReportBefunddaten;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon.tables.XmlReportKloezel;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>colon</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index XLSX_STATISTIK_AUSTRIA_PKEY = Indexes0.XLSX_STATISTIK_AUSTRIA_PKEY;
    public static final Index COLON_XML_REPORT_BEFUNDDATEN_PKEY = Indexes0.COLON_XML_REPORT_BEFUNDDATEN_PKEY;
    public static final Index COLON_XML_REPORT_KLOEZEL_ID_PKEY = Indexes0.COLON_XML_REPORT_KLOEZEL_ID_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index XLSX_STATISTIK_AUSTRIA_PKEY = Internal.createIndex("xlsx_statistik_austria_pkey", XlsxStatistikAustria.XLSX_STATISTIK_AUSTRIA, new OrderField[] { XlsxStatistikAustria.XLSX_STATISTIK_AUSTRIA.ID }, true);
        public static Index COLON_XML_REPORT_BEFUNDDATEN_PKEY = Internal.createIndex("colon_xml_report_befunddaten_pkey", XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN, new OrderField[] { XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN.ID }, true);
        public static Index COLON_XML_REPORT_KLOEZEL_ID_PKEY = Internal.createIndex("colon_xml_report_kloezel_id_pkey", XmlReportKloezel.XML_REPORT_KLOEZEL, new OrderField[] { XmlReportKloezel.XML_REPORT_KLOEZEL.ID }, true);
    }
}
