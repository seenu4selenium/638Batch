package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) throws Exception {
		
		//Create Webdriver Object
		WebDriver driver;
		
		//Open Chrome browser
		driver = new ChromeDriver();
		
		
		//Type FB URL
		driver.get("https://www.facebook.com/");
		
		//Type UN & paswd data
		driver.findElement(By.id("email")).sendKeys("dkjfhgsdjhfsdf454gldsj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("uoyetwrjndbs78hjb");
		//Click on Login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);

		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
				|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
			System.out.println("Error messages is displayed, Given Credentials were invalid");
		} else {
			System.out.println("Error messages is NOT displayed, Given Credentials were valid");
		}

	}

}
