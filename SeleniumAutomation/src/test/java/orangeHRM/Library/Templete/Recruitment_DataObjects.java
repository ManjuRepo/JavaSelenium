package orangeHRM.Library.Templete;

import java.io.IOException;

import orangeHRM.Library.PageObject.RecruitmentPage;

public class Recruitment_DataObjects extends RecruitmentPage{
	
	public static void JobTitle() throws IOException, Exception {
		
		selectDropdownByValue(Sel_JobTitle(), readExcelColumn(filePath, sheetName, "JobTitle"));
		System.out.println("Action Performed on :: \033[1m selectDropdownByValue \033[0m");
		System.out.println("");
	}
}
