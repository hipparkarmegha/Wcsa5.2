package methodsOfWebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodTosetSize {

	private static final org.openqa.selenium.Dimension Size = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension size = new Dimension(800,700);
		driver.manage().window().setSize(Size);
	}

}
