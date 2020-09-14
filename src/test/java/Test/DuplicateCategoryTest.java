package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DuplicateCategoryPage;
import Page.ValidateDuplicateCategory;

public class DuplicateCategoryTest {
	
WebDriver driver;
	
		
	
	@Test
	public void UserShoubAbleToAddCategory() throws InterruptedException {
		
		driver = Util.BrowserFactory.init();
	
		
		DuplicateCategoryPage add_Duplicate_category= PageFactory.initElements(driver, DuplicateCategoryPage.class);
		
		add_Duplicate_category.new_Duplicate_category("Alan");
		add_Duplicate_category.clickAddDuplicateButton();
	

	
		
		ValidateDuplicateCategory add_Validate_Dup_category= PageFactory.initElements(driver, ValidateDuplicateCategory.class);
		add_Validate_Dup_category.varifyCategoryAlready();
	
		}

}
