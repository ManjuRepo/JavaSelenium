package Selenium_With_Java.CheckBox_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normal_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='alertBtn']")).click();
		Alert HandleAlert = driver.switchTo().alert();
		System.out.println(HandleAlert.getText());
		Thread.sleep(2000);
		HandleAlert.accept();
		System.out.println("Action Performed on Alert PopUp");
		driver.quit();
		
		//we can handle alter using ecpllysiply wait
		
//		WebDriverWait ecpllysiplywait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		ecpllysiplywait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
