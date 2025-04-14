package orangeHRM.Library.Templete;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import orangeHRM.Library.PageObject.RecruitmentPage;

public class RecruitmentCandidates_Search_DataObjects extends RecruitmentPage {

	public static void JobTitle() throws IOException, Exception {

		click(Sel_JobTitle());
		System.out.println("Action Performed on :: \033[1m JobTitle Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_JobTitleVal(readExcelColumn(filePath, "Recruitment", "JobTitle")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "JobTitle")
				+ " from JobTitle Drop Down \033[0m");
		System.out.println("");
	}

	public static void Vacancy() throws IOException, Exception {

		click(Sel_Vacancy());
		System.out.println("Action Performed on :: \033[1m Vacancy Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_VacancyVal(readExcelColumn(filePath, "Recruitment", "Vacancy")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "Vacancy")
				+ " from Vacancy Drop Down \033[0m");
		System.out.println("");
	}

	public static void HiringManager() throws IOException, Exception {

		click(Sel_HiringManager());
		System.out.println("Action Performed on :: \033[1m HiringManager Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_HiringManagerVal(readExcelColumn(filePath, "Recruitment", "HiringManager")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "HiringManager")
				+ " from HiringManager Drop Down \033[0m");
		System.out.println("");
	}

	public static void Status() throws IOException, Exception {

		click(Sel_Status());
		System.out.println("Action Performed on :: \033[1m Status Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_StatusVal(readExcelColumn(filePath, "Recruitment", "Status")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "Status")
				+ " from Status Drop Down \033[0m");
		System.out.println("");
	}

	public static WebElement CandidateName() throws IOException, Exception {
		sendKeys(txt_CandidateName(), readExcelColumn(filePath, "Recruitment", "CandidateName"));
		System.out.println("Action Performed on :: \033[1m CandidateName \033[0m" + "text field");
		System.out.println("");

		if (driver.findElement(By.xpath("//*[text()='No Records Found']")).isDisplayed()
				|| driver.findElement(By.xpath("//*[text()='Invalid']")).isDisplayed()) {
			System.out.println(gettext(driver.findElement(By.xpath("//*[text()='No Records Found']"))));
			Assert.fail();
		}
		return null;
	}

	public static WebElement Keywords() throws IOException, Exception {
		sendKeys(txt_Keywords(), readExcelColumn(filePath, "Recruitment", "Keywords"));
		System.out.println("Action Performed on :: \033[1m Keywords \033[0m" + "text field");
		System.out.println("");

		if (driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']")).isDisplayed()) {
			System.out.println(
					gettext(driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']"))));
			Assert.fail();
		}
		return null;
	}

	public static void MethodofApplication() throws IOException, Exception {

		click(Sel_MethodOfApplication());
		System.out.println("Action Performed on :: \033[1m MethodofApplication Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_MethodOfApplicationVal(readExcelColumn(filePath, "Recruitment", "MethodofApplication")));
		System.out.println(
				"Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "MethodofApplication")
						+ " from MethodofApplication Drop Down \033[0m");
		System.out.println("");
	}

	public static void FromDate() throws IOException, Exception {
		sendKeys(txt_FromDateOfApplication(), readExcelColumn(filePath, "Recruitment", "From"));
		System.out.println("Action Performed on :: \033[1m Date of Application (From) "
				+ readExcelColumn(filePath, "Recruitment", "From") + "\033[0m");
		System.out.println("");

		if (driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']")).isDisplayed()) {
			System.out.println(
					gettext(driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']"))));
			Assert.fail();
		}
	}

	public static void ToDate() throws IOException, Exception {
		sendKeys(txt_ToDateOfApplication(), readExcelColumn(filePath, "Recruitment", "To"));
		System.out.println("Action Performed on :: \033[1m Date of Application (To) "
				+ readExcelColumn(filePath, "Recruitment", "To") + " \033[0m");
		System.out.println("");

		if (driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']")).isDisplayed()) {
			System.out.println(
					gettext(driver.findElement(By.xpath("//*[text()='Should be a valid date in yyyy-mm-dd format']"))));
			Assert.fail();
		}
	}

	public static WebElement Search() throws IOException, Exception {
		click(btn_Search());
		System.out.println("Action Performed on :: \033[1m Search \033[0m");
		System.out.println("");
		return null;
	}

	public static WebElement Reset() throws IOException, Exception {
		click(btn_Reset());
		System.out.println("Action Performed on :: \033[1m Reset \033[0m");
		System.out.println("");
		return null;

	}

	public static WebElement Add() throws IOException, Exception {
		click(btn_Add());
		System.out.println("Action Performed on :: \033[1m Add \033[0m");
		System.out.println("");
		return null;
	}

	public static WebElement Resume() throws IOException, Exception {
		sendKeys(btn_Resume(), readExcelColumn(filePath, "Add", "Resume"));
		System.out.println("Action Performed on :: \033[1m Resume \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement FullName() throws IOException, Exception {
		sendKeys(txt_firstname(), readExcelColumn(filePath, "Add", "FullName"));
		System.out.println("Action Performed on :: \033[1m FullName \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement MiddleName() throws IOException, Exception {
		sendKeys(txt_middlename(), readExcelColumn(filePath, "Add", "MiddleName"));
		System.out.println("Action Performed on :: \033[1m MiddleName \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement LastName() throws IOException, Exception {
		sendKeys(txt_lastname(), readExcelColumn(filePath, "Add", "LastName"));
		System.out.println("Action Performed on :: \033[1m LastName \033[0m" + "text field");
		System.out.println("");
		return null;
	}
}
