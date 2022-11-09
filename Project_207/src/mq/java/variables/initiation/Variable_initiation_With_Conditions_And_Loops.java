package mq.java.variables.initiation;

public class Variable_initiation_With_Conditions_And_Loops 
{

	
	public static void main(String[] args) 
	{
		
		
		//Global initiation with Condition
		int a;
		if(true)
		{
			a=100;
		}
		System.out.println(a);
		
		
		
		//Global initiation with loop
		//Conduct Sum between 1 to 100
		int sum=0;
		for (int i = 0; i <= 100; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		//Global Inititation with Trycatch block
		
		boolean flag;
		try {

			flag=true;
		} catch (Exception e) {
			flag=false;
		}
		System.out.println(flag);
		
		
	}

}
