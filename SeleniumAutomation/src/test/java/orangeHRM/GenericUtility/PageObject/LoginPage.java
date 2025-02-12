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
			System.out.println("txt_Username found in Login Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("txt_Username not found in Login Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_password() {

		element = null;
		try {
			element = driver.findElement(By.name("password"));
			System.out.println("txt_password found in Login Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("txt_password not found in Login Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_login() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[contains(@class,'login-button')]"));
			System.out.println("btn_login found in Login Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_login not found in Login Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

}
