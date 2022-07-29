package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class_For_Chrome {
	public WebDriver driver;
	public WebDriver Green_Apex() throws IOException {
		FileInputStream f1=new FileInputStream("F:\\New Selenium Practice\\Green_Apex_TestNg\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium jars\\Chrome Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			//JavascriptExecutor js = (JavascriptExecutor) driver;
		}
		return driver;
	}
	

}
