package superman.GenericUtility.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class LogOutPage extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static WebElement btn_Logout() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Logout']"));
			System.out.println("btn_Logout found in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Logout not found in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Cancel() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Cancel']"));
			System.out.println("btn_Cancel found on PopUp in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Cancel not found on PopUp in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Ok() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Ok']"));
			System.out.println("btn_Ok found on PopUp in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Ok not found on PopUp in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

}
