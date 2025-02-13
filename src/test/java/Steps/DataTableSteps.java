package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class DataTableSteps 
{
	@Given("user is at account opening page")
	public void user_is_at_account_opening_page() {
System.out.println("Account opening page");
	}

//	@When("user enters data in following manner")
//	public void user_enters_data_in_following_manner(DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		List<String> firstlist = data.get(0);
//		System.out.println(firstlist);
//		String mail=firstlist.get(2);
//		System.out.println(mail);
//		System.out.println("row size of datatable is: "+data.size());
//		System.out.println("column size is: "+firstlist.size());
//	  	}
	
	@When("user enters data in following manner")
	public void user_enters_data_in_following_manner(DataTable dataTable) 
	{

	List<Map<String, String>> data1 = dataTable.asMaps();
	String LN=data1.get(0).get("LN");
	System.out.println(LN+" :of data1");
	}
	

	@When("clicks on submit button")
	public void clicks_on_submit_button() {
	    System.out.println("submit button");
	}

	@Then("nominee name must be added")
	public void nominee_name_must_be_added() {
		System.out.println("Nominee added successfully");
	}

}
