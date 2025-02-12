package superman.GenericUtility;

import org.openqa.selenium.WebDriver;

import superman.Generic.BaseClass;

public class SetEnvironment extends BaseClass {

	static {
		loadProperties();
	}
	static WebDriver driver = BaseClass.launchBrowser(BaseClass.browser);

	public static void Execute() {

		System.out.println("Launching : " + "" + BaseClass.browser + " " + "browser");
		System.out.println(" ");
		driver.get(url);
		System.out.println("SuperMan Application Launched : " + "" + url);
		System.out.println(" ");
	}
}
