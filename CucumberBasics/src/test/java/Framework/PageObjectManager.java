package Framework;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.ServicesPage;

public class PageObjectManager {
	
		private WebDriver driver;

		private HomePage homePage;
		private ServicesPage servicesPage;


		public PageObjectManager(WebDriver driver) {
			System.out.println("inside pageobjectmanager()");
			this.driver = driver;
		}

		public HomePage getHomePage(){
			return (homePage == null) ? homePage = new HomePage(driver) : homePage;
		}

		public ServicesPage getServicesPage() {
			return (servicesPage == null) ? servicesPage = new ServicesPage(driver) : servicesPage;
		}

	

}
