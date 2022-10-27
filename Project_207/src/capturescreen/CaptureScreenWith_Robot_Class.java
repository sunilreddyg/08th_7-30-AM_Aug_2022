package capturescreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenWith_Robot_Class 
{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Creating object for robot class
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(new Dimension(800, 600)));
		ImageIO.write(image, "PNG", new File("D:\\14_Sep_8AM_2022\\Project_207\\Screens\\alert.png"));
		
		

	}

}
