package mq.java.Conditional_Statements;

public class NestedIf_Condition 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Nestedif:-->
		 * 			Child Condition inside parent Condition.
		 */
		
		int age=19;
		boolean healthCheckup_Completed=true;
		
		
		if(age > 1)
		{
			
			//Nested if Condition
			if(healthCheckup_Completed==true)
			{
				System.out.println("Insurance Accepted");
			}
			else
			{
				System.out.println("Insurance Rejected");
			}
		}
		else
		{
			System.out.println("Age Rejection");
		}
		
		

	}

}
