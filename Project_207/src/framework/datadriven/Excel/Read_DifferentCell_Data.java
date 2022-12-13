package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_DifferentCell_Data 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
		
		//Get Existing Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Target row
		XSSFRow row=sht.getRow(1);
		
		//Reading First Cell Data
		double Mobile_in_dble_frmt=row.getCell(0).getNumericCellValue();
		//Converting double format value to text
		String MobileNumber=NumberToTextConverter.toText(Mobile_in_dble_frmt);
		System.out.println(MobileNumber);
		
		
		//Reading Second cell data
		String AccountNumber=row.getCell(1).getStringCellValue();
		System.out.println(AccountNumber);
		
		//Reading Third cell data
		double Price=row.getCell(2).getNumericCellValue();
		System.out.println(Price);
		
		//Reading Fourth row data
		double Size=row.getCell(3).getNumericCellValue();
		Double dble=new Double(Size);
		int value=dble.intValue();
		System.out.println(value);
		System.out.println(dble.toString());
		
		//Reading Fifth row data
		boolean flag=row.getCell(4).getBooleanCellValue();
		System.out.println(flag);
		//COnvert boolean value to text
		Boolean bln=new Boolean(flag);
		String status=bln.toString();
		
		
		//Reading Sixth Row Data
		Date date=row.getCell(5).getDateCellValue();
		String NewDate=new SimpleDateFormat("dd/MM/yyyy").format(date);
		System.out.println(NewDate);
	}

}
