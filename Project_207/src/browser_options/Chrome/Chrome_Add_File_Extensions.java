package browser_options.Chrome;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Add_File_Extensions 
{

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod chrome Extensions using crx file
		 */
	
		//Adding extensions to automation browser
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\TruePath.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\XY.crx"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().deleteAllCookies();
		
		

	}

}
