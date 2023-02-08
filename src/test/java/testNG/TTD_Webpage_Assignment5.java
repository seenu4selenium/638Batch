package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TTD_Webpage_Assignment5 {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		// Wait
		Thread.sleep(5000);
		
		//Click on Sign Up link
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(3000);
		
		//Click on Institution
		driver.findElement(By.id("entity")).click();
		//Type any dummy name on Institution Name edit box
		driver.findElement(By.name("name")).sendKeys("H2oTestingTools");
		
	}
}
