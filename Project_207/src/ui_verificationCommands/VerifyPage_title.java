package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyPage_title {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		String pageTitle=driver.getTitle();
		System.out.println("Current Window title is -->"+pageTitle);
		
		if(pageTitle.contains("Outlook"))
		{
			System.out.println("Outlook page is Opened");
			WebElement Signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			Signin.click();
			Thread.sleep(4000);
			
					if(driver.getTitle().contains("Sign in"))
					{
						System.out.println("Signin page is up");
					}
					else
					{
						System.err.println("Sign in page not displayed");
					}
		}
		else
		{
			System.err.println("Failed to load Outlook page");
		}
		
		

	}

}
