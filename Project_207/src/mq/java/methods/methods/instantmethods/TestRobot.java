package mq.java.methods.instantmethods;

public class TestRobot
{

	public void WalkTest()
	{
		System.out.println("Walk Test Completed");
	}
	
	
	public void RunTest()
	{
		System.out.println("Run Test Completed");
	}
	
	public void RunAllTests()
	{
		 WalkTest();
		 RunTest();	
	}
	
	public static void main(String[] args) 
	{
		 new TestRobot().RunAllTests();
	}
	
}
