package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Required_Date_From_Calendar 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().window().maximize();
		
		
		//Click on Calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		String Exp_month="November 2023";
		String Exp_Date="24";
		
		
		
		while(true)
		{
			WebElement MonthHeader=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-title')]"));
			String Runtime_Month=MonthHeader.getText();
			System.out.println(Runtime_Month);
			
			if(Runtime_Month.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_Date)).click();
				break;
			}
			
			WebElement NextButton=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			NextButton.click();
			Thread.sleep(2000);
			
			
		}
		
		
		
		
		
		

	}

}
