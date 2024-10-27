package Selenium_With_Java.Drop_Downs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hidden_deopdown {

	static WebDriver driver = new ChromeDriver();

	public static void HiddenDD(WebElement Element, String... Value) throws InterruptedException {
		Element.click();
		Thread.sleep(2000);
		List<WebElement> DDval = driver
				.findElements(By.xpath("//*[@class='oxd-select-dropdown --positon-bottom']//div/span"));

		// Iterate over each value provided in Value
		for (String option : Value) {
			boolean found = false;

			// Check if the dropdown option contains the desired value
			for (WebElement values : DDval) {
				String Val = values.getText();

				if (Val.contains(option)) {
					Thread.sleep(1000); // Wait for 1 second before clicking
					WebElement Click = driver.findElement(
							By.xpath("//*[contains(@class,'oxd-select-dropdown')]//div/span[contains(text(),'" + option
									+ "')]"));
					Actions act = new Actions(driver);
					act.click(Click).perform();
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
		// TODO Auto-generated method stub

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String UN = driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		String[] u = UN.split(":");
		String UserName = u[1].trim();
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@class,'oxd-button')]")).click();
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		WebElement Ele = driver
				.findElement(By.xpath("(//div[contains(@class,'active')]//div/i[contains(@class,'arrow')])[1]"));
		hidden_deopdown.HiddenDD(Ele, "Freelance");
		Thread.sleep(5000);
		driver.quit();
	}
}
