package at.medunigraz.pathology.bibbox.datatools;

import at.medunigraz.pathology.bibbox.datatools.mamma.MammaStarter;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractGleasonScoring;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractProstateInformation;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractSamenblasenInvationInformation;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ToolRunner {
    //private static final Logger logger = LogManager.getLogManager().getLogger(ToolRunner.class.getName());

    private static boolean prostate_runner = false;
    private static boolean mamma_runner = false;
    private static boolean prostate_gleason_runner = false;
    private static boolean samenblasen_invation_runner = true;

    public static void main(String[] args) {
        System.out.println("ToolRunner started.");

        if(prostate_runner) {
            System.out.println("Prostate Runner.");
            ExtractProstateInformation extractProstateInformation = new ExtractProstateInformation();
            extractProstateInformation.splitDiagnosis();
        } else {
            System.out.println("Prostate Runner disabled.");
        }

        if(samenblasen_invation_runner) {
            System.out.println("Samenblasen Invation Runner.");
            ExtractSamenblasenInvationInformation extractSamenblasenInvationInformation = new ExtractSamenblasenInvationInformation();
            extractSamenblasenInvationInformation.extractInformation();
        } else {
            System.out.println("Samenblasen Invation Runner disabled.");
        }

        if(prostate_gleason_runner) {
            System.out.println("Prostate Gleason Runner.");
            ExtractGleasonScoring extractGleasonScoring = new ExtractGleasonScoring();
            extractGleasonScoring.extractGleastonScore();
        } else {
            System.out.println("Prostate Runner Gleason disabled.");
        }

        if(mamma_runner) {
            System.out.println("Mamma Runner.");
            MammaStarter mammaStarter = new MammaStarter();
            mammaStarter.run();
        } else {
            System.out.println("Mamma Runner disabled.");
        }
    }
}
