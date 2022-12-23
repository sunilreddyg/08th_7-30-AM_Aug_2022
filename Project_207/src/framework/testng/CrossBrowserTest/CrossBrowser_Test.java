package framework.testng.CrossBrowserTest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import miniproject.Common_Reusable_Actions;

public class CrossBrowser_Test extends Common_Reusable_Actions
{
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void SetupBrowser(String browser)
	{
		LaunchBrowser(browser);
		set_explicitwait_time(30);
	}
	
	
	@Test(priority=1)
	@Parameters("Application_url")   //Parameter from suite file
	public void loadApp(String url) throws Exception
	{
		Thread.sleep(5000);
		load_webpage(url);
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid, String Apwd)
	{
		Type_text("//input[@id='email']", Auid);
		Reporter.log("Email enter finished");
		
		Type_text("//input[@id='pass']", Apwd);
		Reporter.log("Password Enter finished");
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		closeBrowser();
	}
	

}
