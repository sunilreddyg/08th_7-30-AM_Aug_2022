package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps_UserReg 
{

	@When("user enter valid mobilenumber")
	public void user_enter_valid_mobilenumber() 
	{
	  System.out.println("Valid Mobile Number Entered");
	}
	
	@When("wait for OTP")
	public void wait_for_otp() 
	{
		System.out.println("TimeOut For OTP to Genarate");

	}
	@When("Enter valid OTP")
	public void enter_valid_otp() 
	{

		System.out.println("OTP is Ented");
	}
	@When("Click on Create Account Button")
	public void click_on_create_account_button() 
	{

		System.out.println("Create account button clicked");
	}
	@Then("Verify Registration successful message displayed")
	public void verify_registration_successful_message_displayed() 
	{

		System.out.println("Message Displayed");
	}

}
