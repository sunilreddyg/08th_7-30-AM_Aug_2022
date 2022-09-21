package mq.java.methods.instantmethods;

public class RobotA 
{
	
	public void walk() 
	{
		System.out.println("Walk Executed");
	}
	
	public void Run()
	{
		System.out.println("Run Executed");
	}
	
	public static void main(String[] args)
	{
		new RobotA().walk();
		new RobotA().Run();
		
	}

}
