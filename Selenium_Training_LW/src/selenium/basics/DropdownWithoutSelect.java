package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		// Providing wait to load all the elements on page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Clicking on Bootstrap Dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		// Get the all WebElements inside the dropdown in List
		List<WebElement> dropdown_list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		for (int i = 0; i < dropdown_list.size(); i++) {

			System.out.println(dropdown_list.get(i).getText());
			WebElement elemt = dropdown_list.get(i);
			if (elemt.getText().contains("Angular")) {
				elemt.click();
				break;
			}
		}
	}
}
