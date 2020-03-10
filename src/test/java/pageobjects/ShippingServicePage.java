package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingServicePage extends BaseClass {

	public ShippingServicePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CLASS_NAME, using = "page-heading")
	public static WebElement page_heading;

	@FindBy(how = How.ID, using = "cgv")
	public static WebElement terms;

	@FindBy(how = How.NAME, using = "processCarrier")
	public static WebElement proceed_to_payment;

}
