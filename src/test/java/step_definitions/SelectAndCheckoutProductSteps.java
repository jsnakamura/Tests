package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.SelectAndCheckoutProductAction;
import pageobjects.HomePage;
import pageobjects.TshirtsCatalogPage;

public class SelectAndCheckoutProductSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public SelectAndCheckoutProductSteps() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I select a t-shirt and proceed to checkout$")
	public void i_select_a_t_shirt_and_proceed_to_checkout() throws Throwable {

		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.WomenPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.WomenPage.TopsPage.class);
		PageFactory.initElements(driver, TshirtsCatalogPage.class);
		PageFactory.initElements(driver, TshirtsCatalogPage.FadedShortSleeve.class);
		PageFactory.initElements(driver, TshirtsCatalogPage.CartPopup.class);

		SelectAndCheckoutProductAction.Execute(driver, datamap);
	}
}
