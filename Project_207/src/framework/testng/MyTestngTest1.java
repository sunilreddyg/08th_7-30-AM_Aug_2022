package framework.testng;

import org.testng.annotations.Test;

public class MyTestngTest1 
{
	  @Test  //Invoke method without object creation..
	  public void tc001() 
	  {
		  System.out.println("tc001 Executed");
	  }
	  
	  @Test
	  public void tc002() 
	  {
		  System.out.println("tc002 Executed");
	  }
}
