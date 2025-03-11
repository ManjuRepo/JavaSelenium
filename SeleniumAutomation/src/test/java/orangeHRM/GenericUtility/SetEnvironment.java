package orangeHRM.GenericUtility;

import org.openqa.selenium.WebDriver;

import superman.Generic.BaseClass;

public class SetEnvironment extends BaseClass {

	static {
		loadProperties();
	}
	static WebDriver driver = launchBrowser(browser);

	public static void Execute() {

		System.out.println("Launching :: \033[1m" + browser + " " + "browser \033[0m");
		System.out.println(" ");
		get(url);
		delay();
		System.out
				.println("Application Launched :: \033[1m" + url + "\033[0m");
		System.out.println(" ");
	}
}
