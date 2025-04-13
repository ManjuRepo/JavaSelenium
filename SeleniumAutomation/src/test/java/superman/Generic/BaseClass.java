package superman.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
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
	private static int delayInSeconds = 2;

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

	public static class HighlightListener implements WebDriverListener {

		@Override
		public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {
			WebDriver driver = ((RemoteWebElement) element).getWrappedDriver();
			highlightElement(driver, element);
		}

		private void highlightElement(WebDriver driver, WebElement element) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='3px solid red'", element);
				Thread.sleep(200); // Delay for visibility
			} catch (Exception e) {
				System.out.println("Highlighting failed: " + e.getMessage());
			}
		}
	}

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

			// Attach the WebDriverListener for highlighting
			driver = new EventFiringDecorator<>(new HighlightListener()).decorate(driver);

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

	public static void selectDropdownByValue(WebElement element, String object) {
		new Select(element).selectByValue(object);
		delay();
	}

	public static void selectDropdownByText(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
		delay();
	}

	public static void selectDropdownByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
		delay();
	}

	/*****************************************************************************************************************************************************************************************************/

	public static String readExcelColumn(String filePath, String sheetName, String columnHeader) throws IOException {
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int columnIdx = -1;

		// Find the header column index
		Row headerRow = sheet.getRow(0); // Assuming headers are in the first row
		if (headerRow == null) {
			workbook.close();
			file.close();
			return null;
		}

		for (Cell cell : headerRow) {
			if (cell.getStringCellValue().trim().equalsIgnoreCase(columnHeader)) {
				columnIdx = cell.getColumnIndex();
				break;
			}
		}

		if (columnIdx == -1) {
			workbook.close();
			file.close();
			return null; // Return null if header not found
		}

		StringBuilder columnData = new StringBuilder();
		DataFormatter formatter = new DataFormatter();

		// Loop through rows and get values under the column
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row == null)
				continue; // Skip empty rows

			Cell cell = row.getCell(columnIdx);
			if (cell == null || cell.getCellType() == CellType.BLANK)
				continue; // Skip empty cells

			columnData.append(formatter.formatCellValue(cell)).append("\n");
		}

		workbook.close();
		file.close();

		return columnData.toString().trim(); // Return collected data
	}

	/*****************************************************************************************************************************************************************************************************/
	public static void TakeScreenshot(WebDriver driver, String testCaseName) {
		try {
			// Format timestamp
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

			// Take screenshot
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Define destination path
			String screenshotPath = "screenshots/" + testCaseName + "_" + timestamp + ".png";
			File destFile = new File(screenshotPath);

			// Copy file to destination
			FileUtils.copyFile(srcFile, destFile);

			System.out.println("Screenshot captured :: \033[1m" + screenshotPath + "\033[0m");
			System.out.println("");
		} catch (IOException e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
}