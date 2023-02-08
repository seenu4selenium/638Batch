package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyObjectByUsingSizeMethod {
	@Test
	public void f() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");

		// find the Email Eidtbox is present?
		if (driver.findElements(By.name("txtUserName")).size() > 0) {// 1>0
			System.out.println("The given locator is  displayed on Screen");

		} else {
			System.out.println("The given locator is not displayed on Screen, check hte locator once");
		}

	}
}
