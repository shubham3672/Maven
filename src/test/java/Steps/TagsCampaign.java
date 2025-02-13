package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsCampaign 
{
	@Given("user is at campaign page")
	public void user_is_at_campaign_page() {
	 System.out.println("campaign page");
	 }

	@When("user clicks on campaign button")
	public void user_clicks_on_campaign_button() {
System.out.println("Click on campaign button");
	}

	@When("user enters information")
	public void user_enters_information() {
	System.out.println("enters info");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		System.out.println("Clicks save button");
	}

	@Then("campaign should be created")
	public void campaign_should_be_created() {
System.out.println("campaign created");
	}

	@When("user clicks on edit campaign")
	public void user_clicks_on_edit_campaign() {
		System.out.println("Clicks on edit campaign");
	}

	@When("user enters schedule information")
	public void user_enters_schedule_information() {
System.out.println("Enters scheduled info");
	}

	@Then("campaign should be scheduled")
	public void campaign_should_be_scheduled() {
System.out.println("campaign scheduled");	
}
}
