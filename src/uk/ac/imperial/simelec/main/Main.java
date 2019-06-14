package uk.ac.imperial.simelec.main;

import uk.ac.imperial.simelec.SimElec;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws IOException {

        new LoadGenerator().generate(200, "", "syn_loads/");

    }
}
