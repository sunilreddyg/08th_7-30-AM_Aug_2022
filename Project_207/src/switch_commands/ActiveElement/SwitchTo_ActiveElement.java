package switch_commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_ActiveElement 
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();    
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    //Method switch to active element and allow set of webelement actions to perform
	    driver.switchTo().activeElement().sendKeys("Darshan");

	}

}
