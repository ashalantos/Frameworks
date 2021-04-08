package Framework;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext(){
		System.out.println("inside TestContext() constructor");
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}