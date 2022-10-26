package switch_commands.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchto_New_Window 
{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    //Capturing current window id
	    String MainwindowID=driver.getWindowHandle();
	   
	    System.out.println(driver.getTitle());
	    
	    //Creating New window
	    WebDriver meta=driver.switchTo().newWindow(WindowType.WINDOW);
	    meta.get("https://about.meta.com/");
	    System.out.println(meta.getTitle());
	    String MetaWindowID=meta.getWindowHandle();
	    
	    
	    meta.switchTo().window(MainwindowID);
	    System.out.println(driver.getTitle());
	    
	  
	    driver.switchTo().window(MetaWindowID);
	    System.out.println(driver.getTitle());

	}

}
