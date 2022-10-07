package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_Example 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type text into entrybox and press enter key..
		driver.findElement(By.xpath("//input[@name='loginfmt']"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Type text into password entrybox and press enter key
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys("hello@123"+Keys.ENTER);
		
		
		
		

	}

}
