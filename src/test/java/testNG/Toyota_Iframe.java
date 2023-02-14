package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.ThreadLocalRandom;

public class Toyota_Iframe {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.get("https://www.toyota.co.uk/order-a-brochure#/iframe/https%3A%2F%2Fforms.toyota.co.uk%2Fbrochure");
		Thread.sleep(5000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		Thread.sleep(5000);

		// Generate Random Number from 1 - 11
		int randomNum = randomNumberWithInRange(1, 11);
		//int to String
		System.out.println(String.valueOf(randomNum));

		loopAllFramesAndReturnCountofElement(By.xpath("//*[@id='__next']/div/main/div/div/div[3]/label["+String.valueOf(randomNum)+"]/div"));
		driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div[3]/label["+String.valueOf(randomNum)+"]/div")).click();
		Thread.sleep(5000);
		//Click on Email button for selected CAR
		driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div[3]/label["+String.valueOf(randomNum)+"]/div[2]/div/button")).click();
		
		//Fill the form with invalid details
		
	}

	public static int randomNumberWithInRange(int minimum, int maximum) {
		int randomNum = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
		System.out.println(randomNum);
		return randomNum;
	}

	public static int iframeCount() {
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		int numberOfFrames = 0;
		numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		return numberOfFrames;
	}

	public static void clickUsingJavaScript(By locator) throws Exception {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		// highlightElement(element);
		executor.executeScript("arguments[0].click();", element);

	}

	public static void switchToFrameByInt(int i) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(i);
	}

	public static int loopAllFramesAndReturnCountofElement(By locator) {

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
