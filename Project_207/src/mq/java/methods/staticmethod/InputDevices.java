package mq.java.methods.staticmethod;

public class InputDevices 
{
	
	public static void Mouse() 
	{
		System.out.println("mouse executed");
	}

	public static void Keyboard() 
	{
		System.out.println("Keyboard executed");
	}
	
	public static void Touch() 
	{
		System.out.println("touch Active");
	}
	
	public static void main(String[] args)
	{
		
		//Calling static methdos with in class
		Mouse();
		Keyboard();
		Touch();
		
	}
}
