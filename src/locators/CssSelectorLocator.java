package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter the snapdeal
 * Type iphone in search text field
 * Click on search button
 * Type pincode
 * Click on check
 * Close the browser
 */
public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.searchTextSpan")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your pincode']")).sendKeys("756045");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.pincode-check")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
