package superman.GenericUtility.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class LoginPage extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static WebElement btn_Access_using_OneLogin() {

		element = null;
		try {
			element = driver.findElement(By.xpath("//*[contains(text(),'OneLogin')]"));
			System.out.println("Access using OneLogin found in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("Access using OneLogin not found in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_UserID() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id='username']"));
			System.out.println("txt_UserID found in Login_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("txt_UserID not found in Login_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Password() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id='password']"));
			System.out.println("txt_Password found in Login_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("txt_Password not found in Login_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Continue() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[text()='Continue']"));
			System.out.println("btn_Continue found in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Continue OneLogin not found in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

}
