package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.CreateAccountAction;
import pageobjects.CreateAccountPage;

public class CreateAccountSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public CreateAccountSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I fill create account fields and submit$")
	public void I_fill_create_account_fields_and_submit() throws Throwable {

		PageFactory.initElements(driver, CreateAccountPage.class);
		PageFactory.initElements(driver, CreateAccountPage.PersonalInfo.class);
		PageFactory.initElements(driver, CreateAccountPage.AddressInfo.class);

		CreateAccountAction.Execute(driver, datamap);
	}
}
