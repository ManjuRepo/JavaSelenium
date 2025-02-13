package orangeHRM.GenericUtility;

import org.openqa.selenium.WebDriver;

import superman.Generic.BaseClass;

public class SetEnvironment extends BaseClass {

	static {
		loadProperties();
	}
	static WebDriver driver = launchBrowser(browser);

	public static void Execute() {

		System.out.println("Launching : " + "" + browser + " " + "browser");
		System.out.println(" ");
		get(url);
		System.out.println("Application Launched : " + PageTitle() + " :: " + url);
		System.out.println(" ");
	}
}
