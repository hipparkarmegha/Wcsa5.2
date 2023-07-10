package actionnsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClassMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://www.flipkart.com/");
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       
	   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP laptop");
	   
	  
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 WebElement Target = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	
	}

}
