package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Selection_Methods {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Selecting Dropdown option using text property
		WebElement DOB_Day=driver.findElement(By.id("day"));
		new Select(DOB_Day).selectByVisibleText("28");
		
		
		//Selecting Dropdown option using Value Property
		WebElement DOB_month=driver.findElement(By.id("month"));
		new Select(DOB_month).selectByValue("8");
		
		//Selecting Dropdown option using index property
		WebElement DOB_year=driver.findElement(By.id("year"));
		new Select(DOB_year).selectByIndex(21);

	}

}
