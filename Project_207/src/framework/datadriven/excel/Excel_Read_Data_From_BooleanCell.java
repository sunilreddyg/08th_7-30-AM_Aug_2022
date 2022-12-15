package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_From_BooleanCell {

	public static void main(String[] args) throws IOException {
		

		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("DataTypes");
		
		//get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get boolean value[Start boolean with uppercase. By Default it convertinto nonprimitive] 
		Boolean flag=row.getCell(3).getBooleanCellValue();
		if(flag==true)
		{
			System.out.println("Return boolean value true");
			
			//Convert Boolean value into string
			if(flag.toString().equalsIgnoreCase("true"))
			{
				System.out.println("Converted boolean to string");
			}
		}
		else
		{
			System.out.println("Return False");
		}
		
		
		

	}

}
