package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * scenario:
 * Open the browser
 * Enter Facebook.com
 * Click on create a page link
 * close the browser
 * 
 */
public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
