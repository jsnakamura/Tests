package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TshirtsCatalogPage extends BaseClass {

	public TshirtsCatalogPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CLASS_NAME, using = "cat-name")
	public static WebElement category_name;

	public static class FadedShortSleeve {

		@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
		public static WebElement img_t_shirt;

		@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")
		public static WebElement add_cart_t_shirt;

		@FindBy(how = How.LINK_TEXT, using = "Add to cart")
		public static WebElement add_cart_t_shirt2;

		@FindBy(how = How.CLASS_NAME, using = "product-price")
		public static WebElement product_price;
	}

	public static class CartPopup {

		@FindBy(how = How.XPATH, using = "//*a[@title='Continue shopping']")
		public static WebElement continue_shopping;

		@FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
		public static WebElement proceed_to_checkout;

	}
}
