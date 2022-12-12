package framework.datadriven.propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Data_From_propertyFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="src\\framework\\datadriven\\propertyfiles\\input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File is Located");
		
		//Create object for properties
		Properties repository=new Properties();
		repository.load(fi);
		System.out.println("InputData loaded into Repository");
		
		
		//Get Data from Repository
		String url=repository.getProperty("application_url");
		System.out.println(url);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		
		
		
		
		
	}

}
