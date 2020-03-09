package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.OrderSummaryBankwireAction;
import modules.OrderSummaryCheckAction;
import pageobjects.OrderSummaryPage;

public class OrderSummarySteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public OrderSummarySteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify check order summary and corfirm$")
	public void I_verify_check_order_summary_and_corfirm() throws Throwable {

		PageFactory.initElements(driver, OrderSummaryPage.class);
		OrderSummaryCheckAction.Execute(driver, datamap);
	}
	
	@Then("^I verify bankwire order summary and corfirm$")
	public void I_verify_bankwire_order_summary_and_corfirm() throws Throwable {

		PageFactory.initElements(driver, OrderSummaryPage.class);
		OrderSummaryBankwireAction.Execute(driver, datamap);
	}

}
