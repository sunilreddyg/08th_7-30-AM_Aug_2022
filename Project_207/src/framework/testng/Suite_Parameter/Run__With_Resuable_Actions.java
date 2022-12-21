package framework.testng.Suite_Parameter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Run__With_Resuable_Actions 
{
	
	@Test
	@Parameters({"MyBrowser","Myurl"})
	public void SetupBrowser(String Browser,String URL)
	{
	
	}

}
