package Cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/java/Cucumber"
, glue = "Cucumber.StepDefs", tags="@PassValues")

@RunWith(Cucumber.class)

public class testRunner {
}
