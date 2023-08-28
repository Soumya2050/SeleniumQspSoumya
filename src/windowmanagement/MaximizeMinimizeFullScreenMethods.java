package windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * open the browser.
 * Enter the ebay.com.
 * Maximize browser.
 * Wait for 2 sec.
 * Minimize the browser
 * Wait for 2sec.
 * View full Screen.
 * Wait for 2sec.
 * Close the browser.
 */
public class MaximizeMinimizeFullScreenMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
	}

}
