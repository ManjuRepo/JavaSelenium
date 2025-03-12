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
				+ "from JobTitle Drop Down \033[0m");
		System.out.println("");
	}

	public static void Vacancy() throws IOException, Exception {

		click(Sel_Vacancy());
		System.out.println("Action Performed on :: \033[1m Vacancy Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_VacancyVal(readExcelColumn(filePath, "Recruitment", "Vacancy")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "Vacancy")
				+ "from Vacancy Drop Down \033[0m");
		System.out.println("");
	}

	public static void HiringManager() throws IOException, Exception {

		click(Sel_HiringManager());
		System.out.println("Action Performed on :: \033[1m HiringManager Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_HiringManagerVal(readExcelColumn(filePath, "Recruitment", "HiringManager")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "HiringManager")
				+ "from HiringManager Drop Down \033[0m");
		System.out.println("");
	}
	
	public static void Status() throws IOException, Exception {

		click(Sel_Status());
		System.out.println("Action Performed on :: \033[1m Status Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_StatusVal(readExcelColumn(filePath, "Recruitment", "Status")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "Status")
				+ "from Status Drop Down \033[0m");
		System.out.println("");
	}
	
	public static void  CandidateName() throws IOException, Exception{
		sendKeys(txt_CandidateName(), readExcelColumn(filePath, "Recruitment", "CandidateName"));
		System.out.println("Action Performed on :: \033[1m CandidateName \033[0m" + "text field" );
		System.out.println("");
	}
	
	public static void  Keywords() throws IOException, Exception{
		sendKeys(txt_Keywords(), readExcelColumn(filePath, "Recruitment", "Keywords"));
		System.out.println("Action Performed on :: \033[1m Keywords \033[0m" + "text field");
		System.out.println("");
	}
	
	public static void MethodofApplication() throws IOException, Exception {

		click(Sel_MethodOfApplication());
		System.out.println("Action Performed on :: \033[1m MethodofApplication Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_MethodOfApplicationVal(readExcelColumn(filePath, "Recruitment", "MethodofApplication")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "MethodofApplication")
				+ "from MethodofApplication Drop Down \033[0m");
		System.out.println("");
	}

	public static void FromDate() throws IOException, Exception {
		sendKeys(txt_FromDateOfApplication(), readExcelColumn(filePath, "Recruitment", "From"));
		System.out.println("Action Performed on :: \033[1m Date of Application (From) "
				+ readExcelColumn(filePath, "Recruitment", "From") + "\033[0m");
		System.out.println("");
	}

	public static void ToDate() throws IOException, Exception {
		sendKeys(txt_ToDateOfApplication(), readExcelColumn(filePath, "Recruitment", "To"));
		System.out.println("Action Performed on :: \033[1m Date of Application (To) "
				+ readExcelColumn(filePath, "Recruitment", "To") + " \033[0m");
		System.out.println("");
	}
}
