package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Data_From_WebTable_Using_Spefic_Row_And_Cell
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		
		WebElement Table=driver.findElement(By.xpath("//table[@class='common-table medium js-table']"));
		
		//Identifying list of rows under table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		//Remove First Row Row
		Rows.remove(0);
		
		//Target Any perticular row using index number
		WebElement SelectedRow=Rows.get(0);
		
		//Finding list of Cell under Selected Row
		List<WebElement> Cells=SelectedRow.findElements(By.tagName("td"));
		
		//Target perticular cell using index number
		String Date=Cells.get(0).getText();
		String HighPrice=Cells.get(3).getText();
		
		System.out.println(Date+"   "+HighPrice);
		
		
	}

}
