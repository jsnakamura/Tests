package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public static WebElement sign_in;

	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public static WebElement sign_out;

	public static class HeaderPage {

		@FindBy(how = How.LINK_TEXT, using = "Women")
		public static WebElement menu_women;

		public static class WomenPage {

			@FindBy(how = How.XPATH, using = "//*[@id='center_column']/div[2]/ul/li[1]/div/a")
			public static WebElement tops;

			public static class TopsPage {

				@FindBy(how = How.LINK_TEXT, using = "T-shirts")
				public static WebElement t_shirts;
			}
		}
	}
}
