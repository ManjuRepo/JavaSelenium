package superman.GenericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;
import superman.Generic.BaseClass.js;

public class Module {

	static WebDriver driver = BaseClass.launchBrowser(BaseClass.browser);
	private static WebElement element;

	public static void Execute(String Val) throws Exception {

		element = null;

		try {
			Thread.sleep(5000);
			element = driver.findElement(By.xpath("//*[@data-testid='button_Plan & Meet']"));
			js.Click(element);
			Thread.sleep(5000);
			js.Click(element);
			System.out.println(Val + " " + "found in Landing_Page");
			System.out.println(" ");
			System.out.println("Action Performed on : " + "" + Val);
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println(Val + " " + "not found in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
	}
}
