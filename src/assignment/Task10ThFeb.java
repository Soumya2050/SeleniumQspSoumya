package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Scenario:
 * Enter skillrary.com
 * Click on GEARS
 * Close the browser
 */

public class Task10ThFeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.findElement(By.linkText("GEARS")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
