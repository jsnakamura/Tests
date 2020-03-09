package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.ShippingServiceAction;
import pageobjects.ShippingServicePage;

public class ShippingServiceSteps {
	
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public ShippingServiceSteps() {

		driver = Hooks.driver;
		datamap = DataHelper.data();
	}
	
	@Then("^I accept terms and proceed$")
	public void i_verify_details_on_shopping_cart_summary_page() throws Throwable {

		PageFactory.initElements(driver, ShippingServicePage.class);

		ShippingServiceAction.Execute(driver, datamap);
	}

}
