package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_HandlingWith_Try_Catch {

	public static void main(String[] args) throws Exception {
		
		/*
		 *  Only Handle popup when it is presented at
		 *  webpage and Ignore it when alert was not presented
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    try {
	    	
	    	driver.switchTo().alert().accept();
	    	System.out.println("Alert Closed");
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		    
	   
	    WebElement Cancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel.click();
	    System.out.println("Cancel Link Clicked");
	    
	    
	    
	    
	    
	    

	}

}
