package at.medunigraz.pathology.bibbox.datatools;

import at.medunigraz.pathology.bibbox.datatools.mamma.MammaStarter;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractGleasonScoring;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractProstateInformation;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractSamenblasenInvationInformation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Record;
import org.jooq.meta.derby.sys.Sys;

public class ToolRunner {
    private static final Logger logger = LogManager.getLogger(ToolRunner.class);

    private static boolean prostate_runner = false;
    private static boolean mamma_runner = false;
    private static boolean prostate_gleason_runner = false;
    private static boolean samenblasen_invation_runner = true;

    public static void main(String[] args) {
        logger.info("ToolRunner started.");

        if(prostate_runner) {
            logger.info("Prostate Runner.");
            ExtractProstateInformation extractProstateInformation = new ExtractProstateInformation();
            extractProstateInformation.splitDiagnosis();
        } else {
            logger.info("Prostate Runner disabled.");
        }

        if(samenblasen_invation_runner) {
            logger.info("Samenblasen Invation Runner.");
            ExtractSamenblasenInvationInformation extractSamenblasenInvationInformation = new ExtractSamenblasenInvationInformation();
            extractSamenblasenInvationInformation.extractInformation();
        } else {
            logger.info("Samenblasen Invation Runner disabled.");
        }

        if(prostate_gleason_runner) {
            logger.info("Prostate Gleason Runner.");
            ExtractGleasonScoring extractGleasonScoring = new ExtractGleasonScoring();
            extractGleasonScoring.extractGleastonScore();
        } else {
            logger.info("Prostate Runner Gleason disabled.");
        }

        if(mamma_runner) {
            logger.info("Mamma Runner.");
            MammaStarter mammaStarter = new MammaStarter();
            mammaStarter.run();
        } else {
            logger.info("Mamma Runner disabled.");
        }
    }
}
