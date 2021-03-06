/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsPhrase;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsSentence;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsStructure;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsToken;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.FindingsTokenMap;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsPhraseRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsSentenceRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsStructureRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsTokenMapRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat.tables.records.FindingsTokenRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>patient_repository_saat</code> schema.
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

    public static final Identity<FindingsPhraseRecord, Integer> IDENTITY_FINDINGS_PHRASE = Identities0.IDENTITY_FINDINGS_PHRASE;
    public static final Identity<FindingsSentenceRecord, Integer> IDENTITY_FINDINGS_SENTENCE = Identities0.IDENTITY_FINDINGS_SENTENCE;
    public static final Identity<FindingsStructureRecord, Integer> IDENTITY_FINDINGS_STRUCTURE = Identities0.IDENTITY_FINDINGS_STRUCTURE;
    public static final Identity<FindingsTokenRecord, Integer> IDENTITY_FINDINGS_TOKEN = Identities0.IDENTITY_FINDINGS_TOKEN;
    public static final Identity<FindingsTokenMapRecord, Integer> IDENTITY_FINDINGS_TOKEN_MAP = Identities0.IDENTITY_FINDINGS_TOKEN_MAP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FindingsPhraseRecord> FINDINGS_PHRASE_PKEY = UniqueKeys0.FINDINGS_PHRASE_PKEY;
    public static final UniqueKey<FindingsSentenceRecord> FINDINGS_SENTENCE_ID_PKEY = UniqueKeys0.FINDINGS_SENTENCE_ID_PKEY;
    public static final UniqueKey<FindingsStructureRecord> FINDINGS_STRUCTURE_PKEY = UniqueKeys0.FINDINGS_STRUCTURE_PKEY;
    public static final UniqueKey<FindingsTokenRecord> FINDINGS_TOKEN_PKEY = UniqueKeys0.FINDINGS_TOKEN_PKEY;
    public static final UniqueKey<FindingsTokenMapRecord> FINDINGS_TOKEN_MAP_PKEY = UniqueKeys0.FINDINGS_TOKEN_MAP_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<FindingsPhraseRecord, Integer> IDENTITY_FINDINGS_PHRASE = Internal.createIdentity(FindingsPhrase.FINDINGS_PHRASE, FindingsPhrase.FINDINGS_PHRASE.FINDINGS_PHRASE_ID);
        public static Identity<FindingsSentenceRecord, Integer> IDENTITY_FINDINGS_SENTENCE = Internal.createIdentity(FindingsSentence.FINDINGS_SENTENCE, FindingsSentence.FINDINGS_SENTENCE.FINDINGS_SENTENCE_ID);
        public static Identity<FindingsStructureRecord, Integer> IDENTITY_FINDINGS_STRUCTURE = Internal.createIdentity(FindingsStructure.FINDINGS_STRUCTURE, FindingsStructure.FINDINGS_STRUCTURE.FINDINGS_STRUCTURE_ID);
        public static Identity<FindingsTokenRecord, Integer> IDENTITY_FINDINGS_TOKEN = Internal.createIdentity(FindingsToken.FINDINGS_TOKEN, FindingsToken.FINDINGS_TOKEN.FINDINGS_TOKEN_ID);
        public static Identity<FindingsTokenMapRecord, Integer> IDENTITY_FINDINGS_TOKEN_MAP = Internal.createIdentity(FindingsTokenMap.FINDINGS_TOKEN_MAP, FindingsTokenMap.FINDINGS_TOKEN_MAP.FINDINGS_TOKEN_MAP_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FindingsPhraseRecord> FINDINGS_PHRASE_PKEY = Internal.createUniqueKey(FindingsPhrase.FINDINGS_PHRASE, "findings_phrase_pkey", FindingsPhrase.FINDINGS_PHRASE.FINDINGS_PHRASE_ID);
        public static final UniqueKey<FindingsSentenceRecord> FINDINGS_SENTENCE_ID_PKEY = Internal.createUniqueKey(FindingsSentence.FINDINGS_SENTENCE, "findings_sentence_id_pkey", FindingsSentence.FINDINGS_SENTENCE.FINDINGS_SENTENCE_ID);
        public static final UniqueKey<FindingsStructureRecord> FINDINGS_STRUCTURE_PKEY = Internal.createUniqueKey(FindingsStructure.FINDINGS_STRUCTURE, "findings_structure_pkey", FindingsStructure.FINDINGS_STRUCTURE.FINDINGS_STRUCTURE_ID);
        public static final UniqueKey<FindingsTokenRecord> FINDINGS_TOKEN_PKEY = Internal.createUniqueKey(FindingsToken.FINDINGS_TOKEN, "findings_token_pkey", FindingsToken.FINDINGS_TOKEN.FINDINGS_TOKEN_ID);
        public static final UniqueKey<FindingsTokenMapRecord> FINDINGS_TOKEN_MAP_PKEY = Internal.createUniqueKey(FindingsTokenMap.FINDINGS_TOKEN_MAP, "findings_token_map_pkey", FindingsTokenMap.FINDINGS_TOKEN_MAP.FINDINGS_TOKEN_MAP_ID);
    }
}
