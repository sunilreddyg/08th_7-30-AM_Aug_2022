package findElements.webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_Reading_nextPage_records 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.icicidirect.com/share-market-today/indices");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		By Next_btn=By.xpath("//a[contains(@id,'tblIdxMoment_next')]");
		while(true)
		{
			
			WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tblIdxMoment')]"));
			//Identifying list of rows under table
			List<WebElement> Rows=Table.findElements(By.tagName("tr"));
			System.out.println("Number of rows available is ---> "+Rows.size());
			//Remove First Row Row
			Rows.remove(0);
			
			
			try {
				new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.attributeContains(Next_btn, "class", "disabled"));
				break;
			} catch (Exception e) {
				driver.findElement(Next_btn).click();
			}
			
		}
		

	}

}
