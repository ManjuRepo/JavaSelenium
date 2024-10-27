package Selenium_With_Java.handling_tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_tables {
	static WebDriver driver = new ChromeDriver();

	static String depcity = "Mexico City";
	static String descity = "London";
	static double tableVal2;

	public static void selectCity(WebElement Element, String cityName) throws InterruptedException {
		Thread.sleep(2000);
		Element.click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='form-inline']//option"));

		boolean isCityPresent = false;

		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.contains(cityName)) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class='form-inline']/option[contains(text(),'" + cityName + "')]"))
						.click();
				System.out.println(cityName + " is selected in the dropdown.");
				isCityPresent = true;
				break;
			}
		}

		if (!isCityPresent) {
			System.out.println(cityName + " is not present in the dropdown.");
		}
	}

	public static void selectCellValue(double tableVal2) {
		List<WebElement> rows = driver.findElements(By.xpath("//*[contains(text(),'Flights')]/..//tr"));
		boolean isValueFound = false;

		for (int rowIndex = 1; rowIndex < rows.size(); rowIndex++) { // Starting from 1 to skip header row
			// Get all cells in the current row
			List<WebElement> cells = rows.get(rowIndex).findElements(By.tagName("td"));

			for (int colIndex = 0; colIndex < cells.size(); colIndex++) {
				String cellText = cells.get(colIndex).getText();

				if (cellText.equals("$" + tableVal2)) {
					// Locate and click the input element in the same row as the matching cell
					WebElement inputElement = rows.get(rowIndex).findElement(By.xpath(".//td/input"));
					inputElement.click();
					System.out.println("Found and selected the flight with value: $" + tableVal2);
					isValueFound = true;
					break;
				}
			}

			if (isValueFound)
				break; // Exit the loop if value is found
		}

		if (!isValueFound) {
			System.out.println("Value $" + tableVal2 + " not found in the table.");
		}
	}

	public static void SelectLowPrizeFlite() {
		List<WebElement> headers = driver.findElements(By.xpath("//*[contains(text(),'Flights')]/..//th"));
		List<WebElement> rows = driver.findElements(By.xpath("//*[contains(text(),'Flights')]/..//tr"));

		int priceColumnIndex = -1;
		for (int i = 0; i < headers.size(); i++) {
			if (headers.get(i).getText().equalsIgnoreCase("Price")) {
				priceColumnIndex = i;
				break;
			}
		}
		if (priceColumnIndex == -1) {
			System.out.println("Price column not found.");
			return;
		}

		double lowestPrice = Double.MAX_VALUE;
		WebElement lowestPriceCell = null;

		for (int rowIndex = 1; rowIndex < rows.size(); rowIndex++) {
			WebElement priceCell = rows.get(rowIndex).findElements(By.tagName("td")).get(priceColumnIndex);
			try {
				double price = Double.parseDouble(priceCell.getText().replaceAll("[$,]", ""));
				if (price < lowestPrice) {
					lowestPrice = price;
					lowestPriceCell = priceCell;
				}
			} catch (NumberFormatException e) {
				System.out.println("Unable to parse price: " + priceCell.getText());
			}
		}

		if (lowestPriceCell != null) {
			tableVal2 = lowestPrice;
			System.out.println("Lowest price found: $" + lowestPrice);
		} else {
			System.out.println("No valid prices found.");
		}
		static_tables.selectCellValue(tableVal2);

		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		System.out.println(
				driver.findElement(By.xpath("//*[@class='container hero-unit']/h1")).isDisplayed() ? "Test Case Pass" : "Test Case Fail");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.blazedemo.com/");

		WebElement DepartureCity = driver.findElement(By.name("fromPort"));
		WebElement DestinationCity = driver.findElement(By.name("toPort"));

		static_tables.selectCity(DepartureCity, depcity);
		static_tables.selectCity(DestinationCity, descity);

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		static_tables.SelectLowPrizeFlite();

		driver.quit();
	}

}
