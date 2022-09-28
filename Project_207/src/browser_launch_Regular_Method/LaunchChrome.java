package browser_launch_Regular_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  106.0
		 * 				Chrome Driver  =>  106.0
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to backup folder 
		 * 		=> with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		
		//Setting Runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome browser and storing into class Reference
		ChromeDriver chrome=new ChromeDriver();
	
		//loadwebpage
		chrome.get("http://facebook.com");
		
		//Print title of the page
		System.out.println(chrome.getTitle());
		
		//Close Chrome Browser
		chrome.close();
		
		
		
		
	}

}
