package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.TestContext;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Book an appointment']")
	WebElement	lnk_bookAAppointment;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public String titleOfPage() {
		return driver.getTitle();
	}
	
	public void verifyUserIsOnHomePage() {
		lnk_bookAAppointment.isDisplayed();
	}
	
	public void clickBookAAppointmentMenu() {
		lnk_bookAAppointment.click();
	}
	
	public void clickOnMenu(String menu) {
		driver.findElement(By.xpath("//a[contains(text(),'"+menu+"')]")).click();
	}
}
