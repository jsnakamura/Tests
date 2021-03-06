package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage extends BaseClass {

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CLASS_NAME, using = "page-heading")
	public static WebElement page_heading;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
	public static WebElement order_complete_message;
}
