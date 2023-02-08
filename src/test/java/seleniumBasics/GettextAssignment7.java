package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettextAssignment7 {
	public static WebDriver driver;

	@Test
	public static void f() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//Get all object text by using Collection(ArrayList / List / Hashmap /Map ...)
		List<WebElement> allErrmsgs = driver.findElements(By.className("formValidationMessage"));
		//Use forEach loop to print list values
		for (WebElement abc : allErrmsgs) {
			System.out.println(abc.getText());
		}

		
		// gettext and display
		//getTextByLocator(By.className("formValidationMessage"));
		
		
//		getTextByLocator(By.id("firstNameError"));
//		getTextByLocator(By.id("lastNameError"));
//		getTextByLocator(By.id("emailAddressError"));
//		getTextByLocator(By.id("phoneNumberError"));
//		getTextByLocator(By.id("passwordError"));
//		getTextByLocator(By.id("ConfirmPasswordError"));
		
//		String errmsg = driver.findElement(By.id("firstNameError")).getText();
//		System.out.println(errmsg);
		
//		String errmsg1 = driver.findElement(By.id("lastNameError")).getText();
//		System.out.println(errmsg1);
//		String errmsg2 = driver.findElement(By.id("emailAddressError")).getText();
//		System.out.println(errmsg2);
//		String errmsg3 = driver.findElement(By.id("phoneNumberError")).getText();
//		System.out.println(errmsg3);
//		String errmsg4 = driver.findElement(By.id("passwordError")).getText();
//		System.out.println(errmsg4);
//		String errmsg5 = driver.findElement(By.id("ConfirmPasswordError")).getText();
//		System.out.println(errmsg5);

	}

	public static void getTextByLocator(By locatorName) {
		String errmsg = driver.findElement(locatorName).getText();
		System.out.println(errmsg);
	}

}