package Selenium_With_Java.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		WebDriver Chromedriver = new ChromeDriver();
//		WebDriver Edgedriver = new EdgeDriver();
//		WebDriver Safaridriver = new SafariDriver();
//		WebDriver Firefoxdriver = new FirefoxDriver();

		// Navigate to specified URL
		Thread.sleep(3000);
		Chromedriver.get("https://www.youtube.com/");

		// Close Browser
		Chromedriver.close();
	}
}
