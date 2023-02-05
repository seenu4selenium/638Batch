package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment6 {
  @Test
  public void f() {
	  
	WebDriver abc;
	abc = new ChromeDriver();
	abc.get("https://testautomationpractice.blogspot.com/");
	
	new Select(abc.findElement(By.name("speed"))).selectByVisibleText("Fast");	
	new Select(abc.findElement(By.name("files"))).selectByVisibleText("PDF file");
	new Select(abc.findElement(By.name("number"))).selectByVisibleText("4");
	new Select(abc.findElement(By.name("products"))).selectByVisibleText("Iphone");
	new Select(abc.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");
	
	
  }
}
