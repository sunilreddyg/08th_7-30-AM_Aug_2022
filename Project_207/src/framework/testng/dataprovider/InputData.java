package framework.testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp")
  public void Userlogin(String name, String mobile) 
  {
	  System.out.println(name+"    "+mobile);
  }

  @DataProvider
  public Object[][] dp() 
   {
    return new Object[][] 
   {
      new Object[] {"Ajay","9030248855" },
      new Object[] {"Rani","8789785241" },
      new Object[] {"Suresh","987897887" },
    };
  }
  
  @DataProvider
  public String[][] ProductInfo() 
   {
	   String data[][]=
		  {
				  {"iphone","64GB","2"},
				  {"Samsung","64GB","5"},
				  {"Vivo","64GB","3"},
		  };
	   return data;	
		  
  }
  
  @Test(dataProvider="ProductInfo")
  public void VerifyProductDetails(String ProductName,String Config,String quantity)
  {
	  System.out.println(ProductName+"    "+Config+"    "+quantity);
  }
  
  
  
}
