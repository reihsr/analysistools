/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma;


import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma.tables.FindingsWithRezeptor;
import at.medunigraz.pathology.bibbox.datatools.jooq.patient_repository_saat_mamma.tables.RezeptorNames;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>patient_repository_saat_mamma</code> 
 * schema.
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

    public static final Index FINDINGS_WITH_REZEPTOR_PKEY = Indexes0.FINDINGS_WITH_REZEPTOR_PKEY;
    public static final Index REZEPTOR_NAMES_PKEY = Indexes0.REZEPTOR_NAMES_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index FINDINGS_WITH_REZEPTOR_PKEY = Internal.createIndex("findings_with_rezeptor_pkey", FindingsWithRezeptor.FINDINGS_WITH_REZEPTOR, new OrderField[] { FindingsWithRezeptor.FINDINGS_WITH_REZEPTOR.FINDING_ID }, true);
        public static Index REZEPTOR_NAMES_PKEY = Internal.createIndex("rezeptor_names_pkey", RezeptorNames.REZEPTOR_NAMES, new OrderField[] { RezeptorNames.REZEPTOR_NAMES.REZEPTOR_NAMES_ID }, true);
    }
}
