package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Element_At_PageSource {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
	
		if(driver.getPageSource().contains("email"))
		{
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("darshan@gmail.com");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		

	}

}
