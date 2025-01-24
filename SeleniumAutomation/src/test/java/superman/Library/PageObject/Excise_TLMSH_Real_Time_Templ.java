package superman.Library.PageObject;

import superman.Generic.BaseClass;
import superman.GenericUtility.Login;
import superman.GenericUtility.Module;
import superman.GenericUtility.SetEnvironment;

public class Excise_TLMSH_Real_Time_Templ extends BaseClass {

	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static void Execute() throws InterruptedException {
		/*************************************************************************************************************************************************************
		 * Environment Setup and Login
		 *************************************************************************************************************************************************************/
		SetEnvironment.Execute();
		Login.Execute();
		Module.Execute(BaseClass.SuperManModule);
		
	}
}