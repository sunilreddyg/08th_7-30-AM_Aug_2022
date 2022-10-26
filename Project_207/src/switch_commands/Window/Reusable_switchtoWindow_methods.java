package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable_switchtoWindow_methods 
{
	
	
	WebDriver driver;
	String mainwindow;
	public Reusable_switchtoWindow_methods(WebDriver driver)
	{
		this.driver=driver;
		mainwindow=driver.getWindowHandle();
	}
	
	
	//method switchto next window
	public void switchToNextWindow()
	{
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) 
		{
			driver.switchTo().window(eachwindow);
		}
		
	}
	
	//Method switch to required window with help of window title
	public void switchToNextWindow_withTitle(String ExpTitle)
	{
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) 
		{
			String PageTitle=driver.switchTo().window(eachwindow).getTitle();
			if(PageTitle.contains(ExpTitle))
			{
				break;
			}
		}
		
	}
	
	//Method switch to mainwindow
	public void SwitchToMainwindow()
	{
		driver.switchTo().window(mainwindow);
	}
	
	public static void main(String args[]) throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();     
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //Clicking Hyperlink [Open Page at New Window/Tab]
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(2000);
	    
	    Reusable_switchtoWindow_methods obj=new Reusable_switchtoWindow_methods(driver);
	    obj.switchToNextWindow();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    
	 
	    obj.SwitchToMainwindow();
	    System.out.println(driver.getTitle());
	    
	}
	
	

}
