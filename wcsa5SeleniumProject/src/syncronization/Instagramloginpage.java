package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramloginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d focus-visible']")).sendKeys("Hitman");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hitman@45");
	   driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
