package browser_options.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run_HeadLess 
{

	public static void main(String[] args) throws Exception 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		WebElement Element=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		Element.sendKeys("9030248855");
		System.out.println("Email Enter Successful");
		
	}

}
