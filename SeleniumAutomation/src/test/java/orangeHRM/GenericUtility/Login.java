package orangeHRM.GenericUtility;

import orangeHRM.GenericUtility.PageObject.LoginPage;

public class Login extends LoginPage {

	static {
		// Load properties when the class is loaded
		loadProperties();
	}

	public static void Execute() throws InterruptedException {

		sendKeys(txt_Username(), username);
		System.out.println("Action Performed on Username :: \033[1m" + username + "\033[0m");

		System.out.println("");

		sendKeys(txt_password(), password);
		System.out.println("Action Performed on password :: \033[1m" +  password  + "\033[0m");
		System.out.println("");
		
		click(btn_login());
		System.out.println("Action Performed on :: \033[1m Login Button \033[0m");
		System.out.println("");
	}
}