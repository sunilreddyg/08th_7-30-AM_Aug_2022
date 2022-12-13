package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_multiple_Rows 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Locating excel binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
				
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using Book reference
		XSSFSheet sht=book.getSheet("Sheet2");
		
		
		//Get First and last Row Numbers where data exist
		int FRnum=sht.getFirstRowNum();	
		int LRnum=sht.getLastRowNum();
		
		for (int i = FRnum+1; i <= LRnum; i++) 
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"  "+PWD);
		}
		

	}

}
