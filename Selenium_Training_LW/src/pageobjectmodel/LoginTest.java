package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	LoginPage loginPage;
	
	@BeforeMethod
	public void init() {
		initialization();
		loginPage=new LoginPage(driver);
	}
	
	@Test (priority=0)
	public void loginSuccess() {	
		loginPage.login();
		String text=driver.findElement(By.xpath("//label[text()=' Customer Name']")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Customer Name");
	}
	
	@Test
	public void loginfailure() {
		loginPage.login();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement dropdownCust = driver.findElement(By.id("bill_to"));	
		driver.findElement(By.id("bill_to")).sendKeys("Sunshine Pvt. Ltd");		
	}
	
	@Test
	public void AtitleCheck() {
		loginPage.login();
		String title = driver.getTitle();
		System.out.println(title);		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
