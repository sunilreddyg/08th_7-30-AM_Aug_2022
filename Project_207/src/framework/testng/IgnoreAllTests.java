package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore  //Ignore all @Test annotated methods execution with in class.
public class IgnoreAllTests
{
	@Test
	  public void tc001() 
	  {
		  Reporter.log("Test1 Executed",true);
	  }
	  
	  @Test(enabled=false)
	  public void tc002() 
	  {
		  Reporter.log("Test2 Executed",true);
	  }
	  
	  @Test
	  public void tc003() 
	  {
		  Reporter.log("Test3 Executed",true);
	  }
}
