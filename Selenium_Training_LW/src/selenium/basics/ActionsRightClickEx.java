package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClickEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons"); 																			
		driver.manage().window().maximize();
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		Actions actions = new Actions(driver);
		actions.contextClick(btnRightClick).perform();
		if(driver.findElement(By.id("rightClickMessage")).isDisplayed()) {
			System.out.println("Right click btn is clicked");		
		}
	}
}
