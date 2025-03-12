package orangeHRM.GenericUtility.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class LoginPage extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		loadProperties();
	}

	public static WebElement txt_Username() {

		element = null;
		try {
			element = driver.findElement(By.name("username"));
			System.out.println("\033[1m txt_Username \033[0m :: found in Login Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_Username \033[0m :: not found in Login Page");
			TakeScreenshot(driver, "txt_Username");
			System.out.println(e);
			System.out.println("");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_password() {

		element = null;
		try {
			element = driver.findElement(By.name("password"));
			System.out.println("\033[1m txt_password \033[0m :: found in Login Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_password \033[0m :: not found in Login Page");
			TakeScreenshot(driver, "txt_password");
			System.out.println(e);
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_login() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[contains(@class,'login-button')]"));
			System.out.println("\033[1m btn_login \033[0m :: found in Login Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_login \033[0m :: not found in Login Page");
			TakeScreenshot(driver, "btn_login");
			System.out.println(e);
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

}
