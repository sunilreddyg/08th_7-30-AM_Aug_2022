package robot_window_interface_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

public class Type_Text_At_NotepadFile 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		//Launching Notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create Object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);
		
		
	}

}
