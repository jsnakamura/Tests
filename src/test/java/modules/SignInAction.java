package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import helpers.DataHelper;
import helpers.Log;
import pageobjects.AuthenticationPage;

public class SignInAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		AuthenticationPage.email_login.sendKeys(DataHelper.getMapValue(datamap, 0, "Email"));
		Log.info("Login email entered in text box");

		AuthenticationPage.password.sendKeys(DataHelper.getMapValue(datamap, 0, "Password"));
		Log.info("Password entered in text box");

		wait.until(ExpectedConditions.elementToBeClickable(AuthenticationPage.submit_login));
		AuthenticationPage.submit_login.click();
		Log.info("Submit login button action performed");

		Reporter.log("Sign in action successfully performed ");
	}

}
