package mq.java.constructor;

public class Sample 
{
	//Constructor or ClassInstance
	public Sample() 
	{
		System.out.println("Initilize data to method");
	}
	
	//Instance Method
	//Why this is instant method [Because method not declared with static Specifier]
	public void methodA() 
	{
		System.out.println("Method A Executed");
	}

	
	public static void main(String[] args) 
	{
		new Sample().methodA();
		
	}

}
