package pageobjects.Without_PageFactory;


import org.junit.Test;

public class Run_TestCases 
{
	TestCase1 tests;
	//@Test
	public void test1() 
	{
		tests=new TestCase1();
		tests.Add_Admin_new_user();	
	}
	
	
	@Test
	public void test2() 
	{
		tests=new TestCase1();
		tests.Add_Admin_new_user_ESS();
	}

}
