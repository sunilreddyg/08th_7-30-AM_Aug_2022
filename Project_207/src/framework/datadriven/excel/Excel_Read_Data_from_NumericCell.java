package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mq.java.methods.Parameter.CallByReference.Product;

public class Excel_Read_Data_from_NumericCell {

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
		
		//Get Numeric Cell value
		double PrdocutID=row.getCell(0).getNumericCellValue();
		System.out.println(PrdocutID);
		
		//Convert numeric value into string
		String str_productid=NumberToTextConverter.toText(PrdocutID);
		System.out.println("Product in String format is --. "+str_productid);
		
		//How to Convert Double to Interger
		Double d=new Double(PrdocutID);
		int intProductid=d.intValue();
		System.out.println("Product id in integer format"+intProductid);
		
		
		
		
	}

}
