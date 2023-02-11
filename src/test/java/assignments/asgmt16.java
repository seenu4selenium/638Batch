package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asgmt16 {
	static WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		// command+shift+c to get dev tool to inspevt an element
		driver.findElement(By.className("login_button")).click();

		driver.findElement(By.id("Button2")).click();
		Thread.sleep(2000);
		// Alert alert = driver.switchTo().alert();
		String alertMsg = driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[@id=\"login_fields\"]/div[1]/div[2]/ul/li[1]/a")).click();

		Thread.sleep(2000);
		String alertMsg1 = driver.switchTo().alert().getText();
		System.out.println(alertMsg1);
		driver.switchTo().alert().accept();

		/*
		 * driver.findElement(By.id("username")).sendKeys("swetha");
		 * driver.findElement(By.name("password")).sendKeys("1234");
		 * driver.findElement(By.id("loginCaptchaValue")).sendKeys("aa");
		 * driver.findElement(By.id("Button2")).click();
		 */

	}
}
