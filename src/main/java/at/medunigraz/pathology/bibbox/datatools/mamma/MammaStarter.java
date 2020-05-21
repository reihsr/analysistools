package at.medunigraz.pathology.bibbox.datatools.mamma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MammaStarter {

    private static final Logger logger = LogManager.getLogger(MammaStarter.class);

    private Integer MAX_PROSTATE_ID = 0;//52376;
    private Integer INCREMENT = 1000;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";

    public void run() {
        Her2NeuExtractor her2NeuExtractor = new Her2NeuExtractor(pg_url, pg_user, pg_password);
        her2NeuExtractor.runHer2NeuDiscriptorExtraction();
    }
}
