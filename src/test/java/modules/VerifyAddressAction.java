package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import helpers.DataHelper;
import helpers.Log;
import pageobjects.VerifyAdressPage;

public class VerifyAddressAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		assertEquals(
				DataHelper.getMapValue(datamap, 0, "Address1") + " " + DataHelper.getMapValue(datamap, 0, "Address2"),
				VerifyAdressPage.DeliveryAddressPage.delivery_address1_plus_address2.getText());
		Log.info("Delivery addresses match");

		assertEquals(
				DataHelper.getMapValue(datamap, 0, "Address1") + " " + DataHelper.getMapValue(datamap, 0, "Address2"),
				VerifyAdressPage.BillingAddressPage.billing_address1_plus_address2.getText());
		Log.info("Billing addresses match");

		assertEquals(
				DataHelper.getMapValue(datamap, 0, "City") + ", " + DataHelper.getMapValue(datamap, 0, "State") + " "
						+ DataHelper.getMapValue(datamap, 0, "Zip"),
				VerifyAdressPage.DeliveryAddressPage.delivery_city_state_postcode.getText());
		Log.info("Delivery city, state and postcode match");

		assertEquals(
				DataHelper.getMapValue(datamap, 0, "City") + ", " + DataHelper.getMapValue(datamap, 0, "State") + " "
						+ DataHelper.getMapValue(datamap, 0, "Zip"),
				VerifyAdressPage.BillingAddressPage.billing_city_state_postcode.getText());
		Log.info("Billing city, state and postcode match");

		assertEquals(DataHelper.getMapValue(datamap, 0, "Country"),
				VerifyAdressPage.DeliveryAddressPage.delivery_country.getText());
		Log.info("Delivery country match");

		assertEquals(DataHelper.getMapValue(datamap, 0, "Country"),
				VerifyAdressPage.BillingAddressPage.billing_country.getText());
		Log.info("Billing country match");

		wait.until(ExpectedConditions.elementToBeClickable(VerifyAdressPage.proceed_to_carrier));
		VerifyAdressPage.proceed_to_carrier.click();
		Log.info("Button to proceed to carrier clicked");

		Reporter.log("Verify address action successfully performed ");
	}
}
