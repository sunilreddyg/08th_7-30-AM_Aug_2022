package pageobjects.Without_PageFactory;

import org.openqa.selenium.WebDriver;

public class TestCase1 
{
	TestBase base;
	WebDriver driver=null;
	
	public TestCase1() 
	{
		base=new TestBase();
		base.SetupFirefox();
		base.Account_login();
		driver=base.driver;
	}
	
	public void Add_Admin_new_user()
	{
		base.static_time(3000);
		driver.findElement(CommonObjects.MenuTab_Admin).click();
		base.static_time(3000);
		driver.findElement(CommonObjects.System_user_Adduser).click();
		base.static_time(3000);
		driver.findElement(CommonObjects.Adduser_EmployeeName).sendKeys("aaaaaa");
		driver.findElement(CommonObjects.Adduser_username).sendKeys("Hari");
	}
	
	public void Add_Admin_new_user_ESS()
	{
		base.static_time(3000);
		driver.findElement(CommonObjects.MenuTab_Admin).click();
		base.static_time(3000);
		driver.findElement(CommonObjects.System_user_Adduser).click();
		base.static_time(3000);
		
		driver.findElement(CommonObjects.Adduser_UserRole).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.Adduser_userRole_ESS).click();
		driver.findElement(CommonObjects.Adduser_EmployeeName).sendKeys("aaaaaa");
		driver.findElement(CommonObjects.Adduser_username).sendKeys("Hari");
	}

}
