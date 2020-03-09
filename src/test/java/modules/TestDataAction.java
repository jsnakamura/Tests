package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import helpers.DataHelper;

public class TestDataAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> datamap) {
		
		System.out.println(DataHelper.getMapValue(datamap, 0, "Password"));
	}
}
