package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

	@BeforeClass //Invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class preCondition");
	}

	@AfterClass //Invoke after execution of last @Test annotation
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class postCondition");
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
