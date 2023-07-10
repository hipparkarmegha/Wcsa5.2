package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.spicejet.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7020980929");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Megha@45");
	   driver.findElement(By.xpath("*//div[@class='css0 r-1f1sjgu r-ah5dr5 r-1otgn73']")).click();
		

	}

}
