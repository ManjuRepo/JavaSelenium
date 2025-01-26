package superman.GenericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import superman.Generic.BaseClass;
import superman.Generic.BaseClass.Action;

public class Module {

	private static WebElement element;

	public static void Execute(String Val) throws Exception {

		element = null;

		try {
			element = BaseClass.driver.findElement(By.xpath("//*[@data-testid='button_Plan & Meet']"));
			Thread.sleep(5000);
			Action.Doubleclick(element);
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
