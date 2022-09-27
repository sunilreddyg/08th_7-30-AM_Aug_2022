package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser 
{

	public static void main(String[] args)
	{
		//setup chromedriver
		WebDriverManager.chromedriver().setup();
		
		//OpenChrome browser and load webpage
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		
		//Print Page Title
		System.out.println(chrome.getTitle());
		
		//Close browser
		chrome.close();
	}

}
