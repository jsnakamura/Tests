package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import helpers.DataHelper;
import helpers.Log;
import pageobjects.CreateAccountPage;

public class CreateAccountAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) throws Exception {

		String gender = DataHelper.getMapValue(datamap, 0, "Gender");
		String newsletter = DataHelper.getMapValue(datamap, 0, "Newsletter");
		String specialOffers = DataHelper.getMapValue(datamap, 0, "SpecialOffers");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		if (gender == "male") {
			wait.until(ExpectedConditions.elementToBeClickable(CreateAccountPage.PersonalInfo.gender_male));
			CreateAccountPage.PersonalInfo.gender_male.click();
			Log.info("Gender male clicked");
		} else if (gender == "female") {
			wait.until(ExpectedConditions.elementToBeClickable(CreateAccountPage.PersonalInfo.gender_female));
			CreateAccountPage.PersonalInfo.gender_female.click();
			Log.info("Gender female clicked");
		}

		wait.until(ExpectedConditions.visibilityOf(CreateAccountPage.PersonalInfo.firstname_personal));
		CreateAccountPage.PersonalInfo.firstname_personal.sendKeys(DataHelper.getMapValue(datamap, 0, "FirstName"));
		Log.info("Firstname for personal information entered in text box");

		CreateAccountPage.PersonalInfo.lastname_personal.sendKeys(DataHelper.getMapValue(datamap, 0, "LastName"));
		Log.info("Lastname for personal information entered in text box");

		CreateAccountPage.PersonalInfo.password.sendKeys(DataHelper.getMapValue(datamap, 0, "Password"));
		Log.info("password entered in text box");

		Select daySelectList = new Select(CreateAccountPage.PersonalInfo.day_birth);
		daySelectList.selectByVisibleText(DataHelper.getMapValue(datamap, 0, "DayBirth") + "  ");
		Log.info("Day of birth selected");

		Select monthSelectList = new Select(CreateAccountPage.PersonalInfo.month_birth);
		monthSelectList.selectByVisibleText(DataHelper.getMapValue(datamap, 0, "MonthBirth") + " ");
		Log.info("Month of birth selected");

		Select yearSelectList = new Select(CreateAccountPage.PersonalInfo.year_birth);
		yearSelectList.selectByVisibleText(DataHelper.getMapValue(datamap, 0, "YearBirth") + "  ");
		Log.info("Year of birth selected");

		if (newsletter == "Y") {
			CreateAccountPage.PersonalInfo.newsletter.click();
			Log.info("Signed for newsletter");
		}

		if (specialOffers == "Y") {
			CreateAccountPage.PersonalInfo.offers.click();
			Log.info("Signed to receive special offers");
		}

		CreateAccountPage.AddressInfo.firstname_address.sendKeys(DataHelper.getMapValue(datamap, 0, "FirstName"));
		Log.info("Firstname for address entered in text box");

		CreateAccountPage.AddressInfo.lastname_address.sendKeys(DataHelper.getMapValue(datamap, 0, "LastName"));
		Log.info("Lastname for address entered in text box");

		CreateAccountPage.AddressInfo.company.sendKeys(DataHelper.getMapValue(datamap, 0, "Company"));
		Log.info("Company name entered in text box");

		CreateAccountPage.AddressInfo.address1.sendKeys(DataHelper.getMapValue(datamap, 0, "Address1"));
		Log.info("Address 1 entered in text box");

		CreateAccountPage.AddressInfo.address2.sendKeys(DataHelper.getMapValue(datamap, 0, "Address2"));
		Log.info("Address 2 entered in text box");

		CreateAccountPage.AddressInfo.city.sendKeys(DataHelper.getMapValue(datamap, 0, "City"));
		Log.info("City entered in text box");

		Select state = new Select(CreateAccountPage.AddressInfo.state);
		state.selectByVisibleText(DataHelper.getMapValue(datamap, 0, "State"));
		Log.info("State selected");

		CreateAccountPage.AddressInfo.zip.sendKeys(DataHelper.getMapValue(datamap, 0, "Zip"));
		Log.info("Zip/Postcode entered in text box");

		Select country = new Select(CreateAccountPage.AddressInfo.country);
		country.selectByVisibleText(DataHelper.getMapValue(datamap, 0, "Country"));
		Log.info("Country selected");

		CreateAccountPage.AddressInfo.info.sendKeys(DataHelper.getMapValue(datamap, 0, "Info"));
		Log.info("Additional information entered in text box");

		CreateAccountPage.AddressInfo.home_phone.sendKeys(DataHelper.getMapValue(datamap, 0, "HomePhone"));
		Log.info("Home phone entered in text box");

		CreateAccountPage.AddressInfo.mobile_phone.sendKeys(DataHelper.getMapValue(datamap, 0, "MobilePhone"));
		Log.info("Mobile phone entered in text box");

		CreateAccountPage.AddressInfo.alias.sendKeys(DataHelper.getMapValue(datamap, 0, "AddressAlias"));
		Log.info("Address alias entered in text box");

		CreateAccountPage.Register.click();
		Log.info("Submit create account clicked");

		Reporter.log("Create account action successfully performed");
	}

}
