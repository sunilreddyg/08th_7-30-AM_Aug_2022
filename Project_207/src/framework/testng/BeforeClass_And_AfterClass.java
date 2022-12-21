package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
	
  @Test //Test invoke to execute method statement
  public void f() 
  {
	  Reporter.log("Function Executed",true);
  }
  
  @BeforeClass //Invoke before first @Test with in class
  public void beforeClass() 
  {
	  System.out.println("Class PreCondition");
  }

  @AfterClass //invoke after last @Test with in class
  public void afterClass() 
  {
	  System.out.println("Class PostCondition");
  }

  @Test //Test invoke to execute method statement
  public void a() 
  {
	  Reporter.log("Function1 Executed",true);
  }
  
}
