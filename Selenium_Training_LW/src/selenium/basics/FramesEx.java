package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.switchTo().frame("frame2");	
		Select select = new Select(driver.findElement(By.id("animals")));
		select.selectByVisibleText("Baby Cat");
		driver.switchTo().defaultContent();		
		String heading = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		System.out.println(heading);	
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.quit();
	}
}
