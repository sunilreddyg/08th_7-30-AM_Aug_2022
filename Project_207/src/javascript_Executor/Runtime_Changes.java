package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runtime_Changes {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);

		
		WebElement Email=driver.findElement(By.id("email"));
		
		//Hiding object using javascript
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.visibility = 'hidden'", Email);
		
		
		//Get Object to visible at webpage
		Thread.sleep(5000);
		js.executeScript("arguments[0].style.visibility = 'visible'", Email);
		
		
		//Disable Object at webpage
		Thread.sleep(5000);
		js.executeScript("arguments[0].disabled = true", Email);
		
		//Get Disable object to enable
		Thread.sleep(5000);
		js.executeScript("arguments[0].disabled = false", Email);
		
		
		//Identify Link
		WebElement Signup=driver.findElement(By.linkText("Sign Up"));
		js.executeScript("arguments[0].setAttribute('target','_blank')", Signup);
		Signup.click();
	
		
	}

}
