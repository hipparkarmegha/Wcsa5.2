package takescreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Bydowncasting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://www.facebook.com/");
	   
	   // By downcasting to Remotewebdriver class
	   RemoteWebDriver rwd = (RemoteWebDriver) driver;
	   File src = rwd.getScreenshotAs(OutputType.FILE);
	   src=new File("./screenshots/google.png");
	   
	   

	}

}
