package mq.java.methods.Parameter.CallByReference;


public class GetProduct 
{
	//Method paramter as Datatype
	public void printDay(String Date)
	{
		System.out.println(Date);
	}
	
	//Method Parameter as Class
	public void Getinfo(Product product)
	{
		product.printinfo();
	}
	

	public static void main(String[] args) 
	{
		GetProduct obj=new GetProduct();
		obj.printDay("23/09/2022");  //Callbyvalue
		
		obj.Getinfo(new Product());  //CallByReference
	
	}

}
