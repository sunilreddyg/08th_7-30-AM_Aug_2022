package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_MultipleRows {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//Get Row count at excel [Return Number of rowsdata available at sheet]
		int FRowNumber=sht.getFirstRowNum();
		int LRowNumber=sht.getLastRowNum();
		
		System.out.println("Data started at -->"+FRowNumber);
		System.out.println("Data ended at ---> "+LRowNumber);
		
		for (int i = FRowNumber; i <= LRowNumber; i++) 
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"    "+PWD);
		}
		
		
		
	}

}
