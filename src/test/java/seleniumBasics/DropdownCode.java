package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownCode {
  @Test
  public void f() throws Exception {

		WebDriver driver;		
		driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		//Click on Create new account button/Hyperlink
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(4000);
		
		//Dropdown code
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("18");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2022");
  
  }
}
