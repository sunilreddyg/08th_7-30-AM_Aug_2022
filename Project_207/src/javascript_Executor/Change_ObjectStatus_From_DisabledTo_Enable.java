package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Change_ObjectStatus_From_DisabledTo_Enable {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
				
		//Location of Login button
		WebElement LogIn=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].removeAttribute('disabled')", LogIn);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
