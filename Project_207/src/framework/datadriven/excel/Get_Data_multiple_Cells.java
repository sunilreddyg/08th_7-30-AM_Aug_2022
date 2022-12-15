package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Data_multiple_Cells {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(3);
		

		
		//Get FirstCellData
		int FCellNumber=sht.getRow(1).getFirstCellNum();
		int LCellNumber=sht.getRow(1).getLastCellNum();
		
		System.out.println("Data started at cell number --> "+FCellNumber);
		System.out.println("Data ended at cell number --> "+LCellNumber);
		
		for (int i = 0; i < LCellNumber; i++) 
		{
			String Row1=sht.getRow(1).getCell(i).getStringCellValue();
			System.out.println(Row1);
		}

	}

}
