package superman.GenericUtility;

import superman.Generic.BaseClass;
import superman.GenericUtility.PageObject.LoginPage;

public class Login extends LoginPage {

	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static void Execute() throws InterruptedException {

		Thread.sleep(3000);
		LoginPage.btn_Access_using_OneLogin().click();
		System.out.println("Action Performed on btn_Access_using_OneLogin");
		System.out.println(" ");

		LoginPage.txt_UserID().sendKeys(BaseClass.username);
		System.out.println("Action Performed on txt_UserID");
		System.out.println(" ");

		LoginPage.btn_Continue().click();
		System.out.println("Action Performed on btn_Continue");
		System.out.println(" ");

		LoginPage.txt_Password().sendKeys(BaseClass.password);
		System.out.println("Action Performed on txt_Password");
		System.out.println(" ");

		LoginPage.btn_Continue().click();
		System.out.println("Action Performed on btn_Continue");
		System.out.println(" ");

		System.out.println("Login Application Completed Successfully");
		System.out.println(" ");
	}

}
