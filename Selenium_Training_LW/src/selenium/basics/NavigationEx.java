package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");	
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.close();	
	}
}
