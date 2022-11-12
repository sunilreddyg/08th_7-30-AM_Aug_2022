package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Text_Presented_At_location {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String ErrorText=Error_location.getText();
		
		String Exp_error_text="Enter a valid email address, phone number, or Skype name.";
		if(!ErrorText.isEmpty())
		{
			System.out.println("location Contains Text");
			if(Exp_error_text.equals(ErrorText))
				System.out.println("Testpass, Expected Text Displayed at Webapge");
			else
				System.out.println("Testfail, Expected text not displayed at webpage");
		}
		else
		{
			System.out.println("location doesn't contains text");
		}
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
