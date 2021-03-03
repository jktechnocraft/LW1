package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://purnadata.in/PurnaDemo/index.php"); // launching
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();	
		String linkText = driver.findElement(By.tagName("a")).getText();	
		System.out.println(linkText);	
//		driver.findElement(By.linkText("Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashb")).click();
	}

}
