package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.VerifyShoppingCartSummaryAction;
import pageobjects.ShoppingCartSummaryPage;

public class ShoppingCartSummarySteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public ShoppingCartSummarySteps() {

		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify details on shopping cart summary page$")
	public void i_verify_details_on_shopping_cart_summary_page() throws Throwable {

		PageFactory.initElements(driver, ShoppingCartSummaryPage.class);

		VerifyShoppingCartSummaryAction.Execute(driver, datamap);
	}
}
