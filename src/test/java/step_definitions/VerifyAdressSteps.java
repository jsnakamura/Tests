package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.VerifyAddressAction;
import pageobjects.VerifyAdressPage;

public class VerifyAdressSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public VerifyAdressSteps() {
		
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}
	
	@Then("^I verify address and proceed$")
	public void i_verify_details_on_shopping_cart_summary_page() throws Throwable {
		
		PageFactory.initElements(driver, VerifyAdressPage.class);
		PageFactory.initElements(driver, VerifyAdressPage.DeliveryAddressPage.class);
		PageFactory.initElements(driver, VerifyAdressPage.BillingAddressPage.class);
		
		VerifyAddressAction.Execute(driver, datamap);
	}
}
