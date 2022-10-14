package mq.selenium.interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_Example1 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Origin_Textbox=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		
		//Keyboard interactions on selected location
		new Actions(driver).click(Origin_Textbox).sendKeys(Keys.BACK_SPACE)
		.pause(2000)
		.sendKeys("HYD").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(2000)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		
		

	}

}
