package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.DataHelper;
import pageobjects.PaymentMethodPage;

public class BankwireMethodAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) throws Exception {

		assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", PaymentMethodPage.page_heading.getText());
		
		assertEquals("$" + DataHelper.getMapValue(datamap, 0, "TotalPrice"), PaymentMethodPage.total_price.getText());
		
		PaymentMethodPage.bank_wire.click();

		Reporter.log("Bankwire selected and proceed successful");
	}

}
