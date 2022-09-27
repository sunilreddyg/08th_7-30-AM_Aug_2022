package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {

	public static void main(String[] args)
	{
		
		//Setup FirefoxDriver
		WebDriverManager.firefoxdriver().setup();
		
		//Open Browser and Loadwebpage
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://instagram.com");
		
		//Print page title
		System.out.println(firefox.getTitle());
		
		//CLose browser
		firefox.close();

	}

}
