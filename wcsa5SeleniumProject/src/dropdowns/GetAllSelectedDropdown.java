package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("file:///C:/Users/Admin/Desktop/Webelement/dropdownmultiple.html");
	   
	   // identify dropdown
	   driver.findElement(By.id("menu"));
	   
	   //handle the dropdown
	  WebElement dropdownElement = null;
	Select sel = new Select(dropdownElement);
	  
	  //select multiple option from dropdwon
	  for(int i=2; i<=5; i++)
	  {
		  Thread.sleep(2000);
		  sel.selectByIndex(i);
	  }
	  
	  //  to read all selected option forom dropdown
	 List<WebElement> allOpts = sel.getAllSelectedOptions();
	 
	 // to read the list of webelement we use for loop....
	 for(WebElement op:allOpts)
	 {
		 Thread.sleep(2000);
		 System.out.println(op.getText());
	 }
	 
	}

}