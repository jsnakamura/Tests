package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyAdressPage extends BaseClass{

	public VerifyAdressPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CLASS_NAME, using = "page-heading")
	public static WebElement page_heading;
	
	@FindBy(how = How.ID, using = "id_address_delivery")
	public static WebElement address_delivery;
	
	@FindBy(how = How.ID, using = "addressesAreEquals")
	public static WebElement addresses_equals;
	
	@FindBy(how = How.NAME, using = "processAddress")
	public static WebElement proceed_to_carrier;
	
	public static class DeliveryAddressPage {
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[2]")
		public static WebElement delivery_firstname_plus_lastname;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[3]")
		public static WebElement delivery_address_company;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[4]")
		public static WebElement delivery_address1_plus_address2;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[5]")
		public static WebElement delivery_city_state_postcode;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[6]")
		public static WebElement delivery_country;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[7]")
		public static WebElement delivery_address_phone;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_delivery\"]/li[8]")
		public static WebElement delivery_address_mobile_phone;
	}
	
	public static class BillingAddressPage {
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[2]")
		public static WebElement billing_firstname_plus_lastname;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[3]")
		public static WebElement billing_address_company;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[4]")
		public static WebElement billing_address1_plus_address2;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[5]")
		public static WebElement billing_city_state_postcode;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[6]")
		public static WebElement billing_country;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[7]")
		public static WebElement billing_address_phone;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_invoice\"]/li[8]")
		public static WebElement billing_address_mobile_phone;
	}
}
