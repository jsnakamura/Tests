package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenAutomationPracticeSteps {

	public WebDriver driver;

	public OpenAutomationPracticeSteps() {
		driver = Hooks.driver;
	}

	@When("^I open automationpratice website$")
	public void i_open_automationpractice_website() throws Throwable {
		driver.get("http://automationpractice.com");
	}

	@Then("^I validate title and URL$")
	public void i_validate_title_url() throws Throwable {

		assertEquals("My Store", driver.getTitle());
		assertEquals("http://automationpractice.com/index.php", driver.getCurrentUrl());
	}
}
