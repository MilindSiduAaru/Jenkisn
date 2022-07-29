package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWithCredentials {
	public WebDriver driver;
	By ClickOnLoginButton=(By.linkText("Log in"));
	By EnterUserName=(By.xpath("//input[@id=\"un\"]"));
	By EnterPassword=(By.xpath("//input[@id=\"pd\"]"));
	By cookie=(By.linkText("Accept all"));
	By AccountLogin=(By.xpath("//button[@id=\"login2\"]"));
	
	
	public LoginWithCredentials(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement ClickLogin() {
		return driver.findElement(ClickOnLoginButton);

	}
	public WebElement EnterUN() {
		return driver.findElement(EnterUserName);

	}
	public WebElement EnterPass() {
		return driver.findElement(EnterPassword);

	}
	public WebElement AcceptC() {
		return driver.findElement(cookie);

	}
	public WebElement LoginToAccount() {
		return driver.findElement(AccountLogin);

	}

}
