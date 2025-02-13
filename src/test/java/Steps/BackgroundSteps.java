package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps 
{
	@Given("user logged in to the app")
	public void user_logged_in_to_the_app() {
System.out.println("Login in to app");
	}

	@When("user clicks on order link")
	public void user_clicks_on_order_link() {
System.out.println("clicks order tab");
	}

	@Then("user redirected to order page")
	public void user_redirected_to_order_page() {
	   System.out.println("order page displayed");
	}

	@When("user clicks on currently placed order")
	public void user_clicks_on_currently_placed_order() {
	 System.out.println("current order button clicks");
	}

	@Then("user should see current order info")
	public void user_should_see_current_order_info() {
		System.out.println("current order info displayed");
		System.out.println("===================");
	}
	
	@When("user clicks on previous placed order")
	public void user_clicks_on_previous_placed_order() {
	 System.out.println("Previosuly placed orders");
	}

	@Then("user should see previous order info")
	public void user_should_see_previous_order_info() {
System.out.println("Previous order info");
System.out.println("===================");
	}

	@When("user clicks on cancelled order")
	public void user_clicks_on_cancelled_order() {
	  System.out.println("cancelled order");
	}

	@Then("user should see cancelled order info")
	public void user_should_see_cancelled_order_info() {
		System.out.println("cancelled order info");
		System.out.println("===================");
	}

}
