package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_4 {

	public static void main(String[] args) 
	{
		
		/*
		 * WebDriver:-->
		 * 			=> Webdriver is a interface class it can automate
		 * 				all browser instances supported by selenium
		 * 
		 * 			=> Webdriver Can manage crossbrowser automation
		 * 				with multiple browser
		 */
		
		//Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		//LaunchBrowser and storing browser reference into WebDriver Interface
		WebDriver driver=new ChromeDriver();
		
		//Loading webpage to browser window
		driver.get("https://paytm.com");

		//Printing Page  title
		System.out.println(driver.getTitle());
		
		//Close browser window
		driver.close();
		
		
		
		
	}

}
