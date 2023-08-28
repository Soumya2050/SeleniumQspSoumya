package Xpath_10_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Open the browser
 * Enter snapdeal.com
 * Type headphones in the search bar
 * Click on search button
 * Validate headphone page
 * Close the browser
 */
public class XpathByAttribute1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("Headphones");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		if(driver.getTitle().contains(title))
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
