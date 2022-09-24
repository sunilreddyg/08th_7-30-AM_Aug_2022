package mq.java.methods.methodTypes;

public class MethodTypes 
{
	String email="info.dsnr@gmail.com";
	
	//Void Type method It doesn't return any value
	public void method1()
	{
		String name="WebDriver";   //Local Variable
	}

	/*
	 * => Otherthan void all method types return values
	 * => For other method type we should write return value at end of the method
	 * => Return value should match with  method type
	 */
	public String method2()
	{
		String ToolName="Selenium";
		return ToolName;
	}
	
	public int method3(int a, int b)
	{
		return a+b;
	}
	
	public boolean method4()
	{
		return true;
	}
	
	public double method5()
	{
		return 1200.00;
	}
	

	public static void main(String[] args) 
	{
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		String name=obj.method2();
		System.out.println("Return value is --> "+name);
		
		int value=obj.method3(100, 200);
		System.out.println("Integer Return value---> "+(value+100));
		
		boolean flag=obj.method4();
		System.out.println(flag);
		
		double dble=obj.method5();
		System.out.println(dble);
	}

}
