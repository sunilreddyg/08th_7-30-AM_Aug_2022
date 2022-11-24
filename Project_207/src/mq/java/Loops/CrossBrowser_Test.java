package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Test {

	public static void main(String[] args) throws Exception 
	{
		
		
		String browsers[]= {"chrome","firefox"};
		WebDriver driver = null;
		
		//outter loop
	    for (int i = 0; i < browsers.length; i++)
	    {
			String EachBrowser = browsers[i];
			
			if(EachBrowser.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(EachBrowser.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			
			String Footerlinks[][]= 
				{
						{"Sign Up","Sign up for Facebook | Facebook"},
						{"Log in","Log in to Facebook"},
						{"Messenger","Messenger"},
						{"Facebook Lite","Facebook Lite APK for Android"},
						{"Watch","Facebook Watch | Facebook"},
						{"Places","Discover great places in every city | Facebook"},
						{"Games","Games"},
				};
			
			for (int j = 0; j < Footerlinks.length; j++) 
			{
				 driver.get("http://facebook.com");
				 
				 String LinkName=Footerlinks[j][0];
				 String pageTitle=Footerlinks[j][1];
				 
				 driver.findElement(By.linkText(LinkName)).click();
				 Thread.sleep(2000);
				 
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				 if(wait.until(ExpectedConditions.titleIs(pageTitle)))
				 {
					 System.out.println(LinkName+"\t"+"Title verified");
				 }
				 else
				 {
					 System.out.println(LinkName+"\t"+"Title not verified");
				 }
			}
			
			
			
		}
		

	}

}
