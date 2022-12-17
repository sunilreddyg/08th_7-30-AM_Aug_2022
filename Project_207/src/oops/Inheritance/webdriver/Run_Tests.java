package oops.Inheritance.webdriver;


import org.junit.Assert;
import org.junit.Test;

public class Run_Tests extends TestCase2
{

	
	@Test
	public void test() 
	{
		Tc001();
		Assert.assertTrue(verify_text_visible_at_webpage("Error"));
		System.out.println("error is Presented");
	}

}
