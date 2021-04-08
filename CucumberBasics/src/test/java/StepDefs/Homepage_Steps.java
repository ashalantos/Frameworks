package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.PageObjectManager;
import Framework.TestContext;
import Pages.HomePage;
import Pages.ServicesPage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Homepage_Steps {
	 
	TestContext testContext;
	HomePage homePage;
	ServicesPage servicesPage;
	
	private String homepageTitle = "Healthcare | Just another WordPress site";
	
	public Homepage_Steps(TestContext context) {
		 testContext = context;
		 homePage = testContext.getPageObjectManager().getHomePage();
		 servicesPage = testContext.getPageObjectManager().getServicesPage();
	}
	
	@Given("user is on homepage page")
	public void user_is_on_homepage_page() {
		Assert.assertEquals(homePage.titleOfPage(), homepageTitle);
		homePage.verifyUserIsOnHomePage();
	}

	@When("user clicks on {string} menu")
	public void user_clicks_on_menu(String menu) {
		homePage.clickOnMenu(menu);	    
	}

}
