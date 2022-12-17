package oops.Inheritance.webdriver;


public class Testcases extends Common_Reusable_Actions
{
	String url="http://facebook.com";
	String username="//input[@id='email']";
	String password="//input[@id='pass']";
	
	
	public void setupbrowser()
	{
		LaunchBrowser("chrome");
		load_webpage(url);
		System.out.println(driver.getTitle());
		set_explicitwait_time(30);
	}
	
	public void userlogin()
	{
		Type_text(username, "Admin");
		Type_text(password, "admin123");
	}
	
	public void endbrowser()
	{
		close_browser();
	}
	
	

}
