package Selenium_With_Java.Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> Links = driver
				.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']/child::div/a"));
		for (WebElement Link : Links) {
			System.out.println("Links are : " + Link.getText());
			Thread.sleep(2000);
			Link.click();
		}
		Set<String> Win = driver.getWindowHandles();
		List<String> Window = new ArrayList<String>(Win);

		for (String W : Window) {
			String Title = driver.switchTo().window(W).getTitle();
			switch (Title) {
			case "Automation Testing Practice": {
				driver.switchTo().window(W);
				Dimension Size = driver.findElement(By.xpath("//*[@class='titlewrapper']/h1")).getSize();
				System.out.println(Size);
				driver.close();
			}
				break;
			case "Selenium dioxide - Wikipedia": {
				driver.switchTo().window(Title);
				Dimension Size = driver.findElement(By.xpath("(//*[.=" + Title + "]/span)[1]")).getSize();
				System.out.println(Size);
				driver.close();
			}
				break;
			case "Selenium disulfide - Wikipedia": {
				driver.switchTo().window(Title);
				Dimension Size = driver.findElement(By.xpath("(//*[.=" + Title + "]/span)[1]")).getSize();
				System.out.println(Size);
				driver.close();
			}
				break;
			case "Selenium - Wikipedia": {
				driver.switchTo().window(Title);
				Dimension Size = driver.findElement(By.xpath("(//*[.=" + Title + "]/span)[1]")).getSize();
				System.out.println(Size);
				driver.close();
			}
				break;
			case "Selenium (software) - Wikipedia": {
				driver.switchTo().window(Title);
				Dimension Size = driver.findElement(By.xpath("(//*[.=" + Title + "]/span)[1]")).getSize();
				System.out.println(Size);
				driver.close();
			}
				break;
			}
		}
	}
}
