package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("Config");
		
		//get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get Cell Using Row Reference
		XSSFCell BrowserCell=row.getCell(0);
		
		//Read characters from excel cell
		String BrowserName=BrowserCell.getStringCellValue();
		System.out.println(BrowserName);
		
		//Get OsDetails From excel
		String Osname=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(Osname);
		
		//Get Url From Excel
		String appurl=sht.getRow(1).getCell(2).getStringCellValue();
		System.out.println(appurl);
		
	}

}
