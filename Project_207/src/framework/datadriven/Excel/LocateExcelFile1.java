package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

public class LocateExcelFile1 
{

	public static void main(String[] args) throws IOException
	{
		
		//Locating excel binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is Located");
		
		
	}

}
