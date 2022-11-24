package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Do_While_Example 
{

	public static void main(String[] args) throws Exception
	{
		
		//Print Numbers 1 to 10
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i < 10);
		
		
		//Do with false Condition
		int j=100;
		do {
			System.out.println(j);
		} while (j < 0);
		
		
		//Reload webpage until Required title presented
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		
		boolean title_status=false;
		int count=0;
		do {
			
			driver.get("http://instagram.com");

			try {
				new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.titleContains("Facebook"));
				title_status=true;
				} catch (Exception e) {
					e.printStackTrace();
			    }
			
			count=count+1;
			if(count==10)
			{
				throw new Exception("page load failed after 10 attempts");
			}
			
		} while (title_status==false);
		
		
		
		

	}

}
