package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\shubham.agrawal\\eclipse-workspace\\Cucumber1\\src\\test\\resources\\appFeatures\\demoqa.feature"},
		glue= {"Steps","demoqahooks"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		)
public class DemoqaRunner extends AbstractTestNGCucumberTests 
{

}
