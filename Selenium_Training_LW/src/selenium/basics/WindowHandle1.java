package selenium.basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle is: "+parentWindowHandle);		
		driver.findElement(By.id("win2")).click();	
		Set<String> windowHandles = driver.getWindowHandles();	
		for(String handle : windowHandles) {  //for-each		
			System.out.println("window handles are: "+handle);
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
