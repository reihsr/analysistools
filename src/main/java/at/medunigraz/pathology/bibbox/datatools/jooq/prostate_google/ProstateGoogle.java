/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.Casedataprostate;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.PoGleason;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.ProstateCaPos;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.ProstateCases;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.RandomCases;

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
public class ProstateGoogle extends SchemaImpl {

    private static final long serialVersionUID = 891618541;

    /**
     * The reference instance of <code>prostate_google</code>
     */
    public static final ProstateGoogle PROSTATE_GOOGLE = new ProstateGoogle();

    /**
     * The table <code>prostate_google.casedataprostate</code>.
     */
    public final Casedataprostate CASEDATAPROSTATE = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.Casedataprostate.CASEDATAPROSTATE;

    /**
     * The table <code>prostate_google.po_gleason</code>.
     */
    public final PoGleason PO_GLEASON = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.PoGleason.PO_GLEASON;

    /**
     * The table <code>prostate_google.prostate_ca_pos</code>.
     */
    public final ProstateCaPos PROSTATE_CA_POS = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.ProstateCaPos.PROSTATE_CA_POS;

    /**
     * The table <code>prostate_google.prostate_cases</code>.
     */
    public final ProstateCases PROSTATE_CASES = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.ProstateCases.PROSTATE_CASES;

    /**
     * The table <code>prostate_google.random_cases</code>.
     */
    public final RandomCases RANDOM_CASES = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_google.tables.RandomCases.RANDOM_CASES;

    /**
     * No further instances allowed
     */
    private ProstateGoogle() {
        super("prostate_google", null);
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
            Sequences.PO_GLEASON_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Casedataprostate.CASEDATAPROSTATE,
            PoGleason.PO_GLEASON,
            ProstateCaPos.PROSTATE_CA_POS,
            ProstateCases.PROSTATE_CASES,
            RandomCases.RANDOM_CASES);
    }
}
