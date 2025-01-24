package Selenium_With_Java.javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import superman.GenericUtility.PageObject.BrowserFactory;

public class js extends BrowserFactory {

	static String URL = "https://testautomationpractice.blogspot.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// send value for text field
			js.executeScript("arguments[0].setAttribute('value','Jhon')", driver.findElement(By.id("name")));
			js.executeScript("arguments[0].setAttribute('value','email.com')", driver.findElement(By.id("email")));
			js.executeScript("arguments[0].setAttribute('value','123456789')", driver.findElement(By.id("phone")));

			driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("XYZ");

			// click action
			WebElement RadioButton = driver.findElement(By.xpath("//input[@id='male']"));
			js.executeScript("arguments[0].click()", RadioButton);
			for (int i = 0; i < 20; i++) {
				js.executeScript("window.scrollBy(0,100)");
			}
			System.out.println(js.executeScript("return window.pageYOffset;"));

			js.executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("//div[@id='Attribution1']//div[@class='widget-content']")));

			// zoom out & in
			js.executeScript("document.body.style.zoom='20%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='40%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='60%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='80%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='100%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='80%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='60%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='40%'");
			Thread.sleep(2000);
			js.executeScript("document.body.style.zoom='20%'");
		}
	}
}
