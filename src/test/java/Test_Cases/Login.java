package Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_Object_Model.Launch_Of_HomePage_URL;
import Resources.Base_Class_For_Chrome;

public class Login extends Base_Class_For_Chrome  {
	@Test
	public void Login_New() throws IOException, InterruptedException {
		driver=Green_Apex();
		driver.get("https://www.ganttic.com/blog/resource-planning-tools");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Launch_Of_HomePage_URL Launch=new Launch_Of_HomePage_URL(driver);
		Launch.AcceptCookies().click();
		
		
	}

}
