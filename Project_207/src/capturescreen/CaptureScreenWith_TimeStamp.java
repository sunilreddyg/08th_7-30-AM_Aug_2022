package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenWith_TimeStamp {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Get Current System Date
		Date date=new Date();   //Import java.util;
		//Creating simple date formatter
		SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		//Using Date format converting current system date
		String Time=SDF.format(date);
		
		//Capturing screen at selected location
		WebElement Footer_Area=driver.findElement(By.xpath("(//div[contains(@class,'abcm')])[7]"));
		File src=Footer_Area.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\Image1"+Time+".png"));
		

	}

}
