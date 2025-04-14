package orangeHRM.TextCase;

import orangeHRM.GenericUtility.Logout;
import orangeHRM.Library.Templete.RecruitmentCandidatesAdd_Real_Time_Templete;

public class TC1_HRM_Add_RecruitmentCandidates extends RecruitmentCandidatesAdd_Real_Time_Templete {

	public static void main(String[] args) throws Exception {
		RecruitmentCandidatesAdd_Real_Time_Templete.Execute();
		Logout.Execute();
	}
}