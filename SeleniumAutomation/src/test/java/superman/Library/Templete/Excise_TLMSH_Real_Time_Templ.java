package superman.Library.Templete;

import superman.Generic.BaseClass;
import superman.GenericUtility.Login;
import superman.GenericUtility.Module;
import superman.GenericUtility.SetEnvironment;
import superman.Library.Utility.Constant;

public class Excise_TLMSH_Real_Time_Templ extends BaseClass {

	static {
		// Load properties when the class is loaded
		BaseClass.loadProperties();
	}

	public static void Execute() throws Exception {
		/*************************************************************************************************************************************************************
		 * Environment Setup and Login
		 *************************************************************************************************************************************************************/
		SetEnvironment.Execute();
		Login.Execute();
		if(Constant.Plan) {
		Module.Execute(BaseClass.SuperManModule);
		}
	}
}