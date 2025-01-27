package superman.Library.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import superman.Generic.BaseClass;

public class TLM_SH_Page extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static WebElement btn_PlanAndMeet() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@data-testid='label_Plan & Meet']"));
			System.out.println("btn_PlanAndMeet found in Landing_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_PlanAndMeet not found in Landing_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

}
