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
			System.out.println("btn_Recruitment found in Home_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Recruitment not found in Home_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Candidates() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Candidates']"));
			System.out.println("btn_Candidates found in Recruitment_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("btn_Candidates not found in Recruitment_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement DD_JobTitle() throws Exception {

		element = null;

		try {
			element = driver.findElement(By.xpath("//*[text()='Job Title']//following::i"));
			System.out.println("JobTitle Drop Down found in Recruitment_Page");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println("JobTitle Drop Down not found in Recruitment_Page");
			System.out.println(" ");
			throw (e);
		}
		return element;
	}
}