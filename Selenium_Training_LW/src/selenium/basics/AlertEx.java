package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();	
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();	
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().dismiss();
		driver.quit();
	}
}
