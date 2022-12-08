package pageobjects.With_PageFactory.Testcases;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.WebDriver;

import pageobjects.With_PageFactory.Keywords.Common_Reusable_actions;
import pageobjects.With_PageFactory.Pages.Adduser_Admin;
import pageobjects.With_PageFactory.Pages.HRM_LoginPage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.SystemUsers;

public class TestCases1 
{
	WebDriver driver;
	HRM_LoginPage login;
	MenuTabs tabs;
	SystemUsers userspage;
	Adduser_Admin newuser;
	Common_Reusable_actions keywords;
	
	public TestCases1(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_LoginPage(driver);
		tabs=new MenuTabs(driver);
		userspage=new SystemUsers(driver);
		newuser=new Adduser_Admin(driver);
		keywords=new Common_Reusable_actions(driver);
	}
	
	
	public void Verify_User_Login()
	{
		keywords.TypeText(login.Username, "Admin");
		keywords.TypeText(login.Password, "admin123");
		keywords.ClickOnElement(login.login_submit);
		keywords.ManageExplicitWait("visible", tabs.admin, null);
		if(tabs.admin.isDisplayed())
			System.out.println("Testpass, Admin page is displayed");
		else
			System.out.println("Testfail, Admin page is not displayed");
	}
	
	
	public void Add_newuser_Details()
	{
		Verify_User_Login();
		keywords.ClickOnElement(tabs.admin);
		keywords.ClickOnElement(userspage.add);
		keywords.ClickOnElement(newuser.UserRole_DDL);
		keywords.ClickOnElement(newuser.UserRole_DDL_Option_Admin);
	}
	
	
	
	
	


}
