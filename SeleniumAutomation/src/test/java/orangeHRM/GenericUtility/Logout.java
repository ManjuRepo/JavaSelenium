package orangeHRM.GenericUtility;

import orangeHRM.GenericUtility.PageObject.LogOutPage;

public class Logout extends LogOutPage {
	
	public static void Execute() throws InterruptedException {
		
		click(btn_userdropdown());
		System.out.println("Action Performed on btn_userdropdown");
		System.out.println("");
		
		click(btn_logout());
		System.out.println("Action Performed on btn_logout");
		System.out.println("");
		
		quit();
	}
}
