package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Util.BasePage;

public class Add_CategoryPage extends BasePage {
	WebDriver driver;
	
	
	// Element Library
	@FindBy(how = How.XPATH, using ="//div[@class = 'advance-controls']/span/input[1]")
	WebElement ADD_CATEGORY;
	@FindBy(how = How.XPATH, using = "//div[@class = 'advance-controls']/span/input[2]")
	WebElement ADD_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[@class = 'advance-controls']/span/select[1]")
	WebElement ADD_DROPDOWN_BUTTON;
	
	//span[@id="extra"]/input[1]
	
	
	// Methods 
	
	public void new_category(String category) {
		String enteredName = category + BasePage.randomNumGenerator();
		//BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[1]"));
		ADD_CATEGORY.sendKeys(enteredName);
	}
	public void clickAddButton() {
		//BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[1]"));
			ADD_BUTTON.click();
		
	}
	
	public void checkCategoryDropDownName(String categorydropdownname) {	
		//BasePage.waitForElement(driver, 3, By.xpath("//div[@class = 'advance-controls']/span/select[1]"));
		BasePage.dropDown(ADD_DROPDOWN_BUTTON, categorydropdownname);
	}

}


// //Input[@name='categorydata']
//Input[@value='Add category']