package assignment;
/*Scenario:
	 * Open the browser
	 * Enter snapdeal.com
	 * Mousehover to sign in
	 * Click on login button
	 * Enter mobile number
	 * close the frame
	 * type watches on seacrh text field 
	 * click on search
	 * close the broswer 
	 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameUsingWebElementPractice {

	public static void main(String[] args) throws InterruptedException {
		// Open the browser
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//Enter snapdeal.com
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Mousehover to sign in
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		//Click on login button
		WebElement login=driver.findElement(By.xpath("//a[text()='login']"));
		login.click();
		WebElement loginframe=driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
		driver.switchTo().frame(loginframe);
		//Enter mobile number
		WebElement mobnum=driver.findElement(By.id("userName"));
		mobnum.sendKeys("12355");
		Thread.sleep(2000);
		//close the frame
		WebElement closeframe=driver.findElement(By.id("close-pop"));
		closeframe.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//type watches on seacrh text field 
		WebElement searchTf=driver.findElement(By.id("inputValEnter"));
		searchTf.sendKeys("new one+ mobile");
		Thread.sleep(2000);
		// click on search
		WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		search.click();
		Thread.sleep(2000);
		//close the broswer 
		driver.quit();
	}

}
