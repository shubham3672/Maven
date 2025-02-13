package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\appFeatures\\Datatable.feature"},
		glue= {"Steps","hooks"},
		plugin = {"pretty"}
		//publish = true
		)

public class DatatableRunner extends AbstractTestNGCucumberTests
{

}
