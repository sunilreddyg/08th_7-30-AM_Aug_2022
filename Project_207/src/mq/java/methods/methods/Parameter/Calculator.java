package mq.java.methods.Parameter;

public class Calculator
{
	
	int a=0;
	int b=0;
	
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	public  void add() 
	{
		System.out.println(a+b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		new Calculator(100, 200).add();
		new Calculator(10, 34).add();
		new Calculator(10,23).mul();
		
	}

}
