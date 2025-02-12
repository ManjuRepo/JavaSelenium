package orangeHRM.GenericUtility;

import orangeHRM.GenericUtility.PageObject.LoginPage;
import superman.Generic.BaseClass;

public class Login extends LoginPage {

	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static void Execute() throws InterruptedException {

		sendKeys(txt_Username(), username);
		System.out.println("Action Performed on Username" + ":" + username);

		sendKeys(txt_password(), password);
		System.out.println("Action Performed on password" + ":" + password);

		click(btn_login());
		System.out.println("Action Performed on Login Button");
	}
}