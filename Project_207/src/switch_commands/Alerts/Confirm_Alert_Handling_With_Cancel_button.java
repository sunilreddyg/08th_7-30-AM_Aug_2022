package switch_commands.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirm_Alert_Handling_With_Cancel_button {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    WebElement Cancel_link=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel_link.click();   //This command open Confirm alert page
	    Thread.sleep(10000);
	    
	    WebElement Confirm_box_link=driver.findElement(By.xpath("//button[contains(.,'click the button to display a confirm box')]"));
	    new Actions(driver).click(Confirm_box_link).perform();  //This action will bring confirmation alert
	    Thread.sleep(3000);
	    
	    
	    //Read Text at alert window
	    String alert_text=driver.switchTo().alert().getText();
	    System.out.println(alert_text);
	    
	    //Click on CanCel Tab at alert window
	    driver.switchTo().alert().dismiss();
	    System.out.println("Clicked at cancel tab");
	    
	    
	  
	   

	}

}
