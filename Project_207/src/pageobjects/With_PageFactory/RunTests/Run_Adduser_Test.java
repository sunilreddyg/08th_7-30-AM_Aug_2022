package pageobjects.With_PageFactory.RunTests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.With_PageFactory.Keywords.TestBase;
import pageobjects.With_PageFactory.Testcases.TestCases1;

public class Run_Adduser_Test extends TestBase
{
	TestCases1 test1;
	@Before
	public void setUp() throws Exception 
	{
		SetupFirefox();
		test1=new TestCases1(driver);
	}

	@After
	public void tearDown() throws Exception 
	{
		static_time(3000);
		CloseBrowser();
	}
	
	@Test
	public void Tc001_AddingNewuser() 
	{
		test1.Add_newuser_Details();
		
	}

}
