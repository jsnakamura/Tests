package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.TestDataAction;

public class testDataSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public testDataSteps() {

		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I test data$")
	public void i_test_data() throws Throwable {

		TestDataAction.Execute(driver, datamap);
	}

}
