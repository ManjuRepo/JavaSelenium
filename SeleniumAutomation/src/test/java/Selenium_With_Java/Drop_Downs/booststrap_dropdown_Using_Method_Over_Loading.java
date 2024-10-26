package Selenium_With_Java.Drop_Downs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booststrap_dropdown_Using_Method_Over_Loading {

	static WebDriver driver = new ChromeDriver();

	public static void MultiDD(String... v1) throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(@class,'multiselect') and @type='button']")).click();
		List<WebElement> val = driver.findElements(By.xpath("//*[@class='multiselect-container dropdown-menu']"));

		for (String option : v1) {
			boolean found = false;

			for (WebElement values : val) {
				String Val = values.getText();

				if (Val.contains(option)) {
					Thread.sleep(1000); // Wait for 1 second before clicking
					driver.findElement(By.xpath(
							"//*[contains(@class,'multiselect')]//label[contains(text(),'" + option + "')]/input"))
							.click();
					System.out.println(option + " is present in the dropdown.");
					found = true;
					break; // Exit the inner loop once the option is found and clicked
				}
			}

			if (!found) {
				System.out.println(option + " is not present in the dropdown.");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		booststrap_dropdown_Using_Method_Over_Loading.MultiDD("Angular", "CSS", "HTML");
		driver.quit();
	}

}
