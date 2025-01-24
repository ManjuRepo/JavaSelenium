package Selenium_With_Java.takes_screenshot;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import superman.GenericUtility.PageObject.BrowserFactory;

public class specific_area_from_page extends BrowserFactory {
	static String URL = "https://testautomationpractice.blogspot.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			WebElement Ele = driver.findElement(By.xpath("(//*[@class='container'])[2]"));
			File sorce = Ele.getScreenshotAs(OutputType.FILE);
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
			String formattedDateTime = now.format(formatter);
			System.out.println(formattedDateTime);
			String filePath = System.getProperty("user.dir") + "\\ScreenShots\\Ele" + formattedDateTime + ".png";
			File file = new File(filePath);
			sorce.renameTo(file);
			driver.quit();
		}
	}
}
