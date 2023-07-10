package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	   driver.get("file:///C:/Users/Admin/Desktop/Webelement/dropdown.html");
	   
	   WebElement multiselectDD = driver.findElement(By.id("menu"));
      Select sel= new Select(multiselectDD);
      
      //identify dropdown on webpage
   	  WebElement dropDownElement = driver.findElement(By.id("menu"));
   	   
   	  // Handle the  dropdown by creating object of select
   	Select sel1 = new Select(dropDownElement);
   	
   	//read all the options of dropdown
      List<WebElement> allOps = sel1.getOptions();
      
      //to read list use looping statement
      for(WebElement op:allOps)
      {
    	  
    	 if (op.getText().equals("PavBhaji")) {
			Thread.sleep(2000);
    		 op.click();
			break;
		}
      }
	}

}
