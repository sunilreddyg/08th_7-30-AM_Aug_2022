package mq.selenium.AutoCompleteEditbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Options_From_AutoCompleted_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		
		//Identifying auto complete editbox and typing reference text init
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='OutletSearch']"));
		SearchBox.sendKeys("hyderabad");
		Thread.sleep(4000);  //Static timegap to load Reference City List
		driver.findElement(By.xpath("//li[@class='suggestions-list active']")).click();

	}

}
