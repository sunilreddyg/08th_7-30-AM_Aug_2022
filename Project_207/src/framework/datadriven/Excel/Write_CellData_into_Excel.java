package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_CellData_into_Excel
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
		
		//Get Existing Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet
		XSSFSheet sht=book.getSheet("login");
		
		//Target Existing row and Existing Cell and Write Data
		sht.getRow(1).getCell(1).setCellValue("Swetha");
		
		//Target Existing row and Create NewCell Then set value
		sht.getRow(1).createCell(3).setCellValue(true);

		//Create new Row and Create NewCell
		sht.createRow(2).createCell(0).setCellValue(new Date().toString());
		
		
		//Create new Excel file
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		book.write(fo);
		book.close();
		
		
		
		
		
}

}
