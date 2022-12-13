package framework.Datadriven.Excel;

import framework.Datadriven.Excel.keywords.Excel_commonReusable_actions;

public class Read_SelectedRows_Data 
{

	public static void main(String[] args) 
	{
		
		
		Excel_commonReusable_actions
		.GetWorkbookAnd_Sheet("InputData.xlsx", "Sheet4");
		
		int RowCount= Excel_commonReusable_actions.GetRowCount();
		for (int i = 1; i <=RowCount; i++) 
		{
			String Exe_status=Excel_commonReusable_actions.getStringCellData(i, 2);
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=Excel_commonReusable_actions.getStringCellData(i, 0);
				String PWD=Excel_commonReusable_actions.getStringCellData(i, 1);
				System.out.println(UID+"    "+PWD);
			}
		}
		

	}

}
