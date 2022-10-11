package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Dropdown_Multiple_SelectionType 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687993&long=78.5307417&shared=1");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement StateDD=driver.findElement(By.xpath("//select[@id='customState']"));
		boolean flag=new Select(StateDD).isMultiple();
		System.out.println("Dropdown Is Mutltiple Selection Type ? --> "+flag);
		
		//Using Javascript Converting Single Option Dropdown into Multiple Selection Type
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", StateDD);
		Thread.sleep(4000);
		
		//verify Dropdown is Multiple Selection Type
		boolean flag1=new Select(StateDD).isMultiple();
		System.out.println("Dropdown Is Mutltiple Selection Type ? --> "+flag1);
		
	}

}
