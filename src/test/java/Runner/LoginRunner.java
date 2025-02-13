package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\LoginVerifyTitle.feature"},
		glue= {"Steps"},
		publish = true
		)

public class LoginRunner extends AbstractTestNGCucumberTests
{

}
