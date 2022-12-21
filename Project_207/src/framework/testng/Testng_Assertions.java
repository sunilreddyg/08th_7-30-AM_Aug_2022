package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Assertions 
{
	@Test
	public void tc001()
	{
		Assert.assertEquals("Gmail", "Instagram");
		Reporter.log("Instagram Title is Verified");
	}
	
	@Test
	public void tc002()
	{
		Assert.assertEquals("Gmail", "Gmail");
		Reporter.log("Gmail Title is Verified");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertTrue(true);
		Reporter.log("Gmail Title is Verified");
	}
	
	
}
