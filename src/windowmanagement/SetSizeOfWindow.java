package windowmanagement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Scenario:
 * Open The browser
 * Enter instgram.com
 * Maximize the window
 * Wait for 2seconds
 * Set window size to 1024x768
 * Wait for 2seconds
 * Close the browser
 */
public class SetSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d=new Dimension(1024,768);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.quit();
	}

}
