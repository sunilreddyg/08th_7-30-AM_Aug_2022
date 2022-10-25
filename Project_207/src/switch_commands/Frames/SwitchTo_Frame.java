package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Switch to frame using Frame ID
	    driver.switchTo().frame("modal_window");
	  
	   //Identifying objects under frame..
	    WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	    Email.sendKeys("info.dsnr@gmail.com");
	    
	    WebElement tripId=driver.findElement(By.id("tripidSecond"));
	    tripId.sendKeys("67897897");
	    
	    //Switch Controls back to MainPage
	    driver.switchTo().defaultContent();
	    
	    //Identifying Object Under page
	    WebElement Home=driver.findElement(By.xpath("//a[@title='Home']"));
	    Home.click();
	    
	  
	}

}
