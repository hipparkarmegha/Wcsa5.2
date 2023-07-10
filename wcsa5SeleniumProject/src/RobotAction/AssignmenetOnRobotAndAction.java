package RobotAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmenetOnRobotAndAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   // lauch bluestone
	   driver.get("https://www.bluestone.com/");
	   driver.findElement(By.id("denyBtn")).click();
	   // move to watch jewellery
	   Actions act = new Actions(driver);
	WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	  act.moveToElement(target).perform();
	  driver.findElement(By.xpath("//a[text()='Band']")).click();
	  Thread.sleep(2000);
	  // click and hold filter by text
	  WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	  for(int i=1; i<=2; i++)
	  {
		  act.doubleClick(target2).perform();
		  act.clickAndHold(target2).perform();
	  }
	  // copy the filter by text
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_C);
	  
	  // identify the search 
	  driver.findElement(By.id("")).click();
	  
	  //
	   
	   
	  
	   
	}

}
