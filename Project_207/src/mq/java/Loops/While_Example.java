package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//print Numbers from 1 to 10
		int i=1;
		while (i <= 10) 
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//Print Numbers from 10 to 1
		int j=10;
		while (j > 0) 
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("http://facebook.com/reg");
		
		
		WebElement RetypeEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		boolean displaystatus=false;
		int count=0;
		while(displaystatus!=true)
		{
			try {
				displaystatus=new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(RetypeEmail)).isDisplayed();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			count=count+1;
			if(count==3)
			{
				throw new Exception("Element is Not Visible at webpage");
			}
		}
		
		System.out.println("Element is Presented");
		
		
	}
	
}
