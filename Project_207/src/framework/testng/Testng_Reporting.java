package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Reporting 
{
  @Test
  public void tc001() 
  {
	  System.out.println("Browser is Up");
  }
  
  
  @Test
  public void tc002()
  {
	  //It print report in Html file [Emailable Reports]
	  Reporter.log("SignIn successful");
  }
  
  @Test
  public void tc003()
  {
	  //It print report in html file and Console
	  Reporter.log("Email is Composed ",true);
  }
  
  
}
