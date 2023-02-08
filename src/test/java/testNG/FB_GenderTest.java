package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_GenderTest {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.name("sex")).size());
			

		// find the Email Eidtbox is present?
		if (driver.findElements(By.name("sex")).size() > 0) {// 1>0
			System.out.println("The given locator is  displayed on Screen");

		} else {
			System.out.println("The given locator is not displayed on Screen, check hte locator once");
		}

	}
}
