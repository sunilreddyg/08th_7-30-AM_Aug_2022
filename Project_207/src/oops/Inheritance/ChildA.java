package oops.Inheritance;

public class ChildA extends Parent
{
	
	String email="info@gmail.com";

	public void method2()
	{
		System.out.println(name);   //From parent Class
		method1();					//From Parent Class
	}
	
	public static void main(String[] args) 
	{
		//Create object for Current Class
		ChildA obj=new ChildA();
		obj.method1();    //Method From Parent class
		obj.method2();    //Method From child class
		
		//Object creation with parent Class reference
		Parent ref=new ChildA();
		ref.method1();    //Method from parent class
	}

}
