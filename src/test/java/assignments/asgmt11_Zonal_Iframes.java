package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asgmt11_Zonal_Iframes {
	static WebDriver driver;
	
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("http://mis.nyiso.com/public/");
	  //driver.findElement(By.linkText("Zonal")).click();
	  int size = driver.findElements(By.tagName("frame")).size();
	  System.out.println(size);
	  driver.switchTo().frame("MENU");
	  driver.findElement(By.linkText("Zonal")).click();
	  
	  
	  
	   }
}
