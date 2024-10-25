package Selenium_With_Java.CheckBox_Alerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {

	static String Val = "Saturday";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> Days = driver.findElements(By.xpath("//*[text()='Days:']/parent::div/div/label"));
		for (WebElement Day : Days) {
			String D = Day.getText();
			if (D.equals(Val) && !Day.isSelected()) {
				Thread.sleep(2000);
				String d = D.toLowerCase();
				driver.findElement(By.xpath("//*[@id='" + d + "']")).click();
				Thread.sleep(5000);
				System.out.println("Action Performed on : " + d);
			}
		}
		driver.quit();
	}

}
