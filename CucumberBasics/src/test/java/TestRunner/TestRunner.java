package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/User.feature",
		glue= {"StepDefs"},
//		tags="@user_features",
		monochrome=true,
		dryRun = false, 
		stepNotifications = true,
//		publish = true
//		plugin= {"pretty","html:target/reports/HtmlReport.html",
//				"json:target/cucumber.json",
//				"junit:target/reports/JunitReport.xml",},
		
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		)

//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:



//@RunWith(Cucumber.class)
//@CucumberOptions(features = "Features", 
//							glue = { "stepDefinitions",	"globalHooks" }, 
//							tags = "",
//							monochrome = true, 
//							dryRun = false, 
//							stepNotifications = true, 
//							plugin = { "pretty",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {
	
}
