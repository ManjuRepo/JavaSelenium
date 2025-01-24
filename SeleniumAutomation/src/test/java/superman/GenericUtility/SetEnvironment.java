package superman.GenericUtility;

import org.openqa.selenium.WebDriver;

import superman.Generic.BaseClass;

public class SetEnvironment extends BaseClass {

	static {
		BaseClass.loadProperties();
	}
	static WebDriver driver = BaseClass.launchBrowser(BaseClass.browser);

	public static void Execute() {

		driver.get(url);
		System.out.println("SuperMan Application Launched : " + "" + url);
		System.out.println(" ");
	}
}
