package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter the facebook.com
 * Enter the user name and password
 * Click on login button
 * Close the broswer
 */
public class IdNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("453259556");
		driver.findElement(By.id("pass")).sendKeys("5853235");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
