package Selenium_With_Java.date_pickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_With_Java.genric.BrowserFactory;

public class datecalender extends BrowserFactory {

	static String Day = "18";
	static String Month = "October";
	static String year = "2027";
	static String URL = "https://jqueryui.com/datepicker/";

	static public void DatePicker(WebDriver driver, WebElement Element, String Day, String Month, String year)
			throws InterruptedException {
		Element.click();
		while (true) {
			// Get current month and year displayed on the date picker
			String currentMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

			// Check if the desired month and year are displayed
			if (currentMonth.equals(Month) && currentYear.equals(year)) {
				// Select the day if the correct month and year are displayed
				List<WebElement> dates = driver
						.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr//a"));
				for (WebElement date : dates) {
					if (date.getText().equals(Day)) {
						date.click();
						return; // Exit method after selecting the date
					}
				}
			} else {
				// Click "Next" to navigate to the desired month and year
				driver.findElement(By.xpath("//*[text()='Next']")).click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// Launch the specified browser and navigate to the URL
		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			// Perform actions with the driver...
			driver.switchTo().frame(0);
			WebElement Ele = driver.findElement(By.xpath("//input[@id='datepicker']"));
			datecalender.DatePicker(driver, Ele, Day, Month, year);
			// Close the browser after testing
			Thread.sleep(5000);
			System.out.println("Test Case Pass");
			driver.quit();
		}
	}
}
