package mq.java.methods.methodTypes.CallByReference;

public class Book1 
{
	//instant variables
	String Name="Selenium1";
	double price=2500.00;
	
	
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
