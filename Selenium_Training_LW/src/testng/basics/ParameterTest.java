package testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "emailId" })
	public void magentoLoginTest(String browser, String url, String emailId) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.name("login[password]")).sendKeys("Password@12");
		driver.findElement(By.id("send2")).click();
		driver.quit();
	}

}
