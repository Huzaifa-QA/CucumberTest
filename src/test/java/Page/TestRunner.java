package Page;

import org.junit.runner.RunWith;
import StepDefination.Login;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/login.feature", glue={"Page"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports.html"}
		)
       
        
public class TestRunner extends Login  {
	
	
}
