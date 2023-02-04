package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

	public static WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
	}

	@Test
	public static void fb() {

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("dkjfhgsdjhfgldsj@gmail.com");
		driver.findElement(By.name("pass123")).sendKeys("uoyetwrjndbs78hjb");

	}

	@Test
	public static void clg() throws Exception {
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("AFGHANISTAN");

	}
}
