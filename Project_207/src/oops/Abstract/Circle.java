package oops.Abstract;

public class Circle extends Shape
{
	

	@Override
	void draw() 
	{
		System.out.println("Draw from child class executed");
	}

	

	public static void main(String[] args) 
	{
		Shape obj=new Circle();
		obj.draw();
		obj.corners();
		
		
	}

}
