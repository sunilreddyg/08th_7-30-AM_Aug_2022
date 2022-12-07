package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod 
{

	@Before //Invoke every test annotation before
	public void setUp() throws Exception
	{
		System.out.println("Test PreCondition");
	}

	@After  //Invoke every test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
	}
	

	@Test  //Invoke method to run without object creation
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Test  //Invoke method to run without object creation
	public void test1() 
	{
		System.out.println("test1 executed");
	}


}
