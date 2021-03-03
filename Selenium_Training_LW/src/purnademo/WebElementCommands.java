package purnademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://purnadata.in/PurnaDemo/index.php"); 														// launching
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		
		System.out.println("location is: "+driver.findElement(By.id("username")).getLocation());
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		System.out.println("tagname is: "+driver.findElement(By.id("password")).getTagName());
		if(driver.findElement(By.name("submit")).isEnabled()) {
			driver.findElement(By.name("submit")).click();
		}
		
		WebElement customerNameElement = driver.findElement(By.xpath("//label[text()=' Customer Name']"));
		
		if(customerNameElement.isDisplayed()) {
			String text= customerNameElement.getText();
			System.out.println(text);
		}
		else{
			System.out.println("Customer is name is not displayed");
		}
		
		System.out.println("attribute value is: "+driver.findElement(By.id("excel")).getAttribute("class"));
		
		driver.close();
			
	}

}
