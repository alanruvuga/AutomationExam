package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthDropDownPage {
	WebDriver driver;

	public MonthDropDownPage(WebDriver driver) {

		this.driver = driver;

	}
	// WebElement Library

	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement MONTH_DROP_DOWN_BUTTON;

	// Method to Interact
	public void ClickMonthDropDown() {
		MONTH_DROP_DOWN_BUTTON.click();

	}
}
