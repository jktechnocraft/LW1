package purnademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoqa.com/automation-practice-form"); 														// launching
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxElements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<checkBoxElements.size(); i++) {
			if(checkBoxElements.get(i).getText().equals("Sports")) {
				checkBoxElements.get(i).click();
			}
		}
	}

}
