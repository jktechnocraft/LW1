package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipWithoutTitleEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/"); 																			
		driver.manage().window().maximize();
		WebElement btnElement = driver.findElement(By.id("toolTipButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btnElement).perform();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[text()='You hovered over the Button']"));
		System.out.println("text is "+element.getText());
		Thread.sleep(3000);
		if(element.getText().equalsIgnoreCase("You hovered over the Button")) {
			System.out.println("tooltip is present");
		}
	}
}
