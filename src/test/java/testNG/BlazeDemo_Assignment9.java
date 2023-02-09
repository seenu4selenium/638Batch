package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeDemo_Assignment9 {
	static WebDriver driver;

	@Test

	public void f() {
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Select departureCity = new Select(driver.findElement(By.name("fromPort")));
		departureCity.selectByVisibleText("Boston");

		Select destinationCity = new Select(driver.findElement(By.name("toPort")));
		destinationCity.selectByVisibleText("Dublin");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();

		driver.findElement(By.id("inputName")).sendKeys("Swetha");
		driver.findElement(By.id("address")).sendKeys("123 iron");
		driver.findElement(By.id("city")).sendKeys("Dublin");
		driver.findElement(By.id("state")).sendKeys("CA");
		driver.findElement(By.id("zipCode")).sendKeys("94568");
		Select cardType = new Select(driver.findElement(By.id("cardType")));
		cardType.selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234556");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		driver.findElement(By.id("nameOnCard")).sendKeys("swetha");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();

		WebElement thanksNote = driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
		System.out.println(thanksNote.getText());

		
		List<WebElement> allDetails = driver.findElements(By.className("table"));
		// Use forEach loop to print list values
		for (WebElement text : allDetails) {
			System.out.println(text.getText());
		}
	}

//	public static void getTextByLocator(By locatorName) {
//		String details = driver.findElement(locatorName).getText();
//		System.out.println(details);
//	}

}