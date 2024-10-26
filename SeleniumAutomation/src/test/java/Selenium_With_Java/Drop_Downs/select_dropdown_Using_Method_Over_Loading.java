package Selenium_With_Java.Drop_Downs;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown_Using_Method_Over_Loading {

	public static WebDriver drivers;

	public static void SelectDropDown(WebElement Element, String Value) throws InterruptedException {

		Select sel = new Select(Element);
		List<WebElement> Options = sel.getOptions();
		for (WebElement Val : Options) {
			String Text = Val.getText();
			if (Text.contains(Value)) {
				System.out.println("The value " + Value + " Persent in the drop down");
				drivers.findElement(By.xpath("//*[contains(text(),'" + Value + "')]")).click();
				Thread.sleep(5000);
				System.out.println("The Value " + Value + " selected from dropdown");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		drivers = driver;
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
		select_dropdown_Using_Method_Over_Loading.SelectDropDown(dd, "Ger");
		driver.quit();
	}

}
