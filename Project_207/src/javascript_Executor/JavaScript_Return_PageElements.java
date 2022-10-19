package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Return_PageElements 
{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//Enabling javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Return page title using javascript
		String PageTitle=js.executeScript("return document.title").toString();
		System.out.println(PageTitle);
		
		//Return Absolute url of webpage
		String url=js.executeScript("return location.href").toString();
		System.out.println(url);
		
		//Return browser protocal
		String protocal=js.executeScript("return location.protocol").toString();
		System.out.println(protocal);
		
		//Return Cookies enabled
		String st=js.executeScript("return navigator.cookieEnabled").toString();
		System.out.println(st);
				
		//Return Cookies enabled
		String st1=js.executeScript("return navigator.platform").toString();
		System.out.println(st1);
		
		//Return Elemet Text
		WebElement TextElement=driver.findElement(By.xpath("//a[@class='_9bq5']"));
		String Text=js.executeScript("return arguments[0].innerText", TextElement).toString();
		System.out.println(Text);
		

	}

}
