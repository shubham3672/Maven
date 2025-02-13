package Steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DemoqadriverConfig.DriverFactory;
import Demoqapages.POM_Demoqa_PracticeForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoqaSteps 
{
	POM_Demoqa_PracticeForm p1=new POM_Demoqa_PracticeForm(DriverFactory.getDriver());
	WebDriver driver;
	@Given("user navigated to form page")
	public void user_navigated_to_form_page() 
	{
	WebDriver driver =DriverFactory.getDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	
	}

	@When("user enters name")
	public void user_enters_name() {
		p1.enterFN("s");
	}

	@When("user enters lastname")
	public void user_enters_lastname() {
	    p1.enterLN("a");
	}

	@When("user enters email")
	public void user_enters_email() {
p1.enterEmail("sa@gmail.com");
	}

	@When("user selects gender")
	public void user_selects_gender() {
p1.selectGendermale();
	}

	@When("user enters mobileno")
	public void user_enters_mobileno() {
p1.enterMobile("9876543210");
	}

	@When("user enters dob")
	public void user_enters_dob() throws InterruptedException {
p1.Click_DOB();
p1.selectYear("1994");
p1.selectMonth("April");
p1.selectDay("15");

	}


	@When("user selects hobbies")
	public void user_selects_hobbies() {
p1.selectHobbiesMusic();
p1.selectHobbiesReading();
p1.selectHobbiesSports();
	}

	@When("user enters current address")
	public void user_enters_current_address() {
p1.enterAddress();

	}

	@When("user selects state")
	public void user_selects_state() throws InterruptedException {
p1.selectState();
	}

	@When("user selects city")
	public void user_selects_city() throws InterruptedException {
	 p1.selectCity();
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
	   p1.clickSubmit();
	}

	@Then("user redirects to nextpage")
	public void user_redirects_to_nextpage() {
	 String act=   p1.verifySubmissionForm();
String exp="Thanks for submitting the form";
Assert.assertEquals(act, exp);
	}
}
