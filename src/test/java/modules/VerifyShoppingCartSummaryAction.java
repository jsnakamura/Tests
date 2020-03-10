package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.ShoppingCartSummaryPage;

public class VerifyShoppingCartSummaryAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		assertEquals("SHOPPING-CART SUMMARY\n" + "Your shopping cart contains: 1 Product",
				ShoppingCartSummaryPage.page_heading.getText());
		assertEquals("Faded Short Sleeve T-shirts", ShoppingCartSummaryPage.product_name.getText());
		assertEquals("$18.51", ShoppingCartSummaryPage.total_price.getText());

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Proceed to checkout")));

		ShoppingCartSummaryPage.proceed_to_checkout.click();

		Reporter.log("Shopping Cart Summary verify and proceed successful");
	}
}
