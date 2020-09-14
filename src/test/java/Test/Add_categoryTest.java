package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Add_CategoryPage;
import Page.ValidateCategory;

public class Add_categoryTest {
	WebDriver driver;
	
		
	
	@Test
	public void UserShoubAbleToAddCategory() throws InterruptedException {
		
		driver = Util.BrowserFactory.init();
		//Thread.sleep(5000);
		
		Add_CategoryPage add_category= PageFactory.initElements(driver, Add_CategoryPage.class);
		
		add_category.new_category("Alan");
		add_category.clickAddButton();
		add_category.checkCategoryDropDownName("Alan");

		
		
		
		ValidateCategory add_Validate_category= PageFactory.initElements(driver, ValidateCategory.class);
		add_Validate_category.varifyAddCate();
	
		}
	}
	


