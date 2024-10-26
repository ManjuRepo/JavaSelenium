package Selenium_With_Java.Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> Links = driver
				.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']/child::div/a"));
		for (WebElement Link : Links) {
			String L = Link.getText();
			switch (L) {
			case "Selenium": {
				int Width = driver
						.findElement(By.xpath("//*[@id='wikipedia-search-result-link']//*[text()='" + L + "']"))
						.getSize().getWidth();
				System.out.println("Width of an " + L + "is : " + Width);
				Link.click();
				System.out.println("Action Performed on Link : " + L);
				break;
			}
			case "Selenium in biology": {

				int Width = driver
						.findElement(By.xpath("//*[@id='wikipedia-search-result-link']//*[text()='" + L + "']"))
						.getSize().getWidth();
				System.out.println("Width of an " + L + "is : " + Width);
				Link.click();
				System.out.println("Action Performed on Link : " + L);
				break;
			}
			case "Selenium (software)": {
				int Width = driver
						.findElement(By.xpath("//*[@id='wikipedia-search-result-link']//*[text()='" + L + "']"))
						.getSize().getWidth();
				System.out.println("Width of an " + L + "is : " + Width);
				Link.click();
				System.out.println("Action Performed on Link : " + L);
				break;
			}
			case "Selenium disulfide": {
				int Width = driver
						.findElement(By.xpath("//*[@id='wikipedia-search-result-link']//*[text()='" + L + "']"))
						.getSize().getWidth();
				System.out.println("Width of an " + L + "is : " + Width);
				Link.click();
				System.out.println("Action Performed on Link : " + L);
				break;
			}
			case "Selenium dioxide": {
				int Width = driver
						.findElement(By.xpath("//*[@id='wikipedia-search-result-link']//*[text()='" + L + "']"))
						.getSize().getWidth();
				System.out.println("Width of an " + L + "is : " + Width);
				Link.click();
				System.out.println("Action Performed on Link : " + L);
				break;
			}
			}
		}
		Set<String> Windows = driver.getWindowHandles();
		List<String> CurrentWindow = new ArrayList<String>(Windows);
		for (String WindowId : CurrentWindow) {
			String WindowTitle = driver.switchTo().window(WindowId).getTitle();

			switch (WindowTitle) {
			case "Automation Testing Practice": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Automation Testing Practice") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			case "Selenium dioxide - Wikipedia": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Selenium dioxide - Wikipedia") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			case "Selenium disulfide - Wikipedia": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Selenium disulfide - Wikipedia") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			case "Selenium (software) - Wikipedia": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Selenium (software) - Wikipedia") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			case "Selenium in biology - Wikipedia": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Selenium in biology - Wikipedia") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			case "Selenium - Wikipedia": {
				driver.switchTo().window(WindowId);
				System.out.println(WindowTitle.equalsIgnoreCase("Selenium - Wikipedia") ? "True" : "Fales");
				System.out.println("Switched to" + WindowTitle + " Page & Closed");
				driver.close();
				break;
			}
			}
		}
	}
}
