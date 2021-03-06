/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.Donor;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.EventType;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.MedicalEvent;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.MedicalEventCodeIcd10Link;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.MedicalEventTnmStagingLink;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.Provider;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.Sample;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.SampleCodeIcd10Link;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.SampleTnmStagingLink;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.TnmStaging;
import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>test</code> schema.
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

    public static final Index DONOR_PKEY = Indexes0.DONOR_PKEY;
    public static final Index EVENT_TYPE_PKEY = Indexes0.EVENT_TYPE_PKEY;
    public static final Index MEDICAL_EVENT_PKEY = Indexes0.MEDICAL_EVENT_PKEY;
    public static final Index MEDICAL_EVENT_CODE_ICD10_LINK_PKEY = Indexes0.MEDICAL_EVENT_CODE_ICD10_LINK_PKEY;
    public static final Index MEDICAL_EVENT_TNM_STAGING_LINK_PKEY = Indexes0.MEDICAL_EVENT_TNM_STAGING_LINK_PKEY;
    public static final Index PROVIDER_PKEY = Indexes0.PROVIDER_PKEY;
    public static final Index SAMPLE_PKEY = Indexes0.SAMPLE_PKEY;
    public static final Index SAMPLE_CODE_ICD10_LINK_PKEY = Indexes0.SAMPLE_CODE_ICD10_LINK_PKEY;
    public static final Index SAMPLE_TNM_STAGING_LINK_PKEY = Indexes0.SAMPLE_TNM_STAGING_LINK_PKEY;
    public static final Index TNM_STAGING_PKEY = Indexes0.TNM_STAGING_PKEY;
    public static final Index USER_PKEY = Indexes0.USER_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index DONOR_PKEY = Internal.createIndex("donor_pkey", Donor.DONOR, new OrderField[] { Donor.DONOR.DONER_ID }, true);
        public static Index EVENT_TYPE_PKEY = Internal.createIndex("event_type_pkey", EventType.EVENT_TYPE, new OrderField[] { EventType.EVENT_TYPE.EVENT_TYPE_ID }, true);
        public static Index MEDICAL_EVENT_PKEY = Internal.createIndex("medical_event_pkey", MedicalEvent.MEDICAL_EVENT, new OrderField[] { MedicalEvent.MEDICAL_EVENT.MEDICAL_EVENT_ID }, true);
        public static Index MEDICAL_EVENT_CODE_ICD10_LINK_PKEY = Internal.createIndex("medical_event_code_icd10_link_pkey", MedicalEventCodeIcd10Link.MEDICAL_EVENT_CODE_ICD10_LINK, new OrderField[] { MedicalEventCodeIcd10Link.MEDICAL_EVENT_CODE_ICD10_LINK.MEDICAL_EVENT_CODE_ICD10_LINK_ID }, true);
        public static Index MEDICAL_EVENT_TNM_STAGING_LINK_PKEY = Internal.createIndex("medical_event_tnm_staging_link_pkey", MedicalEventTnmStagingLink.MEDICAL_EVENT_TNM_STAGING_LINK, new OrderField[] { MedicalEventTnmStagingLink.MEDICAL_EVENT_TNM_STAGING_LINK.MEDICAL_EVENT_TNM_STAGING_LINK_ID }, true);
        public static Index PROVIDER_PKEY = Internal.createIndex("provider_pkey", Provider.PROVIDER, new OrderField[] { Provider.PROVIDER.PROVIDER_ID }, true);
        public static Index SAMPLE_PKEY = Internal.createIndex("sample_pkey", Sample.SAMPLE, new OrderField[] { Sample.SAMPLE.SAMPLE_ID }, true);
        public static Index SAMPLE_CODE_ICD10_LINK_PKEY = Internal.createIndex("sample_code_icd10_link_pkey", SampleCodeIcd10Link.SAMPLE_CODE_ICD10_LINK, new OrderField[] { SampleCodeIcd10Link.SAMPLE_CODE_ICD10_LINK.SAMPLE_CODE_ICD10_LINK_ID }, true);
        public static Index SAMPLE_TNM_STAGING_LINK_PKEY = Internal.createIndex("sample_tnm_staging_link_pkey", SampleTnmStagingLink.SAMPLE_TNM_STAGING_LINK, new OrderField[] { SampleTnmStagingLink.SAMPLE_TNM_STAGING_LINK.SAMPLE_TNM_STAGING_LINK_ID }, true);
        public static Index TNM_STAGING_PKEY = Internal.createIndex("tnm_staging_pkey", TnmStaging.TNM_STAGING, new OrderField[] { TnmStaging.TNM_STAGING.TNM_ID }, true);
        public static Index USER_PKEY = Internal.createIndex("user_pkey", User.USER, new OrderField[] { User.USER.USER_ID }, true);
    }
}
