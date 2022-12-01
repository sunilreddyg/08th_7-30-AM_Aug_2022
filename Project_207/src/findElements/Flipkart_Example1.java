package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Example1
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.clear();
		SearchBox.sendKeys("iphone 13 pro"+Keys.ENTER);
		
		
		By NextButton=By.xpath("//span[contains(.,'Next')]");
		By ProductTable=By.xpath("//div[@class='_1YokD2 _3Mn1Gg']");
		
		boolean visible_status=false;
		do {
			
			List<WebElement> Products=driver.findElement(ProductTable)
			.findElements(By.xpath("//div[contains(@class,'_1AtVbE')]"));
			
			for (int i = 3; i < Products.size()-2; i++) 
			{
				WebElement EachProduct=Products.get(i);
				String ProductName=EachProduct.findElement(By.className("_4rR01T")).getText();
				System.out.println(ProductName);
			}
			
			
			
			try {
				visible_status=new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.invisibilityOfElementLocated(NextButton));
			} catch (Exception e) {
				driver.findElement(NextButton).click();
				//e.printStackTrace();
			}
			
		} while (visible_status==false);
	}
}
