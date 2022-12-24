package framework.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import miniproject.Common_Reusable_Actions;

public class Parallel_Test extends Common_Reusable_Actions
{
	
	  //@DataProvider(parallel=true)
	  public static Object[][] StudentDetails() 
	   {
	    return new Object[][] 
	   {
	      new Object[] {"Ajay","9030248855","BSC" },
	      new Object[] {"Rani","8789785241","B-tech" },
	      new Object[] {"Suresh","987897887","M-tech" },
	      new Object[] {"Sam","987897887","BCOM" },
	    };
	  }
	
	@DataProvider(parallel=true)
	  public static Object[][] BrowserDetails() 
	   {
	    return new Object[][] 
	   {
	      new Object[] {"chrome",null },
	      new Object[] {"firefox",null},
	
	    };
	  }
	
	
	@Test(dataProvider="BrowserDetails")
	public void Testbrowsers(String browser,String info)
	{
		LaunchBrowser(browser);
	}
	
	
	
	//@Test(dataProvider="StudentDetails",enabled=false)
	public void Tc001(String name,String mobile,String branch)
	{
		
	}

}
