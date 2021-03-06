/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports;


import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.tables.HistonumberEnumberMap;
import at.medunigraz.pathology.bibbox.datatools.jooq.colon_imports.tables.records.HistonumberEnumberMapRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>colon_imports</code> schema.
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

    public static final Identity<HistonumberEnumberMapRecord, Integer> IDENTITY_HISTONUMBER_ENUMBER_MAP = Identities0.IDENTITY_HISTONUMBER_ENUMBER_MAP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<HistonumberEnumberMapRecord> HISTONUMBER_ENUMBER_MAP_PKEY = UniqueKeys0.HISTONUMBER_ENUMBER_MAP_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<HistonumberEnumberMapRecord, Integer> IDENTITY_HISTONUMBER_ENUMBER_MAP = Internal.createIdentity(HistonumberEnumberMap.HISTONUMBER_ENUMBER_MAP, HistonumberEnumberMap.HISTONUMBER_ENUMBER_MAP.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<HistonumberEnumberMapRecord> HISTONUMBER_ENUMBER_MAP_PKEY = Internal.createUniqueKey(HistonumberEnumberMap.HISTONUMBER_ENUMBER_MAP, "histonumber_enumber_map_pkey", HistonumberEnumberMap.HISTONUMBER_ENUMBER_MAP.ID);
    }
}
