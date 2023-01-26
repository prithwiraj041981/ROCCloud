package ROCLoginrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@ValidCredentialsLandlord", features = {"src/test/resources/login.feature"}, glue = {"ROCLogin"},
plugin = {"pretty","html:Report1"},dryRun = false,monochrome=true)


public class CucumberRunnerTestslandlordlogin extends AbstractTestNGCucumberTests{
	
	

}