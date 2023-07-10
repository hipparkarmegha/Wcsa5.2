package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/a[contains(@class,'_1_3w1N')]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("hipparkarmegha89@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("HP Laptop");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	}

}
