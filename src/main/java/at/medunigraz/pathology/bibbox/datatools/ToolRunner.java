package at.medunigraz.pathology.bibbox.datatools;

import at.medunigraz.pathology.bibbox.datatools.mamma.MammaStarter;
import at.medunigraz.pathology.bibbox.datatools.prostate.ExtractProstateInformation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Record;
import org.jooq.meta.derby.sys.Sys;

public class ToolRunner {
    private static final Logger logger = LogManager.getLogger(ToolRunner.class);

    private static boolean prostate_runner = false;
    private static boolean mamma_runner = false;

    public static void main(String[] args) {
        logger.info("ToolRunner started.");

        if(prostate_runner) {
            logger.info("Prostate Runner.");
            ExtractProstateInformation extractProstateInformation = new ExtractProstateInformation();
            extractProstateInformation.splitDiagnosis();
        } else {
            logger.info("Prostate Runner disabled.");
        }

        if(mamma_runner) {
            logger.info("Mamma Runner.");
            MammaStarter mammaStarter = new MammaStarter();
            mammaStarter.run();
        } else {
            logger.info("Mamma Runner disabled.");
        }

        String url = "http:\\/\\/searchbroker:8080\\/broker";

        int endindex = url.indexOf("/", 9);
        if(endindex == -1) {
            endindex = url.length();
        }
        url = url.substring(0, endindex);
        System.out.println(url);
    }
}
