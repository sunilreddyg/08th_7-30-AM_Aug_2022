package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Screen {

	public static void main(String[] args) throws InterruptedException, IOException  
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Capturing screen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Creating folder under project
		FileHandler.createDir(new File("Screens"));
		//Copying file to local system
		FileHandler.copy(src, new File("Screens\\image.png"));
		
		
		
		
	}

}
