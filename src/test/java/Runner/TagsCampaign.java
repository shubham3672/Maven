package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\tagsCampaign.feature"},
		glue= {"Steps"},
		plugin = {"pretty"},
		tags="(@Sanity or @Regression) and (not @Functioanl)",
		dryRun = false
		)

public class TagsCampaign extends AbstractTestNGCucumberTests 
{

}
