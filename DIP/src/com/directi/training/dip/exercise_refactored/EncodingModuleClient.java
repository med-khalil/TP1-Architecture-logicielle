package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {

        IEncode encodingWithFiles = new EncodingWithFilesModule();
        IEncode encodingBasedOnNetworkAndDatabase = new EncodingBasedOnNetworkAndDatabaseModule();

        encodingWithFiles.encode();
        encodingBasedOnNetworkAndDatabase.encode();

    }
}
