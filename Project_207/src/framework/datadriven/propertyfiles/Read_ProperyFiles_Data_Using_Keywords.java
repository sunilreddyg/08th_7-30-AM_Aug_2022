package framework.datadriven.propertyfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_ProperyFiles_Data_Using_Keywords {

	public static void main(String[] args) 
	{
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url=Read_propertyFile.getProperty("application_url");
		driver.get(url);
	
	}

}
