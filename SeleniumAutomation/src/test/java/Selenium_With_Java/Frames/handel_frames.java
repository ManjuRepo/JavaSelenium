package Selenium_With_Java.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handel_frames {
	public static WebElement Frame1;
	public static WebElement Frame2;
	public static WebElement Frame3;
	public static WebElement Frame4;
	public static WebElement Frame5;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement F1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		WebElement F2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		WebElement F3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		WebElement F4 = driver.findElement(By.xpath("//*[@src='frame_4.html']"));
		WebElement F5 = driver.findElement(By.xpath("//*[@src='frame_5.html']"));
		Frame1 = F1;
		Frame2 = F2;
		Frame3 = F3;
		Frame4 = F4;
		Frame5 = F5;

		driver.switchTo().frame(Frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1");
		System.out.println("Acrion performed on Frame 1 text box");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Farme2");
		System.out.println("Acrion performed on Frame 2 text box");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Farme3");
		System.out.println("Acrion performed on Frame 3 text box");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='i5']")).click();
		Thread.sleep(2000);
		System.out.println("Acrion performed on Check Box");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='mytext3']")).clear();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Farme4");
		System.out.println("Acrion performed on Frame 4 text box");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Farme5");
		System.out.println("Acrion performed on Frame 5 text box");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		driver.quit();
	}
}
