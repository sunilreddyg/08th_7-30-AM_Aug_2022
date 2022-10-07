package mq.java.constructor;

public class GearTest
{

	public GearTest() 
	{
		System.out.println("Hold Clutch");
	}

	
	public void Change_Gear1() 
	{
		System.out.println("Changed to Gear1");
	}
	
	public void Change_Gear2() 
	{
		System.out.println("Changed to Gear2");
	}
	
	
	public void Change_Gear3() 
	{
		System.out.println("Changed to Gear3");
		
	}
	
	public static void main(String[] args)
	{
		new GearTest().Change_Gear1();
		new GearTest().Change_Gear2();
		new GearTest().Change_Gear3();
	}
	
}
