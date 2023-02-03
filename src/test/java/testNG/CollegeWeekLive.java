package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CollegeWeekLive {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://collegeweeklive.com/go-signup/");
	  //Wait 
	  Thread.sleep(5000);
	  
	  new Select(driver.findElement(By.id("country"))).selectByVisibleText("AFGHANISTAN");
	  //Click on Privacy Policy link
	 // driver.findElement(By.linkText("Privacy Policy")).click();
	  
	  
  }
}
