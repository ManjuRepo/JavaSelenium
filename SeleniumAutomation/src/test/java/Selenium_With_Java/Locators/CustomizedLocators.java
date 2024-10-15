package Selenium_With_Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/");

		// Tag ID Tag can be ignored Syntax = Tag id value (# indicates ID)
		driver.findElement(By.cssSelector("li#menu-item-574")).click();
		// driver.findElement(By.cssSelector("#menu-item-574")).click();
		System.out.println("Action performed with Tag ID");

		/*
		 * Tag Class Tag can be ignored Syntax = Tag . value (. indicates class) if the
		 * class value is having 2 sentence 2nd sentence can be removed
		 */
		driver.findElement(By.cssSelector("a.showcoupon")).click();
		// driver.findElement(By.cssSelector(".showcoupon")).click();
		System.out.println("Action performed with Tag Class");

		// Tag Attribute Tag can be ignored Syntax = Tag[Attribute='Value']
		driver.findElement(By.cssSelector("input[id='coupon_code']")).sendKeys("coupon_code");
		// driver.findElement(By.cssSelector("[id='coupon_code']")).sendKeys("coupon_code");
		System.out.println("Action performed with Tag Attribute");

		/*
		 * Tag class Attribute Tag can be ignored Syntax = Tag . ClassValue
		 * [Attribute='Value'] (. indicates class)
		 */
		driver.findElement(By.cssSelector("button.button[name='apply_coupon']")).click();
		// driver.findElement(By.cssSelector(".button[name='apply_coupon']")).click();
		System.out.println("Action performed with Tag class Attribute");

		driver.quit();
	}

}
