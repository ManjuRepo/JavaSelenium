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

		RecruitmentCandidates_Search_DataObjects.JobTitle();
		RecruitmentCandidates_Search_DataObjects.Vacancy();
		RecruitmentCandidates_Search_DataObjects.HiringManager();
		RecruitmentCandidates_Search_DataObjects.Status();
		RecruitmentCandidates_Search_DataObjects.CandidateName();
		RecruitmentCandidates_Search_DataObjects.Keywords();
		RecruitmentCandidates_Search_DataObjects.FromDate();
		RecruitmentCandidates_Search_DataObjects.ToDate();
		RecruitmentCandidates_Search_DataObjects.MethodofApplication();
		
		String TC = readExcelColumn(filePath, "Recruitment", "TC");
		if (TC.equalsIgnoreCase("Search")) {
			RecruitmentCandidates_Search_DataObjects.btn_Search();
		} else {
			RecruitmentCandidates_Search_DataObjects.btn_Reset();
		}
	}
}