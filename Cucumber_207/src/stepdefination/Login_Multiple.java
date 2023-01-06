package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Multiple 
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
		String UID1=dataTable.row(0).get(0);
		String PWD1=dataTable.row(0).get(1);
		
		System.out.println(UID1+"   "+PWD1);
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	    System.out.println("Error message displayed");
	}


}
