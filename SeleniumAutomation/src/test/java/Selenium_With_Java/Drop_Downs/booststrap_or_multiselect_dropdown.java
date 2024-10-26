package Selenium_With_Java.Drop_Downs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booststrap_or_multiselect_dropdown {

	public static String SelVal = "HTML";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//*[contains(@class,'multiselect') and @type='button']")).click();
		String Val = driver.findElement(By.xpath("//*[@class='multiselect-container dropdown-menu']")).getText();
		if (Val.contains(SelVal)) {
			Thread.sleep(2000);
			WebElement click = driver.findElement(
					By.xpath("//*[contains(@class,'multiselect')]//label[contains(text(),'" + SelVal + "')]/input"));
			System.out.println(click.isSelected() ? "check box is selected" : "check box is not selected");
			click.click();
			System.out.println("Action Performed on : " + SelVal);
		}
		List<WebElement> DDval = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//input"));
		for(WebElement DD:DDval) {
			if(!DD.isSelected()) {
				Thread.sleep(2000);
				DD.click();
			}
			else {
				Thread.sleep(2000);
				DD.click();
			}
		}
		driver.quit();
	}

}
