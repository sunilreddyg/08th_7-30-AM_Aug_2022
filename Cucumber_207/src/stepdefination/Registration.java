package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration 
{
	
	@Given("site url as {string}")
	public void site_url_as(String string) 
	{
	    System.out.println("Url entered --->"+string);
	}
	@Given("click on Register with us")
	public void click_on_register_with_us()
	{
		System.out.println("Create registration button clicked");
	}
	@When("user enter valid mobilenumber {string}")
	public void user_enter_valid_mobilenumber(String string) 
	{
		System.out.println("Mobile Number Entered ---> "+string);
	}
	
	@When("Enter firstname as {string}")
	public void enter_firstname_as(String string) 
	{
	    System.out.println("Firstname Entered --> "+string);
	}
	@When("Enter Surname as {string}")
	public void enter_surname_as(String string) 
	{
	    System.out.println("Surname entered ---> "+string);
	}
	@When("Enter age as {int}")
	public void enter_age_as(Integer int1) 
	{
	   System.out.println("Age ented is --> "+int1);
	}
	
	@When("click on Register")
	public void click_on_register() 
	{
	    System.out.println("Register button clicked");
	}
	@Then("verify Sucessful message")
	public void verify_sucessful_message() 
	{
		System.out.println("Error message displayed");
	}

}
