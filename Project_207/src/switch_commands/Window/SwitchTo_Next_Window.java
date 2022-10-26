package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    //Get Current Window Dynamic ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    //Clicking Hyperlink [Open Page at New Window/Tab]
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    
	    System.out.println("Before Switch Window Title is --> "+driver.getTitle());
	    
	    //Get All dynamic Window ID's
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    for (String EachWindowID : AllWindowIDs) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    
	    /*
	     * Here is the assumption when loop finished by default
	     * controls exist at second window..
	     */
	    
	    Thread.sleep(2000);
	    System.out.println("After switch window title is ---> "+driver.getTitle());
	    

	    //Get Controls Back to MainWindow
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Main window title is ---> "+driver.getTitle());
	}

}
