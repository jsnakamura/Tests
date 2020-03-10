package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Log;
import pageobjects.OrderConfirmationPage;

public class OrderConfirmationAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(
				ExpectedConditions.textToBePresentInElement(OrderConfirmationPage.page_heading, "ORDER CONFIRMATION"));
		assertEquals("ORDER CONFIRMATION", OrderConfirmationPage.page_heading.getText());
		Log.info("confirmation order successfully performed");
	}
}
