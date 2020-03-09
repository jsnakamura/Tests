package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.BankwireMethodAction;
import modules.CheckMethodAction;
import pageobjects.PaymentMethodPage;

public class PaymentMethodSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public PaymentMethodSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I choose payment method check and proceed$")
	public void I_choose_payment_method_check_and_proceed() throws Throwable {

		PageFactory.initElements(driver, PaymentMethodPage.class);
		CheckMethodAction.Execute(driver, datamap);
	}
	
	@Then("^I choose payment method bankwire and proceed$")
	public void I_choose_ayment_method_bankwire_and_proceed() throws Throwable {

		PageFactory.initElements(driver, PaymentMethodPage.class);
		BankwireMethodAction.Execute(driver, datamap);
	}
}
