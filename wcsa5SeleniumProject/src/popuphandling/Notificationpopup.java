package popuphandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Notificationpopup {

	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			
		    WebDriver driver=new EdgeDriver(); //  use to launch Edge Browser.
		    driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       

	}

}
