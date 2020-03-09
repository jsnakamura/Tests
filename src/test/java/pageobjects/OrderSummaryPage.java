package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPage extends BaseClass {

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CLASS_NAME, using = "page-subheading")
	public static WebElement page_subheading;

	@FindBy(how = How.TAG_NAME, using = "button")
	public static List<WebElement> all_buttons;
}
