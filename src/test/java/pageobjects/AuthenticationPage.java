package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage extends BaseClass {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "email")
	public static WebElement email_login;

	@FindBy(how = How.ID, using = "passwd")
	public static WebElement password;

	@FindBy(how = How.ID, using = "SubmitLogin")
	public static WebElement submit_login;

	@FindBy(how = How.ID, using = "email_create")
	public static WebElement email_create;

	@FindBy(how = How.ID, using = "SubmitCreate")
	public static WebElement submit_create;
}
