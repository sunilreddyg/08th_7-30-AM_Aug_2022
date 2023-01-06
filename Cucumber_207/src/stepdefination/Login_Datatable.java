package stepdefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Datatable 
{
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
	    System.out.println("Browser is Up And Homepage is Opened");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() 
	{
	   System.out.println("Succesfully navigated to Login page");
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) 
	{
		   for (List<String> list: dataTable.asLists()) 
		   {
			     System.out.println(list);
		   }
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	    System.out.println("Error message displayed");
	}


}
