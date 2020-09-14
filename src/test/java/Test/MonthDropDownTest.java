package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.MonthDropDownPage;

public class MonthDropDownTest {
	WebDriver driver;

	
	@Test
	public void clickDropDown_Button()  {
		
		driver = Util.BrowserFactory.init();
	
		
		MonthDropDownPage montdropdown= PageFactory.initElements(driver, MonthDropDownPage.class);
		
		montdropdown.ClickMonthDropDown();

	}
}