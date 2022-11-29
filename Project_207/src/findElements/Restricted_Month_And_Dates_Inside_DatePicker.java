package findElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Restricted_Month_And_Dates_Inside_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		//Open Calendar
		WebElement Calendar=driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']"));
		Calendar.click();
		Thread.sleep(1000);
		
		By NextButton=By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[1]/div[2]/svg");
		while(true)
		{
			
			String RuntimeClass=driver.findElement(NextButton).getAttribute("class");
			if(RuntimeClass.contains("c-neutral-200"))
			{
				break;
			}
			driver.findElement(NextButton).click();
			Thread.sleep(1000);
		}
	}

}
