/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeIcd10;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeIcdo3;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.CodeScg;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.Dictionary2Dictionary2AddictionLink;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.DictionaryInstituteRules;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.CodeIcd10Record;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.CodeIcdo3Record;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.CodeScgRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.Dictionary2Dictionary2AddictionLinkRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.Dictionary2Record;
import at.medunigraz.pathology.bibbox.datatools.jooq.public_.tables.records.DictionaryInstituteRulesRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CodeIcd10Record, Integer> IDENTITY_CODE_ICD10 = Identities0.IDENTITY_CODE_ICD10;
    public static final Identity<CodeIcdo3Record, Integer> IDENTITY_CODE_ICDO3 = Identities0.IDENTITY_CODE_ICDO3;
    public static final Identity<CodeScgRecord, Integer> IDENTITY_CODE_SCG = Identities0.IDENTITY_CODE_SCG;
    public static final Identity<DictionaryInstituteRulesRecord, Integer> IDENTITY_DICTIONARY_INSTITUTE_RULES = Identities0.IDENTITY_DICTIONARY_INSTITUTE_RULES;
    public static final Identity<Dictionary2Record, Integer> IDENTITY_DICTIONARY2 = Identities0.IDENTITY_DICTIONARY2;
    public static final Identity<Dictionary2Dictionary2AddictionLinkRecord, Integer> IDENTITY_DICTIONARY2_DICTIONARY2_ADDICTION_LINK = Identities0.IDENTITY_DICTIONARY2_DICTIONARY2_ADDICTION_LINK;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CodeIcd10Record> CODE_ICD10_ID_PK = UniqueKeys0.CODE_ICD10_ID_PK;
    public static final UniqueKey<CodeIcdo3Record> CODE_ICDO3_ID_PK = UniqueKeys0.CODE_ICDO3_ID_PK;
    public static final UniqueKey<CodeScgRecord> CODE_SCG_ID_PK = UniqueKeys0.CODE_SCG_ID_PK;
    public static final UniqueKey<DictionaryInstituteRulesRecord> DICTIONARY_INSTITUTE_RULES_PK = UniqueKeys0.DICTIONARY_INSTITUTE_RULES_PK;
    public static final UniqueKey<Dictionary2Record> DICTIONARY2_PK = UniqueKeys0.DICTIONARY2_PK;
    public static final UniqueKey<Dictionary2Dictionary2AddictionLinkRecord> DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK = UniqueKeys0.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK;
    public static final UniqueKey<Dictionary2Dictionary2AddictionLinkRecord> DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE = UniqueKeys0.DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CodeIcd10Record, Integer> IDENTITY_CODE_ICD10 = Internal.createIdentity(CodeIcd10.CODE_ICD10, CodeIcd10.CODE_ICD10.ID);
        public static Identity<CodeIcdo3Record, Integer> IDENTITY_CODE_ICDO3 = Internal.createIdentity(CodeIcdo3.CODE_ICDO3, CodeIcdo3.CODE_ICDO3.ID);
        public static Identity<CodeScgRecord, Integer> IDENTITY_CODE_SCG = Internal.createIdentity(CodeScg.CODE_SCG, CodeScg.CODE_SCG.ID);
        public static Identity<DictionaryInstituteRulesRecord, Integer> IDENTITY_DICTIONARY_INSTITUTE_RULES = Internal.createIdentity(DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES, DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.ID);
        public static Identity<Dictionary2Record, Integer> IDENTITY_DICTIONARY2 = Internal.createIdentity(Dictionary2.DICTIONARY2, Dictionary2.DICTIONARY2.DICTIONARY_ID);
        public static Identity<Dictionary2Dictionary2AddictionLinkRecord, Integer> IDENTITY_DICTIONARY2_DICTIONARY2_ADDICTION_LINK = Internal.createIdentity(Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK, Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CodeIcd10Record> CODE_ICD10_ID_PK = Internal.createUniqueKey(CodeIcd10.CODE_ICD10, "code_icd10_id_pk", CodeIcd10.CODE_ICD10.ID);
        public static final UniqueKey<CodeIcdo3Record> CODE_ICDO3_ID_PK = Internal.createUniqueKey(CodeIcdo3.CODE_ICDO3, "code_icdo3_id_pk", CodeIcdo3.CODE_ICDO3.ID);
        public static final UniqueKey<CodeScgRecord> CODE_SCG_ID_PK = Internal.createUniqueKey(CodeScg.CODE_SCG, "code_scg_id_pk", CodeScg.CODE_SCG.ID);
        public static final UniqueKey<DictionaryInstituteRulesRecord> DICTIONARY_INSTITUTE_RULES_PK = Internal.createUniqueKey(DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES, "dictionary_institute_rules_pk", DictionaryInstituteRules.DICTIONARY_INSTITUTE_RULES.ID);
        public static final UniqueKey<Dictionary2Record> DICTIONARY2_PK = Internal.createUniqueKey(Dictionary2.DICTIONARY2, "dictionary2_pk", Dictionary2.DICTIONARY2.DICTIONARY_ID);
        public static final UniqueKey<Dictionary2Dictionary2AddictionLinkRecord> DICTIONARY2_DICTIONARY2_ADDICTION_LINK_PK = Internal.createUniqueKey(Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK, "dictionary2_dictionary2_addiction_link_pk", Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ID);
        public static final UniqueKey<Dictionary2Dictionary2AddictionLinkRecord> DICTIONARY2_DICTIONARY2_ADDICTION_LINK_UNIQUE = Internal.createUniqueKey(Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK, "dictionary2_dictionary2_addiction_link_unique", Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.DICTIONARY_ID, Dictionary2Dictionary2AddictionLink.DICTIONARY2_DICTIONARY2_ADDICTION_LINK.ADDICTION_ID);
    }
}