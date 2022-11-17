package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Runtime_Properties 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(10000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		
		String Runtime_Class=Roundtrip.getAttribute("class");
		if(Runtime_Class.contains("selected"))
		{
			System.out.println("Roundtrip is selected");
			
			WebElement DoubleFares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[6]"));
			String DoubleFares_Class=DoubleFares.getAttribute("class");
			if(DoubleFares_Class.contains("isItemDisabled"))
				System.out.println("Testpass, As expected item is disabled");
			else
				System.out.println("Testfail, Double fares button available in enabled state");
			
		}
		else
		{
			System.out.println("PreCondtion failed roundtrip is not selected");
		}
		
		

	}

}
