package Selenium_With_Java.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/");

		// name
		String TagName = driver.findElement(By.name("description")).getTagName();
		System.out.println("Tagname is : " + TagName);

		// id
		String getTagName = driver.findElement(By.id("hamburger-menu")).getTagName();
		System.out.println("Tagname is : " + getTagName);

		// partialLinkText
		driver.findElement(By.partialLinkText("Read")).click();
		System.out.println("Action Performed partialLinkText locator");

		// class
		List<WebElement> Packages = driver.findElements(By.className("you-will-get__feature-card"));
		System.out.println("Number of Packages are :" + Packages.size());

		// tagName
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for (WebElement Print : Links) {
			String Text = Print.getText();
			if (!Text.equals("")) {
				System.out.println(Text);
			}
		}

		// LinkText
		driver.findElement(By.linkText("Postman")).click();
		System.out.println("Action Performed with LinkText locator");

		driver.quit();
	}

}
