package superman.GenericUtility;

import superman.GenericUtility.PageObject.LogOutPage;

public class LogOut extends LogOutPage {

	public static void Execute() {

		LogOutPage.btn_Logout().click();
		System.out.println("Action Performed on btn_Logout");
		System.out.println(" ");

		// LogOutPage.btn_Ok().click();
		JsClick(LogOutPage.btn_Ok());
		System.out.println("Action Performed on btn_Ok");
		System.out.println(" ");

		/*
		 * LogOutPage.btn_Cancel().click();
		 * System.out.println("Action Performed on btn_Cancel");
		 * System.out.println(" ");
		 */

		System.out.println("LogOut Application Completed Successfully");
		System.out.println(" ");

		quit();
	}

}
