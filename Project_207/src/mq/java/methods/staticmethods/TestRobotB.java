package mq.java.methods.staticmethods;

public class TestRobotB 
{

	
	public static void Check_PowerOn() 
	{
		System.out.println("Verified POwer ON ");
	}
	
	public static void CheckArea()
	{
		System.out.println("Verify Area");
	}
	

	public static void main(String[] args)
	{
		
		//Calling static method with in class
		Check_PowerOn();
		CheckArea();

	}

}
