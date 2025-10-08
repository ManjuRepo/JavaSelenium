package orangeHRM.Library.Templete;

import orangeHRM.GenericUtility.Login;
import orangeHRM.GenericUtility.SetEnvironment;
import orangeHRM.Library.Validation.Constants;
import orangeHRM.Library.Validation.HRM;

public class RecruitmentCandidatesAdd_Real_Time_Templete {

	public static void Execute() throws Exception {
		/*************************************************************************************************************************************************************
		 * Environment Setup and Login
		 *************************************************************************************************************************************************************/
		SetEnvironment.Execute();
		Login.Execute();
		HRM.Recruitment_Candidates();

		String[] methods = { "Add", "FullName", "MiddleName", "LastName", "Vacancy", "Email", "ContactNumber", "Resume",
				"Keywords", "DateofApplication", "Notes", "Consenttokeepdata" };

		for (String methodName : methods) {
			RecruitmentCandidates_Add_DataObjects.class.getMethod(methodName).invoke(null);
		}

		if (Constants.save) {
			RecruitmentCandidates_Add_DataObjects.Save();
		} else {
			RecruitmentCandidates_Add_DataObjects.Cancel();
		}
	}
}
