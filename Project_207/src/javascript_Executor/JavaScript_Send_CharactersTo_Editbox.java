package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Send_CharactersTo_Editbox {

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		driver.findElement(By.id("email")).sendKeys("Darshan");
		
		//Using Javscript Executor set value to Editbox..
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='Darshan'");
		
		//Javascript Using Xpath Identification
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].value='Hello@123'", password);
		
		
		
		
		
		
		

	}

}
