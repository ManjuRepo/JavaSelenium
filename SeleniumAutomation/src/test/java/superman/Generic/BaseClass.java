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
	private static int delayInSeconds = 1;

	// Public static method to load properties
	public static void loadProperties() {
		Properties properties = new Properties();
		final String FILE_PATH = System.getProperty("user.dir") + "\\data\\environment.properties";

		try (FileInputStream file = new FileInputStream(FILE_PATH)) {
			properties.load(file);

			// Fetch individual values and store in static variables
			url = properties.getProperty("URL");
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

	public static void delay() {
		try {
			Thread.sleep(delayInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void JsClick(WebElement element) {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].click();", element);
		delay();
	}

	public static void get(String url) {
		driver.get(url);
		delay();
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void click(WebElement element) {
		element.click();
		delay();
	}

	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
		delay();
	}

	public static void moveToElement(WebElement element) {
		new Actions(driver).moveToElement(element).perform();
		delay();
	}

	public static void Doubleclick(WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public static void ActionClick(WebElement element) {
		new Actions(driver).click(element).perform();
	}

	public static String gettext(WebElement Value) {
		Value.getText();
		delay();
		return null;
	}

	public static String PageTitle() {
		driver.getTitle();
		delay();
		return null;
	}
	/*****************************************************************************************************************************************************************************************************/
}
