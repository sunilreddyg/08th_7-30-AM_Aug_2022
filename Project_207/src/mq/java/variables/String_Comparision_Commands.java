package mq.java.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Equals:-->
		 * 		Method Verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		Note:--> Comparision is casesensitive.
		 */
		
		String Act_res="Account Created Successful";
		String Exp_res="account Created Successful";
		
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal Comparision is ---> "+flag);
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify equal comparision between two string
		 * 		by ignoring casesensitive..
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("Equal Ignorecase comparision is --> "+flag1);
		
		
		/*
		 * contains:-->
		 * 		Method verify sub string characters available at main 
		 * 		string.
		 */
		String Status="Account 100 Created";
		System.out.println(Status.contains("Account"));
		System.out.println(Status.contains("Created"));
		System.out.println(Status.contains("Account Created"));
		
		
		/*
		 * length:-->
		 * 		Method get number of charactes available with
		 * 		in string
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobile Number length is --> "+len);
		System.out.println(len==10);  //== Double equals is boolean comparision 
		
		
		/*
		 * SubString:-->
		 * 		Method Get SubString characters from main String
		 */
		String AccountNum="123455889874";
		String LastDigits=AccountNum.substring(6);
		System.out.println("last Digits are --> "+LastDigits);
		
		String MiddleDigts=AccountNum.substring(4, 8);
		System.out.println("Middle Digits are --> "+MiddleDigts);
		
		String ProductPrice="$50000";
		System.out.println(ProductPrice.substring(1));
		
		
		/*
		 * Trim:-->
		 * 	Method trim extra spaces with in String
		 * 		[It only Trims left and right spaces only]
		 */
		String PinCode="    500075    ";
		System.out.println("Before trim ---> "+PinCode.length());
		String NewPincode=PinCode.trim();
		System.out.println("After trim ---> "+NewPincode.length());
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String AccountNumber="111122227777";
		boolean flag5=AccountNumber.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(6);
		System.out.println("charcters available at 6th index number ---> "+ch);
		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname);
		
	

		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));
		
		String Price="$25,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		int Latest=Integer.parseInt(NewPrice);
		System.out.println(Latest);
		

		/*
		 * Split:-->
		 * 		Split string into multiple based on delimeter
		 */
		String browsers="chrome,firefox,safari";
		String arr[]=browsers.split(",");
		System.out.println(arr[0]+"    "+arr[1]+"     "+arr[2]);
		
		
		
	}

}
