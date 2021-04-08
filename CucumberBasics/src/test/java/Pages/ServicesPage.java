package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.TestContext;

public class ServicesPage {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id='emsb-service-name']")
	By	lbl_availableServices;
	
	public ServicesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public String[] getAllAvailableServices() {
		List<WebElement> availableServices = driver.findElements(By.xpath("//*[@id='emsb-service-name']"));
		System.out.println(availableServices);
		String services[] = new String[availableServices.size()];
		int i=0;
		for ( WebElement we: availableServices) { 
	        System.out.println(we.getText());
			services[i] = we.getText();
			i++;			
	        }
		return services;
   	}
	
	
}
