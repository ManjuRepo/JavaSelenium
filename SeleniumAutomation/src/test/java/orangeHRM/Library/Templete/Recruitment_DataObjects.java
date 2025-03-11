package orangeHRM.Library.Templete;

import java.io.IOException;

import orangeHRM.Library.PageObject.RecruitmentPage;

public class Recruitment_DataObjects extends RecruitmentPage {

	public static void JobTitle() throws IOException, Exception {

		click(Sel_JobTitle());
		System.out.println("Action Performed on :: \033[1m JobTitle Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_JobTitleVal(readExcelColumn(filePath, "Recruitment", "JobTitle")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "JobTitle")
				+ " JobTitle Drop Down \033[0m");
		System.out.println("");
	}
}
