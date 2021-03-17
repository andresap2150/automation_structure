package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/", glue = "steps")
public class Runner extends AbstractTestNGCucumberTests{
}
