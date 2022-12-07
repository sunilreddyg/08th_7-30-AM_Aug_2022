package framework.junit;

import org.junit.Assert;
import org.junit.Test;

public class Junit_Assertions 
{

	@Test
	public void test() 
	{
		Assert.assertEquals("Login Successful", "Login Successful");
		System.out.println("Testpass, Login Successful");
	}
	
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
		System.out.println("Condition is true");
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(true);
		System.out.println("Condition is false");
	}
	
	@Test
	public void test3()
	{
		Assert.fail("Tesfail because status is not displayed");
	}
	
	@Test
	public void test4() 
	{
		String Exp[]= {"apple","goa"};
		String Act[]= {"apple","goa"};
		
		Assert.assertArrayEquals(Exp,Act);
		System.out.println("Testpass, Items are equal");
	}
	
	

}
