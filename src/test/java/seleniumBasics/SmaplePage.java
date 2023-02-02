package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmaplePage {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/nalla/OneDrive/Desktop/H2o_Practice_Page.html");
		driver.findElement(By.id("autocomplete")).sendKeys("Selenium");
		
		//Click on SecondRadio button
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();

		driver.findElement(By.id("checkBoxOption3")).click();
	}

}
