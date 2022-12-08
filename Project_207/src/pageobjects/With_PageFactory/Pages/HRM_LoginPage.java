package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HRM_LoginPage
{
	
	WebDriver driver;
	public HRM_LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//input[@name='username']")
	public WebElement  Username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement  Password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElement  login_submit;
	
	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
	public WebElement  forgotYourPassword;
	
	
	public void HrmLogin(String UID,String PWD)
	{
		Username.sendKeys(UID);
		Password.sendKeys(PWD);
		login_submit.click();
	}
	
	

	public void VerifyTitle()
	{
		if(driver.getTitle().contains("OrangeHRM"))
			System.out.println("Homepage Title is Verified");
		else
			System.out.println("Homepage title is not verified");	
	}

}