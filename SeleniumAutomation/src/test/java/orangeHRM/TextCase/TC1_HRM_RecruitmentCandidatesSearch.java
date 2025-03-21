package orangeHRM.TextCase;

import orangeHRM.GenericUtility.Logout;
import orangeHRM.Library.Templete.RecruitmentCandidatesSearch_Real_Time_Templete;
import orangeHRM.Library.Templete.RecruitmentCandidates_DataObjects;

public class TC1_HRM_RecruitmentCandidatesSearch extends RecruitmentCandidates_DataObjects {

	public static void main(String[] args) throws Exception {
		RecruitmentCandidatesSearch_Real_Time_Templete.Execute();
		Logout.Execute();
	}
}