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
			System.out.println("btn_userdropdown found in Home Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_userdropdown not found in Home Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_logout() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Logout']"));
			System.out.println("btn_logout found in Home Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_logout not found in Home Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
}