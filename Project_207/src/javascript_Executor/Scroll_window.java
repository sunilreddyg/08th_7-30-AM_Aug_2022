package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_window {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		
		//Scroll the document to the vertical position 500
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(2000);
		
		
		//Scroll the document to the horizontal position 300
		js.executeScript("window.scrollTo(300, 0)");
		
		

	}

}
