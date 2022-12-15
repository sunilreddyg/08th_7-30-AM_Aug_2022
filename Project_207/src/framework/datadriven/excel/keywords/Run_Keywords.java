package framework.datadriven.excel.keywords;

public class Run_Keywords {

	public static void main(String[] args) {
		
		
		Excel_commonReusable_actions.GetWorkbookAnd_Sheet("InputData.xlsx","Config");
		String BrowserName=Excel_commonReusable_actions.getStringCellData(1, 0);
		System.out.println(BrowserName);
	}

}
