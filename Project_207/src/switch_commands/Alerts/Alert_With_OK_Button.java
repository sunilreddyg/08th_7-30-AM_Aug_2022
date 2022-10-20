package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_With_OK_Button 
{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //Get Text presented at alert
	    String  AlertMsg=driver.switchTo().alert().getText();
	    System.out.println(AlertMsg);
	    
	    driver.switchTo().alert().accept();
	    
	    WebElement Cancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel.click();
	    System.out.println("Link is clicked");
	    
	    
	   
	    
	}

}
