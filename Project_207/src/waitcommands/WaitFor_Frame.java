package waitcommands;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFor_Frame 
{

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(100))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
			System.out.println("expected Frame loaded and applied switch to It");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("Darshan@gmail.com");
		
		
		
		
	}

}
