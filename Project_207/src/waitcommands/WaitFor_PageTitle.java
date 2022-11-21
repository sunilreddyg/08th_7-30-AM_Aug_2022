package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFor_PageTitle {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.titleIs("Instagram"));
		System.out.println("Instagram title verified");

		
		WebElement Signup=driver.findElement(By.xpath("//span[contains(.,'Sign up')]"));
		Signup.click();
		
		new WebDriverWait(driver,Duration.ofSeconds(20))
		.until(ExpectedConditions.titleContains("Sign up"));
		System.out.println("Signup title is presented");
		
		
		
	}

}
