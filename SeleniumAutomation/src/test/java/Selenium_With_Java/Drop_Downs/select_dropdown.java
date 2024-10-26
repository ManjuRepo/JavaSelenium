package Selenium_With_Java.Drop_Downs;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	public static String DDclick = "Japan";
	public static String DDval;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel = new Select(dd);
		int Options = sel.getOptions().size();
		System.out.println("No of oprtons is the dropdown are : " + Options);
		List<WebElement> Val = sel.getOptions();
		for (WebElement Value : Val) {
			String Text = Value.getText();
			DDval = Text;
			// System.out.println(Text);
			if (DDval.contains(DDclick)) {
				System.out.println("The value " + DDval + " Persent in the drop down");
				driver.findElement(By.xpath("//*[contains(text(),'" + DDclick + "')]")).click();
				Thread.sleep(5000);
				System.out.println("The Value " + DDclick + " selected from dropdown");
			}
		}
		driver.quit();
	}
}
