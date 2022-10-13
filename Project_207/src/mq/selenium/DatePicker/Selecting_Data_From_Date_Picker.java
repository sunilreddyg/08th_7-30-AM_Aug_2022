package mq.selenium.DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Data_From_Date_Picker {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Open DatePicker
	driver.findElement(By.id("datepicker")).click();

	//Select a date by clicking on it..
	driver.findElement(By.linkText("24")).click();
	
	
	
	/*
	 * If Datepicker editbox is in editable format
	 * so that we can type required date
	 */
	driver.findElement(By.id("datepicker")).clear();
	driver.findElement(By.id("datepicker")).sendKeys("06/25/2022"+Keys.ESCAPE);
	
	
	}

}
