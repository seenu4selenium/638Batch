package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asgmt14 {
	static WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);

		String alertMsg = driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);

		String timeAlertMsg = driver.switchTo().alert().getText();
		System.out.println(timeAlertMsg);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String confirmAlertMsg = driver.switchTo().alert().getText();
		System.out.println(confirmAlertMsg);
		alert.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
	}
}
