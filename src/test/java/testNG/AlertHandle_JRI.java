package testNG;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle_JRI {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.name("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		// GetCaptcha from Console
		Scanner s = new Scanner(System.in);
		System.out.println("Please type captcha value here: ");
		driver.findElement(By.name("txtCaptcha")).sendKeys(s.next());
		driver.findElement(By.name("imgbtnSignin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("listingtable_btnGridDelete_5")).click();
		Thread.sleep(5000);
		// Alert handle:
		// Click on Cancel button
		driver.switchTo().alert().dismiss();

		Thread.sleep(5000);
		// Click on OK button
		driver.findElement(By.id("listingtable_btnGridDelete_5")).click();
		Thread.sleep(5000);
		// Click on Cancel button
		driver.switchTo().alert().accept();

	}
}
