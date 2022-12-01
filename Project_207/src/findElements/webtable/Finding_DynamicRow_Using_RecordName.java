package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding_DynamicRow_Using_RecordName 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		
		WebElement Table=driver.findElement(By.xpath("//table[contains(@id,'tbl_sector0')]"));
		
		//Identifying list of rows under table
		List<WebElement> Rows=Table.findElements(By.tagName("tr"));
		//Remove First Row 
		Rows.remove(0);
		
		//iterate for number of rows
		for (int i = 0; i < Rows.size(); i++) 
		{
			//Targeting each row using Loop Increment
			WebElement SelectedRow=Rows.get(i);
			
			//Get EachRowText
			String RowText=SelectedRow.getText();
			
			if(RowText.contains("Axis Bank Ltd"))
			{
				System.out.println("Today Share Position is --> "+(i+1));
				//Finding list of Cell under Selected Row
				List<WebElement> Cells=SelectedRow.findElements(By.tagName("td"));
				
				//Target perticular cell using index number
				String ShareName=Cells.get(0).getText();
				String MarketCapital=Cells.get(1).getText();
				String LTPPrice=Cells.get(2).getText();
				
				System.out.println(ShareName+"\t"+MarketCapital+"\t"+LTPPrice);
				
				String Price=LTPPrice.substring(0,3);
				System.out.println(Price);
				
				//Data Wrapping 
				int PriceInNum=Integer.parseInt(Price);
				boolean pricerange=false;
				while(pricerange!=true)
				{
					if(PriceInNum>900  || PriceInNum <= 902)
					{
						Cells.get(0).click();
						Thread.sleep(3000);
						WebElement Buy=driver.findElement(By.xpath("(//a[contains(.,'BUY')])[1]"));
						Buy.click();
						pricerange=true;
						break;
					}
					
				}
				
			}
			

		}
		
		

	}

}
