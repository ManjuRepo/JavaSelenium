package orangeHRM.Library.Validation;

import orangeHRM.Library.PageObject.RecruitmentPage;

public class HRM extends RecruitmentPage {

	public static void Recruitment_Candidates() throws Exception {

		System.out.println("\033[1m ---Navigate to Recruitment --- \033[0m");
		System.out.println("");

		click(btn_Recruitment());
		System.out.println("Action Performed on :: \033[1m btn_Recruitment \033[0m");

		System.out.println("");

		click(btn_Candidates());
		System.out.println("Action Performed on :: \033[1m btn_Candidates \33[0m");
		System.out.println("");
	}

	/**********************************************************************************************************************/
	public static void Recruitment_Vacancies() throws Exception {

	}

	public static void Recruitment_EditVacancy() throws Exception {

	}
}
