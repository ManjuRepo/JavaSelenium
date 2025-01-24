package superman.GenericUtility;

import superman.GenericUtility.PageObject.LoginPage;
import superman.GenericUtility.PageObject.PropertiesUtil;

public class Login extends LoginPage {

	public static void main(String[] args) {
		
        PropertiesUtil.loadProperties();

		LoginPage.btn_Access_using_OneLogin().click();
		System.out.println("Action Performed on btn_Access_using_OneLogin");

		LoginPage.txt_UserID().sendKeys(PropertiesUtil.username);
		System.out.println("Action Performed on txt_UserID");

		LoginPage.btn_Continue().click();
		System.out.println("Action Performed on btn_Continue");

		LoginPage.txt_Password().sendKeys(PropertiesUtil.password);
		System.out.println("Action Performed on txt_Password");

		LoginPage.btn_Continue().click();
		System.out.println("Action Performed on btn_Continue");

		System.out.println("Login Application Completed Successfully");
	}

}
