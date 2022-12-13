package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Workbook_And_Read_Data {

	public static void main(String[] args) throws IOException 
	{
		//Locating excel binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
				
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("login");
		
		//using above sheet Target Row
		XSSFRow row=sht.getRow(1);
		
		//Using Row Reference target Cell
		String URL=row.getCell(0).getStringCellValue();
		System.out.println(URL);
		
		String UID=row.getCell(1).getStringCellValue();
		System.out.println(UID);
		
		
		//Read Sheet2 Cell Data
		String BrowserName=book.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		System.out.println(BrowserName);
		
		
		
		
	}

}
