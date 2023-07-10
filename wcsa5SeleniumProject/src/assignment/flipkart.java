package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP laptop");
	   
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()='HP Victus Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650) 16-d0310TX Gaming Laptop']/../..//[text()='₹58,990']")).click();
	   
	}

}
