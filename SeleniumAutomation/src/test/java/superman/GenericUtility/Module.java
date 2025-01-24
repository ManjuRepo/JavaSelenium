package superman.GenericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class Module {

	static WebDriver driver = BaseClass.launchBrowser(BaseClass.browser);
	private static WebElement element;

	public static void Execute(String Val) {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@class='css-1dbjc4n']//*[contains(text(),'" + Val + "')]"));
			element.click();
			System.out.println(Val + " " + "found in Landing_Page & Action Performed on " + "" + Val);
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println(Val + " " + "not found in Landing_Page & Action Performed on " + "" + Val);
			System.out.println(" ");
			throw (e);
		}
	}
}
