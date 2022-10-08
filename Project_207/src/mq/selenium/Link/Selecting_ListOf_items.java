package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_ListOf_items {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click method to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		
		//Click Method to select one of item under list..
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		
		
		
		

	}

}
