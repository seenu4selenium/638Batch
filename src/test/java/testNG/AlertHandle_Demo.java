package testNG;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertHandle_Demo {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please enter valid browser");
		}
	}

	@Test
	public void f() throws Exception {

		driver.get("https://demoqa.com/alerts");
		// driver.findElement(By.id("alertButton")).click();
		// Thread.sleep(3000);
//		//Alert: ok button
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(3000);
//		//Alert: cancle button
//		//driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("HiAll");
		System.out.println("promt Alert text is : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}
}
