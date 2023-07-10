package methodsOfWebDriver;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagemethodToSetposition {

	private static final org.openqa.selenium.Point Point = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point point = new Point(200,150);
		driver.manage().window().setPosition(Point);
		
	}

}
