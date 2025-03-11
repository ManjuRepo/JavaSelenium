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
			System.out.println("\033[1m btn_Recruitment \033[0m found in Home_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Recruitment \033[0m not found in Home_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Candidates() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Candidates']"));
			System.out.println("\033[1m btn_Candidates \033[0m found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m btn_Candidates \033[0m not found in Recruitment_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Sel_JobTitle() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Job Title']//following::i"));
			System.out.println("\033[1m JobTitle Drop Down \033[0m found in Recruitment_Page");
		} catch (Exception e) {
			System.out.println("\033[1m JobTitle Drop Down \033[0m not found in Recruitment_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
}