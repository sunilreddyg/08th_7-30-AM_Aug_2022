package mq.java.Conditional_Statements;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decision take place here..
		 */
		
		String Browser="firefox";
		
		if(Browser.equals("chrome"))
		{
			System.out.println("Chrome Browser is Opened");
		}
		else if (Browser.equals("firefox")) 
		{
			System.out.println("firefox browser is opened");
		}
		else if (Browser.equals("safari")) 
		{
			System.out.println("safari browser is opened");
		}
		else 
		{
			System.out.println("Browser name is mismatched");
		}
		
	}

}
