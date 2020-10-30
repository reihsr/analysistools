/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive;


import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Duplicatetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Idmaptable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Inboxtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Jsonuploadtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Keyvaluetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Projectkeyvaluemap;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Projecttable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Qualitytable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Rackstatustable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Racktable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Scannerrackpositiontable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Scannertable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Scantable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Slidetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Slideuploadtable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Stagingreferenz;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Storagetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Typetable;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.Users;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.DuplicatetableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.IdmaptableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.InboxtableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.JsonuploadtableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.KeyvaluetableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ProjectkeyvaluemapRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ProjecttableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.QualitytableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.RackstatustableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.RacktableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ScannerrackpositiontableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ScannertableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.ScantableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.SlidetableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.SlideuploadtableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.StagingreferenzRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.StoragetableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.TypetableRecord;
import at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>scannerwebserviceproductive</code> schema.
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

    public static final Identity<InboxtableRecord, Integer> IDENTITY_INBOXTABLE = Identities0.IDENTITY_INBOXTABLE;
    public static final Identity<JsonuploadtableRecord, Integer> IDENTITY_JSONUPLOADTABLE = Identities0.IDENTITY_JSONUPLOADTABLE;
    public static final Identity<SlideuploadtableRecord, Integer> IDENTITY_SLIDEUPLOADTABLE = Identities0.IDENTITY_SLIDEUPLOADTABLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DuplicatetableRecord> DUPLICATETABLE_PKEY = UniqueKeys0.DUPLICATETABLE_PKEY;
    public static final UniqueKey<IdmaptableRecord> IDMAPTABLE_PKEY = UniqueKeys0.IDMAPTABLE_PKEY;
    public static final UniqueKey<InboxtableRecord> INBOXTABLE_PKEY = UniqueKeys0.INBOXTABLE_PKEY;
    public static final UniqueKey<KeyvaluetableRecord> KEYVALUETABLE_PKEY = UniqueKeys0.KEYVALUETABLE_PKEY;
    public static final UniqueKey<ProjectkeyvaluemapRecord> PROJECTKEYVALUEMAP_PKEY = UniqueKeys0.PROJECTKEYVALUEMAP_PKEY;
    public static final UniqueKey<ProjecttableRecord> PROJECTTABLE_PKEY = UniqueKeys0.PROJECTTABLE_PKEY;
    public static final UniqueKey<QualitytableRecord> QUALITYTABLE_PKEY = UniqueKeys0.QUALITYTABLE_PKEY;
    public static final UniqueKey<RackstatustableRecord> RACKSTATUSTABLE_PKEY = UniqueKeys0.RACKSTATUSTABLE_PKEY;
    public static final UniqueKey<RacktableRecord> RACKTABLE_PKEY = UniqueKeys0.RACKTABLE_PKEY;
    public static final UniqueKey<ScannerrackpositiontableRecord> SCANNERRACKPOSITIONTABLE_PKEY = UniqueKeys0.SCANNERRACKPOSITIONTABLE_PKEY;
    public static final UniqueKey<ScannertableRecord> SCANNERTABLE_PKEY = UniqueKeys0.SCANNERTABLE_PKEY;
    public static final UniqueKey<ScantableRecord> SCANTABLE_PKEY = UniqueKeys0.SCANTABLE_PKEY;
    public static final UniqueKey<SlidetableRecord> SLIDETABLE_PKEY = UniqueKeys0.SLIDETABLE_PKEY;
    public static final UniqueKey<StagingreferenzRecord> STAGINGREFERENZ_PKEY = UniqueKeys0.STAGINGREFERENZ_PKEY;
    public static final UniqueKey<StoragetableRecord> STORAGETABLE_PKEY = UniqueKeys0.STORAGETABLE_PKEY;
    public static final UniqueKey<TypetableRecord> TYPETABLE_PKEY = UniqueKeys0.TYPETABLE_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<InboxtableRecord, Integer> IDENTITY_INBOXTABLE = Internal.createIdentity(Inboxtable.INBOXTABLE, Inboxtable.INBOXTABLE.INBOXID);
        public static Identity<JsonuploadtableRecord, Integer> IDENTITY_JSONUPLOADTABLE = Internal.createIdentity(Jsonuploadtable.JSONUPLOADTABLE, Jsonuploadtable.JSONUPLOADTABLE.UPLOADID);
        public static Identity<SlideuploadtableRecord, Integer> IDENTITY_SLIDEUPLOADTABLE = Internal.createIdentity(Slideuploadtable.SLIDEUPLOADTABLE, Slideuploadtable.SLIDEUPLOADTABLE.UPLOADID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<DuplicatetableRecord> DUPLICATETABLE_PKEY = Internal.createUniqueKey(Duplicatetable.DUPLICATETABLE, "duplicatetable_pkey", Duplicatetable.DUPLICATETABLE.DUPLICATEID);
        public static final UniqueKey<IdmaptableRecord> IDMAPTABLE_PKEY = Internal.createUniqueKey(Idmaptable.IDMAPTABLE, "idmaptable_pkey", Idmaptable.IDMAPTABLE.INTERNALID, Idmaptable.IDMAPTABLE.EXTERNALID, Idmaptable.IDMAPTABLE.PROJECTID);
        public static final UniqueKey<InboxtableRecord> INBOXTABLE_PKEY = Internal.createUniqueKey(Inboxtable.INBOXTABLE, "inboxtable_pkey", Inboxtable.INBOXTABLE.INBOXID);
        public static final UniqueKey<KeyvaluetableRecord> KEYVALUETABLE_PKEY = Internal.createUniqueKey(Keyvaluetable.KEYVALUETABLE, "keyvaluetable_pkey", Keyvaluetable.KEYVALUETABLE.KEYVALUEID);
        public static final UniqueKey<ProjectkeyvaluemapRecord> PROJECTKEYVALUEMAP_PKEY = Internal.createUniqueKey(Projectkeyvaluemap.PROJECTKEYVALUEMAP, "projectkeyvaluemap_pkey", Projectkeyvaluemap.PROJECTKEYVALUEMAP.PROJECTID_FK, Projectkeyvaluemap.PROJECTKEYVALUEMAP.KEYVALUEID_FK);
        public static final UniqueKey<ProjecttableRecord> PROJECTTABLE_PKEY = Internal.createUniqueKey(Projecttable.PROJECTTABLE, "projecttable_pkey", Projecttable.PROJECTTABLE.PROJECTID);
        public static final UniqueKey<QualitytableRecord> QUALITYTABLE_PKEY = Internal.createUniqueKey(Qualitytable.QUALITYTABLE, "qualitytable_pkey", Qualitytable.QUALITYTABLE.QUALITYID);
        public static final UniqueKey<RackstatustableRecord> RACKSTATUSTABLE_PKEY = Internal.createUniqueKey(Rackstatustable.RACKSTATUSTABLE, "rackstatustable_pkey", Rackstatustable.RACKSTATUSTABLE.RACKSTATUSID);
        public static final UniqueKey<RacktableRecord> RACKTABLE_PKEY = Internal.createUniqueKey(Racktable.RACKTABLE, "racktable_pkey", Racktable.RACKTABLE.RACKID);
        public static final UniqueKey<ScannerrackpositiontableRecord> SCANNERRACKPOSITIONTABLE_PKEY = Internal.createUniqueKey(Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE, "scannerrackpositiontable_pkey", Scannerrackpositiontable.SCANNERRACKPOSITIONTABLE.SCANNERRACKPOSITIONID);
        public static final UniqueKey<ScannertableRecord> SCANNERTABLE_PKEY = Internal.createUniqueKey(Scannertable.SCANNERTABLE, "scannertable_pkey", Scannertable.SCANNERTABLE.SCANNERID);
        public static final UniqueKey<ScantableRecord> SCANTABLE_PKEY = Internal.createUniqueKey(Scantable.SCANTABLE, "scantable_pkey", Scantable.SCANTABLE.SCANID);
        public static final UniqueKey<SlidetableRecord> SLIDETABLE_PKEY = Internal.createUniqueKey(Slidetable.SLIDETABLE, "slidetable_pkey", Slidetable.SLIDETABLE.SLIDEID);
        public static final UniqueKey<StagingreferenzRecord> STAGINGREFERENZ_PKEY = Internal.createUniqueKey(Stagingreferenz.STAGINGREFERENZ, "stagingreferenz_pkey", Stagingreferenz.STAGINGREFERENZ.STAGEINGREFERENZID);
        public static final UniqueKey<StoragetableRecord> STORAGETABLE_PKEY = Internal.createUniqueKey(Storagetable.STORAGETABLE, "storagetable_pkey", Storagetable.STORAGETABLE.STORAGEID);
        public static final UniqueKey<TypetableRecord> TYPETABLE_PKEY = Internal.createUniqueKey(Typetable.TYPETABLE, "typetable_pkey", Typetable.TYPETABLE.TYPEID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", Users.USERS.USERID);
    }
}