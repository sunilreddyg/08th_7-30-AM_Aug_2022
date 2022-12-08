package pageobjects.With_PageFactory.SamplePages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run_Loginpage1 
{
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
	
	@Test
	public void VerifyLogin()
	{
		HRM_Loginpage1 login=new HRM_Loginpage1(driver);
		login.Userlogin("Admin", "admin123");
	}


}
