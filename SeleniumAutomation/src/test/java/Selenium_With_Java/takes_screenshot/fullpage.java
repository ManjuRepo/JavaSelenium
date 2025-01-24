package Selenium_With_Java.takes_screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Selenium_With_Java.genric.Utilities;

public class fullpage extends Utilities {
	static String URL = "https://testautomationpractice.blogspot.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utilities.launchBrowser("chrome", URL);
		if (driver != null) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);

				// Correctly construct the file path
				String filePath = System.getProperty("user.dir") + "\\ScreenShots\\SS.png";
				File file = new File(filePath);

				// Create Screenshots directory if it doesn’t exist
				file.getParentFile().mkdirs();

				// Save the screenshot
				source.renameTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				driver.quit();
			}
		} else {
			System.out.println("Driver is not initialized.");
		}
	}
}