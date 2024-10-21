package Selenium_With_Java.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Absolute X-path is full X-path

		String GetUserName = driver.findElement(By.xpath("//*[.='Username : Admin']")).getText();
		String[] SplitUserName = GetUserName.split(":");
		System.out.println("Length of an Test is : " + SplitUserName.length);
		String UserName1 = SplitUserName[1].trim();
		String UserName2 = SplitUserName[0].trim();
		System.out.println(GetUserName.isEmpty() ? "User Name is IsEmpty"
				: "User Name found : " + UserName1 + " & " + UserName2 + " ");
		driver.quit();
	}

}
