package browser_options.Chrome;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Set_Download_Directory 
{

	public static void main(String[] args) 
	{
		
		
	
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\MINDQ\\Downloads\\TESTCASES");
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");

		
		
		
		

	}

}
