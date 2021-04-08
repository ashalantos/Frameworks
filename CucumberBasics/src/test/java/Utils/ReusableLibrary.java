package Utils;

import java.io.FileReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ReusableLibrary {

	WebDriver driver;
	
	public WebDriverWait wait;
//	WebDriver driver = driver;
	public ReusableLibrary(WebDriver driver) {
		this.driver = driver;
	}

	// isElementPresent
	public void isElementPresent(By	element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		highLightElement(element);
	}

	// wait untill page or element is loaded
	public static void waitUntilLoaded() {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// isElementClickable
	public void isElementClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		highLightElement(element);
	}

	// isElementVisible
	public void isElementVisible(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		highLightElement(element);
	}

	// isElementInVisible
	public void isElementInVisible(By element) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		highLightElement(element);
	}

	// isElementEnabled
	public void isElementEnabled(By element) {
		driver.findElement(element).isEnabled();
		highLightElement(element);
	}

	// isElementDisplayed
	public void isElementDisplayed(By element) {
		driver.findElement(element).isDisplayed();
		highLightElement(element);
	}

	// Click Button
	public void clickButton(By element) {
		isElementPresent(element);
		driver.findElement(element).click();
	}

	// Click Element
	public void clickElement(By element) {
		isElementPresent(element);
		driver.findElement(element).click();
	}

	// Click link
	public void clickLink(By element) {
		isElementPresent(element);
		driver.findElement(element).click();
	}

	// Select Check box
	public void selectCheckbox(By element) {
		isElementVisible(element);
		driver.findElement(element).click();
	}

	// Select Radio Button
	public void selectRadioButton(By element) {
		isElementVisible(element);
		driver.findElement(element).click();
	}

	// Select Multiple Options
	public void selectOption(By element) {
		isElementVisible(element);
		driver.findElement(element).click();
	}

	// Write Text
	public void enterText(By element, String text) {
		clickElement(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(text);
	}

	// Read Text
	public String readText(By element) {
		isElementDisplayed(element);
		return driver.findElement(element).getText();
	}

	// Random String
	public void generateRandomString() {

		String numbers = "0123456789";
		String empNumber = "EMP" + "";
		int length = 5;

		Random rand = new Random();
		char[] text = new char[length];

		for (int i = 0; i < length; i++) {
			text[i] = numbers.charAt(rand.nextInt(numbers.length()));
		}

		for (int i = 0; i < length; i++) {
			empNumber += text[i];
		}
		System.out.println(empNumber);
	}

//	public static String currentMethod() {
//		String nameofCurrMethod = new Throwable().getStackTrace()[1].getMethodName();
//		System.out.println("Name of current method: " + nameofCurrMethod);
//		ExtentTestManager.getTest().info(nameofCurrMethod);
//		return nameofCurrMethod;
//	}

	public void highLightElement(By element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(element);
//		WebElement ele = element;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", ele);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", ele);
	}


}
