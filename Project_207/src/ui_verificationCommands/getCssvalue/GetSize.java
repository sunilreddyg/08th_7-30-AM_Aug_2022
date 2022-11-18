package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize 
{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement BookADemo=driver.findElement(By.xpath("//a[@href='/hris-hr-software-demo/']"));
		
		//Get Object height and width
		int Obj_Height=BookADemo.getSize().getHeight();
		int Obj_width=BookADemo.getSize().getWidth();
		
		
		System.out.println("Object Height is --> "+Obj_Height);
		System.out.println("Object width is --> "+Obj_width);
		
		//Check object is visble at webpage
		if(Obj_Height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
		

	}

}
