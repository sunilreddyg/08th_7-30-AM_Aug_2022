package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Identifying Group location and Finding list of links availale
		WebElement TrendingTabs=driver.findElement(By.id("trending-naukri-wdgt"));
		List<WebElement> AllLinks=TrendingTabs.findElements(By.className("ntc__chip-wrapper"));
		
		for (int i = 0; i < AllLinks.size(); i++) 
		{
			//Get Each link using index number
			WebElement EachLink=AllLinks.get(i);

			
			//Read Linkname and href
			String LinkName=EachLink.getText();
			String Linkhref=EachLink.getAttribute("href");
			//System.out.println(LinkName+"    "+Linkhref);
			
			//Click Each Link
			EachLink.click();
			Thread.sleep(5000);
			
			String MainwindowId=driver.getWindowHandle();
			for (String EachwindowID : driver.getWindowHandles()) 
			{
				if(!EachwindowID.equals(MainwindowId))
				{
					driver.switchTo().window(EachwindowID);
					if(driver.getCurrentUrl().contains(Linkhref))
					{
						System.out.println(LinkName+"   "+"Title matched");
					}
					else
					{
						System.out.println(LinkName+"   "+"Title mismatched");
					}
					driver.close();
					break;	
				}
				
			}
			//Switch to main window
			driver.switchTo().window(MainwindowId);
		}
		
		
		Thread.sleep(4000);
		
		
		
		
		
	}

}
