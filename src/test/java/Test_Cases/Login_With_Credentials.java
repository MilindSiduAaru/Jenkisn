package Test_Cases;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Page_Object_Model.Launch_Of_HomePage_URL;
import Page_Object_Model.LoginWithCredentials;
import Resources.Base_Class_For_Chrome;

public class Login_With_Credentials extends Base_Class_For_Chrome {
	@Test
	public void ClickOnLogin() throws IOException, InterruptedException {
		driver=Green_Apex();
		
		
		driver.get("https://www.ganttic.com/blog/resource-planning-tools");
		String ParentWindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		 LoginWithCredentials LWC=new LoginWithCredentials(driver);
		LWC.AcceptC().click();
		LWC.ClickLogin().click();
		Set<String>windows=driver.getWindowHandles();
		
		for(String window:windows) {
			driver.switchTo().window(window);
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		LWC.EnterUN().sendKeys("milindsiduaaru@gmail.com");
		LWC.EnterPass().sendKeys("Milind#1211");
		LWC.LoginToAccount().click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	    driver.findElement(By.xpath("//div[@id=\"menu_Task_33619744\"]")).click();
	    
		//driver.findElement(By.xpath("//div[@data-id=\"33619744\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Open task log\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"webix_el_box\"])[6]")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"20 July 2022\"]")).click();
		
		driver.findElement(By.xpath("//button[text()=\"Done\"]")).click();
	}

}
