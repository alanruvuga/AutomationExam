package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_CategoryPage {
	WebDriver driver;
	
	
	
	@FindBy(how = How.XPATH, using ="//Input[@name='categorydata']")
	WebElement ADD_CATEGORY;
	@FindBy(how = How.XPATH, using = "//Input[@value='Add category']")
	WebElement ADD_BUTTON;
	
	public void new_category(String category) {
		
		//String category1;
		//category1= "BMW";
		ADD_CATEGORY.sendKeys(category);
	}
	public void clickAddButton() {
			ADD_BUTTON.click();
		
	}

}
