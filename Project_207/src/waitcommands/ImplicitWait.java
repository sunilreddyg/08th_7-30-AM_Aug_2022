package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait 
{
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//This syntax enable timeout to wait until object load at Document Object Model[DOM]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//This syntax enable pageloadtimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
	
		
		long starttime=System.currentTimeMillis();
	
		try {
			driver.findElement(By.id("email@123"));
			System.out.println("Object is Found");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not found");
			System.out.println(System.currentTimeMillis()-starttime);
		}
	
	
	
	
	
	
	
	
	
	
	

	}

}
