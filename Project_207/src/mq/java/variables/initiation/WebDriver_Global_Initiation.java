package mq.java.variables.initiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Global_Initiation 
{
	WebDriver driver=null;
	public void LaunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void LoadWebPage()
	{
		driver.get("http://facebook.com");
	}
	
	public void login()
	{
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Admin");
	}
	
	public static void main(String[] args) 
	{
		WebDriver_Global_Initiation obj=new WebDriver_Global_Initiation();
		obj.LaunchBrowser();
		obj.LoadWebPage();
		
	}

}
