package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Link 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		

		Thread.sleep(2000);
		driver.findElement(By.linkText("Locations")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("FortArea")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/explore/locations/558866570980556/mumbai-/']")).click();
		
	}

}
