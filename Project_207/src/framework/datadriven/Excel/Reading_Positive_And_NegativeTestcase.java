package framework.Datadriven.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.Datadriven.Excel.keywords.Excel_commonReusable_actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Positive_And_NegativeTestcase 
{
	static By Email=By.xpath("//input[@id='i0116']");
	static By Signinbutton=By.xpath("(//a[contains(.,'Sign in')])[1]");
	static By NextButton=By.xpath("//input[@id='idSIButton9']");
	
	
	public static void main(String[] args) throws Exception 
	{
		
		Excel_commonReusable_actions
		.GetWorkbookAnd_Sheet("InputData.xlsx", "Sheet6");
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		
		int RowCount= Excel_commonReusable_actions.GetRowCount();
		for (int i = 6; i < RowCount; i++) 
		{
			
			String Exe_status=Excel_commonReusable_actions.getStringCellData(i, 3);
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String TestName=Excel_commonReusable_actions.getStringCellData(i, 0);
				String Input=Excel_commonReusable_actions.getStringCellData(i, 1);
				String Expected=Excel_commonReusable_actions.getStringCellData(i, 2);
				
				driver.get("http://outlook.com");
				driver.findElement(Signinbutton).click();
				Thread.sleep(2000);
				
				driver.findElement(Email).sendKeys(Input);
				driver.findElement(NextButton).click();
				Thread.sleep(5000);
				
				String PageText=driver.findElement(By.tagName("body")).getText();
				Thread.sleep(2000);
				
				
				if(PageText.contains(Expected.trim()))
				{
					Excel_commonReusable_actions.WriteCellData_At_newCell(i, 5, "TestPass");
					System.out.println(TestName+"   "+"Testpass");
				}
				else
				{
					Excel_commonReusable_actions.WriteCellData_At_newCell(i, 5, "TestFail");
					System.out.println(TestName+"   "+"TestFail");
				}
				
			}
			
		}
		
			Excel_commonReusable_actions.CreateOtuputFile("RecentOutput.xlsx");
		
	}

}
