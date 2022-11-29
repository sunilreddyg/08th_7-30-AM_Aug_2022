package findElements.webtable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Specfic_CellData_From_All_Rows 
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
		//Remove First Row 
		Rows.remove(0);
		
		//iterate for number of rows
		for (int i = 0; i < Rows.size(); i++) 
		{

			//Targeting each row using Loop Increment
			WebElement SelectedRow=Rows.get(i);
			
			//Finding list of Cell under Selected Row
			List<WebElement> Cells=SelectedRow.findElements(By.tagName("td"));
			
			//Target perticular cell using index number
			String Date=Cells.get(0).getText();
			String HighPrice=Cells.get(3).getText();
			
			System.out.println(Date+"\t"+HighPrice);
			
		}
		
		
	}

}
