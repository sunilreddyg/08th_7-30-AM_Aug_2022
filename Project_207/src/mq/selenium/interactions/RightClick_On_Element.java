package mq.selenium.interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_On_Element {

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Use Mouse Right click at location
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Element).perform();
		
		//Click Method using mouse interactions class
		WebElement Delete_button=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
		new Actions(driver).click(Delete_button).perform();
		
		
		//Switch to alert and close it
		driver.switchTo().alert().accept();
		
		
		
	}

}
