package Selenium_With_Java.uploadDocument;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import superman.GenericUtility.PageObject.BrowserFactory;

public class uploadfile extends BrowserFactory {

	static String URL = "https://davidwalsh.name/demo/multiple-file-upload.php";
	static String File = "C:\\Users\\Admin\\Desktop\\Masked Adhar card Manju.pdf";
	static String File1 = "C:\\Users\\Admin\\Desktop\\Masked Adhar card Manju.pdf";

	public static void main(String[] args) {

		WebDriver driver = BrowserFactory.launchBrowser("chrome", URL);
		if (driver != null) {

			driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(File + "\n" + File);

			String text = driver.findElement(By.xpath("//*[@id='fileList']/li")).getText();

			System.out.println(text.equalsIgnoreCase("Masked Adhar card Manju.pdf") ? "True" : "False");

			driver.quit();
		}
	}
}