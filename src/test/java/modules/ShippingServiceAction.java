package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.ShippingServicePage;

public class ShippingServiceAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {

		assertEquals("SHIPPING", ShippingServicePage.page_heading.getText());

		ShippingServicePage.terms.click();
		Log.info("Terms of service button clicked");

		ShippingServicePage.proceed_to_payment.click();
		Log.info("Proceed to payment button clicked");

		Reporter.log("Shipping Address page verify and proceed successful");
	}
}
