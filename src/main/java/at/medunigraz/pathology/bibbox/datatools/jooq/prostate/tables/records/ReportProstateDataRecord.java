/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.prostate.tables.ReportProstateData;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


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
public class ReportProstateDataRecord extends TableRecordImpl<ReportProstateDataRecord> {

    private static final long serialVersionUID = -398803970;

    /**
     * Setter for <code>prostate.report_prostate_data.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.eingangsdatum</code>.
     */
    public void setEingangsdatum(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.eingangsdatum</code>.
     */
    public Date getEingangsdatum() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.alterpat</code>.
     */
    public void setAlterpat(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.alterpat</code>.
     */
    public Integer getAlterpat() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.einsender</code>.
     */
    public void setEinsender(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.einsender</code>.
     */
    public String getEinsender() {
        return (String) get(3);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.gewinnungsart</code>.
     */
    public void setGewinnungsart(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.gewinnungsart</code>.
     */
    public String getGewinnungsart() {
        return (String) get(4);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.material</code>.
     */
    public void setMaterial(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.material</code>.
     */
    public String getMaterial() {
        return (String) get(5);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.materialzusatz</code>.
     */
    public void setMaterialzusatz(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.materialzusatz</code>.
     */
    public String getMaterialzusatz() {
        return (String) get(6);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.makroskopischebeschreibung</code>.
     */
    public void setMakroskopischebeschreibung(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.makroskopischebeschreibung</code>.
     */
    public String getMakroskopischebeschreibung() {
        return (String) get(7);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.histologischebeschreibung</code>.
     */
    public void setHistologischebeschreibung(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.histologischebeschreibung</code>.
     */
    public String getHistologischebeschreibung() {
        return (String) get(8);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.mikroskopischebeschreibung</code>.
     */
    public void setMikroskopischebeschreibung(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.mikroskopischebeschreibung</code>.
     */
    public String getMikroskopischebeschreibung() {
        return (String) get(9);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.mpbeschreibung</code>.
     */
    public void setMpbeschreibung(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.mpbeschreibung</code>.
     */
    public String getMpbeschreibung() {
        return (String) get(10);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.schnellschnittdiagnose</code>.
     */
    public void setSchnellschnittdiagnose(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.schnellschnittdiagnose</code>.
     */
    public String getSchnellschnittdiagnose() {
        return (String) get(11);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.mpdiagnose</code>.
     */
    public void setMpdiagnose(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.mpdiagnose</code>.
     */
    public String getMpdiagnose() {
        return (String) get(12);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.diagnose</code>.
     */
    public void setDiagnose(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.diagnose</code>.
     */
    public String getDiagnose() {
        return (String) get(13);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.grad</code>.
     */
    public void setGrad(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.grad</code>.
     */
    public String getGrad() {
        return (String) get(14);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.p</code>.
     */
    public void setP(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.p</code>.
     */
    public String getP() {
        return (String) get(15);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.t</code>.
     */
    public void setT(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.t</code>.
     */
    public String getT() {
        return (String) get(16);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.m</code>.
     */
    public void setM(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.m</code>.
     */
    public String getM() {
        return (String) get(17);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.n</code>.
     */
    public void setN(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.n</code>.
     */
    public String getN() {
        return (String) get(18);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.r</code>.
     */
    public void setR(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.r</code>.
     */
    public String getR() {
        return (String) get(19);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.l</code>.
     */
    public void setL(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.l</code>.
     */
    public String getL() {
        return (String) get(20);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.v</code>.
     */
    public void setV(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.v</code>.
     */
    public String getV() {
        return (String) get(21);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.pn</code>.
     */
    public void setPn(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.pn</code>.
     */
    public String getPn() {
        return (String) get(22);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.dgcode1</code>.
     */
    public void setDgcode1(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.dgcode1</code>.
     */
    public String getDgcode1() {
        return (String) get(23);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.dgcode2</code>.
     */
    public void setDgcode2(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.dgcode2</code>.
     */
    public String getDgcode2() {
        return (String) get(24);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.kommentar</code>.
     */
    public void setKommentar(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.kommentar</code>.
     */
    public String getKommentar() {
        return (String) get(25);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.befunder1</code>.
     */
    public void setBefunder1(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.befunder1</code>.
     */
    public String getBefunder1() {
        return (String) get(26);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.befunder2</code>.
     */
    public void setBefunder2(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.befunder2</code>.
     */
    public String getBefunder2() {
        return (String) get(27);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vidit1</code>.
     */
    public void setVidit1(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vidit1</code>.
     */
    public String getVidit1() {
        return (String) get(28);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vidit2</code>.
     */
    public void setVidit2(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vidit2</code>.
     */
    public String getVidit2() {
        return (String) get(29);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.befundstatus</code>.
     */
    public void setBefundstatus(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.befundstatus</code>.
     */
    public String getBefundstatus() {
        return (String) get(30);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.abschlussdatum</code>.
     */
    public void setAbschlussdatum(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.abschlussdatum</code>.
     */
    public String getAbschlussdatum() {
        return (String) get(31);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vpatid</code>.
     */
    public void setVpatid(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vpatid</code>.
     */
    public String getVpatid() {
        return (String) get(32);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vhistid</code>.
     */
    public void setVhistid(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vhistid</code>.
     */
    public String getVhistid() {
        return (String) get(33);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.befundlfdnr</code>.
     */
    public void setBefundlfdnr(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.befundlfdnr</code>.
     */
    public String getBefundlfdnr() {
        return (String) get(34);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.anzbl1</code>.
     */
    public void setAnzbl1(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.anzbl1</code>.
     */
    public String getAnzbl1() {
        return (String) get(35);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.anzot</code>.
     */
    public void setAnzot(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.anzot</code>.
     */
    public String getAnzot() {
        return (String) get(36);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.file</code>.
     */
    public void setFile(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.file</code>.
     */
    public String getFile() {
        return (String) get(37);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vpatid1_ext</code>.
     */
    public void setVpatid1Ext(Long value) {
        set(38, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vpatid1_ext</code>.
     */
    public Long getVpatid1Ext() {
        return (Long) get(38);
    }

    /**
     * Setter for <code>prostate.report_prostate_data.vhistid1_ext</code>.
     */
    public void setVhistid1Ext(Long value) {
        set(39, value);
    }

    /**
     * Getter for <code>prostate.report_prostate_data.vhistid1_ext</code>.
     */
    public Long getVhistid1Ext() {
        return (Long) get(39);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReportProstateDataRecord
     */
    public ReportProstateDataRecord() {
        super(ReportProstateData.REPORT_PROSTATE_DATA);
    }

    /**
     * Create a detached, initialised ReportProstateDataRecord
     */
    public ReportProstateDataRecord(Integer id, Date eingangsdatum, Integer alterpat, String einsender, String gewinnungsart, String material, String materialzusatz, String makroskopischebeschreibung, String histologischebeschreibung, String mikroskopischebeschreibung, String mpbeschreibung, String schnellschnittdiagnose, String mpdiagnose, String diagnose, String grad, String p, String t, String m, String n, String r, String l, String v, String pn, String dgcode1, String dgcode2, String kommentar, String befunder1, String befunder2, String vidit1, String vidit2, String befundstatus, String abschlussdatum, String vpatid, String vhistid, String befundlfdnr, String anzbl1, String anzot, String file, Long vpatid1Ext, Long vhistid1Ext) {
        super(ReportProstateData.REPORT_PROSTATE_DATA);

        set(0, id);
        set(1, eingangsdatum);
        set(2, alterpat);
        set(3, einsender);
        set(4, gewinnungsart);
        set(5, material);
        set(6, materialzusatz);
        set(7, makroskopischebeschreibung);
        set(8, histologischebeschreibung);
        set(9, mikroskopischebeschreibung);
        set(10, mpbeschreibung);
        set(11, schnellschnittdiagnose);
        set(12, mpdiagnose);
        set(13, diagnose);
        set(14, grad);
        set(15, p);
        set(16, t);
        set(17, m);
        set(18, n);
        set(19, r);
        set(20, l);
        set(21, v);
        set(22, pn);
        set(23, dgcode1);
        set(24, dgcode2);
        set(25, kommentar);
        set(26, befunder1);
        set(27, befunder2);
        set(28, vidit1);
        set(29, vidit2);
        set(30, befundstatus);
        set(31, abschlussdatum);
        set(32, vpatid);
        set(33, vhistid);
        set(34, befundlfdnr);
        set(35, anzbl1);
        set(36, anzot);
        set(37, file);
        set(38, vpatid1Ext);
        set(39, vhistid1Ext);
    }
}
