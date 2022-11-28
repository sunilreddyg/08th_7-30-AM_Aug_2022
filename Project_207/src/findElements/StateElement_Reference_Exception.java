package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateElement_Reference_Exception 
{

	public static void main(String[] args) 
	{
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		By Obj_email=By.id("email");
		driver.findElement(Obj_email).sendKeys("User1");
		
		//Method Refresh Page
		driver.navigate().refresh();
		
		driver.findElement(Obj_email).clear();
		driver.findElement(Obj_email).sendKeys("user2");
		
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.clear();
		Password.sendKeys("Rajesh");
		
		//Method Refresh Page
		driver.navigate().refresh();
		
		Password.clear();
		Password.sendKeys("Admin");
		
		
	}

}
