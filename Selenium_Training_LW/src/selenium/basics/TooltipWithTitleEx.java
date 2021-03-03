package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipWithTitleEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/"); 																			
		driver.manage().window().maximize();
		WebElement imgPaypal = driver.findElement(By.xpath("//img[contains(@src, 'paypalobjects')]"));
		
		String text= imgPaypal.getAttribute("title");
		if(text.equals("Additional Options")) {
			System.out.println("tooltip is present");
		}
	}

}
