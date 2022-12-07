package pageobjects.Without_PageFactory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	WebDriver driver;
	
	public void SetupFirefox()
	{
		try {
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			driver.get(CommonObjects.Ip_hrm_url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void Account_login()
	{
		if(driver!=null)
		{
			driver.findElement(CommonObjects.Login_uid)
			.sendKeys(CommonObjects.Ip_uid);
			
			driver.findElement(CommonObjects.Login_pwd)
			.sendKeys(CommonObjects.Ip_password);
			
			driver.findElement(CommonObjects.Login_submit_button).click();
		}
		else
		{
			System.err.println("Browser is Not Initiated");
		}
	}
	
	
	public void static_time(long msec)
	{
		try {
			Thread.sleep(msec);
		} catch (Exception e) {
			
		}
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}

}
