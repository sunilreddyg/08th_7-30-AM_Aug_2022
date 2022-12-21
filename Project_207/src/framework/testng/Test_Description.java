package framework.testng;

import org.testng.annotations.Test;

public class Test_Description
{
  @Test(priority=1,description="Verifying Login with valid data")
  public void tc001() 
  {
	  
  }
  
  @Test(priority=0,description="Verifying Login with Invalid data")
  public void tc002() 
  {
	  
  }
  
  @Test(enabled=false,priority=0,description="Verifying Login with Invalid data")
  public void tc003() 
  {
	  
  }
}
