package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * Scenario:
 * Open the browser
 * Enter the facebook.com
 * Enter the number into username text field
 * Clear the username text field
 * Enter the mailid and password
 * Click on login button
 * Close the browser
 */
public class ClearSubmitPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameTf=driver.findElement(By.name("email"));
		usernameTf.sendKeys("7077522939");
		Thread.sleep(2000);
		usernameTf.clear();
		Thread.sleep(2000);
		usernameTf.sendKeys("abcd@2420");
		driver.findElement(By.id("pass")).sendKeys("452710142");
		driver.findElement(By.name("login")).submit();
		driver.quit();
		
		
	}

}
