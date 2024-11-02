package Selenium_With_Java.mouse_over_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Selenium_With_Java.genric.BrowserFactory;

public class slider extends BrowserFactory {
	static String URL = "https://testautomationpractice.blogspot.com/#";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			WebElement Min = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
			WebElement Max = driver.findElement(By.xpath("//*[@id='slider-range']//span[2]"));
			System.out.println("Befire Slide Position od Min slider : " + Min.getLocation().getX() + " "
					+ "Before Slide Position od Max slider : " + Max.getLocation().getX());
			Actions act = new Actions(driver);
			act.dragAndDropBy(Min, -44, 0).perform();
			act.dragAndDropBy(Max, 97, 0).perform();
			System.out.println("After Slide Position od Min slider : " + Min.getLocation().getX() + " "
					+ "After Slide Position od Max slider : " + Max.getLocation().getX());
			driver.close();
		}
	}
}
