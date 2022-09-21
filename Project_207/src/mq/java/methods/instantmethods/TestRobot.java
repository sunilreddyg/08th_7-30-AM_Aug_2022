package mq.java.methods.instantmethods;

public class TestRobot 
{

	public TestRobot() 
	{
		System.out.println("Power is On");
	}
	
	void StartWalk()
	{
		System.out.println("Robot is Walking");
	}

	void StopWalk()
	{
		System.out.println("Robot Stop");
 	}


	public static void main(String[] args) 
	{
		//new TestRobot().StartWalk();
		//new TestRobot().StopWalk();
		
		/*
		 * Creating object to class
		 * 
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		
		TestRobot x=new TestRobot();
		x.StartWalk();
		x.StopWalk();
		
	}

}
