package edu.arizona.osm.api.extractionlib.tests;

import edu.university.ecs.lab.intermediate.create.services.IRExtractionService;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class InitialTests {

  @Test
  public void InitialExperimentTest() {
    var testResourcesPath = System.getProperty("user.dir") + "/src/test/resources/";
    var configFileName = "config.test.json";
    var configFilePath = testResourcesPath + configFileName;
    var irFileName = "test-ir.json";
    var testIrFilePath = testResourcesPath + irFileName;

    var extractionService = new IRExtractionService(configFilePath, Optional.empty());
    extractionService.generateIR(testIrFilePath);
  }
}
