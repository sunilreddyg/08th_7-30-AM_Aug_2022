package mq.java.methods;

public class Firefox 
{
   public void setup_browser() 
   {
	   System.out.println("browser is open");
   }
   
   public void visit_site() 
   {
	   System.out.println("site id open");
   }
   
   public void capturescreen()
   {
	   System.out.println("screen is captured");
   }
   
   public void CloseBrowser()
   {
	   System.out.println("browser is Closed");
   }
   
   public void Screen1() 
   {
	   setup_browser();
	   visit_site();
	   capturescreen();
   }
   
   public static void main(String[] args)
   {
	 
	   new Firefox().Screen1();
	   new Firefox().CloseBrowser();
   }
}
