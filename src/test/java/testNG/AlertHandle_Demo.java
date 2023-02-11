package testNG;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle_Demo {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		//Alert: ok button
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		//Alert: cancle button
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();

	}
}
