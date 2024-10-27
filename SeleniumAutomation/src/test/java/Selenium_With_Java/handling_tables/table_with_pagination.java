package Selenium_With_Java.handling_tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_with_pagination {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> pagination = driver.findElements(By.xpath("//*[@id='pagination']/li"));
		int pageIndex = 0;

		while (pageIndex < pagination.size()) {
		    List<WebElement> Val = driver.findElements(By.xpath("//*[@id='productTable']//tbody/tr"));

		    for (int i = 0; i < Val.size(); i++) {
		        String Hedder = Val.get(i).getText();
		        WebElement checkbox = Val.get(i).findElement(By.xpath(".//td//input"));
		        checkbox.click();
		        System.out.println(Hedder + "\t" + "CheckBox : " + i);
		        Thread.sleep(2000);
		    }
		    pageIndex++;
		    if (pageIndex < pagination.size()) {
		        pagination.get(pageIndex).click();
		        Thread.sleep(2000);
		    } else {
		        break;
		    }
		}
		driver.quit();
	}
}
