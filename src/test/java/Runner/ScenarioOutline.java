package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\ScenarioOutline.feature"},
		glue= {"Steps"},
		publish = true
		)

public class ScenarioOutline extends AbstractTestNGCucumberTests
{

}
