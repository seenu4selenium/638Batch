package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZonalLink {
	static WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://mis.nyiso.com/public/");
		loopAllFramesAndReturnCountofElement(By.name("P-24Alist"));
		driver.findElement(By.name("P-24Alist")).click();
		Thread.sleep(3000);
		loopAllFramesAndReturnCountofElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]/span"));
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]/span")).getText());

		
//		
//		// Move to Frame
//		driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
//		driver.switchTo().frame("MENU");
//
//		driver.findElement(By.name("P-24Alist")).click();
//		Thread.sleep(3000);
//
//		// Get the latest date
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(2);
//		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]/span")).getText());

	}
	public int iframeCount() {
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		int numberOfFrames = 0;
		numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		return numberOfFrames;
	}

	public void switchToFrameByInt(int i) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(i);
	}

	public int loopAllFramesAndReturnCountofElement(By locator) {

		int elementpresenceCount = 0;
		int loop = 0;
		int maxFramecount = iframeCount();// 3
		// if given locater has present on webpage, then the element size would be '1'
		// else '0'
		elementpresenceCount = driver.findElements(locator).size();// 0
		while (elementpresenceCount == 0 && loop < maxFramecount) {
			try {
				switchToFrameByInt(loop);
				elementpresenceCount = driver.findElements(locator).size();// 1
				System.out.println("Try LoopAllframesAndReturnWebEL : " + loop + "; ElementpresenceCount: "
						+ elementpresenceCount);
				if (elementpresenceCount > 0 || loop > maxFramecount) {
					break;
				}
			} catch (Exception ex) {
				System.out.println("Catch LoopAllframesAndReturnWebEL Old: " + loop + "; " + ex);
			}
			loop++;
		}
		return elementpresenceCount;
	}
}
