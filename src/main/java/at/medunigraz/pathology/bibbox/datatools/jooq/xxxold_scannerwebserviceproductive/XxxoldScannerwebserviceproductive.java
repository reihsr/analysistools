/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive;


import at.medunigraz.pathology.bibbox.datatools.jooq.DefaultCatalog;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Blockslidemap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseicd10map;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseicdomap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseprojectmap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Casescgmap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Casetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Duplicatetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Googlejsonuploadtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Googleslideuploadtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Histonumbervhistonumbermap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Icd10table;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Icdotable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Inboxtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Patienttable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Projectstoragemap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Projecttable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Qualityscanmap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Qualitytable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Rackstatustable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Racktable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scannerrackpositiontable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scannertable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scanprojectmap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scantable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scgtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Slidescanmap;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Slidetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Stagingreferenz;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Storagetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Typetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Users;

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
public class XxxoldScannerwebserviceproductive extends SchemaImpl {

    private static final long serialVersionUID = 931870943;

    /**
     * The reference instance of <code>xxxold_scannerwebserviceproductive</code>
     */
    public static final XxxoldScannerwebserviceproductive XXXOLD_SCANNERWEBSERVICEPRODUCTIVE = new XxxoldScannerwebserviceproductive();

    /**
     * The table <code>xxxold_scannerwebserviceproductive.blockslidemap</code>.
     */
    public final Blockslidemap BLOCKSLIDEMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Blockslidemap.BLOCKSLIDEMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.caseicd10map</code>.
     */
    public final Caseicd10map CASEICD10MAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseicd10map.CASEICD10MAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.caseicdomap</code>.
     */
    public final Caseicdomap CASEICDOMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseicdomap.CASEICDOMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.caseprojectmap</code>.
     */
    public final Caseprojectmap CASEPROJECTMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Caseprojectmap.CASEPROJECTMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.casescgmap</code>.
     */
    public final Casescgmap CASESCGMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Casescgmap.CASESCGMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.casetable</code>.
     */
    public final Casetable CASETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Casetable.CASETABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.duplicatetable</code>.
     */
    public final Duplicatetable DUPLICATETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Duplicatetable.DUPLICATETABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.googlejsonuploadtable</code>.
     */
    public final Googlejsonuploadtable GOOGLEJSONUPLOADTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Googlejsonuploadtable.GOOGLEJSONUPLOADTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.googleslideuploadtable</code>.
     */
    public final Googleslideuploadtable GOOGLESLIDEUPLOADTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Googleslideuploadtable.GOOGLESLIDEUPLOADTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.histonumbervhistonumbermap</code>.
     */
    public final Histonumbervhistonumbermap HISTONUMBERVHISTONUMBERMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Histonumbervhistonumbermap.HISTONUMBERVHISTONUMBERMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.icd10table</code>.
     */
    public final Icd10table ICD10TABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Icd10table.ICD10TABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.icdotable</code>.
     */
    public final Icdotable ICDOTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Icdotable.ICDOTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.inboxtable</code>.
     */
    public final Inboxtable INBOXTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Inboxtable.INBOXTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.patienttable</code>.
     */
    public final Patienttable PATIENTTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Patienttable.PATIENTTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.projectstoragemap</code>.
     */
    public final Projectstoragemap PROJECTSTORAGEMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Projectstoragemap.PROJECTSTORAGEMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.projecttable</code>.
     */
    public final Projecttable PROJECTTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Projecttable.PROJECTTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.qualityscanmap</code>.
     */
    public final Qualityscanmap QUALITYSCANMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Qualityscanmap.QUALITYSCANMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.qualitytable</code>.
     */
    public final Qualitytable QUALITYTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Qualitytable.QUALITYTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.rackstatustable</code>.
     */
    public final Rackstatustable RACKSTATUSTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Rackstatustable.RACKSTATUSTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.racktable</code>.
     */
    public final Racktable RACKTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Racktable.RACKTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.scannerrackpositiontable</code>.
     */
    public final Scannerrackpositiontable SCANNERRACKPOSITIONTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.scannertable</code>.
     */
    public final Scannertable SCANNERTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scannertable.SCANNERTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.scanprojectmap</code>.
     */
    public final Scanprojectmap SCANPROJECTMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scanprojectmap.SCANPROJECTMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.scantable</code>.
     */
    public final Scantable SCANTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scantable.SCANTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.scgtable</code>.
     */
    public final Scgtable SCGTABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Scgtable.SCGTABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.slidescanmap</code>.
     */
    public final Slidescanmap SLIDESCANMAP = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Slidescanmap.SLIDESCANMAP;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.slidetable</code>.
     */
    public final Slidetable SLIDETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Slidetable.SLIDETABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.stagingreferenz</code>.
     */
    public final Stagingreferenz STAGINGREFERENZ = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Stagingreferenz.STAGINGREFERENZ;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.storagetable</code>.
     */
    public final Storagetable STORAGETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Storagetable.STORAGETABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.typetable</code>.
     */
    public final Typetable TYPETABLE = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Typetable.TYPETABLE;

    /**
     * The table <code>xxxold_scannerwebserviceproductive.users</code>.
     */
    public final Users USERS = at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private XxxoldScannerwebserviceproductive() {
        super("xxxold_scannerwebserviceproductive", null);
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
            Sequences.CASETABLE_TMPID_SEQ,
            Sequences.GOOGLESLIDEUPLOADID);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Blockslidemap.BLOCKSLIDEMAP,
            Caseicd10map.CASEICD10MAP,
            Caseicdomap.CASEICDOMAP,
            Caseprojectmap.CASEPROJECTMAP,
            Casescgmap.CASESCGMAP,
            Casetable.CASETABLE,
            Duplicatetable.DUPLICATETABLE,
            Googlejsonuploadtable.GOOGLEJSONUPLOADTABLE,
            Googleslideuploadtable.GOOGLESLIDEUPLOADTABLE,
            Histonumbervhistonumbermap.HISTONUMBERVHISTONUMBERMAP,
            Icd10table.ICD10TABLE,
            Icdotable.ICDOTABLE,
            Inboxtable.INBOXTABLE,
            Patienttable.PATIENTTABLE,
            Projectstoragemap.PROJECTSTORAGEMAP,
            Projecttable.PROJECTTABLE,
            Qualityscanmap.QUALITYSCANMAP,
            Qualitytable.QUALITYTABLE,
            Rackstatustable.RACKSTATUSTABLE,
            Racktable.RACKTABLE,
            Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE,
            Scannertable.SCANNERTABLE,
            Scanprojectmap.SCANPROJECTMAP,
            Scantable.SCANTABLE,
            Scgtable.SCGTABLE,
            Slidescanmap.SLIDESCANMAP,
            Slidetable.SLIDETABLE,
            Stagingreferenz.STAGINGREFERENZ,
            Storagetable.STORAGETABLE,
            Typetable.TYPETABLE,
            Users.USERS);
    }
}
