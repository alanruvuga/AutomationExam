package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Util.BrowserFactory;



public class LauncherBrowserTest {
	WebDriver driver;
@Test	
public void TestBrowser() {
		
	driver= BrowserFactory.LaunchBrowser();
		
		
	

}
}
