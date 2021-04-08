//package StepDefs;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import Framework.BaseTest;
//import Framework.PageObjectManager;
//import Pages.HomePage;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.*;
//
//public class UserSteps {
//
//	WebDriver driver;	
//	HomePage homePage;
//	PageObjectManager pageObjectManager;
//	
//	String url = "http://healthcare.c2ta.co.in";
//	
//	private String homepageTitle = "Healthcare | Just another WordPress site";
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	    System.out.println("inside given...");
//	    BaseTest.loadURL(url);
//	}
//
//	@And("user is on homepage page")
//	public void user_is_on_homepage_page() {
//		pageObjectManager = new PageObjectManager(driver);
//		homePage=pageObjectManager.getHomePage();
//		Assert.assertEquals(homePage.titleOfPage(), homepageTitle);
//		homePage.verifyUserIsOnHomePage();
////	    Assert.assertEquals(homePage.verifyUserIsOnHomePage(),true);
//	}
//
//	@When("user clicks on {string} menu")
//	public void user_clicks_on_menu(String menu) {
////	    BaseTest.driver.findElement(By.xpath("//a[contains(text(),'"+menu+"')]")).click();;	    
//	}
//
//	@Then("user should be able to see all <available services>")
//	public void user_should_be_able_to_see_all_available_services(io.cucumber.datatable.DataTable dataTable) {
////	    WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement bookService;
////		bookService= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Book-Service')]")));
//		
//		java.util.List<String> expectedAvailableServices = dataTable.asList();
//		
//		
//	}
//
//}
