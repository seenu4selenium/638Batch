package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyIsSelectedOrNot {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");

		driver.findElement(By.id("signup-link9")).click();
		// Wait
		Thread.sleep(5000);
		
		//isSelected()
		if (driver.findElement(By.id("checkbox")).isSelected()) {
			System.out.println("The given locator is Selected/Checked");
		} else {
			System.out.println("The given locator is NOT Selected/Checked");
		}
		
		//Click on  create new account button on screen without fill any data
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		
		//Verify the Error message is displayed or not?		
		//isDisplayed()
		if (driver.findElement(By.id("nameTD")).isDisplayed()) {
			System.out.println("The given locator is displayed on screen***");
			//display the text into Console
			String errMsg = driver.findElement(By.id("nameTD")).getText();
			System.out.println(errMsg);
		} else {
			System.out.println("The given locator is NOT displayed on screen***");
		}
		
	}
}
