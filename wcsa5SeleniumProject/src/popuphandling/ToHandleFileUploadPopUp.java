package popuphandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  
	   
		
		driver.get("http://omayo.blogspot.com/");
	    Actions act = new Actions(driver);
		WebElement uploadButton = driver.findElement(By.id("uploadfile"));
//		with the help of single click method
//		act.click(uploadButton).perform();
		act.doubleClick(uploadButton).perform();
		//AutoIt integrate with selenium
		File file = new File("./AutoItPrograms/Actitime.exe");
		String absPath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec("./AutoItPrograms/OmayoFileUpload.exe");
//				
//		File file= new File("./AutoItPrograms/ActitimeVBScript.exe");
//		String absPath = file.getAbsolutePath();
//		Runtime.getRuntime().exec(absPath);
//		Thread.sleep(2000);
//		driver.quit();
//
//		
//		Thread.sleep(4000);
		
//		Runtime.getRuntime().exec(absPath);

	}

}
