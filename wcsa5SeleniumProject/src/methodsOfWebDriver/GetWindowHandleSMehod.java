package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleSMehod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// lauch the browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// apply  implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// lauch the web application
		driver.get("http://omayo.blogspot.com/");
		// get the handle or address of current or parent window
         String parentHandle = driver.getWindowHandle();
         System.out.println( "Address of parent window:"+ parentHandle);
         
         // lauch the child window
         WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
         Thread.sleep(2000);
         // get the handle or address of child window only
         //String childHandle = driver.getWindowHandle();//[
         //System.out.println("Address of child window:"+childHandle);
         Set<String> allHandle = driver.getWindowHandles();
         for( String wh:allHandle)
         {
        	 System.out.println(wh);
         }
         
	}

}
