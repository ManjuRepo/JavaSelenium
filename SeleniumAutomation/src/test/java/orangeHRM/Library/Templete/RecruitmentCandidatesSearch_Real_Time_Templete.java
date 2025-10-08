package orangeHRM.Library.Templete;

import orangeHRM.GenericUtility.Login;
import orangeHRM.GenericUtility.SetEnvironment;
import orangeHRM.Library.Validation.HRM;

public class RecruitmentCandidatesSearch_Real_Time_Templete extends HRM {

	public static void Execute() throws Exception {
		/*************************************************************************************************************************************************************
		 * Environment Setup and Login
		 *************************************************************************************************************************************************************/
		SetEnvironment.Execute();
		Login.Execute();
		HRM.Recruitment_Candidates();

		String[] methods = { "JobTitle", "Vacancy", "HiringManager", "Status", "CandidateName", "Keywords", "FromDate",
				"ToDate", "MethodofApplication" };

		for (String methodName : methods) {
			RecruitmentCandidates_Add_DataObjects.class.getMethod(methodName).invoke(null);
		}

		String TC = readExcelColumn(filePath, "Recruitment", "TC");
		if (TC.equalsIgnoreCase("Search")) {
			RecruitmentCandidates_Search_DataObjects.btn_Search();
		} else {
			RecruitmentCandidates_Search_DataObjects.btn_Reset();
		}
	}
}