package mq.java.Loops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForeachLoop_Example 
{

	public static void main(String[] args) 
	{
		//Reading string array values using foreah loop
		String browsers[]= {"chrome","firefox","ie","edge","safari"};
		for (String EachBrowser : browsers) 
		{
			System.out.println(EachBrowser);
		}
		
		
		//Reading Numric array values using foreach loop
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		//Double Dimensional runtime array
		String data[][]=
			{
					{"arun","9030","TE"},
					{"asha","9040","DEV"},
					{"sam","9050","DEVOPS"},
			};
		
		
			for (String[] Row : data) 
			{
				System.out.println(Row[0]+"   "+Row[1]+"    "+Row[2]);
			}
			
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();	
			driver.get("http://facebook.com/reg");
			
			
			WebElement Month=driver.findElement(By.id("month"));
			List<WebElement> AllOptions=new Select(Month).getOptions();
			for (WebElement EachOption : AllOptions) 
			{
				System.out.println(EachOption.getText());
				EachOption.click();
			}
		

	}

}
