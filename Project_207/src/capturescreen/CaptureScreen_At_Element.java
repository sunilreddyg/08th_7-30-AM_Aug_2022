package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreen_At_Element {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Capturing screen at selected location
		WebElement Footer_Area=driver.findElement(By.xpath("(//div[contains(@class,'abcm')])[7]"));
		File src=Footer_Area.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\Image1.png"));
		
	}

}
