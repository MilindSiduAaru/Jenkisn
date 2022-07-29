package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Launch_Of_HomePage_URL {
	public WebDriver driver;
	By cookies=(By.linkText("Accept all"));
	
  
	public Launch_Of_HomePage_URL(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement AcceptCookies() {
		return driver.findElement(cookies);
	}

}
