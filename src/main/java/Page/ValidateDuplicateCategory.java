package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
  
  public class ValidateDuplicateCategory {
  
  WebDriver driver;
  
  public ValidateDuplicateCategory(WebDriver driver) { 
	  
	  this.driver = driver;
  }
  
  
  
  // Element Library
  
  @FindBy(how = How.XPATH, using ="//a[text()='Nevermind']") WebElement
  ADD_VALIDATE_CATEGORY;
  
  // Methods to interact with the elements
  
  public void varifyCategoryAlready() {
		Assert.assertEquals(ADD_VALIDATE_CATEGORY.getText(), "Nevermind", "Wrong page!!!");	
	}
  
  }
 