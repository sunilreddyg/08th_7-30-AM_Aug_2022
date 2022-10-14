package mq.selenium.interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click_Action
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		WebElement Button_link=driver.findElement(By.xpath("//button[contains(.,'Buttons')]"));
		Button_link.click();
		Thread.sleep(4000);
		
		WebElement Element=driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"));
		new Actions(driver).doubleClick(Element).perform();

	}

}
