package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Input_From_Editbox {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Darshan");
		Thread.sleep(10000);
		
		//Method usefull only to read input from editbox
		String Runtime_value=email.getAttribute("value");
		System.out.println(Runtime_value);
	}

}
