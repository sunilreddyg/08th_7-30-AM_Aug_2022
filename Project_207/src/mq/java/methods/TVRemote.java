package mq.java.methods;

public class TVRemote 
{
	
	public void on() 
	{
		System.out.println("Television is ON");
	}
	
	public void off() 
	{
		System.out.println("Television is  off");
	}
	
	public static void main(String[] args) 
	{
		new TVRemote().on();
		new TVRemote().off();
	}
	

}
