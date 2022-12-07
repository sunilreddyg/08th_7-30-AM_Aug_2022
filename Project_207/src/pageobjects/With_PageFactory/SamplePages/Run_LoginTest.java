package pageobjects.With_PageFactory.SamplePages;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run_LoginTest {

	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Before
	public void setUp() throws Exception 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(10000);
		driver.close();
	}

	//@Test
	public void VerifyLoginPage() throws Exception 
	{
		driver.get(url);
		Thread.sleep(4000);
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		login.username.sendKeys("Admin");
		login.password.sendKeys("admin123");
		login.login_button.click();
	}

	
	
	@Test
	public void VerifyLoginTest_WithInvalidEmail() throws Exception
	{
		driver.get(url);
		Thread.sleep(4000);
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		login.enterusername("dhfjdhf");
		login.enterpassword("admin123");
		login.clickLoginbutton();
		Thread.sleep(4000);
		Assert.assertEquals("Invalid credentials", login.getLoginErrorText());
	}
}
