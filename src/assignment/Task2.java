package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter the ebay.com
 * Type "watches" in the search text field
 * Click on search
 * Close the browser
 */
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("watches");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
