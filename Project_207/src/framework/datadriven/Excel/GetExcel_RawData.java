package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcel_RawData {

	public static void main(String[] args) throws IOException 
	{
		
		//Locating excel binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
				
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		

	}

}
