package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Ignore 
{
  @Test(enabled=false)
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed");
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc001 Executed");
  }
}
