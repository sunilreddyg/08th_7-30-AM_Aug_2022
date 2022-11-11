package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyElementPresented_Using_Try_Catch {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		try {
			
			WebElement Email=driver.findElement(By.id("email9787"));
			Email.clear();
			Email.sendKeys("darshan@gmail.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
