package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownWithSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://purnadata.in/PurnaDemo/index.php"); // launching
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
		
		
//		Thread.sleep(20000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		WebDriverWait wait = new WebDriverWait(driver,25);	
		WebElement buttonElement  = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("submit"))));
		buttonElement.click();	
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		
		WebElement dropdownCust = driver.findElement(By.id("bill_to"));	
		Thread.sleep(1000);
		driver.findElement(By.id("bill_to")).sendKeys("Sunshine Pvt. Ltd");
//		Select select = new Select(dropdownCust);
//		select.selectByIndex(2);
//		select.selectByValue("Sunshine Pvt. Ltd");
//		select.selectByVisibleText("Infotech Ltd.");
//		driver.close();
	}
}
