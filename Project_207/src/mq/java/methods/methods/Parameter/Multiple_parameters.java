package mq.java.methods.Parameter;

public class Multiple_parameters 
{
	
	//Method with multiple parameters
	public void method1(int b , int a)
	{
		System.out.println(a+b);
	}
	
	
	public void method2(String Mobile,double price)
	{
		System.out.println(Mobile);
		System.out.println(price);
	}
	

	public static void main(String[] args) 
	{
		Multiple_parameters obj=new Multiple_parameters();
		obj.method1(100, 200);
		obj.method2("Samsung", 25000.00);
	}

}
