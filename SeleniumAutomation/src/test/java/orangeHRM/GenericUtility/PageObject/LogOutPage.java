package orangeHRM.GenericUtility.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class LogOutPage extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		loadProperties();
	}

	public static WebElement btn_userdropdown() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown-icon')]"));
			System.out.println("\033[1m btn_userdropdown \033[0m :: found in Home Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_userdropdown \033[0m :: not found in Home Page");
			TakeScreenshot(driver, "btn_userdropdown");
			System.out.println(e);
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_logout() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Logout']"));
			System.out.println("\033[1m btn_logout \033[0m :: found in Home Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_logout \033[0m :: not found in Home Page");
			TakeScreenshot(driver, "btn_logout");
			System.out.println(e);
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
}