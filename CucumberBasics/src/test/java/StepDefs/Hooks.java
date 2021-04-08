package StepDefs;

import Framework.FileReaderManager;
import Framework.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	 TestContext testContext;
	 
	 public Hooks(TestContext testContext) {
	 this.testContext = testContext;
	 }
	 
	 @Before
	 public void BeforeSteps() {
	 /*What all you can perform here
	 Starting a webdriver
	 Setting up DB connections
	 Setting up test data
	 Setting up browser cookies
	 Navigating to certain page
	 or anything before the test
	 */
		
	 System.out.println("inside before() hook");	 
	 String url = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
	 System.out.println("URL - :"+url);

	 System.out.println("driver = "+testContext.getWebDriverManager().getDriver());
	 testContext.getWebDriverManager().getDriver().get(url);
	 System.out.println("url loaded");
	 }
	 
	 @After
	 public void AfterSteps() {
//	 testContext.getWebDriverManager().closeDriver();
		 System.out.println("inside after() method");
		 testContext.getWebDriverManager().closeDriver();
	 }
	 
	}