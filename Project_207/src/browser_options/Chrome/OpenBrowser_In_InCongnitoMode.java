package browser_options.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser_In_InCongnitoMode {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		
		
		

	}

}
