package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_ElementTobe_Clickable 
{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		//Enable explicitwait at automaiton driver
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//Wait Until Email Visible at webpage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("info@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("info@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		System.out.println("Element available at clickable state");

	}

}
