package framework.junit;

import org.junit.Test;

public class MyJunitTest1 
{

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
