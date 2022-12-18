package oops.Encapsulation;

public class User1 {

	public static void main(String[] args) 
	{
		
		Encaps obj=new Encaps();
		System.out.println(obj.EMPID);
		obj.EMPID="MQ0005";
		System.out.println(obj.EMPID);
		
		//Set Data to method
		obj.setName("Mindq");
		System.out.println(obj.getName());
		
		obj.setMobile("9030248855");
		System.out.println(obj.getMobile());
		
	}

}
