package mq.java.methods.methodTypes.CallByReference;

public class Book2 
{
	//instant variables
		String Name="Selenium2";
		double price=1500.00;
		
		
		//Instant Method
		public void PrintDetails()
		{
			System.out.println(Name+"    "+price);
		}
		
		public String  GetName()
		{
			return Name;
		}
		
		public double GetPrice()
		{
			return price;
		}

}
