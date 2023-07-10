package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenarateException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	   driver.get("file:///C:/Users/Admin/Desktop/Webelement/dropdown.html");
	   
	   //identify dropdown on webpage
	  WebElement dropDownElement = driver.findElement(By.id("menu"));
	   
	  // Handle the  dropdown by creating object of select
	Select sel = new Select(dropDownElement);
	
	// select the options from dropdown...
	//use selection methods
	Thread.sleep(2000);
	sel.selectByIndex(2);// from single select dropdown
	Thread.sleep(2000);
	
	//try to deselect given options from dropdown
	  sel.deselectByIndex(2);
	 
         // we will get  java.lang.UnsupportedOperationException
	}

}
