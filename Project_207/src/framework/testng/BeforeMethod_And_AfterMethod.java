package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod 
{
  
  @BeforeMethod //invoke Every @Test annotation before
  public void beforeMethod() 
  {
	  System.out.println("Method PreCondition");
  }

  @AfterMethod  //Invoke every @Test annotation after
  public void afterMethod() 
  {
	  System.out.println("Method PostCondition"+"\n");
  }
  
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
  
  @Test
  public void tc003() 
  {
	  System.out.println("tc003 Executed");
  }

}
