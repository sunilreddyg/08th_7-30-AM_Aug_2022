package framework.datadriven.propertyfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetProperties 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object for properties
		Properties obj=new Properties();
		
		//Set Data to Repository
		obj.setProperty("Iphone", "true");
		obj.setProperty("Samsung", "false");
		obj.setProperty("oneplus", "true");
		
		
		//Create output file
		String filepath="src\\framework\\datadriven\\propertyfiles\\Output.properties";
		FileOutputStream fo=new FileOutputStream(filepath);
		obj.store(fo, "Product available status");
		
		
		

	}

}
