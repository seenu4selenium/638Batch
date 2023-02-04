package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		
		//Create Webdriver Object
		WebDriver driver;
		
		//Open Chrome browser
		driver = new ChromeDriver();
		
		
		//Type FB URL
		driver.get("https://www.facebook.com/");
		
		//Type UN & paswd data
		driver.findElement(By.id("email")).sendKeys("dkjfhgsdjhfgldsj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("uoyetwrjndbs78hjb");
		//Click on Login button
		driver.findElement(By.name("login")).click();

	}

}
