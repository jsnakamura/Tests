package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.AuthenticationPage;

public class SignUpAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		AuthenticationPage.email_create.sendKeys(map.get(0).get("Email"));
		Log.info("New email entered in text box");

		wait.until(ExpectedConditions.elementToBeClickable(AuthenticationPage.submit_create));
		AuthenticationPage.submit_create.click();
		Log.info("Click action performed on Submit create button");

		Reporter.log("Sign up action successfully performed ");
	}
}
