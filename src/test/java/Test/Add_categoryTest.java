package Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Add_CategoryPage;

public class Add_categoryTest {
	WebDriver driver;
	
		
	
	@Test
	public void UserShoubAbleToAddCategory() throws InterruptedException {
		
		driver = Util.BrowserFactory.LaunchBrowser();
		Thread.sleep(5000);
		
		Add_CategoryPage add_category= PageFactory.initElements(driver, Add_CategoryPage.class);
		
		add_category.new_category("BMW");
		add_category.clickAddButton();
		
		Scanner userInput = new Scanner(System.in);
		String data = userInput.next();
		if(data.equalsIgnoreCase("BMW")){
			System.out.println( "The category you want to add already exists: <duplicated category name>.");
		}
	}
	

}
