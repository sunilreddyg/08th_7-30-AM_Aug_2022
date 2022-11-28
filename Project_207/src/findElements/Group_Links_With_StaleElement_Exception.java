package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Links_With_StaleElement_Exception {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		WebElement MenuTabs=driver.findElement(By.xpath("//h1[.='Recharge & Pay Bills on Paytm.']/following-sibling::div"));
		List<WebElement> AllLinks=MenuTabs.findElements(By.className("_2EGQY"));
		
		if(AllLinks.size() > 0)
		{
			System.out.println("Group links found and count is --> "+AllLinks.size());
			
			for (int j = 0; j < AllLinks.size(); j++) 
			{
				//Get Each Links using index number
				WebElement Eachlink=AllLinks.get(j);
				System.out.println(Eachlink.getText()+"      "+driver.getTitle());
				
				Eachlink.click();
				Thread.sleep(4000);
				
				driver.navigate().back();
				
				//Restore all links to avoid staleelement exception
				MenuTabs=driver.findElement(By.xpath("//h1[.='Recharge & Pay Bills on Paytm.']/following-sibling::div"));
				
			}
			
		}
		else
		{
			System.out.println("Links Return Zero");
		}
	}

}
