package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_SelectedRows_Data 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(5);
		
		
		//Read data from multiple rows
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			//Get Third Cell data
			String ExeStatus=sht.getRow(i).getCell(2).getStringCellValue();
			if(ExeStatus.equalsIgnoreCase("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(UID+"    "+PWD);
			}
			
		}
	

	}

}
