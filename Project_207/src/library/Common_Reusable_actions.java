package library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Common_Reusable_actions
{
	
	WebDriver driver;
	String mainwindow;
	WebDriverWait wait;
	
	public Common_Reusable_actions(WebDriver driver)
	{
		this.driver=driver;
		mainwindow=driver.getWindowHandle();
		wait=new WebDriverWait(driver, Duration.ofSeconds(100));
	}
	
	
	
	public void ClickOnElement(String Xpath)
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.xpath(Xpath))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SelectingDropdown(String Xpath,String OptionName)
	{
		try {
			ManageExplicitWait("visible", Xpath, null);
			new Select(driver.findElement(By.xpath(Xpath))).selectByVisibleText(OptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void TypeText(String Xpath,String Input)
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.xpath(Xpath))).sendKeys(Input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void CaptureScreen_At_Page() 
	{
		//Get Current System Date
		Date date=new Date();   //Import java.util;
		//Creating simple date formatter
		SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		//Using Date format converting current system date
		String Time=SDF.format(date);
	
		try {
		
		
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screens\\Image1"+Time+".png"));

		} catch (Exception e) {
			
		}
		
	}
	
	public void CaptureScreen_At_Element(WebElement element) 
	{
		//Get Current System Date
		Date date=new Date();   //Import java.util;
		//Creating simple date formatter
		SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		//Using Date format converting current system date
		String Time=SDF.format(date);
	
		try {
		
		
			File src=element.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screens\\Image1"+Time+".png"));

		} catch (Exception e) {
			
		}
		
	}
	
	//method switchto next window
	public void switchToNextWindow()
	{
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) 
		{
			driver.switchTo().window(eachwindow);
		}
		
	}
		
	//Method switch to required window with help of window title
	public void switchToNextWindow_withTitle(String ExpTitle)
	{
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) 
		{
			String PageTitle=driver.switchTo().window(eachwindow).getTitle();
			if(PageTitle.contains(ExpTitle))
			{
				break;
			}
		}
		
	}
		
	//Method switch to mainwindow
	public void SwitchToMainwindow()
	{
		driver.switchTo().window(mainwindow);
	}
		
	public void CaptureScreen(String ImageName) 
	{
		//Capturing screen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Creating folder under project
		FileHandler.createDir(new File("Screens"));
		
	
		try {
			//Copying file to local system
			FileHandler.copy(src, new File("Screens\\"+ImageName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//ManageExplicitwait
	public void ManageExplicitWait(String WaitType,String Location,String Input)
	{
		
		switch (WaitType) 
		{
		case "visible":
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Location)));
			break;

		case "presence":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Location)));
			break;
			
		case "text":
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Location), Input));
			break;
			
		case "value":
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(Location), Input));
			break;
			
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
			
		case "frame":
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(Location)));
			break;
		default:
			break;
		}
	}
		
		
	
	
	
}
