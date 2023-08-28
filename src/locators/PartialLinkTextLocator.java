package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Scenario:
 * Open the browser
 * Enter the demo.actitime.com
 * Click on "forgot your password"
 * Click on "return to Login Page"
 * Close the browser
 */
public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Return")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
