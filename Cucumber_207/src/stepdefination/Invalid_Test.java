package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid_Test 
{
	WebDriver driver;
	
	@Given("Outlook Url at chrome")
	public void outlook_url_at_chrome() 
	{
		 driver = new ChromeDriver();
		 driver.get("https://outlook.live.com/owa/");
		 driver.manage().window().setSize(new Dimension(780, 540));

	}
	@Given("click on SignIn button")
	public void click_on_sign_in_button()
	{
		 driver.findElement(By.linkText("Sign in")).click();
	}
	
	@When("User enter valid username")
	public void user_enter_valid_username() throws Exception 
	{
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
	}
	@When("enter invalid password")
	public void enter_invalid_password() throws Exception 
	{
		driver.findElement(By.id("i0118")).sendKeys("dsfdsfdffdsfdf");
	    driver.findElement(By.id("idSIButton9")).click();

	}
	@Then("verify error message displayed")
	public void verify_error_message_displayed() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.textToBe(By.id("passwordError"), "You\'ve tried to sign in too many times with an incorrect account or password."));
	}


}
