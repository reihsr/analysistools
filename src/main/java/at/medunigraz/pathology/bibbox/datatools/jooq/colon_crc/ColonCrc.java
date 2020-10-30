/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.colon_crc;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_crc.tables.AdoptScannFiles;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_crc.tables.XmlReportBefunddaten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class ColonCrc extends SchemaImpl {

    private static final long serialVersionUID = 223558358;

    /**
     * The reference instance of <code>colon_crc</code>
     */
    public static final ColonCrc COLON_CRC = new ColonCrc();

    /**
     * The table <code>colon_crc.adopt_scann_files</code>.
     */
    public final AdoptScannFiles ADOPT_SCANN_FILES = at.medunigraz.pathology.bibbox.datatools.jooq.colon_crc.tables.AdoptScannFiles.ADOPT_SCANN_FILES;

    /**
     * The table <code>colon_crc.xml_report_befunddaten</code>.
     */
    public final XmlReportBefunddaten XML_REPORT_BEFUNDDATEN = at.medunigraz.pathology.bibbox.datatools.jooq.colon_crc.tables.XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN;

    /**
     * No further instances allowed
     */
    private ColonCrc() {
        super("colon_crc", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.XML_REPORT_BEFUNDDATEN_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AdoptScannFiles.ADOPT_SCANN_FILES,
            XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN);
    }
}