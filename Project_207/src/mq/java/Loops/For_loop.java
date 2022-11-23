package mq.java.Loops;

public class For_loop {

	public static void main(String[] args) 
	{
		
		
		//Print number 1 to 10
		
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print Number from 100-90
		for (int i = 100; i >= 90; i--) 
		{
			System.out.println(i);
		}

		
		//Print Array values
		String browsers[]= {"chrome","safari","Opera","Edge"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser = browsers[i];
			System.out.println(eachbrowser);
		}
		
		
		//Conduct sum between number 1 to 100
		int sum=0;
		for (int i = 1; i <= 1000; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is ---> "+sum);
		
		
		//How to Reverse a string
		String name="linus";
		char ch[]=name.toCharArray();
		
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//Using StringBuilder Reverse a string
		StringBuilder builder=new StringBuilder(name);
		System.out.println(builder.reverse());
		
		
		
		
		
		
		
		
	}

}
