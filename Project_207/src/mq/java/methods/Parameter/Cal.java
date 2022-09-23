package mq.java.methods.Parameter;

public class Cal 
{
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		Cal obj=new Cal();
		obj.add(100, 200);

	}

}
