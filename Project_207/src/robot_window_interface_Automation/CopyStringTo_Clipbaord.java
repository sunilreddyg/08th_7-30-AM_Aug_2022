package robot_window_interface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipbaord 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Launching Notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		String  path="D:\\Manual Classnotes\\Defect_Handling\\MyResume.docx";
		
		//Copy String to Clipboard 
		
		//Copy selected string
		StringSelection spath=new StringSelection(path);
		
		//Enabled System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//set memory to Clipboard
		clipboard.setContents(spath, spath);
		
		//Press Control+V using roboat
		//Create Object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Down Keyboard Control..
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
