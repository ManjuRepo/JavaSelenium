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

		RecruitmentCandidates_DataObjects.JobTitle();
		RecruitmentCandidates_DataObjects.Vacancy();
		RecruitmentCandidates_DataObjects.HiringManager();
		RecruitmentCandidates_DataObjects.Status();
		RecruitmentCandidates_DataObjects.CandidateName();
		RecruitmentCandidates_DataObjects.Keywords();
		RecruitmentCandidates_DataObjects.FromDate();
		RecruitmentCandidates_DataObjects.ToDate();
		RecruitmentCandidates_DataObjects.MethodofApplication();
		
		String TC = readExcelColumn(filePath, "Recruitment", "TC");
		if (TC.equalsIgnoreCase("Search")) {
			RecruitmentCandidates_DataObjects.Search();
		} else {
			RecruitmentCandidates_DataObjects.Reset();
		}
	}
}