package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/"); // application
																					// launching
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//h2[text()='Already registered?']")).getText();
		
		if(text.equals("ALREADY REGISTERED?")) {
			System.out.println("This is text is correct");
		}
		
		if(driver.findElement(By.id("email")).isDisplayed()) {
			WebElement usernameElement = driver.findElement(By.id("email"));
			usernameElement.sendKeys("janardhankaragir@gmail.com");
		}	
		
		driver.findElement(By.id("pass")).sendKeys("Password@12");
		if(driver.findElement(By.id("send2")).isEnabled()) {
			driver.findElement(By.id("send2")).click();
		}
	}
}
