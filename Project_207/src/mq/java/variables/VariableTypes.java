package mq.java.variables;

public class VariableTypes 
{
	//Global Variable  [Instant Variables]
	String email="info.dsnr@gmail.com";
	String mobile="9030248855";
	
	//Global Variables  [Static Variables]
	static int x=100;
	static int y=200;
	
	public void method1() 
	{
		String name="WebDriver";      //Local Variable
		System.out.println(name);
		
		//printing global variable
		System.out.println(email);
	}
	
	public void method2() 
	{
		//Printing global variables
		System.out.println(email);
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
	
		//create object for class
		VariableTypes obj=new VariableTypes();
		obj.method1();
		
		//Calling Instant Variables
		System.out.println(obj.email);
		System.out.println(obj.mobile);
		
		//Calling Static Variables
		System.out.println(VariableTypes.x);
		System.out.println(VariableTypes.y);

	}

}
