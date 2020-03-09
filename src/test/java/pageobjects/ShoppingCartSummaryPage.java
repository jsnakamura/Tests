package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartSummaryPage extends BaseClass {

	public ShoppingCartSummaryPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(how = How.CLASS_NAME, using = "page-heading")
	public static WebElement page_heading;

	@FindBy(how = How.XPATH, using = "//*[@id='cart_summary']/tbody/tr/td[2]/p/a")
	public static WebElement product_name;

	@FindBy(how = How.ID, using = "total_price")
	public static WebElement total_price;

	@FindBy(how = How.LINK_TEXT, using = "Proceed to checkout")
	public static WebElement proceed_to_checkout;
}
