package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{

@Given("user navigated to login page")
public void precondition()
{
System.out.println("Navigated to Login page");
}

@Given("user is at login page")
public void user_is_at_login_page() 
{
 System.out.println("User is at login page");
}

@When("user enters username")
public void enterUN()
{
	System.out.println("Username");
}

@When("user enters password")
public void enterPassword()
{
System.out.println("password");
	
}

@When("clicks login button")
public void ClickLoginButton()
{
	System.out.println("login button");

}

@Then("user redirects to homepage")
public void RedirectsToHomepage()
{
System.out.println("Redirected Homepage");

}

@Then("page title should be displayed")
public void page_title_should_be_displayed() {
 System.out.println("page title dislplayed");
 
}
@When("user enters username as {string}")
public void user_enters_username_as(String string) {
	System.out.println(string);
}

@When("user enters password as {string}")
public void user_enters_password_as(String string) {
    System.out.println(string);
}


}