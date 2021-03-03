package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://purnadata.in/PurnaDemo/index.php"); // launching
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	}
}
