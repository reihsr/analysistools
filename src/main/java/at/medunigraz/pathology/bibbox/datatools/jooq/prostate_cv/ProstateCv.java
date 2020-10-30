/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.prostate_cv;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.prostate_cv.tables.DiagnosisSelection;

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
public class ProstateCv extends SchemaImpl {

    private static final long serialVersionUID = 363867566;

    /**
     * The reference instance of <code>prostate_cv</code>
     */
    public static final ProstateCv PROSTATE_CV = new ProstateCv();

    /**
     * The table <code>prostate_cv.diagnosis_selection</code>.
     */
    public final DiagnosisSelection DIAGNOSIS_SELECTION = at.medunigraz.pathology.bibbox.datatools.jooq.prostate_cv.tables.DiagnosisSelection.DIAGNOSIS_SELECTION;

    /**
     * No further instances allowed
     */
    private ProstateCv() {
        super("prostate_cv", null);
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
            Sequences.DIAGNOSIS_SELECTION_TABLEKEY_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            DiagnosisSelection.DIAGNOSIS_SELECTION);
    }
}
