package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_RequiredWindow_Using_Title 
{

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
	    Thread.sleep(2000);
	    
	    //Clicking Hyperlink [Open Page at New Window/Tab]
	    WebElement About=driver.findElement(By.linkText("About"));
	    About.click();
	    Thread.sleep(2000);
	    
	    //Clicking Hyperlink [Open Page at New Window/Tab]
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(2000);
	    
	    System.out.println("Before Switch Window Title is --> "+driver.getTitle());
	    
	    //Get All dynamic Window ID's
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    //Using foreach loop switch to all windows..
	    for (String EachWindowID : AllWindowIDs) 
	    {
			String PageTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(PageTitle.contains("Capture, Create"))
			{
				break;  //Break loop iteration
			}
			
		}
	    
	    
	    System.out.println("After switch window title is ---> "+driver.getTitle());
	    
	
	    //Switch Controls back to mainwindow
	    driver.switchTo().window(MainWindowID);
	}

}
