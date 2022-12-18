package oops.polymorphism.overriding;

public class Pentagon extends Shape
{
	

	@Override
	public void draw() 
	{
		super.draw();
		System.out.println(super.name);
	}

	public static void main(String[] args) 
	{
		
		Pentagon obj=new Pentagon();
		obj.draw();
		

	}

}
