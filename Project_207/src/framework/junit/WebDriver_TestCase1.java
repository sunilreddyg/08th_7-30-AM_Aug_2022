package framework.junit;

import static org.junit.Assert.*;

import java.io.File;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_TestCase1 {

	static WebDriver driver;
	static WebDriverWait wait;
	String url="http://facebook.com";
	public @Rule TestName test=new TestName();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(3000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("newscreens"));
		//Get Current Constructed method name/ Test name
		String Testname=test.getMethodName();
		FileHandler.copy(src, new File("newscreens\\"+Testname+".png"));
	}

	@Test
	public void Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
	}
	
	@Test
	public void Verify_Login_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
		Assert.assertTrue(wait.until(ExpectedConditions.titleContains("Log in to Facebook")));
	}
	
	@Test
	public void Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertTrue(wait.until(ExpectedConditions.titleContains("Messenger")));
	}

}
