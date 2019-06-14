package uk.ac.imperial.simelec.main;

import uk.ac.imperial.simelec.SimElec;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class LoadGenerator {


    public LoadGenerator() { }

    public void generate(int households, String folderBaseName, String folderPath) throws IOException {

        int month = 7;
        int nResidents = randBetween(1, 5);
        boolean weekend = false;

        for (int i = 0; i < households; i++) {
            SimElec simelec = new SimElec(month, nResidents, weekend, folderName(folderBaseName, folderPath, i));
            // Set some options
            simelec.setCalculateGrandTotals(true);
            simelec.setMakeRPlots(false);
// Run the model
            simelec.run();
        }

    }

    private String folderName(String folderBaseName, String folderPath, int folderNumber) {
        return folderPath + folderBaseName + folderNumber;
    }

    private int randBetween(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
