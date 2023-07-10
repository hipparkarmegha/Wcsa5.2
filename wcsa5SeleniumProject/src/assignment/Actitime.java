package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://127.0.0.1/login.do;jsessionid=1ivnimnaj0cb1");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@src='/img/default/pixel.gif?hash=1692528820']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='button']")).click();
	 
	   
		
		
		
		
	 
}
	
}
