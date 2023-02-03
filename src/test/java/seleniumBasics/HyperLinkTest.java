package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLinkTest {
  @Test
  public void f() {
	  
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  //Click on Forgot password? hyperlink
	  driver.findElement(By.linkText("Forgot password?")).click();

	  
  }
  
  
}
