package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Click on forgot password
 * Type mobile number in search text field
 * Click on search
 * Close the window
 */
public class Task2_10ThFeb {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("7735481847");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
