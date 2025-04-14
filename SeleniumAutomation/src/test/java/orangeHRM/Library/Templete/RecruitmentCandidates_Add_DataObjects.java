package orangeHRM.Library.Templete;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import orangeHRM.Library.PageObject.RecruitmentPage;

public class RecruitmentCandidates_Add_DataObjects extends RecruitmentPage {

	public static void Vacancy() throws IOException, Exception {

		click(Sel_Vacancy());
		System.out.println("Action Performed on :: \033[1m Vacancy Drop Dwon \033[0m");
		System.out.println("");
		click(Sel_VacancyVal(readExcelColumn(filePath, "Add", "Vacancy")));
		System.out.println("Action Performed on :: \033[1m " + readExcelColumn(filePath, "Recruitment", "Vacancy")
				+ " from Vacancy Drop Down \033[0m");
		System.out.println("");
	}

	public static WebElement Keywords() throws IOException, Exception {
		sendKeys(txt_Keywords(), readExcelColumn(filePath, "Add", "Keywords"));
		System.out.println("Action Performed on :: \033[1m Keywords \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static void DateofApplication() throws IOException, Exception {
		txt_DateofApplication().click();
		WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--focus']"));
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.BACK_SPACE);
		sendKeys(ele, readExcelColumn(filePath, "Add", "DateofApplication"));
		System.out.println("Action Performed on :: \033[1m Date of Application (To) "
				+ readExcelColumn(filePath, "Add", "DateofApplication") + " \033[0m");
		System.out.println("");
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

	public static WebElement Email() throws IOException, Exception {
		sendKeys(txt_email(), readExcelColumn(filePath, "Add", "Email"));
		System.out.println("Action Performed on :: \033[1m Email \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement ContactNumber() throws IOException, Exception {
		sendKeys(txt_contactnumber(), readExcelColumn(filePath, "Add", "ContactNumber"));
		System.out.println("Action Performed on :: \033[1m ContactNumber \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement Notes() throws IOException, Exception {
		sendKeys(txt_notes(), readExcelColumn(filePath, "Add", "Notes"));
		System.out.println("Action Performed on :: \033[1m Notes \033[0m text field");
		System.out.println("");

		// Avoid NoSuchElementException
		List<WebElement> validationMsgs = driver
				.findElements(By.xpath("//*[contains(@class,'oxd-input-group__message')]"));
		if (!validationMsgs.isEmpty() && validationMsgs.get(0).isDisplayed()) {
			System.out.println(gettext(validationMsgs.get(0)));
			Assert.fail("Validation error displayed: " + gettext(validationMsgs.get(0)));
		}

		return null;
	}

	public static WebElement Consenttokeepdata() throws IOException, Exception {
		if (readExcelColumn(filePath, "Add", "Consenttokeepdata").contains("yes")) {
			click(chk_ConsentToKeepData());
		}
		System.out.println("Action Performed on :: \033[1m ConsentToKeepData \033[0m" + "text field");
		System.out.println("");
		return null;
	}

	public static WebElement Add() throws IOException, Exception {
		click(btn_Add());
		System.out.println("Action Performed on :: \033[1m Add \033[0m");
		System.out.println("");
		return null;
	}

	public static WebElement Save() throws IOException, Exception {
		click(btn_Save());
		System.out.println("Action Performed on :: \033[1m Save \033[0m");
		System.out.println("");
		return null;
	}

	public static WebElement Cancel() throws IOException, Exception {
		click(btn_Cancel());
		System.out.println("Action Performed on :: \033[1m Cancel \033[0m");
		System.out.println("");
		return null;
	}
}
