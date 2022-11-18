package ui_verificationCommands.getCssvalue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect_Example {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	

		System.out.println(RoundTrip.getRect().getX());
		System.out.println(RoundTrip.getRect().getY());
		System.out.println(RoundTrip.getRect().getHeight());
		System.out.println(RoundTrip.getRect().getWidth());
		System.out.println(RoundTrip.getRect().getDimension());
		System.out.println(RoundTrip.getRect().getPoint());
	}

}
