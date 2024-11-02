package Selenium_With_Java.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Selenium_With_Java.genric.BrowserFactory;

public class combination extends BrowserFactory {
	static String URL = "https://text-compare.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {
			WebElement TextArea = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
			Actions Act = new Actions(driver);
			TextArea.sendKeys("Hellow....!");
			Act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			Act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
			Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
			driver.findElement(By.xpath("//div[@class='compareButtonText']")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("//*[@class='messageForUser']")).getText());
			driver.quit();
		}
	}
}
