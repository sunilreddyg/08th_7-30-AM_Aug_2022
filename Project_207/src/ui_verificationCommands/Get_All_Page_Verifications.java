package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_All_Page_Verifications 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		String pageTitle=driver.getTitle();
		System.out.println("Current Window title is -->"+pageTitle);
		
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("Current Url is ---> "+pageurl);
		
		
		String WindowID=driver.getWindowHandle();
		System.out.println("Window Id is ---> "+WindowID);
		
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		
		driver.close();
		
		

	}

}
