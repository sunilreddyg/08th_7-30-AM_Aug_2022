package mq.selenium.Wrapping_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjects 
{
	//Global Variable
	static By hrm_username=By.xpath("//input[contains(@name,'username')]");
	static By hrm_password=By.xpath("//input[@type='password']");
	static By hrm_login_button=By.xpath("//button[contains(.,'Login')]");
	
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(hrm_username).sendKeys("Admin");
		driver.findElement(hrm_password).sendKeys("admin123");
		driver.findElement(hrm_login_button).click();

	}

}
