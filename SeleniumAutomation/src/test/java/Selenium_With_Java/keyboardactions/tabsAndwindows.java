package Selenium_With_Java.keyboardactions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import Selenium_With_Java.genric.Utilities;

public class tabsAndwindows extends Utilities {
	static String URL = "https://testautomationpractice.blogspot.com/#";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utilities.launchBrowser("chrome", URL);
		if (driver != null) {
			WebElement GUI = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
			Actions Act = new Actions(driver);
			Act.keyDown(Keys.CONTROL).click(GUI).keyUp(Keys.CONTROL).perform();
			List<String> win = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(win.get(1));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("FirstName");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("phone");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("textarea");
			driver.switchTo().window(win.get(0));
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("FirstName 1");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email 1");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("phone 1");
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("textarea 1");
			Thread.sleep(1000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			Thread.sleep(1000);
			driver.switchTo().newWindow(WindowType.TAB);

			driver.quit();
		}
	}
}
