package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Deselecting_Dropdown_Options 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687993&long=78.5307417&shared=1");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Identify Dropdown element at webpage
		WebElement StateDD=driver.findElement(By.xpath("//select[@id='customState']"));
		
		//Using Javascript Converting Single Option Dropdown into Multiple Selection Type
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", StateDD);
		Thread.sleep(4000);
		
		//verify Dropdown is Multiple Selection Type
		boolean flag=new Select(StateDD).isMultiple();
		System.out.println("Dropdown Is Mutltiple Selection Type ? --> "+flag);
		
		
		if (flag) 
		{
			System.out.println("Dropdown is multiple option selection type");
			new Select(StateDD).deselectAll();   //This method only works on multiple selection type
			new Select(StateDD).selectByIndex(2);
			new Select(StateDD).selectByIndex(4);
			new Select(StateDD).selectByIndex(6);
			
			//Get All Selection Count
			int SelectionCount=new Select(StateDD).getAllSelectedOptions().size();
			System.out.println("Selection Count is---> "+SelectionCount);
			
			//Deselecting Option From Multiple Selection
			new Select(StateDD).deselectByIndex(4);
			
			
			//Get All Selection Count
			int DeSelectionCount=new Select(StateDD).getAllSelectedOptions().size();
			System.out.println("Selection Count is---> "+DeSelectionCount);

		}
		else 
		{
			System.out.println("Dropdown is Single Option Selection Type");
		}
		
	}

}
