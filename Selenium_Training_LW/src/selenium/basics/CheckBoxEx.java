package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form"); 																			
		driver.manage().window().maximize();
		if(!driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).isSelected()) {
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		}	
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		System.out.println("size is "+checkBoxes.size());		
		for(int i=0; i<checkBoxes.size(); i++) {
			System.out.println("text is "+checkBoxes.get(i).getText());
			if(checkBoxes.get(i).getText().equals("Music")) {
				Thread.sleep(3000);
				checkBoxes.get(i).click();
			}
		}
		driver.close();
	}
}
