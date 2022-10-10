package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelection_Using_Click_method 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting Dropdown option using click method..
		driver.findElement(By.id("day"))
		.findElement(By.xpath("//option[@value='27'][contains(.,'27')]"))
		.click();
		
		
		//Selecting Dropdown Option using Click Method
		driver.findElement(By.xpath("//option[@value='6'][contains(.,'Jun')]")).click();
		
		

	}

}
