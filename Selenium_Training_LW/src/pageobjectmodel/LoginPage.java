package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement txtBox_username;
	
	@FindBy(name="password")
	WebElement txtBox_password;
	
	@FindBy(name="submit")
	WebElement btn_login;
	
	public void login() {
		txtBox_username.sendKeys("admin");
		txtBox_password.sendKeys("admin");
		btn_login.click();
	}
}
