package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Util.BasePage;

public class DuplicateCategoryPage {
	
	
		WebDriver driver;
		
		public DuplicateCategoryPage (WebDriver driver) {
			
			this.driver = driver;
		}
		
		// Element Library
		@FindBy(how = How.XPATH, using ="//div[@class = 'advance-controls']/span/input[1]")
		WebElement ADD_DUPLICATE_CATEGORY;
		@FindBy(how = How.XPATH, using = "//div[@class = 'advance-controls']/span/input[2]")
		WebElement ADD_DUPLICATE_BUTTON;
		@FindBy(how = How.XPATH, using = "//div[@class = 'advance-controls']/span/select[1]")
		WebElement ADD_DROP_MENUE;
		

		
		
		// Methods 
		
		public void new_Duplicate_category(String category) {
			
			ADD_DUPLICATE_CATEGORY.sendKeys(category);
		}
		public void clickAddDuplicateButton() {
			
			ADD_DUPLICATE_BUTTON.click();
			
		}
		

	
}
