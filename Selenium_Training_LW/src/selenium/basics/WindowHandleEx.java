package selenium.basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parentWindowHandle= driver.getWindowHandle();
		System.out.println("Parent windw handle is: "+parentWindowHandle);		
		driver.findElement(By.id("win2")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All window handles: "+windowHandles);	
		for(String handle : windowHandles) {   //for-each loop			
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
			}			
		}	
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());		
		driver.quit();
	}
}
