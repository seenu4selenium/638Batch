package dataDrivernFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLoginWithExcel {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		
		
		
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		FileInputStream fi = new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("FBlogin");
		Row r = s.getRow(2);
		
		Cell username = r.getCell(0);
		Cell password = r.getCell(1);
		System.out.println(username);
		System.out.println(password);


		driver.findElement(By.id("email")).sendKeys(username.getStringCellValue());
		driver.findElement(By.name("pass")).sendKeys(password.getStringCellValue());
		
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(6000);
//
//		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
//				|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
//			System.out.println("Error messages is displayed, Given Credentials were invalid");
//		} else {
//			System.out.println("Error messages is NOT displayed, Given Credentials were valid");
//		}

	}
}
