package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateCategory {
	WebDriver driver;
	
	public  ValidateCategory(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Element Library
		@FindBy(how = How.XPATH, using ="//div[@id='label-first']")
		WebElement ADD_VALIDATE_CATEGORY;
		
		// Methods to interact with the elements

		public void varifyAddCate() {
			Assert.assertEquals(ADD_VALIDATE_CATEGORY.getText(), "NSS-TODO List v 1.1", "Wrong page!!!");
		}

}
