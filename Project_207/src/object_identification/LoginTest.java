package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("qadarshan.com");
		driver.findElement(By.id("pass")).sendKeys("Dekjgff");
		driver.findElement(By.name("login")).click();
		
	}

}
