package mq.java.methods.Parameters;

public class Method_Parameters
{
	
	public void methodA(int a) 
	{
		System.out.println(a);
	}
	
	public void methodB(String str)
	{
		System.out.println(str);
	}
	
	public void methodC(double dble)
	{
		System.out.println(dble);
	}
	
	public void methodD(char ch)
	{
		System.out.println(ch);
	}

	public void methodE(boolean flag)
	{
		System.out.println(flag);
	}
	
	public static void main(String[] args) 
	{
		Method_Parameters obj=new Method_Parameters();
		obj.methodA(100);
		obj.methodB("MQ");
		obj.methodC(1200.12);
		obj.methodD('B');
		obj.methodE(true);
	}
}
