package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_5 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://naukri.com");
		
		
		/*
		 * avoidShutdownHook:-->
		 * 			Method keep browser open instead on closing it
		 * Create:-->
		 * 			It opens browser 
		 * get:-->
		 * 		   It load webpage to browser window
		 */
		
		driver.get("https://www.facebook.com/");
	    driver.manage().window().setSize(new Dimension(816, 576));
	    driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Newuser");
	    driver.findElement(By.name("lastname")).click();
	    driver.findElement(By.name("lastname")).sendKeys("Webdriver");
	    driver.findElement(By.name("reg_email__")).click();
	    driver.findElement(By.name("reg_email__")).sendKeys("info.dsnr@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).click();
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("info.dsnr@gmail.com");
	    driver.findElement(By.id("password_step_input")).click();
	    driver.findElement(By.id("password_step_input")).sendKeys("Hello123");
	    driver.findElement(By.id("day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("day"));
	      dropdown.findElement(By.xpath("//option[. = '15']")).click();
	    }
	    driver.findElement(By.id("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("month"));
	      dropdown.findElement(By.xpath("//option[. = 'Aug']")).click();
	    }
	    driver.findElement(By.id("year")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("year"));
	      dropdown.findElement(By.xpath("//option[. = '2008']")).click();
	    }
	    driver.findElement(By.xpath("//span/input")).click();

	}

}
