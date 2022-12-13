package framework.Datadriven.Excel;


import framework.Datadriven.Excel.keywords.Excel_commonReusable_actions;

public class Diffenent_Outputs {

	public static void main(String[] args) {
		
		Excel_commonReusable_actions
		.GetWorkbookAnd_Sheet("InputData.xlsx", "Sheet5");
		
		int RowCount= Excel_commonReusable_actions.GetRowCount();
		for (int i = 1; i <=RowCount; i++) 
		{
			String Exe_status=Excel_commonReusable_actions.getStringCellData(i, 1);
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=Excel_commonReusable_actions.getStringCellData(i, 0);
				
				//Get output type
				String Output=Excel_commonReusable_actions.getStringCellData(i, 2);
				
				if(Output.equals("text"))
				{
					System.out.println(UID+"    "+"TextCaptured");
				}
				else if(Output.equals("alert"))
				{
					System.out.println(UID+"    "+"AlertHandled");
				}
				else if(Output.equals("displayed"))
				{
					System.out.println(UID+"   "+"Objectdisplayed");
				}
				else if(Output.equals("title"))
				{
					System.out.println(UID+"   "+"TitleVerified");
				}
				
			}
		}

	}

}
