package framework.datadriven.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.datadriven.excel.keywords.Excel_commonReusable_actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_TestCases {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		Excel_commonReusable_actions.GetWorkbookAnd_Sheet("InputData.xlsx", "Sheet4");
		int RowCount=Excel_commonReusable_actions.GetRowCount();
        for (int i = 0; i <=RowCount ; i++) 
        {
			String TestName=Excel_commonReusable_actions.getStringCellData(i, 0);
			String TestData=Excel_commonReusable_actions.getStringCellData(i, 1);
			String Exp_result=Excel_commonReusable_actions.getStringCellData(i,2);
			String Exe_status=Excel_commonReusable_actions.getStringCellData(i, 3);
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				driver.get("http://outlook.com");
				WebElement Signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
				Signin.click();
				
				WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
				Email.sendKeys(TestData+Keys.ENTER);
				Thread.sleep(8000);
				
				//Read Entire page visible text
				String pageVisibleText=driver.findElement(By.tagName("body")).getText();
				Thread.sleep(4000);
				
				if(pageVisibleText.contains(Exp_result))
				{
					Excel_commonReusable_actions.WriteData_At_exsitingRow_And_NewCell(i, 4, "Testpass");
					System.out.println(TestName+"      "+"Testpass");
				}
				else
				{
					Excel_commonReusable_actions.WriteData_At_exsitingRow_And_NewCell(i, 4, "Testfail");
					System.out.println(TestName+"      "+"Testfail");
				}
				
			}
			
			
			
		}
        
        	Excel_commonReusable_actions.CreateOtuputFile("NewOutput.xlsx");
	}

}
