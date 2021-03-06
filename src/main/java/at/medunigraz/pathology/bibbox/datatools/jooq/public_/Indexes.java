/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeIcd10;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeIcdo3;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeScg;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2Dictionary2AddictionLink;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2FindingsLink;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.DictionaryInstituteRules;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Findings;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
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

    public static final Index CODE_ICD10_BEZ_HASH = Indexes0.CODE_ICD10_BEZ_HASH;
    public static final Index CODE_ICD10_ID_PK = Indexes0.CODE_ICD10_ID_PK;
    public static final Index CODE_ICDO3_ID_PK = Indexes0.CODE_ICDO3_ID_PK;
    public static final Index CODE_OCDO3_CODE_HASH = Indexes0.CODE_OCDO3_CODE_HASH;
    public static final Index CODE_SCG_CODE_HASH = Indexes0.CODE_SCG_CODE_HASH;
    public static final Index CODE_SCG_ID_PK = Indexes0.CODE_SCG_ID_PK;
    public static final Index DICTIONARY2_PK = Indexes0.DICTIONARY2_PK;
    public static final Index HASH_CODE_TYP = Indexes0.HASH_CODE_TYP;
    public static final Index HASH_CODE_VALUE = Indexes0.HASH_CODE_VALUE;
    public static final Index DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK = Indexes0.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK;
    public static final Index DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE = Indexes0.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE;
    public static final Index DICTIONARY2_FINDINGS_LINK_ID_PK = Indexes0.DICTIONARY2_FINDINGS_LINK_ID_PK;
    public static final Index DICTIONARY2_FINDINGS_LINK_UK = Indexes0.DICTIONARY2_FINDINGS_LINK_UK;
    public static final Index DICTIONARY_INSTITUTE_RULES_PK = Indexes0.DICTIONARY_INSTITUTE_RULES_PK;
    public static final Index FINDINGS_ID = Indexes0.FINDINGS_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CODE_ICD10_BEZ_HASH = Internal.createIndex("code_icd10_bez_hash", CodeIcd10.CODE_ICD10, new OrderField[] { CodeIcd10.CODE_ICD10.CODE }, false);
        public static Index CODE_ICD10_ID_PK = Internal.createIndex("code_icd10_id_pk", CodeIcd10.CODE_ICD10, new OrderField[] { CodeIcd10.CODE_ICD10.ID }, true);
        public static Index CODE_ICDO3_ID_PK = Internal.createIndex("code_icdo3_id_pk", CodeIcdo3.CODE_ICDO3, new OrderField[] { CodeIcdo3.CODE_ICDO3.ID }, true);
        public static Index CODE_OCDO3_CODE_HASH = Internal.createIndex("code_ocdo3_code_hash", CodeIcdo3.CODE_ICDO3, new OrderField[] { CodeIcdo3.CODE_ICDO3.CODE }, false);
        public static Index CODE_SCG_CODE_HASH = Internal.createIndex("code_scg_code_hash", CodeScg.CODE_SCG, new OrderField[] { CodeScg.CODE_SCG.CODE }, false);
        public static Index CODE_SCG_ID_PK = Internal.createIndex("code_scg_id_pk", CodeScg.CODE_SCG, new OrderField[] { CodeScg.CODE_SCG.ID }, true);
        public static Index DICTIONARY2_PK = Internal.createIndex("dictionary2_pk", Dictionary2.DICTIONARY2, new OrderField[] { Dictionary2.DICTIONARY2.DICTIONARY_ID }, true);
        public static Index HASH_CODE_TYP = Internal.createIndex("hash_code_typ", Dictionary2.DICTIONARY2, new OrderField[] { Dictionary2.DICTIONARY2.CODE_TYP }, false);
        public static Index HASH_CODE_VALUE = Internal.createIndex("hash_code_value", Dictionary2.DICTIONARY2, new OrderField[] { Dictionary2.DICTIONARY2.CODE_VALUE }, false);
        public static Index DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK = Internal.createIndex("dictionary2_dictionary2_addiction_link_pk", Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK, new OrderField[] { Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ID }, true);
        public static Index DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE = Internal.createIndex("dictionary2_dictionary2_addiction_link_unique", Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK, new OrderField[] { Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.DICTIONARY_ID, Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ADDICTION_ID }, true);
        public static Index DICTIONARY2_FINDINGS_LINK_ID_PK = Internal.createIndex("dictionary2_findings_link_id_pk", Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK, new OrderField[] { Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.ID }, true);
        public static Index DICTIONARY2_FINDINGS_LINK_UK = Internal.createIndex("dictionary2_findings_link_uk", Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK, new OrderField[] { Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.DICTIONARY_ID, Dictionary2FindingsLink.DICTIONARY2_FINDINGS_LINK.FINDING_ID }, true);
        public static Index DICTIONARY_INSTITUTE_RULES_PK = Internal.createIndex("dictionary_institute_rules_pk", DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES, new OrderField[] { DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.ID }, true);
        public static Index FINDINGS_ID = Internal.createIndex("findings_id", Findings.FINDINGS, new OrderField[] { Findings.FINDINGS.FINDING_ID }, true);
    }
}
