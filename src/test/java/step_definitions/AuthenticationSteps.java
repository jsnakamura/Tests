package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.SignUpAction;
import modules.SignInAction;
import pageobjects.AuthenticationPage;

public class AuthenticationSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public AuthenticationSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I insert a new email and proceed to create an account$")
	public void i_insert_a_new_email_and_proceed_to_create_an_account() throws Throwable {

		PageFactory.initElements(driver, AuthenticationPage.class);
		SignUpAction.Execute(driver, datamap);
	}
	
	@Then("^I sign in")
	public void i_sign_in() throws Throwable {
		
		PageFactory.initElements(driver, AuthenticationPage.class);
		
		SignInAction.Execute(driver, datamap);
	}

}
