package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggylogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.swiggy.com/");
	    Thread.sleep(2000);
        
	    driver.findElement(By.xpath("//a[@class='r2iyh' or text()='Sign up']")).click();
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("ABCD");
	    driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("abcdi20@gmail.com");
	    driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	}

}
