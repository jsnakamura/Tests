package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.OrderConfirmationAction;
import pageobjects.OrderConfirmationPage;

public class OrderConfirmationSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public OrderConfirmationSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify order confirmation page an verify success message$")
	public void i_verify_order_summary_page_and_proceed() throws Throwable {

		PageFactory.initElements(driver, OrderConfirmationPage.class);
		OrderConfirmationAction.Execute(driver, datamap);
	}
}
