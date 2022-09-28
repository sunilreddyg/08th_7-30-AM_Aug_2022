package browser_launch_Regular_Method;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{

	public static void main(String[] args) {
		
		/*
		 * download geckodriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under firefox click on documentation link
		 * 		=> Find suitable driver version 
		 * 		=> click on geckodriver releases
		 * 		=>  Latest version   [0.30.0 ] Supports [> 78 firefox version]
		 *      =>  Under selected Selected version scroll down page until find Assets
		 *      =>  Download Zip format file w.r.t  Operating system and hotspot size
		 *      =>  After download unzip file to backup folder
		 *      => either set up environment variabe for geckodriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		  
		 //Setting runtime system variable for geckodriver.exe file
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		 
		  //launching firefox browser and storing into reference class
		  FirefoxDriver firefox=new FirefoxDriver();
		  
		  //Loading wbepage using browser reference
		  firefox.get("http://facebook.com");
		  System.out.println(firefox.getTitle());
		  
		  //Closing browser
		  firefox.close();
		  
		  

	}

}
