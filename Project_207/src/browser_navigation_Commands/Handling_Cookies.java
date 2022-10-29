package browser_navigation_Commands;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Cookies {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		
		//Method delete all Stored cookies with in browser
		//driver.manage().deleteAllCookies();  
		
		driver.manage().addCookie(new Cookie("_Add", "46657326327999jjjj"));
		Thread.sleep(20000);
		
		
		//Delete Cookie Using Session ID
		driver.manage().deleteCookieNamed("_Add");
		
		
		for (Cookie EachCookie : driver.manage().getCookies()) 
		{
				String CookieName=EachCookie.getName();
				String CookieValue=EachCookie.getValue();
				
				if(CookieName.equals("_fbp"))
				{
					driver.manage().deleteCookieNamed("_fbp");
				}
				System.out.println(CookieName+"\t"+CookieValue);
		}
		
		

	}

}
