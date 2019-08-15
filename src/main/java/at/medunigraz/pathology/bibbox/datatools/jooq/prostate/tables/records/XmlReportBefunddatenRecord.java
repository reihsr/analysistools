/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate.tables.XmlReportBefunddaten;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class XmlReportBefunddatenRecord extends UpdatableRecordImpl<XmlReportBefunddatenRecord> {

    private static final long serialVersionUID = 856490271;

    /**
     * Setter for <code>prostate.xml_report_befunddaten.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.EINGANGSDATUM1</code>.
     */
    public void setEingangsdatum1(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.EINGANGSDATUM1</code>.
     */
    public Date getEingangsdatum1() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.ALTERPAT1</code>.
     */
    public void setAlterpat1(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.ALTERPAT1</code>.
     */
    public Integer getAlterpat1() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.EINSENDER1</code>.
     */
    public void setEinsender1(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.EINSENDER1</code>.
     */
    public String getEinsender1() {
        return (String) get(3);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.GEWINNUNGSART1</code>.
     */
    public void setGewinnungsart1(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.GEWINNUNGSART1</code>.
     */
    public String getGewinnungsart1() {
        return (String) get(4);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MATERIAL1</code>.
     */
    public void setMaterial1(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MATERIAL1</code>.
     */
    public String getMaterial1() {
        return (String) get(5);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MATERIALZUSATZ1</code>.
     */
    public void setMaterialzusatz1(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MATERIALZUSATZ1</code>.
     */
    public String getMaterialzusatz1() {
        return (String) get(6);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MAKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public void setMakroskopischebeschreibung1(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MAKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public String getMakroskopischebeschreibung1() {
        return (String) get(7);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.HISTOLOGISCHEBESCHREIBUNG1</code>.
     */
    public void setHistologischebeschreibung1(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.HISTOLOGISCHEBESCHREIBUNG1</code>.
     */
    public String getHistologischebeschreibung1() {
        return (String) get(8);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MIKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public void setMikroskopischebeschreibung1(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MIKROSKOPISCHEBESCHREIBUNG1</code>.
     */
    public String getMikroskopischebeschreibung1() {
        return (String) get(9);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MPBESCHREIBUNG1</code>.
     */
    public void setMpbeschreibung1(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MPBESCHREIBUNG1</code>.
     */
    public String getMpbeschreibung1() {
        return (String) get(10);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.SCHNELLSCHNITTDIAGNOSE1</code>.
     */
    public void setSchnellschnittdiagnose1(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.SCHNELLSCHNITTDIAGNOSE1</code>.
     */
    public String getSchnellschnittdiagnose1() {
        return (String) get(11);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.MPDIAGNOSE1</code>.
     */
    public void setMpdiagnose1(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.MPDIAGNOSE1</code>.
     */
    public String getMpdiagnose1() {
        return (String) get(12);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.DIAGNOSE1</code>.
     */
    public void setDiagnose1(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.DIAGNOSE1</code>.
     */
    public String getDiagnose1() {
        return (String) get(13);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.GRAD1</code>.
     */
    public void setGrad1(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.GRAD1</code>.
     */
    public String getGrad1() {
        return (String) get(14);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMP1</code>.
     */
    public void setTnmp1(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMP1</code>.
     */
    public String getTnmp1() {
        return (String) get(15);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMT1</code>.
     */
    public void setTnmt1(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMT1</code>.
     */
    public String getTnmt1() {
        return (String) get(16);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMM1</code>.
     */
    public void setTnmm1(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMM1</code>.
     */
    public String getTnmm1() {
        return (String) get(17);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMN1</code>.
     */
    public void setTnmn1(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMN1</code>.
     */
    public String getTnmn1() {
        return (String) get(18);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMR1</code>.
     */
    public void setTnmr1(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMR1</code>.
     */
    public String getTnmr1() {
        return (String) get(19);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNML1</code>.
     */
    public void setTnml1(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNML1</code>.
     */
    public String getTnml1() {
        return (String) get(20);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMV1</code>.
     */
    public void setTnmv1(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMV1</code>.
     */
    public String getTnmv1() {
        return (String) get(21);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.TNMPN1</code>.
     */
    public void setTnmpn1(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.TNMPN1</code>.
     */
    public String getTnmpn1() {
        return (String) get(22);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.DGCODE11</code>.
     */
    public void setDgcode11(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.DGCODE11</code>.
     */
    public String getDgcode11() {
        return (String) get(23);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.DGCODE21</code>.
     */
    public void setDgcode21(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.DGCODE21</code>.
     */
    public String getDgcode21() {
        return (String) get(24);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.KOMMENTAR1</code>.
     */
    public void setKommentar1(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.KOMMENTAR1</code>.
     */
    public String getKommentar1() {
        return (String) get(25);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.BEFUNDER11</code>.
     */
    public void setBefunder11(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.BEFUNDER11</code>.
     */
    public String getBefunder11() {
        return (String) get(26);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.BEFUNDER21</code>.
     */
    public void setBefunder21(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.BEFUNDER21</code>.
     */
    public String getBefunder21() {
        return (String) get(27);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.VIDIT11</code>.
     */
    public void setVidit11(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.VIDIT11</code>.
     */
    public String getVidit11() {
        return (String) get(28);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.VIDIT21</code>.
     */
    public void setVidit21(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.VIDIT21</code>.
     */
    public String getVidit21() {
        return (String) get(29);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.BEFUNDSTATUS1</code>.
     */
    public void setBefundstatus1(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.BEFUNDSTATUS1</code>.
     */
    public String getBefundstatus1() {
        return (String) get(30);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.ABSCHLUSSDATUM1</code>.
     */
    public void setAbschlussdatum1(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.ABSCHLUSSDATUM1</code>.
     */
    public String getAbschlussdatum1() {
        return (String) get(31);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.VPATID1</code>.
     */
    public void setVpatid1(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.VPATID1</code>.
     */
    public String getVpatid1() {
        return (String) get(32);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.VHISTID1</code>.
     */
    public void setVhistid1(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.VHISTID1</code>.
     */
    public String getVhistid1() {
        return (String) get(33);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.BEFUNDLFDNR1</code>.
     */
    public void setBefundlfdnr1(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.BEFUNDLFDNR1</code>.
     */
    public String getBefundlfdnr1() {
        return (String) get(34);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.ANZBL1</code>.
     */
    public void setAnzbl1(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.ANZBL1</code>.
     */
    public String getAnzbl1() {
        return (String) get(35);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.ANZOT1</code>.
     */
    public void setAnzot1(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.ANZOT1</code>.
     */
    public String getAnzot1() {
        return (String) get(36);
    }

    /**
     * Setter for <code>prostate.xml_report_befunddaten.file</code>.
     */
    public void setFile(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>prostate.xml_report_befunddaten.file</code>.
     */
    public String getFile() {
        return (String) get(37);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XmlReportBefunddatenRecord
     */
    public XmlReportBefunddatenRecord() {
        super(XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN);
    }

    /**
     * Create a detached, initialised XmlReportBefunddatenRecord
     */
    public XmlReportBefunddatenRecord(Integer id, Date eingangsdatum1, Integer alterpat1, String einsender1, String gewinnungsart1, String material1, String materialzusatz1, String makroskopischebeschreibung1, String histologischebeschreibung1, String mikroskopischebeschreibung1, String mpbeschreibung1, String schnellschnittdiagnose1, String mpdiagnose1, String diagnose1, String grad1, String tnmp1, String tnmt1, String tnmm1, String tnmn1, String tnmr1, String tnml1, String tnmv1, String tnmpn1, String dgcode11, String dgcode21, String kommentar1, String befunder11, String befunder21, String vidit11, String vidit21, String befundstatus1, String abschlussdatum1, String vpatid1, String vhistid1, String befundlfdnr1, String anzbl1, String anzot1, String file) {
        super(XmlReportBefunddaten.XML_REPORT_BEFUNDDATEN);

        set(0, id);
        set(1, eingangsdatum1);
        set(2, alterpat1);
        set(3, einsender1);
        set(4, gewinnungsart1);
        set(5, material1);
        set(6, materialzusatz1);
        set(7, makroskopischebeschreibung1);
        set(8, histologischebeschreibung1);
        set(9, mikroskopischebeschreibung1);
        set(10, mpbeschreibung1);
        set(11, schnellschnittdiagnose1);
        set(12, mpdiagnose1);
        set(13, diagnose1);
        set(14, grad1);
        set(15, tnmp1);
        set(16, tnmt1);
        set(17, tnmm1);
        set(18, tnmn1);
        set(19, tnmr1);
        set(20, tnml1);
        set(21, tnmv1);
        set(22, tnmpn1);
        set(23, dgcode11);
        set(24, dgcode21);
        set(25, kommentar1);
        set(26, befunder11);
        set(27, befunder21);
        set(28, vidit11);
        set(29, vidit21);
        set(30, befundstatus1);
        set(31, abschlussdatum1);
        set(32, vpatid1);
        set(33, vhistid1);
        set(34, befundlfdnr1);
        set(35, anzbl1);
        set(36, anzot1);
        set(37, file);
    }
}
