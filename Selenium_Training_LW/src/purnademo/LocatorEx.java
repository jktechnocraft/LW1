package purnademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://purnadata.in/PurnaDemo/index.php"); 														// launching
		driver.manage().window().maximize();
		
		if(driver.findElement(By.xpath("//img[@src='logo.jpg']")).isDisplayed()) {
			System.out.println("Logo is displayed");
		}
			
		driver.findElement(By.name("username")).sendKeys("admin");
		System.out.println(driver.findElement(By.id("username")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.id("username")).getLocation());
		
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
//		driver.findElement(By.tagName("select")).click();
		
//		driver.findElement(By.partialLinkText("Dashbo")).click();
		String txt=driver.findElement(By.xpath("//label[text()=' Customer Name']")).getText();
		if(txt.equals("Customer Name")) {
			System.out.println("customer name is present");
		}
		
		System.out.println(driver.findElement(By.tagName("a")).getText());
		
//		driver.findElement(By.linkText("Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashbo")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
