package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Click on forgotten Password
 * Type your mobile number
 * Click on search button
 */
public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("7873226379");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"did_submit\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
