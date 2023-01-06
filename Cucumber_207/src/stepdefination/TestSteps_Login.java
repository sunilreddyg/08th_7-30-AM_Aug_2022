package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps_Login 
{
	
	@Given("Enter Facebook Site url")
	public void enter_facebook_site_url() 
	{
	   System.out.println("Facebook Page is Opened");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() 
	{
		System.out.println("Valid Username and Password Entered");
	}
	@When("click on Login Button")
	public void click_on_login_button() 
	{
	    System.out.println("Login Button Clicked");
	}
	@Then("verify Login successful message")
	public void verify_login_successful_message() 
	{
	   System.out.println("Login Successful message displayed");
	}



}
