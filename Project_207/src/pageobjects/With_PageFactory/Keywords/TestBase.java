package pageobjects.With_PageFactory.Keywords;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	protected WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public void SetupFirefox()
	{
		try {
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
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
