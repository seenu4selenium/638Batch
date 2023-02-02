package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestPage {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//Actions
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, sign in']"))).perform();
		//Click on Signin button
		driver.findElement(By.className("nav-action-inner")).click();
		
		//Send mobile number
		driver.findElement(By.name("email")).sendKeys("9685741230");
		//Click on continue button
		driver.findElement(By.id("continue")).click();
	}

}
