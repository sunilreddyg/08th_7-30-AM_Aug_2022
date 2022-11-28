package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Identifying Month dropdown and Collect All Options into List Interface
		WebElement Month_DD=driver.findElement(By.name("birthday_month"));
		List<WebElement> MonthOptions=Month_DD.findElements(By.tagName("option"));
		System.out.println("Number of months available is --> "+MonthOptions.size());

		if(MonthOptions.size() > 0)
		{
			  //Read all object using for loop
			  for (int i = 0; i < MonthOptions.size(); i++) 
			  {
				   WebElement EachObj=MonthOptions.get(i);
				   System.out.println(EachObj.getText());
				   EachObj.click();
				   Thread.sleep(1000);
			  }
		}
		else
		{
			System.out.println("Month Option Found zero");
		}
		
		
		
		
		//Identifying year dropdown and Collec All Options into List Interface
		WebElement Year_DD=driver.findElement(By.name("birthday_year"));
		//Get All Options under Select Elements
		List<WebElement> YearOptions=new Select(Year_DD).getOptions();
		
		
		if(YearOptions.size() > 0)
		{
				//Reading all object using foreach loop
				for (WebElement EachOption : YearOptions) 
				{
					System.out.println(EachOption.getText());
					EachOption.click();
					Thread.sleep(400);
				}
		}
		else
		{
			System.out.println("Year Option Found zero");
		}
		
	}

}
