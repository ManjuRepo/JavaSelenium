package superman.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Public static variables to hold property values
	public static String url;
	public static String username;
	public static String password;
	public static String browser;
	public static String SuperManModule;
	public static WebDriver driver;
	public static Actions Act;

	// Public static method to load properties
	public static void loadProperties() {
		Properties properties = new Properties();
		final String FILE_PATH = System.getProperty("user.dir") + "\\data\\environment.properties";

		try (FileInputStream file = new FileInputStream(FILE_PATH)) {
			properties.load(file);

			// Fetch individual values and store in static variables
			url = properties.getProperty("UATURL");
			username = properties.getProperty("UserName");
			password = properties.getProperty("Password");
			browser = properties.getProperty("browser");
			SuperManModule = properties.getProperty("SuperManModule");

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load properties from: " + FILE_PATH);
		}
	}

	/*****************************************************************************************************************************************************************************************************/
	public static WebDriver launchBrowser(String browser) {
		// Initialize the driver only if it's null
		if (driver == null) {
			switch (browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Invalid browser type! Please select 'chrome', 'firefox', or 'edge'.");
				return driver;
			}

			// Configure WebDriver settings
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		return driver;
	}

	// Optionally, a method to quit the driver after use
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Reset driver to null after quitting
		}
	}

	/*****************************************************************************************************************************************************************************************************/
	public static class Js {

		public static void Click(WebElement element) {

			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].click();", element);
		}
	}

	/*****************************************************************************************************************************************************************************************************/
	public static class Action {

		public static void Doubleclick(WebElement element) {
			Act = new Actions(driver);
			Act.doubleClick(element).perform();
		}

		public static void Click(WebElement element) {
			Act.click(element).perform();
		}

		public static void MoveToElement(WebElement element) {
			Act.moveToElement(element).perform();
		}
	}
}
