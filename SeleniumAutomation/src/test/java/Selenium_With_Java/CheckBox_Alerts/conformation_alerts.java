package Selenium_With_Java.CheckBox_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformation_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='confirmBtn']")).click();
		Alert HandleAlert = driver.switchTo().alert();
		System.out.println(HandleAlert.getText());
		Thread.sleep(2000);
		HandleAlert.accept();
		WebElement ConfMsg = driver.findElement(By.xpath("//*[@id='demo']"));
		Thread.sleep(2000);
		if (ConfMsg.isDisplayed()) {
			System.out.println(ConfMsg.getText());
		}
		System.out.println("Action Performed on Alert PopUp");
		driver.quit();

	}

}
