package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://www.instagram.com/");
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("meghashreepatil18@gmail.com");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("meghaprakash");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	}

}
