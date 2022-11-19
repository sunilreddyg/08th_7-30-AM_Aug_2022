package ui_verificationCommands.Dropdown_Verifications;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Dropdown_Option_Count 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement DOB_month=driver.findElement(By.xpath("//select[@id='month']"));
		int Count=new Select(DOB_month).getOptions().size();
		if(Count==12)
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		
	}

}
