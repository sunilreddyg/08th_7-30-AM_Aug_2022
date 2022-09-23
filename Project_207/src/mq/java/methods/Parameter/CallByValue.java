package mq.java.methods.Parameter;

public class CallByValue 
{
	//Method without parameters
	public void methodA() 
	{
		System.out.println("Statement");
	}
	
	//Method with integer parameter
	public void methodB(int num)
	{
		System.out.println(num);
	}
	
	//Method with String parameter
	public void methodC(String name)
	{
		System.out.println(name);
	}
	
	//Method With Double Parameter
	public void methodD(double dble)
	{
		System.out.println(dble);
	}
	
	//Method with boolean parameter
	public void methodE(boolean flag)
	{
		System.out.println(flag);
	}
	
	//Method with Single Characters
	public void methodF(char ch)
	{
		System.out.println(ch);
	}
	
	public static void main(String[] args) 
	{
		
		//Calling methods with Runtime Arguments
		CallByValue obj=new CallByValue();
		obj.methodA();
		obj.methodB(5);
		obj.methodC("Iphone");
		obj.methodD(250000.22);
		obj.methodE(true);
		obj.methodF('A');
		
	}
	
	

}
