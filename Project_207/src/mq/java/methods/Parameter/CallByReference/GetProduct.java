package mq.java.methods.Parameter.CallByReference;

public class GetProduct 
{
	
	public void printDay(String Date)
	{
		System.out.println(Date);
	}
	
	public void Getinfo(Product product)
	{
		product.printinfo();
	}
	
	

	public static void main(String[] args) 
	{
		GetProduct obj=new GetProduct();
		obj.printDay("23/09/2022");  //Callbyvalue
		
		obj.Getinfo(new Product());
		

	}

}
