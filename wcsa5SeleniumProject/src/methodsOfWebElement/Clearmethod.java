package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://127.0.0.1/login.do;jsessionid=1ivnimnaj0cb1");
	   
	 //  driver.findElement(By.name("username")).sendKeys("admin");
	   //driver.findElement(By.name("pwd")).sendKeys("manager");
	   //Thread.sleep(2000);
	 //  driver.findElement(By.name("username")).clear();
	  // driver.findElement(By.name("pwd")).clear();

	   
	  WebElement usnTB = driver.findElement(By.name("username"));
	   WebElement passTB = driver.findElement(By.name("pwd"));
	   usnTB.sendKeys("admin");
	   passTB.sendKeys("manager");
	   usnTB.clear();
	   passTB.clear();
	   
	}

}
