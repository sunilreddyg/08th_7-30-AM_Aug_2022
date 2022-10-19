package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightObject_Using_Javascript {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		//Highlight Button With Outline
		WebElement CreateButton=driver.findElement(By.xpath("//a[contains(.,'Create New Account')]"));
		js.executeScript("arguments[0].style.outline='2px solid red'", CreateButton);

		
		//Setting background color to object..
		WebElement ForgotLink=driver.findElement(By.linkText("Forgotten password?"));
		js.executeScript("arguments[0].style.backgroundColor='yellow'", ForgotLink);
		
		
		
		
	}

}
