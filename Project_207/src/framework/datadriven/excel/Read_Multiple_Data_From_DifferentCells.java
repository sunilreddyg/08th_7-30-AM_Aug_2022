package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Multiple_Data_From_DifferentCells {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(4);
		
		
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			 XSSFCell UsernameCell=sht.getRow(i).getCell(0);
			 XSSFCell passwordCell=sht.getRow(i).getCell(1);
			 
			 String UID=null;
			if(UsernameCell.getCellType()==CellType.STRING)
			{
				UID=UsernameCell.getStringCellValue();
			}
			else if(UsernameCell.getCellType()==CellType.NUMERIC)
			{
				UID=NumberToTextConverter.toText(UsernameCell.getNumericCellValue());
			}
			
			
			String PWD=null;
			if(passwordCell.getCellType()==CellType.STRING)
			{
				PWD=passwordCell.getStringCellValue();
			}
			else if(passwordCell.getCellType()==CellType.NUMERIC)
			{
				PWD=NumberToTextConverter.toText(passwordCell.getNumericCellValue());
			}
			
			System.out.println(UID+"   "+PWD);
			
		}
		

	}

}
