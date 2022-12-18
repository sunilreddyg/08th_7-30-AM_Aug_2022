package miniproject;


public class TestCases extends Common_Reusable_Actions implements CommonObjects,InputData
{
	
	public void Tc001_HrmLogin()
	{
		LaunchBrowser(IP_browsername);
		load_webpage(IP_Page_url);
		set_explicitwait_time(IP_exp_timeout);
		Type_text(obj_login_email, IP_login_email);
		Type_text(obj_login_password, IP_login_password);
		click_element(obj_login_Submit_button);
	}
	
	
	public static void main(String args[])
	{
		TestCases obj=new TestCases();
		obj.Tc001_HrmLogin();
	}

}
