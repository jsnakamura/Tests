package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.OrderSummaryPage;

public class OrderSummaryBankwireAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) throws Exception {

		assertEquals("BANK-WIRE PAYMENT", OrderSummaryPage.page_subheading.getText());
		OrderSummaryPage.all_buttons.get(1).click();
	}
}
