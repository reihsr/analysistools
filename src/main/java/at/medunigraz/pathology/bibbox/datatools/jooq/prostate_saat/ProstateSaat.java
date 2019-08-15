/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.DiagnosisView;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.GleasonDiagnosisView;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.XmlReportBefunddatenGleason;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.XmlReportBefunddatenToken;

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
public class ProstateSaat extends SchemaImpl {

    private static final long serialVersionUID = 310990353;

    /**
     * The reference instance of <code>prostate_saat</code>
     */
    public static final ProstateSaat PROSTATE_SAAT = new ProstateSaat();

    /**
     * The table <code>prostate_saat.diagnosis_view</code>.
     */
    public final DiagnosisView DIAGNOSIS_VIEW = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.DiagnosisView.DIAGNOSIS_VIEW;

    /**
     * The table <code>prostate_saat.gleason_diagnosis_view</code>.
     */
    public final GleasonDiagnosisView GLEASON_DIAGNOSIS_VIEW = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.GleasonDiagnosisView.GLEASON_DIAGNOSIS_VIEW;

    /**
     * The table <code>prostate_saat.xml_report_befunddaten_gleason</code>.
     */
    public final XmlReportBefunddatenGleason XML_REPORT_BEFUNDDATEN_GLEASON = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.XmlReportBefunddatenGleason.XML_REPORT_BEFUNDDATEN_GLEASON;

    /**
     * The table <code>prostate_saat.xml_report_befunddaten_token</code>.
     */
    public final XmlReportBefunddatenToken XML_REPORT_BEFUNDDATEN_TOKEN = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_saat.tables.XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN;

    /**
     * No further instances allowed
     */
    private ProstateSaat() {
        super("prostate_saat", null);
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
            Sequences.XML_REPORT_BEFUNDDATEN_GLEASO_XML_REPORT_BEFUNDDATEN_GLEASO_SEQ,
            Sequences.XML_REPORT_BEFUNDDATEN_TOKEN_XML_REPORT_BEFUNDDATEN_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            DiagnosisView.DIAGNOSIS_VIEW,
            GleasonDiagnosisView.GLEASON_DIAGNOSIS_VIEW,
            XmlReportBefunddatenGleason.XML_REPORT_BEFUNDDATEN_GLEASON,
            XmlReportBefunddatenToken.XML_REPORT_BEFUNDDATEN_TOKEN);
    }
}
