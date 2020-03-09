package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage extends BaseClass {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "submitAccount")
	public static WebElement Register;

	public static class PersonalInfo {

		@FindBy(how = How.ID, using = "id_gender1")
		public static WebElement gender_male;

		@FindBy(how = How.ID, using = "id_gender2")
		public static WebElement gender_female;

		@FindBy(how = How.ID, using = "customer_firstname")
		public static WebElement firstname_personal;

		@FindBy(how = How.ID, using = "customer_lastname")
		public static WebElement lastname_personal;

		@FindBy(how = How.ID, using = "passwd")
		public static WebElement password;

		@FindBy(how = How.ID, using = "days")
		public static WebElement day_birth;

		@FindBy(how = How.ID, using = "months")
		public static WebElement month_birth;

		@FindBy(how = How.ID, using = "years")
		public static WebElement year_birth;

		@FindBy(how = How.ID, using = "newsletter")
		public static WebElement newsletter;

		@FindBy(how = How.ID, using = "optin")
		public static WebElement offers;
	}

	public static class AddressInfo {

		@FindBy(how = How.ID, using = "firstname")
		public static WebElement firstname_address;

		@FindBy(how = How.ID, using = "lastname")
		public static WebElement lastname_address;

		@FindBy(how = How.ID, using = "company")
		public static WebElement company;

		@FindBy(how = How.ID, using = "address1")
		public static WebElement address1;

		@FindBy(how = How.ID, using = "address2")
		public static WebElement address2;

		@FindBy(how = How.ID, using = "city")
		public static WebElement city;

		@FindBy(how = How.ID, using = "id_state")
		public static WebElement state;

		@FindBy(how = How.ID, using = "postcode")
		public static WebElement zip;

		@FindBy(how = How.ID, using = "id_country")
		public static WebElement country;

		@FindBy(how = How.ID, using = "other")
		public static WebElement info;

		@FindBy(how = How.ID, using = "phone")
		public static WebElement home_phone;

		@FindBy(how = How.ID, using = "phone_mobile")
		public static WebElement mobile_phone;

		@FindBy(how = How.ID, using = "alias")
		public static WebElement alias;
	}
}
