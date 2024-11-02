package Selenium_With_Java.mouse_over_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Selenium_With_Java.genric.BrowserFactory;

public class action_class extends BrowserFactory {

	static String URL = "https://testautomationpractice.blogspot.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			WebElement PointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
			WebElement Mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
			WebElement Laptops = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(PointMe).moveToElement(Mobiles).click().perform();
			System.out.println("Action Performed on Mobiles");			

			Thread.sleep(2000);
			act.moveToElement(PointMe).moveToElement(Laptops).click().perform();
			System.out.println("Action Performed on Laptops");
			

			WebElement CopyText = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			act.doubleClick(CopyText).perform();
			String text = driver.findElement(By.xpath("//input[@id='field1']")).getAttribute("value");
			if (text.equalsIgnoreCase("Hello World!")) {
				System.out.println(driver
						.findElement(
								By.xpath("//p[contains(text(),'Double click on button, the text from Field1 will ')]"))
						.getText());
			} else {
				System.out.println("Text not Copied");
			}
			System.out.println("Action Performed on doubleClick");
			
			WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']/p"));
			WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']/p"));
			Thread.sleep(5000);
			act.dragAndDrop(drag, drop).perform();
			Thread.sleep(2000);
			System.out.println("Action Performed on dragAndDrop "
					+ driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());

			Thread.sleep(2000);
			driver.close();
		}
	}
}
