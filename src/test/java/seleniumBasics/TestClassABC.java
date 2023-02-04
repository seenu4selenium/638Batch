package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClassABC {
	// Create Webdriver Object
	public static WebDriver driver;

	public static void fb() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dkjfhgsdjhfgldsj@gmail.com");
		driver.findElement(By.name("pass123")).sendKeys("uoyetwrjndbs78hjb");

	}

	public static void clg() throws Exception {
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("AFGHANISTAN");

	}

	public static void main(String[] args) throws Exception {
		fb();
		clg();

	}

}
