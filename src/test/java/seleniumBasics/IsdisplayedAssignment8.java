package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsdisplayedAssignment8 {
	private Object by;

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");

		Thread.sleep(4000);

		// radio button is seleceted or not
		if (driver.findElement(By.id("yesRadio")).isSelected()) {
			System.out.println("The radio button is selected");
		} else {

			System.out.println("The radio button is not selected");
		}
		// no radiobutton is enabled or not
		if (driver.findElement(By.id("noRadio")).isSelected()) {
			System.out.println("The NO radio button is disabled");
		} else {

			System.out.println("The NO radio button is enabled");
		}
	}

}
