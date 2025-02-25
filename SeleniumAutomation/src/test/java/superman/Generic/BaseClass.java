package superman.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	public static String filePath;
	public static String sheetName;
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
			filePath = properties.getProperty("filePath");
			sheetName = properties.getProperty("sheetName");
			
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

	public static void ActionClick(WebElement element) {
		new Actions(driver).click(element).perform();
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

	public static void selectDropdownByValue(WebElement element, String value) {
		new Select(element).selectByValue(value);
	}

	public static void selectDropdownByText(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public static void selectDropdownByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	/*****************************************************************************************************************************************************************************************************/

	public static void ExcelData(String filePath, String sheetName, String columnHeader) throws IOException {
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int columnIdx = -1;

		// **Find the header column index**
		Row headerRow = sheet.getRow(0); // Assuming headers are in the first row
		for (Cell cell : headerRow) {
			if (cell.getStringCellValue().trim().equalsIgnoreCase(columnHeader)) {
				columnIdx = cell.getColumnIndex();
				break;
			}
		}

		if (columnIdx == -1) {
			// System.out.println("Header '" + columnHeader + "' not found.");
			workbook.close();
			file.close();
			return;
		}

		// **Loop through rows and get values under the column**
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row == null)
				break; // Stop if the row is empty

			Cell cell = row.getCell(columnIdx);
			if (cell == null || cell.getCellType() == CellType.BLANK)
				break; // Stop if the cell is empty

			// String cellValue = cell.toString(); // Convert value to string
			// System.out.println("Row " + i + " - " + columnHeader + ": " + cellValue);
		}

		workbook.close();
		file.close();
	}
	/*****************************************************************************************************************************************************************************************************/
}
