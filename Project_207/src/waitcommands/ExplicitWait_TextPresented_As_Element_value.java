package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_TextPresented_As_Element_value {

	public static void main(String[] args) {
		
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116")).sendKeys("9030222222");

		
		//Enable explicitwait on automation browser
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.textToBePresentInElementValue(By.id("i0116"), "9030248855"));
			System.out.println("Input Presented at editbox");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
