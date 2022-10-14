package mq.selenium.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Zoom_button 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Mouse and Keyboard interactions..
		WebElement Element=driver.findElement(By.xpath("//a[contains(@title,'Magnify Images On Hover Or Touch & Hold - jQuery izoomify')]"));
		new Actions(driver).moveToElement(Element)
		.pause(2000)
		.click()
		.pause(3000)
		.sendKeys(Keys.ESCAPE).perform();

	}

}
