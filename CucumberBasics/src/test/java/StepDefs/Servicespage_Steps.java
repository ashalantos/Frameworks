package StepDefs;

import java.util.Arrays;

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

public class Servicespage_Steps {
	 
	TestContext testContext;
	ServicesPage servicesPage;
	
	public Servicespage_Steps(TestContext context) {
		 testContext = context;
		 servicesPage = testContext.getPageObjectManager().getServicesPage();
	}

	@Then("user should be able to see all <available services>")
	public void user_should_be_able_to_see_all_available_services(io.cucumber.datatable.DataTable dataTable) {
		String[] availableServices = servicesPage.getAllAvailableServices();
		System.out.println(Arrays.toString(availableServices));
	}

}
