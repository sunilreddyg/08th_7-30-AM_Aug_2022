package framework.testng.dataprovider;

import org.testng.annotations.Test;

public class GetDataProvider_Details 
{


	@Test(dataProvider="StudentDetails",dataProviderClass=InputData.class)
	public void GetInfo(String name,String mobile,String branch)
	{
		
	}
}
