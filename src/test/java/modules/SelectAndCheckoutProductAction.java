package modules;

import static org.testng.AssertJUnit.assertEquals;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import pageobjects.HomePage;
import pageobjects.TshirtsCatalogPage;

public class SelectAndCheckoutProductAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		HomePage.HeaderPage.menu_women.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tops")));
		HomePage.HeaderPage.WomenPage.tops.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(HomePage.HeaderPage.WomenPage.TopsPage.t_shirts));
		HomePage.HeaderPage.WomenPage.TopsPage.t_shirts.click();

		assertEquals("T-SHIRTS ", TshirtsCatalogPage.category_name.getText());

		Actions action = new Actions(driver);
		action.moveToElement(TshirtsCatalogPage.FadedShortSleeve.img_t_shirt);
		action.perform();

		wait.until(ExpectedConditions.elementToBeClickable(TshirtsCatalogPage.FadedShortSleeve.add_cart_t_shirt));
		TshirtsCatalogPage.FadedShortSleeve.add_cart_t_shirt.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(TshirtsCatalogPage.CartPopup.proceed_to_checkout));
		TshirtsCatalogPage.CartPopup.proceed_to_checkout.click();
		
		Reporter.log("Select product successful");
	}
}
