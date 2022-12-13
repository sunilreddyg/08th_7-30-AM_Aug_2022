package framework.Datadriven.Excel;

import java.io.FileInputStream;

public class LocateExcelFile2 {

	public static void main(String[] args) 
	{
		
		FileInputStream fi=null;
		try {
			 fi=new FileInputStream("TestData\\InputData.xlsx");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(fi!=null)
		{
			 System.out.println("File is Located");
		}
		else
		{
			System.out.println("File is Not located");
		}
		

	}

}
