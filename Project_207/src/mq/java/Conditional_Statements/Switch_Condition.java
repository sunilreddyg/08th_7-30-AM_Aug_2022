package mq.java.Conditional_Statements;

public class Switch_Condition {

	public static void main(String[] args) 
	{
		
		/*
		 * SwitchCondition:-->
		 * 		Multiple Decision statement take place here,
		 * 		Switch condition execute same as else-if condition
		 * 		The only difference is Switch directly execute
		 * 		required case instead of checking each condition.
		 */
		
		String month="apr";
		
		 switch (month) 
		 {
		case "jan":
				System.out.println("10% discount");
			break;
			
		case "feb":
			System.out.println("20% discount");
			break;
			
		case "mar":
			System.out.println("30% discount");
			break;
			
		case "apr":
			System.out.println("40% discount");
			break;

		default:
			System.out.println("No Offer Available");
			break;
		}

	}

}
