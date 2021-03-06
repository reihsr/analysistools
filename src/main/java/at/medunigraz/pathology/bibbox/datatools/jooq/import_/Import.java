/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.import_;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Caseicd10map;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Caseicdomap;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Casetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.CasetableTest;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.HistonumberVhistonumberMap;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Patienttable;
import at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.PatienttableProstate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
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
public class Import extends SchemaImpl {

    private static final long serialVersionUID = 981741177;

    /**
     * The reference instance of <code>import</code>
     */
    public static final Import IMPORT = new Import();

    /**
     * The table <code>import.caseicd10map</code>.
     */
    public final Caseicd10map CASEICD10MAP = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Caseicd10map.CASEICD10MAP;

    /**
     * The table <code>import.caseicdomap</code>.
     */
    public final Caseicdomap CASEICDOMAP = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Caseicdomap.CASEICDOMAP;

    /**
     * The table <code>import.casetable</code>.
     */
    public final Casetable CASETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Casetable.CASETABLE;

    /**
     * The table <code>import.casetable_test</code>.
     */
    public final CasetableTest CASETABLE_TEST = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.CasetableTest.CASETABLE_TEST;

    /**
     * The table <code>import.histonumber_vhistonumber_map</code>.
     */
    public final HistonumberVhistonumberMap HISTONUMBER_VHISTONUMBER_MAP = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.HistonumberVhistonumberMap.HISTONUMBER_VHISTONUMBER_MAP;

    /**
     * The table <code>import.patienttable</code>.
     */
    public final Patienttable PATIENTTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.Patienttable.PATIENTTABLE;

    /**
     * The table <code>import.patienttable_prostate</code>.
     */
    public final PatienttableProstate PATIENTTABLE_PROSTATE = at.medunigraz.pathology.bibbox.datatools.jooq.import_.tables.PatienttableProstate.PATIENTTABLE_PROSTATE;

    /**
     * No further instances allowed
     */
    private Import() {
        super("import", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Caseicd10map.CASEICD10MAP,
            Caseicdomap.CASEICDOMAP,
            Casetable.CASETABLE,
            CasetableTest.CASETABLE_TEST,
            HistonumberVhistonumberMap.HISTONUMBER_VHISTONUMBER_MAP,
            Patienttable.PATIENTTABLE,
            PatienttableProstate.PATIENTTABLE_PROSTATE);
    }
}
