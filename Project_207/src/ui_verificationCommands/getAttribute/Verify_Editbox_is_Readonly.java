package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Editbox_is_Readonly
{

	public static void main(String[] args) 
	{
		
		/*
		 * Sceanrio:--> verifying Editbox readonly status
		 * 
		 * 			Given Site url  "http://facebook.com"
		 * 			Then verify Email Textbox is in readonly mode...
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Convert editbox into editable mode
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').setAttribute('readonly','readonly')");
		
		
		WebElement Email=driver.findElement(By.id("email"));
		String Value=Email.getAttribute("readonly");
		//getattribute return null value when required property doesn't exist at html
		
		if(Value!=null  &&  Value=="true")
		{
			System.out.println("Editbox available in non editable mode");
		}
		else
		{
			System.out.println("Editbox available in  editable mode");
		}
		
		
		
		

	}

}
