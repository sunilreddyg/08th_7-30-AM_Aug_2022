package mq.selenium.Wrapping_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrap_Pageobjects {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//pageObject storing into WebElement Reference
		WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		System.out.println(Username.isDisplayed());  //Method print object visible status in true/false
		Username.clear();  							//Clear Existing text at Editbox
		Username.sendKeys("Admin");  				//Type text into editbox
		
		
		//pageObject storing into WebElement Reference
		WebElement Password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		System.out.println(Password.isDisplayed());
		Password.clear();
		Password.sendKeys("Hello@123");
		
		
		//Reusing Locator from Pageobjects class
		driver.findElement(PageObjects.hrm_login_button).click();
		
		
		
	}

}
