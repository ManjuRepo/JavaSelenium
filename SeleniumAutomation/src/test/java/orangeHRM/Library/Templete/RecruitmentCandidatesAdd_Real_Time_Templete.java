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

		RecruitmentCandidates_Add_DataObjects.Add();
		RecruitmentCandidates_Add_DataObjects.FullName();
		RecruitmentCandidates_Add_DataObjects.MiddleName();
		RecruitmentCandidates_Add_DataObjects.LastName();
		RecruitmentCandidates_Add_DataObjects.Vacancy();
		RecruitmentCandidates_Add_DataObjects.Email();
		RecruitmentCandidates_Add_DataObjects.ContactNumber();
		RecruitmentCandidates_Add_DataObjects.Resume();
		RecruitmentCandidates_Add_DataObjects.Keywords();
		RecruitmentCandidates_Add_DataObjects.DateofApplication();
		RecruitmentCandidates_Add_DataObjects.Notes();
		RecruitmentCandidates_Add_DataObjects.Consenttokeepdata();
		if (Constants.save) {
			RecruitmentCandidates_Add_DataObjects.Save();
		} else {
			RecruitmentCandidates_Add_DataObjects.Cancel();
		}
	}
}
