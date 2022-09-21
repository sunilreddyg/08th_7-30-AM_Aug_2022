package mq.java.methods;

public class TVRemote 
{

	public void on()
	{
		System.out.println("TV is ON");
	}
	
	public void off()
	{
		System.out.println("TV is off");
	}
	
	public void nextchannel() 
	{
		System.out.println("Next Channel");
	}
	
	public void previouschannel() 
	{
		System.out.println("Previous Channel");
	}
	
	public static void main(String[] args) 
	{
		new TVRemote().on();
		new TVRemote().off();
	}

}
