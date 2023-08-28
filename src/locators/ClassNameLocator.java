package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Scenario:
 * Open the browser,
 * Enter snapdeal.com
 * Type iphone in search text field 
 * Click on search 
 * Close the browser
 */
public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.className("searchformInput")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
