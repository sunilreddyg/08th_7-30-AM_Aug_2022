package mq.selenium.AutoCompleteEditbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete_Editbox_With_IMplicit_Wait {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		/*
		 * Implicitwait:-->
		 * 		=> Set timeout until object loaded into document object model [DOM]
		 * 		=> This timeout enabled on NosuchElement Exception..
		 * 		
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Click on from label
		driver.findElement(By.xpath("(//span[contains(.,'From')])[1]")).click();

		//Type Reference name
		driver.findElement(By.xpath("//input[@placeholder='From']"))
		.sendKeys("VTZ");
		
		//Click on City
		WebElement ViZag_City=driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Visakhapatnam, India Visakhapatnam International Airport')]"));
		ViZag_City.click();
		
		
		//Type Referenc Name
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"))
		.sendKeys("BLR");
		
		//Click on City
		WebElement BangloreCity=driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][contains(.,'Bengaluru, India')]"));
		BangloreCity.click();
		
		
		//Select Date
		WebElement DepartueDate=driver.findElement(By.xpath("(//p[@class=' todayPrice'][contains(.,'₹ 6,477')])[2]"));
		DepartueDate.click();
		
	}

}
