package object_identification.classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Indentifications 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(RelativeLocator.with
				(By.tagName("input")).above(By.name("password")))
				.sendKeys("Username");
		
		
		driver.findElement(RelativeLocator.with
				(By.tagName("input")).below(By.name("username")))
		         .sendKeys("hello");
		
		Thread.sleep(5000);
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).
				below(By.name("password"))).click();
	}

}
