package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUpperLetterEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form"); 																			
		driver.manage().window().maximize();
		WebElement textBoxFirstName= driver.findElement(By.id("firstName"));
		Actions actions = new Actions(driver);
		actions.keyDown(textBoxFirstName, Keys.SHIFT);
		actions.sendKeys("janardhan");
		actions.keyUp(Keys.SHIFT);
		actions.perform();
	}
	
	//what is the difference between Build and perform in selenium?
}
