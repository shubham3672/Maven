package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\Background_keyword.feature"},
		glue= {"Steps","hooks"},
		publish = true
		)

public class BackgroundRunner extends AbstractTestNGCucumberTests
{

}
