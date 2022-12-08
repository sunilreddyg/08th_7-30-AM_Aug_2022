package pageobjects.With_PageFactory.Pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Adduser_Admin
{

	WebDriver driver;
	public Adduser_Admin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public WebElement  UserRole_DDL;
	
	@FindBy(xpath = "(//span[contains(.,'Admin')])[3]")
	public WebElement  UserRole_DDL_Option_Admin;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement  EmployeeName;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input'][contains(.,'-- Select --')]")
	public WebElement  Status_DDL;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	public WebElement  Username;
	
	@FindBy(xpath = "(//input[contains(@type,'password')])[1]")
	public WebElement  Password;
	
	@FindBy(xpath = "(//input[contains(@type,'password')])[2]")
	public WebElement  Confirm_Password;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	public WebElement  save;
	
	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	public WebElement  cancel;
	
	
	
	public void TypeUsername(String UID)
	{
		Username.sendKeys(UID);
	}

	public void TypePassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void RetypePassword(String RetypePwd)
	{
		Confirm_Password.sendKeys(RetypePwd);
	}
}