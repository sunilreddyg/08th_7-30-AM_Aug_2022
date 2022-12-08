package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SystemUsers
{
	
	public WebDriver driver;
	
	public SystemUsers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	@FindBy(xpath = "//button[contains(.,'Add')]")
	public WebElement  add;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]")
	public WebElement  SelectUser;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	public WebElement  DeleteUser;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	public WebElement  EditUser;


	public void ClickAddButton()
	{
		add.click();
	}
	
	public void SelectUser_From_Table()
	{
		SelectUser.click();
	}
	
	public void ClickOnDeleteUserButton()
	{
		DeleteUser.click();
	}
	
	public void ClickOnEditUserButton()
	{
		EditUser.click();
	}

}