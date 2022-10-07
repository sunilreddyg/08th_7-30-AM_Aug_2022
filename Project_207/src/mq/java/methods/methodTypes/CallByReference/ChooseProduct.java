package mq.java.methods.methodTypes.CallByReference;

public class ChooseProduct 
{
	
	public Book1  SelectBook1()
	{
		return new Book1();
	}
	
	public Book2 selectBook2()
	{
		return new Book2();
	}
	
	public static void main(String args[])
	{
		ChooseProduct product=new ChooseProduct();
		
		//Get Firstbook details
		String BookName=product.SelectBook1().GetName();
		double BookPrice=product.SelectBook1().GetPrice();
		System.out.println(BookName+"     "+BookPrice);
	}

}
