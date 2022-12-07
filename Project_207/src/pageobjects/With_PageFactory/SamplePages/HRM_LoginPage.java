package pageobjects.With_PageFactory.SamplePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRM_LoginPage 
{
	//@Findby annotation look for object at Webpage
	@FindBy(name="username") 
	public WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login_button;
	
	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
	public WebElement forgot_password;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement error_location;
	
	
	public void enterusername(String uid)
	{
		username.sendKeys(uid);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLoginbutton()
	{
		login_button.click();
	}
	
	public void forgot_password_link()
	{
		forgot_password.click();
	}
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement geterror()
	{
		return error_location;
	}
	
	public String getLoginErrorText()
	{
		return error_location.getText();
	}
	
	public void Userlogin(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		login_button.click();
	}

	
	
	
}
