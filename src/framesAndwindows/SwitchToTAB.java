package framesAndwindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter google.com
 * Open new tab
 * Enter facebook.com
 * close facebook.com
 * Exit browser
 * 
 */
public class SwitchToTAB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
