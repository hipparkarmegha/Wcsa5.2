package assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	//Perform max action on child window?

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     	
	     	driver.get("http://omayo.blogspot.com/");
	     	
	     	
	}

}
