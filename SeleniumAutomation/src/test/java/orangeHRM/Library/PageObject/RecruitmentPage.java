package orangeHRM.Library.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import superman.Generic.BaseClass;

public class RecruitmentPage extends BaseClass {

	private static WebElement element;
	static {
		// Load properties when the class is loaded
		loadProperties();
	}

	public static WebElement btn_Recruitment() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Recruitment']"));
			System.out.println("\033[1m btn_Recruitment \033[0m :: found in Home_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Recruitment \033[0m :: not found in Home_Page");
			TakeScreenshot(driver, "btn_Recruitment");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Candidates() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Candidates']"));
			System.out.println("\033[1m btn_Candidates \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Candidates \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Candidates");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_JobTitle() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Job Title']/parent::div/..//i"));
			System.out.println("\033[1m JobTitle Drop Down \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m JobTitle Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "Sel_JobTitle");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_JobTitleVal(String Val) throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath(
					"//div[@class='oxd-grid-4 orangehrm-full-width-grid'][.//label[text()='Job Title']]//*[contains(text(),'"
							+ Val + "')]"));

			System.out.println("\033[1m " + Val + "\033[0m :: found in JobTitle Drop Down");
		} catch (Exception e) {
			System.out.println("\033[1m " + Val + " \033[0m :: not found in JobTitle Drop Down");
			TakeScreenshot(driver, "Sel_JobTitleVal");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_Vacancy() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Vacancy']/parent::div/..//i"));
			System.out.println("\033[1m Vacancy Drop Down \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m Vacancy Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "Sel_Vacancy");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_VacancyVal(String Val) throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@role='listbox']/div/span[contains(text(),'" + Val + "')]"));

			System.out.println("\033[1m " + Val + "\033[0m :: found in Vacancy Drop Down");
		} catch (Exception e) {
			System.out.println("\033[1m " + Val + " \033[0m :: not found in Vacancy Drop Down");
			TakeScreenshot(driver, "Sel_VacancyVal");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_HiringManager() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Hiring Manager']/parent::div/..//i"));
			System.out.println("\033[1m Hiring Manager Drop Down \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m Hiring Manager Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "Sel_HiringManager");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_HiringManagerVal(String Val) throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath(
					"//div[@class='oxd-grid-4 orangehrm-full-width-grid'][.//label[text()='Hiring Manager']]//*[contains(text(),'"
							+ Val + "')]"));

			System.out.println("\033[1m " + Val + "\033[0m :: found in Hiring Manager Drop Down");
		} catch (Exception e) {
			System.out.println("\033[1m " + Val + " \033[0m :: not found in Hiring Manager Drop Down");
			TakeScreenshot(driver, "Sel_HiringManagerVal");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_Status() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Status']/parent::div/..//i"));
			System.out.println("\033[1m Status Drop Down \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m Status Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "Sel_Status");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_StatusVal(String Val) throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath(
					"//div[@class='oxd-grid-4 orangehrm-full-width-grid'][.//label[text()='Status']]//*[contains(text(),'"
							+ Val + "')]"));

			System.out.println("\033[1m " + Val + "\033[0m :: found in Status Drop Down");
		} catch (Exception e) {
			System.out.println("\033[1m " + Val + " \033[0m :: not found in Status Drop Down");
			TakeScreenshot(driver, "Sel_StatusVal");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_MethodOfApplication() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Method of Application']/parent::div/..//i"));
			System.out.println("\033[1m Method of Application Drop Down \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m Method of Application Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "Sel_MethodOfApplication");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement Sel_MethodOfApplicationVal(String Val) throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath(
					"//div[@class='oxd-grid-4 orangehrm-full-width-grid'][.//label[text()='Method of Application']]//*[contains(text(),'"
							+ Val + "')]"));

			System.out.println("\033[1m " + Val + "\033[0m :: found in Method of Application Drop Down");
		} catch (Exception e) {
			System.out.println("\033[1m " + Val + " \033[0m :: not found in Method of Application Drop Down");
			TakeScreenshot(driver, "Sel_MethodOfApplicationVal");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CandidateName() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[contains(@class,'text-input--active')]//input"));
			System.out.println("\033[1m txt_CandidateName \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_CandidateName Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_CandidateName");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Keywords() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[contains(text(),'Keywords')]/parent::*/parent::*//input"));
			System.out.println("\033[1m txt_Keywords \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_Keywords Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_Keywords");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Reset() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@class='oxd-form-actions']/button[@type='reset']"));
			System.out.println("\033[1m btn_Reset \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Reset Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Reset");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Search() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@class='oxd-form-actions']/button[@type='submit']"));
			System.out.println("\033[1m btn_Search \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Search Drop Down \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Search");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FromDateOfApplication() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Date of Application']/parent::*/parent::*//input"));
			System.out.println("\033[1m txt_FromDateOfApplication \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_FromDateOfApplication \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_FromDateOfApplication");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ToDateOfApplication() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@placeholder='To']"));
			System.out.println("\033[1m txt_ToDateOfApplication \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_ToDateOfApplication \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_ToDateOfApplication");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_firstname() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
			System.out.println("\033[1m txt_firstname \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_firstname \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_firstname");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_middlename() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@placeholder='Middle Name']"));
			System.out.println("\033[1m txt_middlename \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_middlename \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_middlename");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_lastname() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
			System.out.println("\033[1m txt_lastname \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_lastname \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_lastname");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_email() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Email']/parent::div/..//input"));
			System.out.println("\033[1m txt_email \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_email \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_email");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_contactnumber() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Contact Number']/parent::div/..//input"));
			System.out.println("\033[1m txt_contactnumber \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_contactnumber \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_contactnumber");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_notes() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Notes']/parent::div/..//textarea"));
			System.out.println("\033[1m txt_notes \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_notes \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_notes");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement chk_ConsentToKeepData() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
			System.out.println("\033[1m chk_ConsentToKeepData \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m chk_ConsentToKeepData \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "chk_ConsentToKeepData");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Add() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']"));
			System.out.println("\033[1m btn_Add \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Add \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Add");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Resume() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@type='file']"));
			System.out.println("\033[1m btn_Browse \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Browse \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Browse");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@type='submit']"));
			System.out.println("\033[1m btn_Save \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Save \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Save");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Cancel() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
			System.out.println("\033[1m btn_Cancel \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Cancel \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "btn_Cancel");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_DateofApplication() throws Exception {

		element = null;

		try {
			element = driver
					.findElement(By.xpath("//*[@class='oxd-input oxd-input--active' and @placeholder='yyyy-dd-mm']"));
			System.out.println("\033[1m txt_DateofApplication \033[0m :: found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m txt_DateofApplication \033[0m :: not found in Recruitment_Page");
			TakeScreenshot(driver, "txt_DateofApplication");
			System.out.println(e.getMessage());
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
}