package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://www.bluestone.com/");
	   
	   // handle hiddien division pop up
	   driver.findElement(By.id("denyBtn")).click();
         Thread.sleep(2000);
	   // handle the frame by switch the control to frame
	   driver.switchTo().frame(5);
	   
	   //driver.findElement(By.id("chat-icon")).click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon"))).click();   
	    
	    
	    
	   

	}

}
