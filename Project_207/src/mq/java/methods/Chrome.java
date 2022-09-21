package mq.java.methods;

public class Chrome
{
	
     public void Openchrome() 
     {
	     System.out.println("Open");
     }
     
     public void Loadpage() 
     {
	      System.out.println("Load");
     }
  
     public void Login() 
     {
		  System.out.println("Login");
	 }
     
     public void Logout() 
     {
		  System.out.println("Logout");
	 }
     
     public static void main(String[] args)
     {
	     new Chrome().Openchrome();
	     new Chrome().Loadpage();
	     new Chrome().Login();
	     new Chrome().Logout();
    	 
	 }
  }
