package mq.java.variables.initiation;

public class Global_Instatiation_of_Variable 
{
	
	int a=10;
	
	public void method1()
	{
		a=200;   //Don't initiated locally again  [int a=200;]
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		  Global_Instatiation_of_Variable obj=new Global_Instatiation_of_Variable();
		  System.out.println(obj.a);
		  obj.method1();
		  System.out.println(obj.a);
		  
		  Global_Instatiation_of_Variable obj1=new Global_Instatiation_of_Variable();
		  System.out.println(obj1.a);

	}

}
