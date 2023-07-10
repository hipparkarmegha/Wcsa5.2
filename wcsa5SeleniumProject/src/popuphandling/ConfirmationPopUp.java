package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			
		    WebDriver driver=new EdgeDriver(); //  use to launch Edge Browser.
		    driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     	driver.get("file:///C:/Users/Admin/Desktop/Webelement/Confirmation%20popup.html");
	     	// to generate confirmation pop up  click on submit  button
	     	driver.findElement(By.tagName("input")).click();
            // handle confirmation pop up by using switchTo();
	     	Thread.sleep(2000);
	     	Alert al = driver.switchTo().alert();
	     	al.accept(); // accept the confirmation pop up
	     	al.dismiss(); // dismiss the confirmation pop up
	     	System.out.println(al.getText());
	     	al.accept();
	     	al.sendKeys("getText");
	}

}
