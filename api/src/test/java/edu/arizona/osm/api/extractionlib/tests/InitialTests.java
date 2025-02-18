package edu.arizona.osm.api.extractionlib.tests;

import edu.university.ecs.lab.intermediate.create.services.IRExtractionService;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

public class InitialTests {

    @Test
    public void InitialExperimentTest() {
        var testResourcesPath = System.getProperty("user.dir") + "/src/test/resources/";
        var configFileName = "config.test.json";
        var configFilePath = testResourcesPath + configFileName;
        var irFileName = "test-ir.json";
        var testIrFilePath = testResourcesPath + irFileName;

        try {
            var extractionService = new IRExtractionService(configFilePath, Optional.empty());
            extractionService.generateIR(testIrFilePath);
        } catch (IOException | InterruptedException | GitAPIException e) {
            throw new RuntimeException(e);
        }
    }
}
