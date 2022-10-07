package mq.java.methods.instantmethods;

public class RobotB 
{
	
	public RobotB() 
	{
		System.out.println("Power ON");
	}
	
	public void Startwalk()
	{
		System.out.println("Walk Started");
	}
	
	public void StopWalk()
	{
		System.out.println("Stop Walk");
	}

	public static void main(String[] args) 
	{

	
		RobotB obj=new RobotB();
		obj.Startwalk();
		obj.StopWalk();

	}

}
