package otherpackages;

import mq.java.methods.Firefox;
import mq.java.methods.instantmethods.RobotB;

public class TestA 
{

	public static void main(String[] args) 
	{
		
		RobotB obj=new RobotB();
		obj.Startwalk();
		obj.StopWalk();
		
		Firefox browser=new Firefox();
		browser.setup_browser();
		browser.visit_site();
		
	}

}
